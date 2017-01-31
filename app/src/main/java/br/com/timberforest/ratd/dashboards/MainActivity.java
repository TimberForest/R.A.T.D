package br.com.timberforest.ratd.dashboards;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica.ListRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.listActivity.cadastroMecanico.ListCadastroMecanicoActivity;
import br.com.timberforest.ratd.listActivity.relatorioAvaliacaoOperacional.ListRelatorioAvaliacaoOperacionalActivity;
import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseFactory;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesEmailActivity;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DatabaseFactory.initDatabaseConnection(this);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_simples_botao_voltar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //int id = item.getItemId();

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
            case R.id.ServicosPonsseButton:
                startActivity(new Intent(this, ServicosPonsseActivity.class));
                break;
            case R.id.ServicosLogmaxButton:
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
