package br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import br.com.timberforest.ratd.dashboards.MainActivity;
import br.com.timberforest.ratd.listAdapter.relatorioAssistenciaTecnica.RelatorioAssistenciaTecnicaListAdatapter;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.relatorioAssistenciaTecnica.RelatorioAssistenciaTecnicaDao;
import br.com.timberforest.ratd.detail.relatorioAssistenciaTecnica.DetailRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.formulariosActivity.relatorioAssistenciaTecnica.FormRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.RelatorioAssistenciaTecnica;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento;

import java.util.List;
public class ListRelatorioAssistenciaTecnicaActivity extends ActionBarActivity {

    private RelatorioAssistenciaTecnicaDao relatorioAssistenciaTecnicaDao;
    private RelatorioAssistenciaTecnicaListAdatapter relatorioAssistenciaTecnicaListAdatapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_relatorio_assistencia_tecnica);
        ListView formulariosListView= (ListView) findViewById(R.id.listViewFormularios);
        formulariosListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onListItemClick(position);
            }
        });
        relatorioAssistenciaTecnicaDao = new RelatorioAssistenciaTecnicaDao();
        relatorioAssistenciaTecnicaListAdatapter = new RelatorioAssistenciaTecnicaListAdatapter(this);
        formulariosListView.setAdapter(relatorioAssistenciaTecnicaListAdatapter);
    buscaFormularios();
}
    private void buscaFormularios(){
        List<RelatorioAssistenciaTecnica> relatorioAssistenciaTecnicas = relatorioAssistenciaTecnicaDao.busca();
        relatorioAssistenciaTecnicaListAdatapter.clear();
        relatorioAssistenciaTecnicaListAdatapter.addAll(relatorioAssistenciaTecnicas);
    }
    private void onListItemClick(int position){
        Intent intent = new Intent(this,DetailRelatorioAssistenciaTecnicaActivity.class);
        RelatorioAssistenciaTecnica relatorioAssistenciaTecnica = (RelatorioAssistenciaTecnica) relatorioAssistenciaTecnicaListAdatapter.getItem(position);
        intent.putExtra("relatorioAssistenciaTecnica", relatorioAssistenciaTecnica);
        startActivity(intent);
    }

    //botão voltar do device
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent intent = new Intent(ListRelatorioAssistenciaTecnicaActivity.this, MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list_relatorio_assistencia_tecnica, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_new) {
            Intent intent = new Intent(this, FormRelatorioAssistenciaTecnicaActivity.class);
            startActivity(intent);
            return true;
        }
        if(item.getItemId()==R.id.action_refresh) {
            buscaFormularios();
        }
/*        if(item.getItemId()==R.id.action_voltar) {
            Intent intent = new Intent(ListRelatorioAssistenciaTecnicaActivity.this, MainActivity.class);
            startActivity(intent);
        }*/
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onResume(){
        super.onResume();
        buscaFormularios();
    }
}
