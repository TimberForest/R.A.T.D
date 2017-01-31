package br.com.timberforest.ratd.detail.servicosPonsse;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;

import br.com.timberforest.ratd.R;
public class DetailManutencaoProgramadaCabecotePonsseActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_manutencao_harvester_ponsse);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_manutencao_detail, menu);
        return true;
    }
   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
