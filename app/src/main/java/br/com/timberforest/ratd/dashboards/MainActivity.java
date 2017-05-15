package br.com.timberforest.ratd.dashboards;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.GregorianCalendar;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica.ListRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.listActivity.cadastroMecanico.ListCadastroMecanicoActivity;
import br.com.timberforest.ratd.listActivity.relatorioAvaliacaoOperacional.ListRelatorioAvaliacaoOperacionalActivity;
import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseFactory;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesEmailActivity;
import br.com.timberforest.ratd.sharedPreferences.deslocamento.KmRodado;
import br.com.timberforest.ratd.sharedPreferences.deslocamento.OpcoesDeslocamentoActivity;
import br.com.timberforest.ratd.utilitarios.Geolocalizacao;

public class MainActivity extends AppCompatActivity {

    public String digitalSignature = "com.vajsi.digital_signature";
    public String picFolder = "com.alensw.PicFolder";
    public String googlePlayEndereco = "https://play.google.com/store/apps/details?id=";
    private String animacao = "file:///android_asset/animacao_main.html";

     WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DatabaseFactory.initDatabaseConnection(this);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl(animacao);

        PackageManager pm = getPackageManager();
        boolean isInstalled = isPackageInstalled(digitalSignature, pm);
        boolean isInstalledPic = picFolderVerifica(picFolder, pm);
    }

    private boolean isPackageInstalled(String packagename, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(packagename, 0);
            Log.i("Erro", "Pacote Instalado");
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.i("Erro", "Pacote não instalado");
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(googlePlayEndereco + digitalSignature)));
            return false;
        }
    }

    private boolean picFolderVerifica(String packagename, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(packagename, 0);
            Log.i("Erro", "Pacote Instalado");
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.i("Erro", "Pacote não instalado");
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(googlePlayEndereco + picFolder)));
            return false;
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
        if (item.getItemId() == R.id.action_knRodado) {
            Intent intent = new Intent(MainActivity.this, KmRodado.class);
            startActivity(intent);
        }

        if (item.getItemId() == R.id.action_ponto_digital) {
            Intent intent = new Intent(MainActivity.this, OpcoesDeslocamentoActivity.class);
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