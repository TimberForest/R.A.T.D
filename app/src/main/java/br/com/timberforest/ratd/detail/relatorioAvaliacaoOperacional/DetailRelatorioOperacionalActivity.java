package br.com.timberforest.ratd.detail.relatorioAvaliacaoOperacional;
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
import br.com.timberforest.ratd.dao.relatorioAvaliacaoOperacional.RelatorioAvaliacaoOperacionalDao;
import br.com.timberforest.ratd.formulariosActivity.relatorioAvaliacaoOperacional.RelatorioOperacionalFormActivity;
import br.com.timberforest.ratd.model.relatorioAvaliacaoOperacional.RelatorioAvaliacaoOperacional;

import br.com.timberforest.ratd.utilitarios.EnviarEmail;

public class DetailRelatorioOperacionalActivity extends ActionBarActivity {

    private RelatorioAvaliacaoOperacionalDao relatorioAvaliacaoOperacionalDao = new RelatorioAvaliacaoOperacionalDao();
    private RelatorioAvaliacaoOperacional relatorioAvaliacaoOperacional;
    public static final String PREF_NAME = "Preferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_relatorio_avaliacao_operacional);
        relatorioAvaliacaoOperacional = (RelatorioAvaliacaoOperacional) getIntent().getExtras().get("RelatorioAvaliacaoOperacional");
        atualizarTela();
    }
        private void atualizarTela(){

        TextView textRelatorioCapacete = (TextView) findViewById(R.id.textCapaceteDetailOp);
        TextView textRelatorioOculosProt= (TextView) findViewById(R.id.textOculosProtOp);
        TextView textRelatorioLuva= (TextView) findViewById(R.id.textLuvaDetailOp);
        TextView textRelatorioCamisaMangaL= (TextView) findViewById(R.id.textCamisaMangaDetailOp);
        TextView textRelatorioCalsaFaixR= (TextView) findViewById(R.id.textCalcaFaixRefletDetailOp);
        TextView textRelatorioSapatoUsoN= (TextView) findViewById(R.id.textSapatoUsoNormalDetailOp);
        TextView textRelatorioSapatoOperacional = (TextView) findViewById(R.id.textSapatoOpDetailOp);
        TextView textRelatorioDistanEntrMaq= (TextView) findViewById(R.id.textDistanEntrMaqDetailOp);
        TextView textRelatorioEstacLocAdeq= (TextView) findViewById(R.id.textEstLocalAdDetailOp);
        TextView textRelatorioDistanOpAbastec= (TextView) findViewById(R.id.textDistOpAbastDetailOp);
        TextView textRelatorioProcSubDesc= (TextView) findViewById(R.id.textProcSubDescMaqDetailOp);
        TextView textRelatorioUtilizaSaidaEmerg= (TextView) findViewById(R.id.textUtilizaSaidEmerDetailOp);
        TextView textRelatorioPossuiKitCont = (TextView) findViewById(R.id.textPossuiKitDetailOp);
        TextView textRelatorioSabeUsarSisAntCham= (TextView) findViewById(R.id.textSabeUsarSisAntChamDetailOp);
        TextView textRelatorioDanosCanalEstr= (TextView) findViewById(R.id.textDanosCanaletaEstrDetailOp);
        TextView textRelatorioDanosMatNat= (TextView) findViewById(R.id.textDanosMatNatDetailOp);
        TextView textRelatorioTipoEqu= (TextView) findViewById(R.id.textTipoEquipDetailOp);
        TextView textRelatorioCapacReserv= (TextView) findViewById(R.id.textCapacReservaDetailOp);
        TextView textRelatorioTipoLubrif = (TextView) findViewById(R.id.textTiposLubrifDetailOp);
        TextView textRelatorioPontosLubrifi= (TextView) findViewById(R.id.textPontosLubrifDetailOp);
        TextView textRelatorioInterpManualEqu= (TextView) findViewById(R.id.textInterpManualEqDetailOp);
        TextView textRelatorioConhecIndicPainel= (TextView) findViewById(R.id.textConhecIndicPainDetailOp);
        TextView textRelatorioUtilizacCorretaFuncJoyStic= (TextView) findViewById(R.id.textUtilizFuncJoyStickDetailOp);
        TextView textRelatorioRegulagenCalibr= (TextView) findViewById(R.id.textRegCalibDetailOp);
        TextView textRelatorioCheckListDiar = (TextView) findViewById(R.id.textCheckListDiarDetailOp);
        TextView textRelatorioRelatorioDiarEq= (TextView) findViewById(R.id.textRelatorioDiarEqOp);
        TextView textRelatorioPreenchiLivroOcorr= (TextView) findViewById(R.id.textPreencLivrOcorrDetailOp);
        TextView textRelatorioReapertoEq= (TextView) findViewById(R.id.textReapertEquipDetailOp);
        TextView textRelatorioCoopEqu= (TextView) findViewById(R.id.textCoopEquipDetailOp);
        TextView textRelatorioComunicao= (TextView) findViewById(R.id.textComunicacaoDetailOp);
        TextView textRelatorioSegueNormTrab = (TextView) findViewById(R.id.textSegNormasTrabDetailOp);
        TextView textRelatorioAssiduidade= (TextView) findViewById(R.id.textAssiduidadeDetailOp);
        TextView textRelatorioMovimenSuavSincron= (TextView) findViewById(R.id.textMovSuaveSincronDetailOp);
        TextView textRelatorioManobrabEqu= (TextView) findViewById(R.id.textManobEquipDetailOp);
        TextView textRelatorioPosicionEqu= (TextView) findViewById(R.id.textPoscEquipDiarDetailOp);
        TextView textRelatorioSentExecTrab= (TextView) findViewById(R.id.textSentExecTrabDetailOp);
        TextView textRelatorioPosicPilhasLinhas= (TextView) findViewById(R.id.textPosicPilhLinhDetailOp);
        TextView textRelatorioLeitMapas= (TextView) findViewById(R.id.textLeitMapasDetailOp);
        TextView textRelatorioDesempGerProd= (TextView) findViewById(R.id.textDesempGeralProdDetailOp);
        TextView textRelatorioDesempGerSim= (TextView) findViewById(R.id.textDesempGeralSimDetailOp);
        TextView textRelatorioDesempGerQualid= (TextView) findViewById(R.id.textDesempGeralQualidadeDetailOp);
        TextView textSubirMaqPrancha= (TextView) findViewById(R.id.textViewsSubirPranchaMaq);
        TextView textFixarMaqPrancha= (TextView) findViewById(R.id.textViewFixarMaqPrancha);

        TextView textRelatorioNomeEmpresaAval= (TextView) findViewById(R.id.textViewNomeEmpresaAvaliada);
        TextView textRelatorioNomeOperadorAval= (TextView) findViewById(R.id.textViewNomeDoOperadorAvaliado);
        TextView textRelatorioIdDeFrotaDaMaquina= (TextView) findViewById(R.id.textViewIdDeFrotaDaMaquina);
        TextView textRelatorioNomeMecanicoAvaliador= (TextView) findViewById(R.id.textViewNomeMecanicoAvaliador);
        TextView textRelatorioDataAvaliacao= (TextView) findViewById(R.id.textViewDataDaAvaliacao);
        TextView textRelatorioObs= (TextView) findViewById(R.id.textViewObs);

        TextView textNotaSeguranca= (TextView) findViewById(R.id.textViewNotaSeguranca);
        TextView textNotaMeioAmbiente= (TextView) findViewById(R.id.textViewNotameioAmbiente);
        TextView textNotaPlanejamento= (TextView) findViewById(R.id.textViewNotaPlanejamento);
        TextView textNotaSimulador= (TextView) findViewById(R.id.textViewNotaSimulador);
        TextView textNotaRelatoriosVerificacoesReaperto= (TextView) findViewById(R.id.textViewNotaRelatVeriafiReapert);
        TextView textNotaPainelAlavancaRegulag= (TextView) findViewById(R.id.textViewNotaPainelAlavancReg);
        TextView textNotaTecnicasOp= (TextView) findViewById(R.id.textViewNotaTecnicaOp);
        TextView textNotaDadosTecEq= (TextView) findViewById(R.id.textViewNotaDadosTecEq);
        TextView textNotaTrabalhoEquipe= (TextView) findViewById(R.id.textViewNotaTrabalhoEquipe);
        TextView textNotaAvaliacaoQualidade= (TextView) findViewById(R.id.textViewNotaAvanliacaoQualidade);
        TextView textNotaProducao= (TextView) findViewById(R.id.textViewNotaProducao);
        TextView textNotaGeral= (TextView) findViewById(R.id.textViewNotaGeral);

        textRelatorioCapacete.setText(relatorioAvaliacaoOperacional.getCapacete());
        textRelatorioOculosProt.setText(relatorioAvaliacaoOperacional.getOculosDeProtecao());
        textRelatorioLuva.setText(relatorioAvaliacaoOperacional.getLuva());
        textRelatorioCamisaMangaL.setText(relatorioAvaliacaoOperacional.getCamisaMangaLonga());
        textRelatorioCalsaFaixR.setText(relatorioAvaliacaoOperacional.getCalcaFaixaRefle());
        textRelatorioSapatoUsoN.setText(relatorioAvaliacaoOperacional.getSapatoNormal());
        textRelatorioSapatoOperacional.setText(relatorioAvaliacaoOperacional.getSapatoOperador());
        textRelatorioDistanEntrMaq.setText(relatorioAvaliacaoOperacional.getDistanciaEntreMaq());
        textRelatorioEstacLocAdeq.setText(relatorioAvaliacaoOperacional.getEstacionaLocalAdequado());
        textRelatorioDistanOpAbastec.setText(relatorioAvaliacaoOperacional.getDistanciaOperadorAbastecimento());
        textRelatorioProcSubDesc.setText(relatorioAvaliacaoOperacional.getProcedimentoSubirDescer());
        textRelatorioUtilizaSaidaEmerg.setText(relatorioAvaliacaoOperacional.getUtilizacaoCorretaSaidaEmenrgencia());
        textRelatorioPossuiKitCont.setText(relatorioAvaliacaoOperacional.getPossuiKitContencao());
        textRelatorioSabeUsarSisAntCham.setText(relatorioAvaliacaoOperacional.getSabeUsarSistAntChama());
        textRelatorioDanosCanalEstr.setText(relatorioAvaliacaoOperacional.getDanosCanaletasEstarada());
        textRelatorioDanosMatNat.setText(relatorioAvaliacaoOperacional.getDanosMataNativa());
        textRelatorioTipoEqu.setText(relatorioAvaliacaoOperacional.getTiposEquip());
        textRelatorioCapacReserv.setText(relatorioAvaliacaoOperacional.getCapacidadeReservatorio());
        textRelatorioTipoLubrif.setText(relatorioAvaliacaoOperacional.getTiposLubrificante());
        textRelatorioPontosLubrifi.setText(relatorioAvaliacaoOperacional.getPontosLubrificao());
        textRelatorioInterpManualEqu.setText(relatorioAvaliacaoOperacional.getInterpretacaoManualEquip());
        textRelatorioConhecIndicPainel.setText(relatorioAvaliacaoOperacional.getConhecimentoIndicadoresPinel());
        textRelatorioUtilizacCorretaFuncJoyStic.setText(relatorioAvaliacaoOperacional.getUtilizacaoCorretaFuncoesJoyStick());
        textRelatorioRegulagenCalibr.setText(relatorioAvaliacaoOperacional.getRegulagensCalibracoe());
        textRelatorioCheckListDiar.setText(relatorioAvaliacaoOperacional.getCheckListDiario());
        textRelatorioRelatorioDiarEq.setText(relatorioAvaliacaoOperacional.getRelatorioDarioEquip());
        textRelatorioPreenchiLivroOcorr.setText(relatorioAvaliacaoOperacional.getPreenchimentlivroOcorrencia());
        textRelatorioReapertoEq.setText(relatorioAvaliacaoOperacional.getReapertoEquip());
        textRelatorioCoopEqu.setText(relatorioAvaliacaoOperacional.getCooperacaoEquip());
        textRelatorioComunicao.setText(relatorioAvaliacaoOperacional.getComunicacao());
        textRelatorioSegueNormTrab.setText(relatorioAvaliacaoOperacional.getSegueNormasTrab());
        textRelatorioAssiduidade.setText(relatorioAvaliacaoOperacional.getAssiduidade());
        textRelatorioMovimenSuavSincron.setText(relatorioAvaliacaoOperacional.getMovimentosSuavesSincro());
        textRelatorioManobrabEqu.setText(relatorioAvaliacaoOperacional.getManobrabilidadeEquip());
        textRelatorioPosicionEqu.setText(relatorioAvaliacaoOperacional.getPosicionaEquip());
        textRelatorioSentExecTrab.setText(relatorioAvaliacaoOperacional.getSentidoExecucaoTrab());
        textRelatorioPosicPilhasLinhas.setText(relatorioAvaliacaoOperacional.getPosicaoPilhasLinhas());
        textRelatorioLeitMapas.setText(relatorioAvaliacaoOperacional.getLeituraMapas());
        textRelatorioDesempGerProd.setText(relatorioAvaliacaoOperacional.getDesempenhoGeralProd());
        textRelatorioDesempGerQualid.setText(relatorioAvaliacaoOperacional.getDesempenhoGeralQualidade());
        textRelatorioDesempGerSim.setText(relatorioAvaliacaoOperacional.getDesempenhoGeralSimulador());
        textSubirMaqPrancha.setText(relatorioAvaliacaoOperacional.getSubirDescerPranMaq());
        textFixarMaqPrancha.setText(relatorioAvaliacaoOperacional.getFixarMaqPrancha());

        textRelatorioNomeEmpresaAval.setText(relatorioAvaliacaoOperacional.getNomeEmpresAval());
        textRelatorioNomeOperadorAval.setText(relatorioAvaliacaoOperacional.getNomeOpAval());
        textRelatorioIdDeFrotaDaMaquina.setText(relatorioAvaliacaoOperacional.getIdDeFrotaMaq());
        textRelatorioNomeMecanicoAvaliador.setText(relatorioAvaliacaoOperacional.getNomeMecanicoAval());
        textRelatorioDataAvaliacao.setText(relatorioAvaliacaoOperacional.getData());

        textRelatorioObs.setText(relatorioAvaliacaoOperacional.getObsRelatorioOp());

        textNotaSeguranca.setText(relatorioAvaliacaoOperacional.getNotaSeguranca());
        textNotaMeioAmbiente.setText(relatorioAvaliacaoOperacional.getNotaMeioAmbiente());
        textNotaPlanejamento.setText(relatorioAvaliacaoOperacional.getNotaPlanejamento());
        textNotaSimulador.setText(relatorioAvaliacaoOperacional.getNotaSimulador());
        textNotaRelatoriosVerificacoesReaperto.setText(relatorioAvaliacaoOperacional.getNotaRelatoriosVerificacoesReaperto());
        textNotaPainelAlavancaRegulag.setText(relatorioAvaliacaoOperacional.getNotaPainelAlavancaRegulag());
        textNotaTecnicasOp.setText(relatorioAvaliacaoOperacional.getNotaTecnicasOp());
        textNotaDadosTecEq.setText(relatorioAvaliacaoOperacional.getNotaDadosTecEq());
        textNotaTrabalhoEquipe.setText(relatorioAvaliacaoOperacional.getNotaTrabalhoEquipe());
        textNotaAvaliacaoQualidade.setText(relatorioAvaliacaoOperacional.getNotaAvaliacaoQualidade());
        textNotaProducao.setText(relatorioAvaliacaoOperacional.getNotaProducao());
        textNotaGeral.setText(relatorioAvaliacaoOperacional.getNotaGeral());
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
            builder.setTitle("Excluir Relatório Operacional");
            builder.setMessage("Deseja realmente excluir esse Relatório Operacional?");
            builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    relatorioAvaliacaoOperacionalDao.excluir(relatorioAvaliacaoOperacional);
                    Toast.makeText( DetailRelatorioOperacionalActivity.this, "Relatório Operacional excluído com sucesso!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
            builder.setNegativeButton("Não",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int id) {
                    Toast.makeText( DetailRelatorioOperacionalActivity.this, "Relatótio Operacional nao excluído!", Toast.LENGTH_SHORT).show();
                }
            });
            builder.show();
        }
        if (item.getItemId() == R.id.action_edit) {
            Intent intent = new Intent(this, RelatorioOperacionalFormActivity.class);
            intent.putExtra("RelatorioAvaliacaoOperacional", relatorioAvaliacaoOperacional);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.action_enviar) {
            SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, 0);
            String email = sharedPreferences.getString("email", "");
            EnviarEmail.enviarEmail(this, email);
        }

        if (item.getItemId() == R.id.action__enviar_email_rigesa) {

            SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, 0);
            String email = sharedPreferences.getString("email_rigesa", "");
            EnviarEmail.enviarEmail(this, email);
        }

        if (item.getItemId() == R.id.action_assinatura) {
            Intent i = new Intent(Intent.ACTION_MAIN);
            PackageManager managerclock = getPackageManager();
            i = managerclock.getLaunchIntentForPackage("com.rihan.digitalsignature");
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected  void onResume(){
        super.onResume();
        if(relatorioAvaliacaoOperacional !=null){
            relatorioAvaliacaoOperacional = relatorioAvaliacaoOperacionalDao.buscaPorId(relatorioAvaliacaoOperacional.getIdRelatorioOperacional());
            atualizarTela();
        }
    }
}
