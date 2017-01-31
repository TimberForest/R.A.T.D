package br.com.timberforest.ratd.dashboards;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import br.com.timberforest.ratd.R;

public class ServicosLogMaxActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos_log_max);
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
    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.InstalacaoCertificadoGarantia:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this, ControleInstalacaoCertificadoGarantiaDao.class));
                break;
            case R.id.GuiaManutencao:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this, FormGuiaManutencaoLogmaxActivity.class));
                break;
            case R.id.revisao500Hrs:
                Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this, DashRevisao500hrsLogMaxModelosActivity.class));
                break;
        }
    }

    public void abrirManutencaoProgGrua(View view){
        Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
    }
    public void manualServiço(View view){
        Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
    }
    public void CatalogoPeças(View view){
        Toast.makeText(getApplicationContext(), "Relatório em desenvolvimento !", Toast.LENGTH_SHORT).show();
    }
}
