package br.com.timberforest.ratd.listActivity.relatorioAvaliacaoOperacional;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.listAdapter.relatorioAvaliacaoOperacional.RelatorioOperacionalListAdapter;
import br.com.timberforest.ratd.dao.relatorioAvaliacaoOperacional.RelatorioAvaliacaoOperacionalDao;
import br.com.timberforest.ratd.detail.relatorioAvaliacaoOperacional.DetailRelatorioOperacionalActivity;
import br.com.timberforest.ratd.formulariosActivity.relatorioAvaliacaoOperacional.RelatorioOperacionalFormActivity;
import br.com.timberforest.ratd.model.relatorioAvaliacaoOperacional.RelatorioAvaliacaoOperacional;

import java.util.List;


public class ListRelatorioAvaliacaoOperacionalActivity extends ActionBarActivity {


    private RelatorioAvaliacaoOperacionalDao relatorioAvaliacaoOperacionalDao;
    private RelatorioOperacionalListAdapter relatorioOperacionalListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_relatorio_avaliacao_operacional);

        ListView relaListView= (ListView) findViewById(R.id.relatorioOperacioanalListView);

        relaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onListItemClick(position);
            }
        });

        relatorioAvaliacaoOperacionalDao = new RelatorioAvaliacaoOperacionalDao();
        relatorioOperacionalListAdapter = new RelatorioOperacionalListAdapter(this);

        relaListView.setAdapter(relatorioOperacionalListAdapter);
        buscaRelatorioOperacional();
    }

    private void buscaRelatorioOperacional(){
        List<RelatorioAvaliacaoOperacional> relatorioAvaliacaoOperacionals = relatorioAvaliacaoOperacionalDao.busca();

        relatorioOperacionalListAdapter.clear();
        relatorioOperacionalListAdapter.addAll(relatorioAvaliacaoOperacionals);
    }
    private void onListItemClick(int position){
        Intent intent = new Intent(this,DetailRelatorioOperacionalActivity.class);
        RelatorioAvaliacaoOperacional relatorioAvaliacaoOperacional = (RelatorioAvaliacaoOperacional) relatorioOperacionalListAdapter.getItem(position);
        intent.putExtra("RelatorioAvaliacaoOperacional", relatorioAvaliacaoOperacional);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_relatorio_operacional_list, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_new) {
            Intent intent = new Intent(this, RelatorioOperacionalFormActivity.class);
            startActivity(intent);
            return true;
        }
        if(item.getItemId()==R.id.action_refresh) {
            buscaRelatorioOperacional();
        }
        if(item.getItemId()==R.id.action_voltar) {
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onResume(){
        super.onResume();
        buscaRelatorioOperacional();
    }
}
