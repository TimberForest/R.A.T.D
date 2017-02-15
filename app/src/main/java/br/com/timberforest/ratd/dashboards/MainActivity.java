package br.com.timberforest.ratd.dashboards;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.relatorioAssistenciaTecnica.RelatorioAssistenciaTecnicaDao;
import br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica.ListRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.listActivity.cadastroMecanico.ListCadastroMecanicoActivity;
import br.com.timberforest.ratd.listActivity.relatorioAvaliacaoOperacional.ListRelatorioAvaliacaoOperacionalActivity;
import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseFactory;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesEmailActivity;

import static br.com.timberforest.ratd.R.id.webView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DatabaseFactory.initDatabaseConnection(this);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("file:///android_asset/animacao_main.html");

    }

    //botão voltar do device
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //int id = item.getItemId();
        if (item.getItemId() == R.id.action_ponto_digital) {
            Intent intent = new Intent(MainActivity.this, SharedPreferencesDeslocamento.class);
            startActivity(intent);
        }

        if (item.getItemId() == R.id.action_config) {
            Intent intent = new Intent(MainActivity.this, SharedPreferencesEmailActivity.class);
            startActivity(intent);
        }
/*        if (item.getItemId()== R.id.action_voltar) {
            super.finish();
        }*/

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        super.finish();
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.btn_ponsse:
                startActivity(new Intent(this, ServicosPonsseActivity.class));
                break;
            case R.id.btn_log_max:
                startActivity(new Intent(this, ServicosLogMaxActivity.class));
                break;
            case R.id.RelatoriosAssistenciaTecnicaButton:
                startActivity(new Intent(this, ListRelatorioAssistenciaTecnicaActivity.class));
                break;
            case R.id.RelatoriosAvaliacaoOperacionalButton:
                startActivity(new Intent(this, ListRelatorioAvaliacaoOperacionalActivity.class));
                break;
            case R.id.PerfilMecanicoButton:
                startActivity(new Intent(this, ListCadastroMecanicoActivity.class));
                break;
        }
    }
}