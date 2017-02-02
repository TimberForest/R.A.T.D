package br.com.timberforest.ratd.dashboards;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

public class MainActivity extends ActionBarActivity {

    private SharedPreferencesDeslocamento sharedPreferencesDeslocamento = new SharedPreferencesDeslocamento();
    public static final String PREF_NAME = "Preferences";
    TextView btn_ponto_digital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DatabaseFactory.initDatabaseConnection(this);
        setContentView(R.layout.activity_main);

//        btn_ponto_digital = (TextView) findViewById(R.id.btn_ponto_digital);

        //atualizarBotao();
        /*btn_ponto_digital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferencesDeslocamento.fimDesl();
            }
        });*/

    }

    public void atualizarBotao() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, 0);
        String iniDesl = sharedPreferences.getString("inicio_deslocamento", "");
        String iniTrab = sharedPreferences.getString("inicio_trabalho", "");
        String iniAlm = sharedPreferences.getString("inicio_almoço", "");
        String fimAlm = sharedPreferences.getString("fim_almoço", "");
        String fimTrab = sharedPreferences.getString("fim_trabalho", "");
        String fimDesl = sharedPreferences.getString("fim_deslocamento", "");

        if (fimDesl.equals("")) {
            btn_ponto_digital.setText("Inicio Deslocamento");
        }

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
        if (item.getItemId()== R.id.action_voltar) {
            super.finish();
        }

        return super.onOptionsItemSelected(item);
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
