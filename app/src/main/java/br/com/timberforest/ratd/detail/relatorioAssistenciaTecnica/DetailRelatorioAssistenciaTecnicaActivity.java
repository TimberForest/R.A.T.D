package br.com.timberforest.ratd.detail.relatorioAssistenciaTecnica;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.io.FileOutputStream;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.relatorioAssistenciaTecnica.RelatorioAssistenciaTecnicaDao;
import br.com.timberforest.ratd.formulariosActivity.relatorioAssistenciaTecnica.FormRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica.ListRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.RelatorioAssistenciaTecnica;

import br.com.timberforest.ratd.utilitarios.EnviarEmail;

public class DetailRelatorioAssistenciaTecnicaActivity extends ActionBarActivity implements View.OnClickListener{
    private RelatorioAssistenciaTecnicaDao relatorioAssistenciaTecnicaDao = new RelatorioAssistenciaTecnicaDao();
    private RelatorioAssistenciaTecnica relatorioAssistenciaTecnica;
    private CadastroMecanico mecanico;
    public static final String PREF_NAME = "Preferences";
    public String packageName = "com.vajsi.digital_signature";
    FileOutputStream outputStream;
    String filename = "ExemploTeste";

    private String subject= null;
    private String message = null;
    private String email = null;
    public String arquivo = null;
    public String storageImage = "/R.A.T.D./";
    public String relatorio = "Relatorio_Nº";
    public String aux = null;
    public String chassi = "";
    public String horimetro = "";
    public String defeito = "";
    public String defeito1 = "";
    public String defeito2 = "";
    public String defeito3 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_relatorio_relatorio_assistencia_tecnica);
        relatorioAssistenciaTecnica = (RelatorioAssistenciaTecnica) getIntent().getExtras().get("relatorioAssistenciaTecnica");
        atualizarTelaFormulario();

    }

    //botão voltar do device
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent intent = new Intent(DetailRelatorioAssistenciaTecnicaActivity.this, ListRelatorioAssistenciaTecnicaActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    private void atualizarTelaFormulario(){
        TextView textFormularioRelator = (TextView) findViewById(R.id.textRelatorDetailFormulario);
        TextView textFormularioData = (TextView) findViewById(R.id.textDataDetailFormulario);
        TextView textFormularioRelatorio = (TextView) findViewById(R.id.textNumRelatorioDetailFormulario);
        TextView textFormularioChassi = (TextView) findViewById(R.id.textChassiDetailFormulario);
        TextView textFormularioModelo = (TextView) findViewById(R.id.textModeloDetailFormulario);
        TextView textFormularioHorimetro = (TextView) findViewById(R.id.textLeituraHorimetroDetailFormulario);
        TextView textFormularioDistribuidorAssitencia = (TextView) findViewById(R.id.textDistribuidorDetailFormulario);
        TextView textFormularioCidadeDist = (TextView) findViewById(R.id.textCidadeDistDetailFormulario);
        TextView textFormularioEstadoDist= (TextView) findViewById(R.id.textEstadoDistDetailFormulario);
        TextView textFormularioCliente = (TextView) findViewById(R.id.textClienteDetailFormulario);
        TextView textFormularioCidadeCli = (TextView) findViewById(R.id.textCidadeCliDetailFormulario);
        TextView textFormularioEstadoCli = (TextView) findViewById(R.id.textEstadoCliDetailFormulario);
        TextView textFormularioLocObra = (TextView) findViewById(R.id.textLocalObraDetailFormulario);
        TextView textFormularioMaterialTransp = (TextView) findViewById(R.id.textMatTranspDetailFormualario);
        TextView textFormularioDefeitoConstatado = (TextView) findViewById(R.id.textDefeitoConstDetailFormulario);
        TextView textFormularioProcedAdot = (TextView) findViewById(R.id.textProcedimentoAdotDetailFormulario);
        TextView textFormularioPendencias = (TextView) findViewById(R.id.textPendenciasAdotDetailFormulario);
        TextView textFormularioKmRodad = (TextView) findViewById(R.id.textKmRodadoDetailFormulario);
        TextView textFormularioDeslocamento = (TextView) findViewById(R.id.textDeslocamentoDetailFormulario);
        TextView textFormularioTrabalho = (TextView) findViewById(R.id.textTrabalhoDetailFormulario);
        TextView textFormularioRefeicao = (TextView) findViewById(R.id.textRefeicaoDetailFormulario);
        TextView textFormularioExtraServ = (TextView) findViewById(R.id.textExtraServDetailFormulario);
        TextView textFormularioExtraDesl = (TextView) findViewById(R.id.textExtraDeslDetailFormulario);
        TextView textFormularioGetCodPec = (TextView) findViewById(R.id.textCodigoDetailFormulario);
        TextView textFormularioGetPecaQtd = (TextView) findViewById(R.id.textQtdDetailFormulario);
        TextView textFormularioGetDescPec = (TextView) findViewById(R.id.textDescricaoDetailFormulario);

        textFormularioRelator.setText(relatorioAssistenciaTecnica.getRelator());
        textFormularioData.setText(relatorioAssistenciaTecnica.getData());
        textFormularioRelatorio.setText(relatorioAssistenciaTecnica.getNumeroRelatorio());
        textFormularioChassi.setText(relatorioAssistenciaTecnica.getNumeroChassi());
        textFormularioModelo.setText(relatorioAssistenciaTecnica.getModelo());
        textFormularioHorimetro.setText(relatorioAssistenciaTecnica.getHorimetro());
        textFormularioDistribuidorAssitencia.setText(relatorioAssistenciaTecnica.getDistribuidorAssisTec());
        textFormularioCidadeDist.setText(relatorioAssistenciaTecnica.getCidadeDistr());
        textFormularioEstadoDist.setText(relatorioAssistenciaTecnica.getEstadoDistr());
        textFormularioCliente.setText(relatorioAssistenciaTecnica.getCliente());
        textFormularioCidadeCli.setText(relatorioAssistenciaTecnica.getCidadeCli());
        textFormularioEstadoCli.setText(relatorioAssistenciaTecnica.getEstadoCli());
        textFormularioLocObra.setText(relatorioAssistenciaTecnica.getLocalObra());
        textFormularioMaterialTransp.setText(relatorioAssistenciaTecnica.getMaterialTransp());
        textFormularioDefeitoConstatado.setText(relatorioAssistenciaTecnica.getDefeitoCostatado());
        textFormularioProcedAdot.setText(relatorioAssistenciaTecnica.getProcedAdot());
        textFormularioPendencias.setText(relatorioAssistenciaTecnica.getPendencias());
        textFormularioKmRodad.setText(relatorioAssistenciaTecnica.getKmRodad());
        textFormularioDeslocamento.setText(relatorioAssistenciaTecnica.getDeslocamento());
        textFormularioTrabalho.setText(relatorioAssistenciaTecnica.getTrabalho());
        textFormularioRefeicao.setText(relatorioAssistenciaTecnica.getRefeicao());
        textFormularioExtraServ.setText(relatorioAssistenciaTecnica.getExtraServ());
        textFormularioExtraDesl.setText(relatorioAssistenciaTecnica.getExtraDesl());
        textFormularioGetCodPec.setText(relatorioAssistenciaTecnica.getGetCodPec());
        textFormularioGetPecaQtd.setText(relatorioAssistenciaTecnica.getPecaQtd());
        textFormularioGetDescPec.setText(relatorioAssistenciaTecnica.getGetDescPec());

        subject="RATD Nº"+textFormularioRelatorio.getText().toString()+" - Técnico: "+textFormularioRelator.getText().toString();
        message="Cliente: "+textFormularioCliente.getText().toString()+" / Data do Serviço: "+textFormularioData.getText().toString();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail_relatorio_asstencia_tecnica, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_edit) {
            Intent intent = new Intent(this, FormRelatorioAssistenciaTecnicaActivity.class);
            intent.putExtra("relatorioAssistenciaTecnica", relatorioAssistenciaTecnica);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.action_enviar) {

            SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, 0);
            String email = sharedPreferences.getString("email", "");

            String[] to = {email};
            Intent enviarEmail = new Intent(Intent.ACTION_SEND);

            enviarEmail.setData(Uri.parse("mailto:"));
            enviarEmail.setType("application/image");
            enviarEmail.putExtra(Intent.EXTRA_EMAIL, to);
            enviarEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
            enviarEmail.putExtra(Intent.EXTRA_TEXT, message);
            startActivity(Intent.createChooser(enviarEmail, "Enviar E-mail com Gmail !!!"));

//            EnviarEmail.enviarEmail(this, email);
        }

        if (item.getItemId() == R.id.action__enviar_email_rigesa) {

            SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, 0);
            String email = sharedPreferences.getString("email_rigesa", "");
            EnviarEmail.enviarEmail(this, email);
        }
        if (item.getItemId() == R.id.action_assinatura) {
            Intent i = new Intent(Intent.ACTION_MAIN);
            PackageManager managerclock = getPackageManager();
            i = managerclock.getLaunchIntentForPackage(packageName);
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected  void onResume(){
        super.onResume();
        if(relatorioAssistenciaTecnica !=null){
            relatorioAssistenciaTecnica = relatorioAssistenciaTecnicaDao.buscaPorId(relatorioAssistenciaTecnica.getIdFormulario());
            atualizarTelaFormulario();
        }
    }

    @Override
    public void onClick(View v) {

    }
}
