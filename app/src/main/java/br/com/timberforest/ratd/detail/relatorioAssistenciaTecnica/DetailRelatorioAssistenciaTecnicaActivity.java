package br.com.timberforest.ratd.detail.relatorioAssistenciaTecnica;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.relatorioAssistenciaTecnica.RelatorioAssistenciaTecnicaDao;
import br.com.timberforest.ratd.formulariosActivity.relatorioAssistenciaTecnica.FormRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.RelatorioAssistenciaTecnica;

import br.com.timberforest.ratd.utilitarios.EnviarEmail;

public class DetailRelatorioAssistenciaTecnicaActivity extends ActionBarActivity {
    private RelatorioAssistenciaTecnicaDao relatorioAssistenciaTecnicaDao = new RelatorioAssistenciaTecnicaDao();
    private RelatorioAssistenciaTecnica relatorioAssistenciaTecnica;
    private CadastroMecanico mecanico;
    public static final String PREF_NAME = "Preferences";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_relatorio_relatorio_assistencia_tecnica);
        relatorioAssistenciaTecnica = (RelatorioAssistenciaTecnica) getIntent().getExtras().get("relatorioAssistenciaTecnica");
        atualizarTelaFormulario();
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
        TextView textFormularioKmRodad = (TextView) findViewById(R.id.textKmRodadoDetailFormulario);
        TextView textFormularioHrsTrablh = (TextView) findViewById(R.id.textHrsTrabalDetailFormulario);
        TextView textFormularioHrsDesloc = (TextView) findViewById(R.id.textHrsDeslocDetailFormulario);
        TextView textFormularioHrsExtrTrab = (TextView) findViewById(R.id.textHrsExtrTrabDetailFormulario);
        TextView textFormularioHrsExtrDesloc = (TextView) findViewById(R.id.textHrsExtrDeslocDetailFormulario);
        TextView textFormularioGetCodPec = (TextView) findViewById(R.id.textCodigoDetailFormulario);
        TextView textFormularioGetPecaQtd = (TextView) findViewById(R.id.textQtdDetailFormulario);
        TextView textFormularioGetDescPec = (TextView) findViewById(R.id.textDescricaoDetailFormulario);
        TextView textFormularioGetCodPec1 = (TextView) findViewById(R.id.textCodigoDetailFormulario1);
        TextView textFormularioGetPecaQtd1 = (TextView) findViewById(R.id.textQtdDetailFormulario1);
        TextView textFormularioGetDescPec1 = (TextView) findViewById(R.id.textDescricaoDetailFormulario1);

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
        textFormularioKmRodad.setText(relatorioAssistenciaTecnica.getKmRodad());
        textFormularioHrsTrablh.setText(relatorioAssistenciaTecnica.getHrsTrablh());
        textFormularioHrsDesloc.setText(relatorioAssistenciaTecnica.getHrsDesloc());
        textFormularioHrsExtrTrab.setText(relatorioAssistenciaTecnica.getHrsExtrTrab());
        textFormularioHrsExtrDesloc.setText(relatorioAssistenciaTecnica.getHrsExtrDesloc());
        textFormularioGetCodPec.setText(relatorioAssistenciaTecnica.getGetCodPec());
        textFormularioGetPecaQtd.setText(relatorioAssistenciaTecnica.getPecaQtd());
        textFormularioGetDescPec.setText(relatorioAssistenciaTecnica.getGetDescPec());
        textFormularioGetCodPec1.setText(relatorioAssistenciaTecnica.getGetCodPec1());
        textFormularioGetPecaQtd1.setText(relatorioAssistenciaTecnica.getGetPecaQtd1());
        textFormularioGetDescPec1.setText(relatorioAssistenciaTecnica.getGetDescPec1());
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail_relatorio_asstencia_tecnica, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_delete){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Excluir RATD");
            builder.setMessage("Deseja realmente excluir esse RATD?");
            builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    relatorioAssistenciaTecnicaDao.excluir(relatorioAssistenciaTecnica);
                    Toast.makeText( DetailRelatorioAssistenciaTecnicaActivity.this, "RATD excluído com sucesso!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
            builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    Toast.makeText(DetailRelatorioAssistenciaTecnicaActivity.this, "RATD não excluído!", Toast.LENGTH_SHORT).show();
                }
            });
            builder.show();
        }
        if (item.getItemId() == R.id.action_edit) {
            Intent intent = new Intent(this, FormRelatorioAssistenciaTecnicaActivity.class);
            intent.putExtra("relatorioAssistenciaTecnica", relatorioAssistenciaTecnica);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.action_enviar) {

            //CHAMANDO O BOTÃO ENVIAR E-MAIL !!!!!!!

//            SharedPreferencesEmailActivity sharedPreferencesEmailActivity = new SharedPreferencesEmailActivity();
            SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, 0);
            String email = sharedPreferences.getString("email", "");
            EnviarEmail.enviarEmail(this, email);
        }

        if (item.getItemId() == R.id.action__enviar_email_rigesa) {

            SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, 0);
            String email = sharedPreferences.getString("email_rigesa", "");
            EnviarEmail.enviarEmail(this, email);
           /* Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:cassiano@rodoparana.com.br;rafael.sontos@rodoparana.com.br;cesar.massucheto@rodoparana.com.br;cesar.ferreira@westrock.com;osmar.jarschel@westrock.com;nick.janssen@westrock.com;joao.abujamra@westrock.com;" +
                    "helio.oliveira@westrock.com;andre.vieira@rodoparana.com.br"));
            startActivity(intent);*/
        }
        if (item.getItemId() == R.id.action_assinatura) {
            Intent i = new Intent(Intent.ACTION_MAIN);
            PackageManager managerclock = getPackageManager();
            i = managerclock.getLaunchIntentForPackage("com.rihan.digitalsignature");
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            startActivity(i);
        }
        /*if (item.getItemId() == R.id.action_voltar) {
           super.finish();
        }*/
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
}