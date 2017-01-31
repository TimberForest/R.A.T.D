package br.com.timberforest.ratd.listActivity.cadastroMecanico;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import br.com.timberforest.ratd.listAdapter.cadastroMecanico.CadastroMecanicoListAdapter;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.cadastroMecanico.CadastroMecanicoDao;
import br.com.timberforest.ratd.detail.cadastroMecanico.DetailMecanicoActivity;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;

import java.util.List;

public class ListCadastroMecanicoActivity extends ActionBarActivity {

    private CadastroMecanicoDao cadastroMecanicoDao;
    private CadastroMecanicoListAdapter cadastroMecanicoListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cadastro_mecanico);

        ListView mecanicosListView= (ListView) findViewById(R.id.mecanicosListView);

        mecanicosListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onListItemClick(position);
            }
        });

        cadastroMecanicoDao = new CadastroMecanicoDao();
        cadastroMecanicoListAdapter = new CadastroMecanicoListAdapter(this);

        mecanicosListView.setAdapter(cadastroMecanicoListAdapter);
        buscaMecanicos();
    }
    private void buscaMecanicos(){
        List<CadastroMecanico> mecanicos= cadastroMecanicoDao.busca();

        cadastroMecanicoListAdapter.clear();
        cadastroMecanicoListAdapter.addAll(mecanicos);
    }
    private void onListItemClick(int position){
        Intent intent = new Intent(this,DetailMecanicoActivity.class);
        CadastroMecanico mecanico= (CadastroMecanico) cadastroMecanicoListAdapter.getItem(position);
        intent.putExtra("CadastroMecanico", mecanico);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mecanico_list, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        /*if(item.getItemId()==R.id.action_new) {
            Intent intent = new Intent(this, FormMecanicoActivity.class);
            startActivity(intent);
            return true;
        }*/
        if(item.getItemId()==R.id.action_refresh) {
            buscaMecanicos();
        }
        if(item.getItemId()==R.id.action_voltar) {
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onResume(){
        super.onResume();

        buscaMecanicos();
    }
}
