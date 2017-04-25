package br.com.timberforest.ratd.dashboards;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.listActivity.relatorioAvaliacaoOperacional.ListRelatorioAvaliacaoOperacionalActivity;
import de.keyboardsurfer.android.widget.crouton.Configuration;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class ServicosLogMaxActivity extends Activity {

    final Style styleAlert = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.RED)
            .setConfiguration(new Configuration.Builder().setDuration(2000).build())
            .build();

    final Style styleConfirm = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.GREEN)
            .setConfiguration(new Configuration.Builder().setDuration(2000).build())
            .build();
    final Style styleInf = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.BLUE)
            .setConfiguration(new Configuration.Builder().setDuration(2000).build())
            .build();

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
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.InstalacaoCertificadoGarantia:
                Crouton.makeText(ServicosLogMaxActivity.this, "Relatório em desenvolvimento !", styleAlert).show();
//                startActivity(new Intent(this, ControleInstalacaoCertificadoGarantiaDao.class));
                break;
            case R.id.GuiaManutencao:
                Crouton.makeText(ServicosLogMaxActivity.this, "Relatório em desenvolvimento !", styleAlert).show();
//                startActivity(new Intent(this, FormGuiaManutencaoLogmaxActivity.class));
                break;
            case R.id.revisao500Hrs:
                Crouton.makeText(ServicosLogMaxActivity.this, "Relatório em desenvolvimento !", styleAlert).show();
//                startActivity(new Intent(this, DashRevisao500hrsLogMaxModelosActivity.class));
                break;
        }
    }

    public void abrirManutencaoProgGrua(View view){
        Crouton.makeText(ServicosLogMaxActivity.this, "Relatório em desenvolvimento !", styleAlert).show();
    }
    public void manualServiço(View view){
        Crouton.makeText(ServicosLogMaxActivity.this, "Relatório em desenvolvimento !", styleAlert).show();
    }
    public void CatalogoPeças(View view){
        Crouton.makeText(ServicosLogMaxActivity.this, "Relatório em desenvolvimento !", styleAlert).show();
    }
}
