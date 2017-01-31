package br.com.timberforest.ratd.detail.servicosPonsse;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;

import br.com.timberforest.ratd.R;
public class DetailManutencaoProgramadaGruaPonsseActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_manutencao_programada_grua_ponsse);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_manutencao_programada_guindaste_detail, menu);
        return true;
    }
  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
