package br.com.timberforest.ratd.dashboards;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import br.com.timberforest.ratd.R;

public class ServicosPonsseActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos_ponsse);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_simples_botao_voltar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_voltar) {
            super.finish();
        }

        return super.onOptionsItemSelected(item);
    }

   /* @Override
    protected void onResume() {
        super.onResume();

        Button btManutencaoProgForwarder = (Button) findViewById(R.id.manutencaoProgBasCompForwarderButton);

        Realm realm = Realm.getInstance(this);
        RealmResults<ManutencaoProgForwarderModel> manutencaoProgForwarderModels = realm.where(ManutencaoProgForwarderModel.class).findAll();

        btManutencaoProgForwarder.setText( "Manutenção programada básica/completa do FORWARDER ("+manutencaoProgForwarderModels.size()+")" );
        realm.close();
    }*/


    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.manutencaoProgBasCompGruaButton:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this, ListManutencaoProgGruaPonsseActivity.class));
                break;
            case R.id.manutencaoProgBasCompCabecoteButton:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this, FormManutencaoPragramadaCabecotePonsseActivity.class));
                break;
            case R.id.manutencaoProgBasCompForwarderButton:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this, FormManutencaoProgramadaForwarderPonsseActivity.class));
                break;
            case R.id.manutencaoProgBasCompMaquinaBaseButton:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this, FormManutencaoProgramadaMaquinaBasePonsseActivity.class));
                break;
            case R.id.garantiaForwarderButton:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(this, FormGarantiaForwarderPonsseActivity.class);
                startActivity(intent);*/
                break;
            case R.id.garantiaHarvesterButton:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this, FormGarantiaHarvesterPonsseActivity.class));
                break;
            case R.id.imageView2:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this, ListGarantiaForwarderPonsseActivity.class));
                break;
        }
    }
}
