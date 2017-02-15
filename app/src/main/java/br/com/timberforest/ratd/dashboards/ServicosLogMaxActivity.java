package br.com.timberforest.ratd.dashboards;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.listActivity.relatorioAvaliacaoOperacional.ListRelatorioAvaliacaoOperacionalActivity;

public class ServicosLogMaxActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos_log_max);
    }
    //botão voltar do device
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent intent = new Intent(ServicosLogMaxActivity.this, MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
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
