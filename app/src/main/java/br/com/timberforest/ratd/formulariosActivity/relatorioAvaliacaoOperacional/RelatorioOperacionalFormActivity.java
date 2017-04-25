package br.com.timberforest.ratd.formulariosActivity.relatorioAvaliacaoOperacional;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.cadastroMecanico.CadastroMecanicoDao;
import br.com.timberforest.ratd.dao.relatorioAvaliacaoOperacional.RelatorioAvaliacaoOperacionalDao;
import br.com.timberforest.ratd.dashboards.MainActivity;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;
import br.com.timberforest.ratd.model.relatorioAvaliacaoOperacional.RelatorioAvaliacaoOperacional;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import br.com.timberforest.ratd.utilitarios.Utils;

public class RelatorioOperacionalFormActivity extends ActionBarActivity {

    RelatorioAvaliacaoOperacionalDao relatorioAvaliacaoOperacionalDao = new RelatorioAvaliacaoOperacionalDao();
    private RelatorioAvaliacaoOperacional relatorioAvaliacaoOperacional;

    private EditText edtCapacete, edtOculosProt, edtCamisaManga,edtluva,edtCalca,edtSapatoNormal,edtSapatoOp,edtDistanciaEntreMaq, edtEstacionamentoLocalAdeq, edtDistanciaOpAbast, edtProcedSubirDescer,
            edtUtilizacaoSaidaEmergencia, edtSubirDescerPranchaMaq,edtFixarMaqPrancha, edtPossuiKitCont, edtSabeUsarSisAntChama, edtDanosCanaletaEstrada, edtDanosMataNativa, edtTipoEquip, edtCapacidadeReservatorio,
            edtTiposLubrificante, edtPontosLubrificacao, edtInterpretecaoManualEquip,edtCheckListDiar,edtRelatorioDiarEquip, edtPreenchimentoCorretoLivOcorr,edtReapertoEqui, edtMovimentosSuavesSincro,edtManobrabilidade,
            edtNomeOpAval,edtNomeEmpresaAval, edtIdFrotaMaq,edtCooperacaoEquip,edtComunicacao,edtSegueNormasTrab,edtAssiduidade, edtPosicionamEquip, edtSentidoExecTrabal,edtPosicionamPilhasLinhas,edtLeituraMapas,
            edtConhecimentoIndicador,edtUtilizacaoCorretoJoyStick,edtRegulagenCalibracao,edtDesempenhoGerQualidade,edtDesempenhoGerProducao,edtDesempenhoGerSimulador,edtObsRelatorioOp,edtnotaSeguranca,
            edtnotaMeioAmbiente,edtnotaPlanejamento,edtnotaSimulador,edtnotaRelatoriosVerificacoesReaperto,edtnotaPainelAlavancaRegulag,edtnotaTecnicasOp,edtnotaDadosTecEq,edtnotaTrabalhoEquipe,edtnotaAvaliacaoQualidade,
            edtnotaProducao,edtnotaGeral;

    private Button btnSomar;

    Double resultadoNotaSeguranca = (double)0;
    Double resultadoNotaMeioAmbiente = (double)0;
    Double resultadoNotaPlanejamento = (double)0;
    Double resultadoNotaSimulador = (double)0;
    Double resultadoNotaRelatoriosVerificacoesReaperto = (double)0;
    Double resultadoNotaPainelAlavancaRegulag = (double)0;
    Double resultadoNotaTecnicasOp = (double)0;
    Double resultadoNotaDadosTecEq = (double)0;
    Double resultadoNotaTrabalhoEquipe = (double)0;
    Double resultadoNotaAvaliacaoQualidade = (double)0;
    Double resultadoNotaProducao = (double)0;
    Double resultadoNotaGeral = (double)0;

    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_relatorio_avaliacao_operacional);
        initViews();

        CadastroMecanicoDao cadastroMecanicoDao = new CadastroMecanicoDao();
        List<CadastroMecanico> mecanicos = cadastroMecanicoDao.busca();
        if(mecanicos.size() > 0) {
            CadastroMecanico mecanico = mecanicos.get(0);

            TextView mecanicoAvaliadorTextView = (TextView) findViewById(R.id.mecanico_avaliador);
            mecanicoAvaliadorTextView.setText(mecanico.getNome());

        }
        TextView textDataAvaliacaoOp = (TextView) findViewById(R.id.data_hora_avaliacao);
        textDataAvaliacaoOp.setText(getDateTime());

        edtnotaSeguranca = (EditText)findViewById(R.id.editTextNotaSeguranca);
        edtnotaMeioAmbiente = (EditText)findViewById(R.id.editTextNotameioAmbiente);
        edtnotaPlanejamento = (EditText)findViewById(R.id.editTextNotaPlanejamento);
        edtnotaSimulador = (EditText)findViewById(R.id.editTextNotaSimulador);
        edtnotaRelatoriosVerificacoesReaperto = (EditText)findViewById(R.id.editTextNotaRelatoriosVerificaçReapertos);
        edtnotaPainelAlavancaRegulag= (EditText)findViewById(R.id.editTextNotaPainelAlavancasRegulagens);
        edtnotaTecnicasOp = (EditText)findViewById(R.id.editNotaTécnicasOperação);
        edtnotaDadosTecEq = (EditText)findViewById(R.id.editTextDadosTécEquipamento);
        edtnotaTrabalhoEquipe = (EditText)findViewById(R.id.editNotaTextTrabalhoEquipe);
        edtnotaAvaliacaoQualidade = (EditText)findViewById(R.id.editTextAvaliaçãoQualidade);
        edtnotaProducao = (EditText)findViewById(R.id.editTextNotaProducao);
        edtnotaGeral = (EditText)findViewById(R.id.editTextNotaGeral);

        btnSomar = (Button)findViewById(R.id.onClick_btnSomar);
        btnSomar.setOnClickListener(onClick_btnSomar);

        if (getIntent().hasExtra("RelatorioAvaliacaoOperacional")) {
            relatorioAvaliacaoOperacional = (RelatorioAvaliacaoOperacional) getIntent().getExtras().get("RelatorioAvaliacaoOperacional");
            //dados cadastrais
            Utils.setTextEditText(this, R.id.editTextNomeEmpresaAval, relatorioAvaliacaoOperacional.getNomeEmpresAval());
            Utils.setTextEditText(this, R.id.editTextNomeOpAval, relatorioAvaliacaoOperacional.getNomeOpAval());
            Utils.setTextEditText(this, R.id.editTextIdDeFrotaMaq, relatorioAvaliacaoOperacional.getIdDeFrotaMaq());
            Utils.setTextFromTextView(this, R.id.mecanico_avaliador, relatorioAvaliacaoOperacional.getNomeMecanicoAval());
            Utils.setTextFromTextView(this, R.id.data_hora_avaliacao, relatorioAvaliacaoOperacional.getData());
            //seguran�a
            Utils.setTextEditText(this, R.id.capaceteditText, (relatorioAvaliacaoOperacional.getCapacete()));
            Utils.setTextEditText(this, R.id.oculoseditText, (relatorioAvaliacaoOperacional.getOculosDeProtecao()));
            Utils.setTextEditText(this, R.id.luvaeditText, (relatorioAvaliacaoOperacional.getLuva()));
            Utils.setTextEditText(this, R.id.camisaMangaLongaeditText, (relatorioAvaliacaoOperacional.getCamisaMangaLonga()));
            Utils.setTextEditText(this, R.id.calsaFaixRefleteditText, (relatorioAvaliacaoOperacional.getCalcaFaixaRefle()));
            Utils.setTextEditText(this, R.id.sapatoUsoNormeditText, (relatorioAvaliacaoOperacional.getSapatoNormal()));
            Utils.setTextEditText(this, R.id.sapatoOperacaoeditText, (relatorioAvaliacaoOperacional.getCapacete()));
            Utils.setTextEditText(this, R.id.distanciaEntrMaquinaeditText, (relatorioAvaliacaoOperacional.getDistanciaEntreMaq()));
            Utils.setTextEditText(this, R.id.estacionLocalAdeqeditText, (relatorioAvaliacaoOperacional.getEstacionaLocalAdequado()));
            Utils.setTextEditText(this, R.id.distanciaOpAbastceditText, (relatorioAvaliacaoOperacional.getDistanciaOperadorAbastecimento()));
            Utils.setTextEditText(this, R.id.procedimSubDescereditText, (relatorioAvaliacaoOperacional.getProcedimentoSubirDescer()));
            Utils.setTextEditText(this, R.id.utilizacaoSaidaEmergeditText, (relatorioAvaliacaoOperacional.getUtilizacaoCorretaSaidaEmenrgencia()));
            //t�cnica de opera��o
            Utils.setTextEditText(this, R.id.movimentSuavesSincroneditText, (relatorioAvaliacaoOperacional.getMovimentosSuavesSincro()));
            Utils.setTextEditText(this, R.id.manobraEquipeditText, (relatorioAvaliacaoOperacional.getManobrabilidadeEquip()));
            //dados tecnico equipamento
            Utils.setTextEditText(this, R.id.tipoEquipeditText, (relatorioAvaliacaoOperacional.getTiposEquip()));
            Utils.setTextEditText(this, R.id.capacidadeReserveditText, (relatorioAvaliacaoOperacional.getCapacidadeReservatorio()));
            Utils.setTextEditText(this, R.id.tiposLubrificanteseditText, (relatorioAvaliacaoOperacional.getTiposLubrificante()));
            Utils.setTextEditText(this, R.id.pontosLubrificeditText, (relatorioAvaliacaoOperacional.getPontosLubrificao()));
            Utils.setTextEditText(this, R.id.interpManualEquipeditText, (relatorioAvaliacaoOperacional.getInterpretacaoManualEquip()));
            //reaperto equipamento
            Utils.setTextEditText(this, R.id.chekcListDiareditText, (relatorioAvaliacaoOperacional.getCheckListDiario()));
            Utils.setTextEditText(this, R.id.relatorioDiarEquieditText, (relatorioAvaliacaoOperacional.getRelatorioDarioEquip()));
            Utils.setTextEditText(this, R.id.preenchimLivroOcorreeditText, (relatorioAvaliacaoOperacional.getPreenchimentlivroOcorrencia()));
            Utils.setTextEditText(this, R.id.reapertoEquipeditText, (relatorioAvaliacaoOperacional.getReapertoEquip()));
            //meio ambieite
            Utils.setTextEditText(this, R.id.possuiKitConteditText, (relatorioAvaliacaoOperacional.getPossuiKitContencao()));
            Utils.setTextEditText(this, R.id.sabUsarSitAntChameditText, (relatorioAvaliacaoOperacional.getSabeUsarSistAntChama()));
            Utils.setTextEditText(this, R.id.danosCanaEstraeditText, (relatorioAvaliacaoOperacional.getDanosCanaletasEstarada()));
            Utils.setTextEditText(this, R.id.danosMataNativaeditText, (relatorioAvaliacaoOperacional.getDanosMataNativa()));
            //assiduidade
            Utils.setTextEditText(this, R.id.cooperacaoEquieditText,(relatorioAvaliacaoOperacional.getCooperacaoEquip()));
            Utils.setTextEditText(this, R.id.comunicaoeditText, (relatorioAvaliacaoOperacional.getComunicacao()));
            Utils.setTextEditText(this, R.id.segueNormasTrabaeditText, (relatorioAvaliacaoOperacional.getSegueNormasTrab()));
            Utils.setTextEditText(this, R.id.assiduidadeeditText,(relatorioAvaliacaoOperacional.getAssiduidade()));
            //planejamento
            Utils.setTextEditText(this, R.id.posicaoEquipeditText, (relatorioAvaliacaoOperacional.getPosicionaEquip()));
            Utils.setTextEditText(this, R.id.sentidoExecuTrabeditText, (relatorioAvaliacaoOperacional.getSentidoExecucaoTrab()));
            Utils.setTextEditText(this, R.id.posicaoPilhasLinhaseditText, (relatorioAvaliacaoOperacional.getPosicaoPilhasLinhas()));
            Utils.setTextEditText(this, R.id.leituraMapaseditText, (relatorioAvaliacaoOperacional.getLeituraMapas()));
            //painel
            Utils.setTextEditText(this, R.id.conhecimIndicadoresPaineditText, (relatorioAvaliacaoOperacional.getConhecimentoIndicadoresPinel()));
            Utils.setTextEditText(this, R.id.utilizacaoCorretaJoystieditText, (relatorioAvaliacaoOperacional.getUtilizacaoCorretaFuncoesJoyStick()));
            Utils.setTextEditText(this, R.id.regulagCalibraeditText, (relatorioAvaliacaoOperacional.getRegulagensCalibracoe()));
            //desempenho geral
            Utils.setTextEditText(this, R.id.desempenhoGeralQualidadeditText, (relatorioAvaliacaoOperacional.getDesempenhoGeralQualidade()));
            Utils.setTextEditText(this, R.id.desempenhoGeralProducaoeditText, (relatorioAvaliacaoOperacional.getDesempenhoGeralProd()));
            Utils.setTextEditText(this, R.id.desempenhoGeraSimuladorleditText, (relatorioAvaliacaoOperacional.getDesempenhoGeralSimulador()));

            Utils.setTextEditText(this, R.id.suburDescerMaquinaPrnachaeditText, (relatorioAvaliacaoOperacional.getSubirDescerPranMaq()));
            Utils.setTextEditText(this, R.id.fixarMaquinaNaPranchaeditText, (relatorioAvaliacaoOperacional.getFixarMaqPrancha()));

            Utils.setTextEditText(this, R.id.editTextNotaSeguranca, (relatorioAvaliacaoOperacional.getNotaSeguranca()));

            Utils.setTextEditText(this, R.id.editTextNotameioAmbiente, (relatorioAvaliacaoOperacional.getNotaMeioAmbiente()));
            Utils.setTextEditText(this, R.id.editTextNotaPlanejamento, (relatorioAvaliacaoOperacional.getNotaPlanejamento()));
            Utils.setTextEditText(this, R.id.editTextAvaliaçãoQualidade, (relatorioAvaliacaoOperacional.getNotaAvaliacaoQualidade()));
            Utils.setTextEditText(this, R.id.editTextNotaRelatoriosVerificaçReapertos, (relatorioAvaliacaoOperacional.getNotaRelatoriosVerificacoesReaperto()));
            Utils.setTextEditText(this, R.id.editTextNotaPainelAlavancasRegulagens, (relatorioAvaliacaoOperacional.getNotaPainelAlavancaRegulag()));

            Utils.setTextEditText(this, R.id.editNotaTécnicasOperação, (relatorioAvaliacaoOperacional.getNotaTecnicasOp()));
            Utils.setTextEditText(this, R.id.editTextDadosTécEquipamento, (relatorioAvaliacaoOperacional.getNotaDadosTecEq()));
            Utils.setTextEditText(this, R.id.editNotaTextTrabalhoEquipe, (relatorioAvaliacaoOperacional.getNotaTrabalhoEquipe()));
            Utils.setTextEditText(this, R.id.editTextNotaSimulador, (relatorioAvaliacaoOperacional.getNotaSimulador()));
            Utils.setTextEditText(this, R.id.editTextNotaProducao, (relatorioAvaliacaoOperacional.getNotaProducao()));
            Utils.setTextEditText(this, R.id.editTextNotaGeral, (relatorioAvaliacaoOperacional.getNotaGeral()));


            Utils.setTextEditText(this, R.id.editTextObsRelatorioOp, (relatorioAvaliacaoOperacional.getObsRelatorioOp()));

        } else {
            relatorioAvaliacaoOperacional = new RelatorioAvaliacaoOperacional();
        }
    }

    //botão voltar do device
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent it = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(it);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    public void SalvarRelatorioOp(View view){
        relatorioAvaliacaoOperacional.setNomeEmpresAval(Utils.getTextFromEditText(this, R.id.editTextNomeEmpresaAval));
        relatorioAvaliacaoOperacional.setNomeOpAval(Utils.getTextFromEditText(this, R.id.editTextNomeOpAval));
        relatorioAvaliacaoOperacional.setIdDeFrotaMaq(Utils.getTextFromEditText(this, R.id.editTextIdDeFrotaMaq));
        relatorioAvaliacaoOperacional.setNomeMecanicoAval(Utils.getTextFromTextView(this, R.id.mecanico_avaliador));
        relatorioAvaliacaoOperacional.setData(Utils.getTextFromTextView(this, R.id.data_hora_avaliacao));
        //seguran�a
        relatorioAvaliacaoOperacional.setCapacete(Utils.getTextFromEditText(this, R.id.capaceteditText));
        relatorioAvaliacaoOperacional.setOculosDeProtecao(Utils.getTextFromEditText(this, R.id.oculoseditText));
        relatorioAvaliacaoOperacional.setLuva(Utils.getTextFromEditText(this, R.id.luvaeditText));
        relatorioAvaliacaoOperacional.setCamisaMangaLonga(Utils.getTextFromEditText(this, R.id.camisaMangaLongaeditText));
        relatorioAvaliacaoOperacional.setCalcaFaixaRefle(Utils.getTextFromEditText(this, R.id.calsaFaixRefleteditText));
        relatorioAvaliacaoOperacional.setSapatoNormal(Utils.getTextFromEditText(this, R.id.sapatoUsoNormeditText));
        relatorioAvaliacaoOperacional.setSapatoOperador(Utils.getTextFromEditText(this, R.id.sapatoOperacaoeditText));
        relatorioAvaliacaoOperacional.setDistanciaEntreMaq(Utils.getTextFromEditText(this, R.id.distanciaEntrMaquinaeditText));
        relatorioAvaliacaoOperacional.setEstacionaLocalAdequado(Utils.getTextFromEditText(this, R.id.estacionLocalAdeqeditText));
        relatorioAvaliacaoOperacional.setDistanciaOperadorAbastecimento(Utils.getTextFromEditText(this, R.id.distanciaOpAbastceditText));
        relatorioAvaliacaoOperacional.setProcedimentoSubirDescer(Utils.getTextFromEditText(this, R.id.procedimSubDescereditText));
        relatorioAvaliacaoOperacional.setUtilizacaoCorretaSaidaEmenrgencia(Utils.getTextFromEditText(this, R.id.utilizacaoSaidaEmergeditText));
        //tecnica de opera��o
        relatorioAvaliacaoOperacional.setMovimentosSuavesSincro(Utils.getTextFromEditText(this, R.id.movimentSuavesSincroneditText));
        relatorioAvaliacaoOperacional.setManobrabilidadeEquip(Utils.getTextFromEditText(this, R.id.manobraEquipeditText));
        //dados t�cnicos equipamento
        relatorioAvaliacaoOperacional.setTiposEquip(Utils.getTextFromEditText(this, R.id.tipoEquipeditText));
        relatorioAvaliacaoOperacional.setCapacidadeReservatorio(Utils.getTextFromEditText(this, R.id.capacidadeReserveditText));
        relatorioAvaliacaoOperacional.setTiposLubrificante(Utils.getTextFromEditText(this, R.id.tiposLubrificanteseditText));
        relatorioAvaliacaoOperacional.setPontosLubrificao(Utils.getTextFromEditText(this, R.id.pontosLubrificeditText));
        relatorioAvaliacaoOperacional.setInterpretacaoManualEquip(Utils.getTextFromEditText(this, R.id.interpManualEquipeditText));
        //reaperto equipamento
        relatorioAvaliacaoOperacional.setCheckListDiario(Utils.getTextFromEditText(this, R.id.chekcListDiareditText));
        relatorioAvaliacaoOperacional.setRelatorioDarioEquip(Utils.getTextFromEditText(this, R.id.relatorioDiarEquieditText));
        relatorioAvaliacaoOperacional.setPreenchimentlivroOcorrencia(Utils.getTextFromEditText(this, R.id.preenchimLivroOcorreeditText));
        relatorioAvaliacaoOperacional.setReapertoEquip(Utils.getTextFromEditText(this, R.id.reapertoEquipeditText));
        //meio ambiente
        relatorioAvaliacaoOperacional.setPossuiKitContencao(Utils.getTextFromEditText(this, R.id.possuiKitConteditText));
        relatorioAvaliacaoOperacional.setSabeUsarSistAntChama(Utils.getTextFromEditText(this, R.id.sabUsarSitAntChameditText));
        relatorioAvaliacaoOperacional.setDanosCanaletasEstarada(Utils.getTextFromEditText(this, R.id.danosCanaEstraeditText));
        relatorioAvaliacaoOperacional.setDanosMataNativa(Utils.getTextFromEditText(this, R.id.danosMataNativaeditText));
        //assiduidade
        relatorioAvaliacaoOperacional.setCooperacaoEquip(Utils.getTextFromEditText(this, R.id.cooperacaoEquieditText));
        relatorioAvaliacaoOperacional.setComunicacao(Utils.getTextFromEditText(this, R.id.comunicaoeditText));
        relatorioAvaliacaoOperacional.setSegueNormasTrab(Utils.getTextFromEditText(this, R.id.segueNormasTrabaeditText));
        relatorioAvaliacaoOperacional.setAssiduidade(Utils.getTextFromEditText(this, R.id.assiduidadeeditText));
        //planejamento
        relatorioAvaliacaoOperacional.setPosicionaEquip(Utils.getTextFromEditText(this, R.id.posicaoEquipeditText));
        relatorioAvaliacaoOperacional.setSentidoExecucaoTrab(Utils.getTextFromEditText(this, R.id.sentidoExecuTrabeditText));
        relatorioAvaliacaoOperacional.setPosicaoPilhasLinhas(Utils.getTextFromEditText(this, R.id.posicaoPilhasLinhaseditText));
        relatorioAvaliacaoOperacional.setLeituraMapas(Utils.getTextFromEditText(this, R.id.leituraMapaseditText));
        //painel
        relatorioAvaliacaoOperacional.setConhecimentoIndicadoresPinel(Utils.getTextFromEditText(this, R.id.conhecimIndicadoresPaineditText));
        relatorioAvaliacaoOperacional.setUtilizacaoCorretaFuncoesJoyStick(Utils.getTextFromEditText(this, R.id.utilizacaoCorretaJoystieditText));
        relatorioAvaliacaoOperacional.setRegulagensCalibracoe(Utils.getTextFromEditText(this, R.id.regulagCalibraeditText));
        //aval qualidade
        relatorioAvaliacaoOperacional.setDesempenhoGeralQualidade(Utils.getTextFromEditText(this, R.id.desempenhoGeralQualidadeditText));
        //aval produ��o
        relatorioAvaliacaoOperacional.setDesempenhoGeralProd(Utils.getTextFromEditText(this, R.id.desempenhoGeralProducaoeditText));
        //aval simulador
        relatorioAvaliacaoOperacional.setDesempenhoGeralSimulador(Utils.getTextFromEditText(this, R.id.desempenhoGeraSimuladorleditText));

        relatorioAvaliacaoOperacional.setNotaSeguranca(Utils.getTextFromEditText(this, R.id.editTextNotaSeguranca));
        relatorioAvaliacaoOperacional.setNotaMeioAmbiente(Utils.getTextFromEditText(this, R.id.editTextNotameioAmbiente));
        relatorioAvaliacaoOperacional.setNotaPlanejamento(Utils.getTextFromEditText(this, R.id.editTextNotaPlanejamento));
        relatorioAvaliacaoOperacional.setNotaSimulador(Utils.getTextFromEditText(this, R.id.editTextNotaSimulador));
        relatorioAvaliacaoOperacional.setNotaRelatoriosVerificacoesReaperto(Utils.getTextFromEditText(this, R.id.editTextNotaRelatoriosVerificaçReapertos));
        relatorioAvaliacaoOperacional.setNotaPainelAlavancaRegulag(Utils.getTextFromEditText(this, R.id.editTextNotaPainelAlavancasRegulagens));
        relatorioAvaliacaoOperacional.setNotaTecnicasOp(Utils.getTextFromEditText(this, R.id.editNotaTécnicasOperação));
        relatorioAvaliacaoOperacional.setNotaDadosTecEq(Utils.getTextFromEditText(this, R.id.editTextDadosTécEquipamento));
        relatorioAvaliacaoOperacional.setNotaTrabalhoEquipe(Utils.getTextFromEditText(this, R.id.editNotaTextTrabalhoEquipe));
        relatorioAvaliacaoOperacional.setNotaAvaliacaoQualidade(Utils.getTextFromEditText(this, R.id.editTextAvaliaçãoQualidade));
        relatorioAvaliacaoOperacional.setNotaProducao(Utils.getTextFromEditText(this, R.id.editTextNotaProducao));

        relatorioAvaliacaoOperacional.setSubirDescerPranMaq(Utils.getTextFromEditText(this, R.id.suburDescerMaquinaPrnachaeditText));
        relatorioAvaliacaoOperacional.setFixarMaqPrancha(Utils.getTextFromEditText(this, R.id.fixarMaquinaNaPranchaeditText));

        relatorioAvaliacaoOperacional.setObsRelatorioOp(Utils.getTextFromEditText(this, R.id.editTextObsRelatorioOp));

        relatorioAvaliacaoOperacional.setNotaSeguranca(Utils.getTextFromEditText(this, R.id.editTextNotaSeguranca));
        relatorioAvaliacaoOperacional.setNotaMeioAmbiente(Utils.getTextFromEditText(this, R.id.editTextNotameioAmbiente));
        relatorioAvaliacaoOperacional.setNotaPlanejamento(Utils.getTextFromEditText(this, R.id.editTextNotaPlanejamento));
        relatorioAvaliacaoOperacional.setNotaSimulador(Utils.getTextFromEditText(this, R.id.editTextNotaSimulador));
        relatorioAvaliacaoOperacional.setNotaRelatoriosVerificacoesReaperto(Utils.getTextFromEditText(this, R.id.editTextNotaRelatoriosVerificaçReapertos));
        relatorioAvaliacaoOperacional.setNotaPainelAlavancaRegulag(Utils.getTextFromEditText(this, R.id.editTextNotaPainelAlavancasRegulagens));
        relatorioAvaliacaoOperacional.setNotaTecnicasOp(Utils.getTextFromEditText(this, R.id.editNotaTécnicasOperação));
        relatorioAvaliacaoOperacional.setNotaDadosTecEq(Utils.getTextFromEditText(this, R.id.editTextDadosTécEquipamento));
        relatorioAvaliacaoOperacional.setNotaTrabalhoEquipe(Utils.getTextFromEditText(this, R.id.editNotaTextTrabalhoEquipe));
        relatorioAvaliacaoOperacional.setNotaAvaliacaoQualidade(Utils.getTextFromEditText(this, R.id.editTextAvaliaçãoQualidade));
        relatorioAvaliacaoOperacional.setNotaProducao(Utils.getTextFromEditText(this, R.id.editTextNotaProducao));
        relatorioAvaliacaoOperacional.setNotaGeral(Utils.getTextFromEditText(this, R.id.editTextNotaGeral));

        String msgMecanico = getResources().getString(R.string.relatorio_avaliacao_operacional_salvo);

        if (validateFields()) {
            relatorioAvaliacaoOperacionalDao.salvar(relatorioAvaliacaoOperacional);
            Toast.makeText(this, msgMecanico, Toast.LENGTH_LONG).show();
            super.finish();
        }
    }
    private void initViews() {
        resources = getResources();

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                callClearErrors(s);
            }
        };
        edtNomeEmpresaAval = (EditText) findViewById(R.id.editTextNomeEmpresaAval);
        edtNomeEmpresaAval.addTextChangedListener(textWatcher);

        edtNomeOpAval = (EditText) findViewById(R.id.editTextNomeOpAval);
        edtNomeOpAval.addTextChangedListener(textWatcher);

        edtIdFrotaMaq = (EditText) findViewById(R.id.editTextIdDeFrotaMaq);
        edtIdFrotaMaq.addTextChangedListener(textWatcher);

        edtCapacete = (EditText) findViewById(R.id.capaceteditText);
        edtCapacete.addTextChangedListener(textWatcher);

        edtOculosProt = (EditText) findViewById(R.id.oculoseditText);
        edtOculosProt.addTextChangedListener(textWatcher);

        edtluva = (EditText) findViewById(R.id.luvaeditText);
        edtluva.addTextChangedListener(textWatcher);

        edtCamisaManga = (EditText) findViewById(R.id.camisaMangaLongaeditText);
        edtCamisaManga.addTextChangedListener(textWatcher);

        edtCalca = (EditText) findViewById(R.id.calsaFaixRefleteditText);
        edtCalca.addTextChangedListener(textWatcher);

        edtSapatoNormal = (EditText) findViewById(R.id.sapatoUsoNormeditText);
        edtSapatoNormal.addTextChangedListener(textWatcher);

        edtSapatoOp = (EditText) findViewById(R.id.sapatoOperacaoeditText);
        edtSapatoOp.addTextChangedListener(textWatcher);

        edtDistanciaEntreMaq = (EditText) findViewById(R.id.distanciaEntrMaquinaeditText);
        edtDistanciaEntreMaq.addTextChangedListener(textWatcher);

        edtEstacionamentoLocalAdeq = (EditText) findViewById(R.id.estacionLocalAdeqeditText);
        edtEstacionamentoLocalAdeq.addTextChangedListener(textWatcher);

        edtDistanciaOpAbast = (EditText) findViewById(R.id.distanciaOpAbastceditText);
        edtDistanciaOpAbast.addTextChangedListener(textWatcher);

        edtProcedSubirDescer = (EditText) findViewById(R.id.procedimSubDescereditText);
        edtProcedSubirDescer.addTextChangedListener(textWatcher);

        edtUtilizacaoSaidaEmergencia = (EditText) findViewById(R.id.utilizacaoSaidaEmergeditText);
        edtUtilizacaoSaidaEmergencia.addTextChangedListener(textWatcher);

        edtMovimentosSuavesSincro = (EditText) findViewById(R.id.movimentSuavesSincroneditText);
        edtMovimentosSuavesSincro.addTextChangedListener(textWatcher);

        edtManobrabilidade = (EditText) findViewById(R.id.manobraEquipeditText);
        edtManobrabilidade.addTextChangedListener(textWatcher);

        edtTipoEquip = (EditText) findViewById(R.id.tipoEquipeditText);
        edtTipoEquip.addTextChangedListener(textWatcher);

        edtCapacidadeReservatorio = (EditText) findViewById(R.id.capacidadeReserveditText);
        edtCapacidadeReservatorio.addTextChangedListener(textWatcher);

        edtTiposLubrificante = (EditText) findViewById(R.id.tiposLubrificanteseditText);
        edtTiposLubrificante.addTextChangedListener(textWatcher);

        edtPontosLubrificacao = (EditText) findViewById(R.id.pontosLubrificeditText);
        edtPontosLubrificacao.addTextChangedListener(textWatcher);

        edtInterpretecaoManualEquip = (EditText) findViewById(R.id.interpManualEquipeditText);
        edtInterpretecaoManualEquip.addTextChangedListener(textWatcher);

        edtCheckListDiar = (EditText) findViewById(R.id.chekcListDiareditText);
        edtCheckListDiar.addTextChangedListener(textWatcher);

        edtRelatorioDiarEquip = (EditText) findViewById(R.id.relatorioDiarEquieditText);
        edtRelatorioDiarEquip.addTextChangedListener(textWatcher);

        edtPreenchimentoCorretoLivOcorr = (EditText) findViewById(R.id.preenchimLivroOcorreeditText);
        edtPreenchimentoCorretoLivOcorr.addTextChangedListener(textWatcher);

        edtReapertoEqui = (EditText) findViewById(R.id.reapertoEquipeditText);
        edtReapertoEqui.addTextChangedListener(textWatcher);

        edtPossuiKitCont = (EditText) findViewById(R.id.possuiKitConteditText);
        edtPossuiKitCont.addTextChangedListener(textWatcher);

        edtSabeUsarSisAntChama = (EditText) findViewById(R.id.sabUsarSitAntChameditText);
        edtSabeUsarSisAntChama.addTextChangedListener(textWatcher);

        edtDanosCanaletaEstrada = (EditText) findViewById(R.id.danosCanaEstraeditText);
        edtDanosCanaletaEstrada.addTextChangedListener(textWatcher);

        edtDanosMataNativa = (EditText) findViewById(R.id.danosMataNativaeditText);
        edtDanosMataNativa.addTextChangedListener(textWatcher);

        edtCooperacaoEquip = (EditText) findViewById(R.id.cooperacaoEquieditText);
        edtCooperacaoEquip.addTextChangedListener(textWatcher);

        edtComunicacao = (EditText) findViewById(R.id.comunicaoeditText);
        edtComunicacao.addTextChangedListener(textWatcher);

        edtSegueNormasTrab = (EditText) findViewById(R.id.segueNormasTrabaeditText);
        edtSegueNormasTrab.addTextChangedListener(textWatcher);

        edtAssiduidade = (EditText) findViewById(R.id.assiduidadeeditText);
        edtAssiduidade.addTextChangedListener(textWatcher);

        edtPosicionamEquip = (EditText) findViewById(R.id.posicaoEquipeditText);
        edtPosicionamEquip.addTextChangedListener(textWatcher);

        edtSentidoExecTrabal = (EditText) findViewById(R.id.sentidoExecuTrabeditText);
        edtSentidoExecTrabal.addTextChangedListener(textWatcher);

        edtPosicionamPilhasLinhas = (EditText) findViewById(R.id.posicaoPilhasLinhaseditText);
        edtPosicionamPilhasLinhas.addTextChangedListener(textWatcher);

        edtLeituraMapas = (EditText) findViewById(R.id.leituraMapaseditText);
        edtLeituraMapas.addTextChangedListener(textWatcher);

        edtConhecimentoIndicador = (EditText) findViewById(R.id.conhecimIndicadoresPaineditText);
        edtConhecimentoIndicador.addTextChangedListener(textWatcher);

        edtUtilizacaoCorretoJoyStick = (EditText) findViewById(R.id.utilizacaoCorretaJoystieditText);
        edtUtilizacaoCorretoJoyStick.addTextChangedListener(textWatcher);

        edtRegulagenCalibracao = (EditText) findViewById(R.id.regulagCalibraeditText);
        edtRegulagenCalibracao.addTextChangedListener(textWatcher);

        edtDesempenhoGerProducao = (EditText) findViewById(R.id.desempenhoGeralProducaoeditText);
        edtDesempenhoGerProducao.addTextChangedListener(textWatcher);

        edtDesempenhoGerQualidade = (EditText) findViewById(R.id.desempenhoGeralQualidadeditText);
        edtDesempenhoGerQualidade.addTextChangedListener(textWatcher);

        edtDesempenhoGerSimulador = (EditText) findViewById(R.id.desempenhoGeraSimuladorleditText);
        edtDesempenhoGerSimulador.addTextChangedListener(textWatcher);

        edtSubirDescerPranchaMaq = (EditText) findViewById(R.id.suburDescerMaquinaPrnachaeditText);
        edtSubirDescerPranchaMaq.addTextChangedListener(textWatcher);

        edtFixarMaqPrancha = (EditText) findViewById(R.id.fixarMaquinaNaPranchaeditText);
        edtFixarMaqPrancha.addTextChangedListener(textWatcher);

        edtnotaSeguranca = (EditText) findViewById(R.id.editTextNotaSeguranca);
        edtnotaSeguranca.addTextChangedListener(textWatcher);

        edtnotaMeioAmbiente = (EditText) findViewById(R.id.editTextNotameioAmbiente);
        edtnotaMeioAmbiente.addTextChangedListener(textWatcher);

        edtnotaPlanejamento = (EditText) findViewById(R.id.editTextNotaPlanejamento);
        edtnotaPlanejamento.addTextChangedListener(textWatcher);

        edtnotaAvaliacaoQualidade = (EditText) findViewById(R.id.editTextAvaliaçãoQualidade);
        edtnotaAvaliacaoQualidade.addTextChangedListener(textWatcher);

        edtnotaRelatoriosVerificacoesReaperto = (EditText) findViewById(R.id.editTextNotaRelatoriosVerificaçReapertos);
        edtnotaRelatoriosVerificacoesReaperto.addTextChangedListener(textWatcher);

        edtnotaPainelAlavancaRegulag = (EditText) findViewById(R.id.editTextNotaPainelAlavancasRegulagens);
        edtnotaPainelAlavancaRegulag.addTextChangedListener(textWatcher);

        edtnotaTecnicasOp = (EditText) findViewById(R.id.editNotaTécnicasOperação);
        edtnotaTecnicasOp.addTextChangedListener(textWatcher);

        edtnotaDadosTecEq = (EditText) findViewById(R.id.editTextDadosTécEquipamento);
        edtnotaDadosTecEq.addTextChangedListener(textWatcher);

        edtnotaTrabalhoEquipe = (EditText) findViewById(R.id.editNotaTextTrabalhoEquipe);
        edtnotaTrabalhoEquipe.addTextChangedListener(textWatcher);

        edtnotaSimulador = (EditText) findViewById(R.id.editTextNotaSimulador);
        edtnotaSimulador.addTextChangedListener(textWatcher);

        edtnotaProducao = (EditText) findViewById(R.id.editTextNotaProducao);
        edtnotaProducao.addTextChangedListener(textWatcher);

        edtnotaGeral = (EditText) findViewById(R.id.editTextNotaGeral);
        edtnotaGeral.addTextChangedListener(textWatcher);
    }
    private void callClearErrors(Editable s) {
        if (!s.toString().isEmpty()) {
            clearErrorFields(edtCapacete);
        }
    }
    private boolean validateFields() {
        String nomeEmpresaAval = relatorioAvaliacaoOperacional.getNomeEmpresAval().toString().trim();
        String nomeOpAval = relatorioAvaliacaoOperacional.getNomeOpAval().toString().trim();
        String idDeFrotaMaq = relatorioAvaliacaoOperacional.getIdDeFrotaMaq().toString().trim();
        String capacete = relatorioAvaliacaoOperacional.getCapacete().toString().trim();
        String oculosProt = relatorioAvaliacaoOperacional.getOculosDeProtecao().toString().trim();
        String luva = relatorioAvaliacaoOperacional.getLuva().toString().trim();
        String camisaMangaL = relatorioAvaliacaoOperacional.getCamisaMangaLonga().toString().trim();
        String calcaFaixaReflet = relatorioAvaliacaoOperacional.getCalcaFaixaRefle().toString().trim();
        String sapatoNolmal = relatorioAvaliacaoOperacional.getSapatoNormal().toString().trim();
        String sapatoOperacao = relatorioAvaliacaoOperacional.getSapatoOperador().toString().trim();
        String distanciaEntreMaq = relatorioAvaliacaoOperacional.getDistanciaEntreMaq().toString().trim();
        String estacionaLocalAdeq = relatorioAvaliacaoOperacional.getEstacionaLocalAdequado().toString().trim();
        String distanciaOpAbastc = relatorioAvaliacaoOperacional.getDistanciaOperadorAbastecimento().toString().trim();
        String procedSubirDescer = relatorioAvaliacaoOperacional.getProcedimentoSubirDescer().toString().trim();
        String utilizacaoSaidaEmerg = relatorioAvaliacaoOperacional.getUtilizacaoCorretaSaidaEmenrgencia().toString().trim();
        String movimentoSuavSincroni = relatorioAvaliacaoOperacional.getMovimentosSuavesSincro().toString().trim();
        String manobrabilidadeEqu = relatorioAvaliacaoOperacional.getManobrabilidadeEquip().toString().trim();
        String tipoEquip = relatorioAvaliacaoOperacional.getTiposEquip().toString().trim();
        String capacidadeReserv = relatorioAvaliacaoOperacional.getCapacidadeReservatorio().toString().trim();
        String tiposLubrif = relatorioAvaliacaoOperacional.getTiposLubrificante().toString().trim();
        String pontosLubrif = relatorioAvaliacaoOperacional.getPontosLubrificao().toString().trim();
        String interpretacaoManualEquip = relatorioAvaliacaoOperacional.getInterpretacaoManualEquip().toString().trim();
        String checkListDiar = relatorioAvaliacaoOperacional.getCheckListDiario().toString().trim();
        String relatorioDiarEquip = relatorioAvaliacaoOperacional.getRelatorioDarioEquip().toString().trim();
        String preencLivroOcorre = relatorioAvaliacaoOperacional.getPreenchimentlivroOcorrencia().toString().trim();
        String reapertoEquip = relatorioAvaliacaoOperacional.getReapertoEquip().toString().trim();
        String possuiKitCont = relatorioAvaliacaoOperacional.getPossuiKitContencao().toString().trim();
        String sabeUsarSisAntCham = relatorioAvaliacaoOperacional.getSabeUsarSistAntChama().toString().trim();
        String danosCanalEstra = relatorioAvaliacaoOperacional.getDanosCanaletasEstarada().toString().trim();
        String danosMataNativa = relatorioAvaliacaoOperacional.getDanosMataNativa().toString().trim();

        String cooperacaoEqu = relatorioAvaliacaoOperacional.getCooperacaoEquip().toString().trim();
        String comunicacao = relatorioAvaliacaoOperacional.getComunicacao().toString().trim();
        String segueNormaTrab = relatorioAvaliacaoOperacional.getSegueNormasTrab().toString().trim();
        String assiduidade = relatorioAvaliacaoOperacional.getAssiduidade().toString().trim();
        String posicaoEqu = relatorioAvaliacaoOperacional.getPosicionaEquip().toString().trim();
        String sentidoExecTrab = relatorioAvaliacaoOperacional.getSentidoExecucaoTrab().toString().trim();
        String posicaoPilhLinh = relatorioAvaliacaoOperacional.getPosicaoPilhasLinhas().toString().trim();
        String leituraMapas = relatorioAvaliacaoOperacional.getLeituraMapas().toString().trim();
        String conheceIndicadoresPainel = relatorioAvaliacaoOperacional.getConhecimentoIndicadoresPainel().toString().trim();
        String utilizacaoCorretaJoyStick = relatorioAvaliacaoOperacional.getUtilizacaoCorretaFuncoesJoyStick().toString().trim();
        String regulagenCalibracoes = relatorioAvaliacaoOperacional.getRegulagensCalibracoe().toString().trim();
        String desempenhoGeralQualidade = relatorioAvaliacaoOperacional.getDesempenhoGeralQualidade().toString().trim();
        String desempenhoGeralProd = relatorioAvaliacaoOperacional.getDesempenhoGeralProd().toString().trim();
        String desempenhoGeralSimulador = relatorioAvaliacaoOperacional.getDesempenhoGeralSimulador().toString().trim();

        String subirPranchaMaq = relatorioAvaliacaoOperacional.getSubirDescerPranMaq().toString().trim();
        String fixarMaqPrancha = relatorioAvaliacaoOperacional.getFixarMaqPrancha().toString().trim();

        String notaSeguranca = relatorioAvaliacaoOperacional.getNotaSeguranca().toString().trim();
        String notaMeioAmbiente = relatorioAvaliacaoOperacional.getNotaMeioAmbiente().toString().trim();
        String notaPlanejamento = relatorioAvaliacaoOperacional.getNotaPlanejamento().toString().trim();
        String notaAvaliacaoQualidade= relatorioAvaliacaoOperacional.getNotaAvaliacaoQualidade().toString().trim();
        String notaRelatorioVerifReaperto = relatorioAvaliacaoOperacional.getNotaRelatoriosVerificacoesReaperto().toString().trim();
        String notaPainelAlavanReg = relatorioAvaliacaoOperacional.getNotaPainelAlavancaRegulag().toString().trim();
        String notaTecnicaOp = relatorioAvaliacaoOperacional.getNotaTecnicasOp().toString().trim();
        String notaDadosTecEq = relatorioAvaliacaoOperacional.getNotaDadosTecEq().toString().trim();
        String notaTrabalhoEq = relatorioAvaliacaoOperacional.getNotaTrabalhoEquipe().toString().trim();
        String notaSimulador = relatorioAvaliacaoOperacional.getNotaSimulador().toString().trim();
        String notaProducao = relatorioAvaliacaoOperacional.getNotaProducao().toString().trim();
        String notaGeral = relatorioAvaliacaoOperacional.getNotaGeral().toString().trim();

        return (validaRange(capacete, oculosProt, luva, camisaMangaL, calcaFaixaReflet, sapatoNolmal, sapatoOperacao, distanciaEntreMaq, estacionaLocalAdeq,
                distanciaOpAbastc, procedSubirDescer, utilizacaoSaidaEmerg, movimentoSuavSincroni, manobrabilidadeEqu, tipoEquip, capacidadeReserv, tiposLubrif,
                pontosLubrif, interpretacaoManualEquip, possuiKitCont, sabeUsarSisAntCham, danosCanalEstra, danosMataNativa,cooperacaoEqu, comunicacao, segueNormaTrab, assiduidade,conheceIndicadoresPainel,
                utilizacaoCorretaJoyStick, regulagenCalibracoes, subirPranchaMaq, fixarMaqPrancha)

                &&hasSizeValid(capacete, oculosProt, luva, camisaMangaL, calcaFaixaReflet, sapatoNolmal, sapatoOperacao, distanciaEntreMaq, estacionaLocalAdeq,
                distanciaOpAbastc, procedSubirDescer, utilizacaoSaidaEmerg, movimentoSuavSincroni, manobrabilidadeEqu, tipoEquip, capacidadeReserv, tiposLubrif,
                pontosLubrif, interpretacaoManualEquip, checkListDiar, relatorioDiarEquip, preencLivroOcorre, reapertoEquip, possuiKitCont, sabeUsarSisAntCham, danosCanalEstra, danosMataNativa,
                cooperacaoEqu, comunicacao, segueNormaTrab, assiduidade, posicaoEqu, sentidoExecTrab, posicaoPilhLinh, leituraMapas, conheceIndicadoresPainel,
                utilizacaoCorretaJoyStick, regulagenCalibracoes, desempenhoGeralQualidade, desempenhoGeralProd, desempenhoGeralSimulador, subirPranchaMaq, fixarMaqPrancha)

                && !isEmptyFields(capacete, oculosProt, luva, camisaMangaL, calcaFaixaReflet, sapatoNolmal, sapatoOperacao, distanciaEntreMaq, estacionaLocalAdeq,
                distanciaOpAbastc, procedSubirDescer, utilizacaoSaidaEmerg, movimentoSuavSincroni, manobrabilidadeEqu, tipoEquip, capacidadeReserv, tiposLubrif,
                pontosLubrif, interpretacaoManualEquip, checkListDiar, relatorioDiarEquip, preencLivroOcorre, reapertoEquip, possuiKitCont, sabeUsarSisAntCham, danosCanalEstra, danosMataNativa,
                nomeEmpresaAval, nomeOpAval, idDeFrotaMaq,cooperacaoEqu, comunicacao, segueNormaTrab, assiduidade, posicaoEqu, sentidoExecTrab, posicaoPilhLinh, leituraMapas, conheceIndicadoresPainel,
                utilizacaoCorretaJoyStick, regulagenCalibracoes, desempenhoGeralQualidade, desempenhoGeralProd, desempenhoGeralSimulador, subirPranchaMaq, fixarMaqPrancha, notaSeguranca,
                notaMeioAmbiente, notaPlanejamento, notaAvaliacaoQualidade, notaRelatorioVerifReaperto, notaPainelAlavanReg, notaTecnicaOp, notaDadosTecEq, notaTrabalhoEq, notaSimulador, notaProducao, notaGeral));
    }
    private boolean isEmptyFields(String capacete, String oculosProt, String luva, String camisaMangaL, String calcaFaixaReflet, String sapatoNolmal,
                                  String sapatoOperacao, String distanciaEntreMaq, String estacionaLocalAdeq, String distanciaOpAbastc, String procedSubirDescer, String utilizacaoSaidaEmerg,
                                  String movimentoSuavSincroni, String manobrabilidadeEqu, String tipoEquip, String capacidadeReserv, String tiposLubrif, String pontosLubrif, String interpretacaoManualEquip,
                                  String checkListDiar, String relatorioDiarEquip, String preencLivroOcorre, String reapertoEquip, String possuiKitCont, String sabeUsarSisAntCham, String danosCanalEstra, String danosMataNativa,
                                  String nomeEmpresaAval, String nomeOpAval, String idDeFrotaMaq,String cooperacaoEqu, String comunicacao, String segueNormaTrab, String assiduidade, String posicaoEqu, String sentidoExecTrab,
                                  String posicaoPilhLinh, String leituraMapas, String conheceIndicadoresPainel, String utilizacaoCorretaJoyStick, String regulagenCalibracoes, String desempenhoGeralQualidade,
                                  String desempenhoGeralProd, String desempenhoGeralSimulador, String subirPranchaMaq, String fixarMaqPrancha, String notaSeguranca, String notaMeioAmbiente,
                                  String notaPlanejamento, String notaAvaliacaoQualidade, String notaRelatorioVerifReaperto, String notaPainelAlavanReg, String notaTecnicaOp, String notaDadosTecEq,
                                  String notaTrabalhoEq, String notaSimulador, String notaProducao, String notaGeral) {

        if (TextUtils.isEmpty(nomeEmpresaAval)) {
            edtNomeEmpresaAval.requestFocus();
            edtNomeEmpresaAval.setError(resources.getString(R.string.nome_empresa_aval_required));
            return true;
        } else if (TextUtils.isEmpty(nomeOpAval)) {
            edtNomeOpAval.requestFocus();
            edtNomeOpAval.setError(resources.getString(R.string.nome_op_aval_required));
            return true;
        } else if (TextUtils.isEmpty(idDeFrotaMaq)) {
            edtIdFrotaMaq.requestFocus();
            edtIdFrotaMaq.setError(resources.getString(R.string.id_frota_maq_required));
            return true;
        }
        if (TextUtils.isEmpty(capacete)) {
            edtCapacete.requestFocus();
            edtCapacete.setError(resources.getText(R.string.capacete_required));
            return true;
        } else if (TextUtils.isEmpty(oculosProt)) {
            edtOculosProt.requestFocus();
            edtOculosProt.setError(resources.getString(R.string.oculos_prot_required));
            return true;
        } else if (TextUtils.isEmpty(luva)) {
            edtluva.requestFocus();
            edtluva.setError(resources.getString(R.string.luva_required));
            return true;
        } else if (TextUtils.isEmpty(camisaMangaL)) {
            edtCamisaManga.requestFocus();
            edtCamisaManga.setError(resources.getString(R.string.camisa_manga_required));
            return true;
        } else if (TextUtils.isEmpty(calcaFaixaReflet)) {
            edtCalca.requestFocus();
            edtCalca.setError(resources.getString(R.string.calca_required));
            return true;
        } else if (TextUtils.isEmpty(sapatoNolmal)) {
            edtSapatoNormal.requestFocus();
            edtSapatoNormal.setError(resources.getString(R.string.sapato_norma_required));
            return true;
        } else if (TextUtils.isEmpty(sapatoOperacao)) {
            edtSapatoOp.requestFocus();
            edtSapatoOp.setError(resources.getString(R.string.sapato_operador_required));
            return true;
        } else if (TextUtils.isEmpty(distanciaEntreMaq)) {
            edtDistanciaEntreMaq.requestFocus();
            edtDistanciaEntreMaq.setError(resources.getString(R.string.distancia_entre_maquina_required));
            return true;
        } else if (TextUtils.isEmpty(estacionaLocalAdeq)) {
            edtEstacionamentoLocalAdeq.requestFocus();
            edtEstacionamentoLocalAdeq.setError(resources.getString(R.string.estacionamento_local_adequado_required));
            return true;
        } else if (TextUtils.isEmpty(distanciaOpAbastc)) {
            edtDistanciaOpAbast.requestFocus();
            edtDistanciaOpAbast.setError(resources.getString(R.string.distancia_operador_abastecimento));
            return true;
        } else if (TextUtils.isEmpty(procedSubirDescer)) {
            edtProcedSubirDescer.requestFocus();
            edtProcedSubirDescer.setError(resources.getString(R.string.proced_subir_descer_required));
            return true;
        } else if (TextUtils.isEmpty(utilizacaoSaidaEmerg)) {
            edtUtilizacaoSaidaEmergencia.requestFocus();
            edtUtilizacaoSaidaEmergencia.setError(resources.getString(R.string.utilizacao_saida_emergencia_required));
            return true;
        } else if (TextUtils.isEmpty(movimentoSuavSincroni)) {
            edtMovimentosSuavesSincro.requestFocus();
            edtMovimentosSuavesSincro.setError(resources.getString(R.string.movimento_suave_sincronizado_required));
            return true;
        } else if (TextUtils.isEmpty(manobrabilidadeEqu)) {
            edtManobrabilidade.requestFocus();
            edtManobrabilidade.setError(resources.getString(R.string.manobrabilidade_equipamento_required));
            return true;
        } else if (TextUtils.isEmpty(tipoEquip)) {
            edtTipoEquip.requestFocus();
            edtTipoEquip.setError(resources.getString(R.string.tipo_equipamento_required));
            return true;
        } else if (TextUtils.isEmpty(capacidadeReserv)) {
            edtCapacidadeReservatorio.requestFocus();
            edtCapacidadeReservatorio.setError(resources.getString(R.string.capacidade_reservatorio_required));
            return true;
        } else if (TextUtils.isEmpty(tiposLubrif)) {
            edtTiposLubrificante.requestFocus();
            edtTiposLubrificante.setError(resources.getString(R.string.tipos_lubrificante_required));
            return true;
        } else if (TextUtils.isEmpty(pontosLubrif)) {
            edtPontosLubrificacao.requestFocus();
            edtPontosLubrificacao.setError(resources.getString(R.string.pontos_lubrificacao_required));
            return true;
        } else if (TextUtils.isEmpty(interpretacaoManualEquip)) {
            edtInterpretecaoManualEquip.requestFocus();
            edtInterpretecaoManualEquip.setError(resources.getString(R.string.interpret_manual_required));
            return true;
        } else if (TextUtils.isEmpty(checkListDiar)) {
            edtCheckListDiar.requestFocus();
            edtCheckListDiar.setError(resources.getString(R.string.check_list_required));
            return true;
        } else if (TextUtils.isEmpty(relatorioDiarEquip)) {
            edtRelatorioDiarEquip.requestFocus();
            edtRelatorioDiarEquip.setError(resources.getString(R.string.relatorio_diario_equip_required));
            return true;
        } else if (TextUtils.isEmpty(preencLivroOcorre)) {
            edtPreenchimentoCorretoLivOcorr.requestFocus();
            edtPreenchimentoCorretoLivOcorr.setError(resources.getString(R.string.preenchimento_livro_ocorrencia_required));
            return true;
        } else if (TextUtils.isEmpty(reapertoEquip)) {
            edtReapertoEqui.requestFocus();
            edtReapertoEqui.setError(resources.getString(R.string.reaperto_equip_required));
            return true;
        } else if (TextUtils.isEmpty(possuiKitCont)) {
            edtPossuiKitCont.requestFocus();
            edtPossuiKitCont.setError(resources.getString(R.string.possui_kit_contencao));
            return true;
        } else if (TextUtils.isEmpty(sabeUsarSisAntCham)) {
            edtSabeUsarSisAntChama.requestFocus();
            edtSabeUsarSisAntChama.setError(resources.getString(R.string.usar_ant_chama_required));
            return true;
        } else if (TextUtils.isEmpty(danosCanalEstra)) {
            edtDanosCanaletaEstrada.requestFocus();
            edtDanosCanaletaEstrada.setError(resources.getString(R.string.danos_canaleletas_required));
            return true;
        } else if (TextUtils.isEmpty(danosMataNativa)) {
            edtDanosMataNativa.requestFocus();
            edtDanosMataNativa.setError(resources.getString(R.string.danos_mata_required));
            return true;
        }
        if (TextUtils.isEmpty(cooperacaoEqu)) {
            edtCooperacaoEquip.requestFocus();
            edtCooperacaoEquip.setError(resources.getText(R.string.cooperacao_equipe_required));
            return true;
        }
        else if (TextUtils.isEmpty(comunicacao)) {
            edtComunicacao.requestFocus();
            edtComunicacao.setError(resources.getString(R.string.comunicacao_required));
            return true;
        } else if (TextUtils.isEmpty(segueNormaTrab)) {
            edtSegueNormasTrab.requestFocus();
            edtSegueNormasTrab.setError(resources.getString(R.string.segue_normas_trab_required));
            return true;
        } else if (TextUtils.isEmpty(assiduidade)) {
            edtAssiduidade.requestFocus();
            edtAssiduidade.setError(resources.getString(R.string.assiduidade_required));
            return true;
        } else if (TextUtils.isEmpty(posicaoEqu)) {
            edtPosicionamEquip.requestFocus();
            edtPosicionamEquip.setError(resources.getString(R.string.posicao_equip_required));
            return true;
        } else if (TextUtils.isEmpty(sentidoExecTrab)) {
            edtSentidoExecTrabal.requestFocus();
            edtSentidoExecTrabal.setError(resources.getString(R.string.sentido_exec_trab_required));
            return true;
        } else if (TextUtils.isEmpty(posicaoPilhLinh)) {
            edtPosicionamPilhasLinhas.requestFocus();
            edtPosicionamPilhasLinhas.setError(resources.getString(R.string.posicao_pilhas_required));
            return true;
        } else if (TextUtils.isEmpty(leituraMapas)) {
            edtLeituraMapas.requestFocus();
            edtLeituraMapas.setError(resources.getString(R.string.leitura_mapas_required));
            return true;
        } else if (TextUtils.isEmpty(conheceIndicadoresPainel)) {
            edtConhecimentoIndicador.requestFocus();
            edtConhecimentoIndicador.setError(resources.getString(R.string.conhecimento_indicador_painal_required));
            return true;
        } else if (TextUtils.isEmpty(utilizacaoCorretaJoyStick)) {
            edtUtilizacaoCorretoJoyStick.requestFocus();
            edtUtilizacaoCorretoJoyStick.setError(resources.getString(R.string.utilizacao_funcao_joystick_required));
            return true;
        } else if (TextUtils.isEmpty(regulagenCalibracoes)) {
            edtRegulagenCalibracao.requestFocus();
            edtRegulagenCalibracao.setError(resources.getString(R.string.regulagens_calibracoes_required));
            return true;
        } else if (TextUtils.isEmpty(desempenhoGeralQualidade)) {
            edtDesempenhoGerQualidade.requestFocus();
            edtDesempenhoGerQualidade.setError(resources.getString(R.string.desempenho_geral_qualidade_required));
            return true;
        } else if (TextUtils.isEmpty(desempenhoGeralProd)) {
            edtDesempenhoGerProducao.requestFocus();
            edtDesempenhoGerProducao.setError(resources.getString(R.string.desempenho_geral_producao_required));
            return true;
        } else if (TextUtils.isEmpty(desempenhoGeralSimulador)) {
            edtDesempenhoGerSimulador.requestFocus();
            edtDesempenhoGerSimulador.setError(resources.getString(R.string.movimento_suave_sincronizado_required));
            return true;
        }
        else if (TextUtils.isEmpty(subirPranchaMaq)) {
            edtSubirDescerPranchaMaq.requestFocus();
            edtSubirDescerPranchaMaq.setError(resources.getString(R.string.proced_subir_descer_required));
            return true;
        }else if (TextUtils.isEmpty(fixarMaqPrancha)) {
            edtFixarMaqPrancha.requestFocus();
            edtFixarMaqPrancha.setError(resources.getString(R.string.nome_fixar_maq_prancha_required));
            return true;
        }else if (TextUtils.isEmpty(notaSeguranca)) {
            edtnotaSeguranca.requestFocus();
            edtnotaSeguranca.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }

        else if (TextUtils.isEmpty(notaMeioAmbiente)) {
            edtnotaMeioAmbiente.requestFocus();
            edtnotaMeioAmbiente.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaPlanejamento)) {
            edtnotaPlanejamento.requestFocus();
            edtnotaPlanejamento.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaAvaliacaoQualidade)) {
            edtnotaAvaliacaoQualidade.requestFocus();
            edtnotaAvaliacaoQualidade.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaRelatorioVerifReaperto)) {
            edtnotaRelatoriosVerificacoesReaperto.requestFocus();
            edtnotaRelatoriosVerificacoesReaperto.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaPainelAlavanReg)) {
            edtnotaPainelAlavancaRegulag.requestFocus();
            edtnotaPainelAlavancaRegulag.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaTecnicaOp)) {
            edtnotaTecnicasOp.requestFocus();
            edtnotaTecnicasOp.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaDadosTecEq)) {
            edtnotaDadosTecEq.requestFocus();
            edtnotaDadosTecEq.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaTrabalhoEq)) {
            edtnotaTrabalhoEquipe.requestFocus();
            edtnotaTrabalhoEquipe.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaSimulador)) {
            edtnotaSimulador.requestFocus();
            edtnotaSimulador.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaProducao)) {
            edtnotaProducao.requestFocus();
            edtnotaProducao.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        else if (TextUtils.isEmpty(notaGeral)) {
            edtnotaGeral.requestFocus();
            edtnotaGeral.setError(resources.getString(R.string.calcular_nota_seguranca_required));
            return true;
        }
        return false;
    }
    private boolean hasSizeValid(String capacete,String oculosProt, String luva, String camisaMangaL, String calcaFaixaReflet, String sapatoNolmal,
                                 String sapatoOperacao, String distanciaEntreMaq, String estacionaLocalAdeq, String distanciaOpAbastc, String procedSubirDescer, String utilizacaoSaidaEmerg,
                                 String movimentoSuavSincroni, String manobrabilidadeEqu, String tipoEquip, String capacidadeReserv, String tiposLubrif, String pontosLubrif, String interpretacaoManualEquip,
                                 String checkListDiar, String relatorioDiarEquip, String preencLivroOcorre, String reapertoEquip, String possuiKitCont, String sabeUsarSisAntCham, String danosCanalEstra, String danosMataNativa,
                                 String cooperacaoEqu, String comunicacao, String segueNormaTrab, String assiduidade, String posicaoEqu, String sentidoExecTrab,
                                 String posicaoPilhLinh, String leituraMapas, String conheceIndicadoresPainel, String utilizacaoCorretaJoyStick, String regulagenCalibracoes, String desempenhoGeralQualidade,
                                 String desempenhoGeralProd, String desempenhoGeralSimulador, String subirPranchaMaq, String fixarMaqPrancha){
        //seguran�a
        if (!(capacete.length()<2)){
            edtCapacete.requestFocus();
            edtCapacete.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        } else if (!(oculosProt.length() < 2)) {
            edtOculosProt.requestFocus();
            edtOculosProt.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(luva.length() < 2)) {
            edtluva.requestFocus();
            edtluva.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(camisaMangaL.length() < 2)) {
            edtCamisaManga.requestFocus();
            edtCamisaManga.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(calcaFaixaReflet.length() < 2)) {
            edtCalca.requestFocus();
            edtCalca.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(sapatoNolmal.length() < 2)) {
            edtSapatoNormal.requestFocus();
            edtSapatoNormal.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(sapatoOperacao.length() < 2)) {
            edtSapatoOp.requestFocus();
            edtSapatoOp.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(distanciaEntreMaq.length() < 2)) {
            edtDistanciaEntreMaq.requestFocus();
            edtDistanciaEntreMaq.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(estacionaLocalAdeq.length() < 2)) {
            edtEstacionamentoLocalAdeq.requestFocus();
            edtEstacionamentoLocalAdeq.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(distanciaOpAbastc.length() < 2)) {
            edtDistanciaOpAbast.requestFocus();
            edtDistanciaOpAbast.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(procedSubirDescer.length() < 2)) {
            edtProcedSubirDescer.requestFocus();
            edtProcedSubirDescer.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(utilizacaoSaidaEmerg.length() < 2)) {
            edtUtilizacaoSaidaEmergencia.requestFocus();
            edtUtilizacaoSaidaEmergencia.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        //tecnicas de operac�o
        else if (!(movimentoSuavSincroni.length() < 2)) {
            edtMovimentosSuavesSincro.requestFocus();
            edtMovimentosSuavesSincro.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(manobrabilidadeEqu.length() < 2)) {
            edtManobrabilidade.requestFocus();
            edtManobrabilidade.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        //dados t�cnicos quipamento
        else if (!(tipoEquip.length() < 2)) {
            edtTipoEquip.requestFocus();
            edtTipoEquip.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(capacidadeReserv.length() < 2)) {
            edtCapacidadeReservatorio.requestFocus();
            edtCapacidadeReservatorio.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(tiposLubrif.length() < 2)) {
            edtTiposLubrificante.requestFocus();
            edtTiposLubrificante.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(pontosLubrif.length() < 2)) {
            edtPontosLubrificacao.requestFocus();
            edtPontosLubrificacao.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(interpretacaoManualEquip.length() < 2)) {
            edtInterpretecaoManualEquip.requestFocus();
            edtInterpretecaoManualEquip.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        //relat�rios, verifica�oes reapertos
        else if (!(checkListDiar.length() < 2)) {
            edtCheckListDiar.requestFocus();
            edtCheckListDiar.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        else if (!(relatorioDiarEquip.length() < 2)) {
            edtCheckListDiar.requestFocus();
            edtCheckListDiar.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        else if (!(preencLivroOcorre.length() < 2)) {
            edtPreenchimentoCorretoLivOcorr.requestFocus();
            edtPreenchimentoCorretoLivOcorr.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        else if (!(reapertoEquip.length() < 2)) {
            edtReapertoEqui.requestFocus();
            edtReapertoEqui.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        //meio ambiente
        else if (!(possuiKitCont.length() < 2)) {
            edtPossuiKitCont.requestFocus();
            edtPossuiKitCont.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(sabeUsarSisAntCham.length() < 2)) {
            edtSabeUsarSisAntChama.requestFocus();
            edtSabeUsarSisAntChama.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(danosCanalEstra.length() < 2)) {
            edtDanosCanaletaEstrada.requestFocus();
            edtDanosCanaletaEstrada.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        else if (!(danosMataNativa.length() < 2)) {
            edtDanosMataNativa.requestFocus();
            edtDanosMataNativa.setError(resources.getString(R.string.tamanho_numero_required));
            return false;
        }
        //trabalho em equipe
        if (!(cooperacaoEqu.length() < 2)) {
            edtCooperacaoEquip.requestFocus();
            edtCooperacaoEquip.setError(resources.getString(R.string.tamanho_numero_trabalho_equipe_required));
            return false;
        } else if (!(comunicacao.length() < 2)) {
            edtComunicacao.requestFocus();
            edtComunicacao.setError(resources.getString(R.string.tamanho_numero_trabalho_equipe_required));
            return false;
        }
        else if (!(segueNormaTrab.length() < 2)) {
            edtSegueNormasTrab.requestFocus();
            edtSegueNormasTrab.setError(resources.getString(R.string.tamanho_numero_trabalho_equipe_required));
            return false;
        }
        else if (!(assiduidade.length() < 2)) {
            edtAssiduidade.requestFocus();
            edtAssiduidade.setError(resources.getString(R.string.tamanho_numero_trabalho_equipe_required));
            return false;
        }
        //planejamento
        else if (!(posicaoEqu.length() < 2)) {
            edtPosicionamEquip.requestFocus();
            edtPosicionamEquip.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        else if (!(sentidoExecTrab.length() < 2)) {
            edtSentidoExecTrabal.requestFocus();
            edtSentidoExecTrabal.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        else if (!(posicaoPilhLinh.length() < 2)) {
            edtPosicionamPilhasLinhas.requestFocus();
            edtPosicionamPilhasLinhas.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        else if (!(leituraMapas.length() < 2)) {
            edtLeituraMapas.requestFocus();
            edtLeituraMapas.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        //painel, alavancas e regulagens
        else if (!(conheceIndicadoresPainel.length() < 2)) {
            edtConhecimentoIndicador.requestFocus();
            edtConhecimentoIndicador.setError(resources.getString(R.string.tamanho_numero_trabalho_equipe_required));
            return false;
        }
        else if (!(utilizacaoCorretaJoyStick.length() < 2)) {
            edtUtilizacaoCorretoJoyStick.requestFocus();
            edtUtilizacaoCorretoJoyStick.setError(resources.getString(R.string.tamanho_numero_trabalho_equipe_required));
            return false;
        }
        else if (!(regulagenCalibracoes.length() < 2)) {
            edtRegulagenCalibracao.requestFocus();
            edtRegulagenCalibracao.setError(resources.getString(R.string.tamanho_numero_trabalho_equipe_required));
            return false;
        }
        //avalia�ao de qualidade
        else if (!(desempenhoGeralQualidade.length() < 2)) {
            edtDesempenhoGerQualidade.requestFocus();
            edtDesempenhoGerQualidade.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        //produ��o
        else if (!(desempenhoGeralProd.length() < 2)) {
            edtDesempenhoGerProducao.requestFocus();
            edtDesempenhoGerProducao.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        //simulador
        else if (!(desempenhoGeralSimulador.length() < 2)) {
            edtDesempenhoGerSimulador.requestFocus();
            edtDesempenhoGerSimulador.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }

        else if (!(subirPranchaMaq.length() < 2)) {
            edtSubirDescerPranchaMaq.requestFocus();
            edtSubirDescerPranchaMaq.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        else if (!(fixarMaqPrancha.length() < 2)) {
            edtFixarMaqPrancha.requestFocus();
            edtFixarMaqPrancha.setError(resources.getString(R.string.tamanho_numero_reaperto_verificacoes_required));
            return false;
        }
        return true;
    }
    private boolean validaRange(String capacete,String oculosProt, String luva, String camisaMangaL, String calcaFaixaReflet, String sapatoNolmal,
                                String sapatoOperacao, String distanciaEntreMaq, String estacionaLocalAdeq, String distanciaOpAbastc, String procedSubirDescer, String utilizacaoSaidaEmerg,
                                String movimentoSuavSincroni, String manobrabilidadeEqu, String tipoEquip, String capacidadeReserv, String tiposLubrif, String pontosLubrif, String interpretacaoManualEquip,
                                String possuiKitCont, String sabeUsarSisAntCham, String danosCanalEstra, String danosMataNativa,
                                String cooperacaoEqu, String comunicacao, String segueNormaTrab, String assiduidade, String conheceIndicadoresPainel, String utilizacaoCorretaJoyStick, String regulagenCalibracoes,
                                String subirPranchaMaq, String fixarMaqPrancha){
        //seguran�a
        if (capacete.equals("10")){
            edtCapacete.requestFocus();
            edtCapacete.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (oculosProt.equals("10")){
            edtOculosProt.requestFocus();
            edtOculosProt.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (luva.equals("10")){
            edtluva.requestFocus();
            edtluva.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (camisaMangaL.equals("10")){
            edtCamisaManga.requestFocus();
            edtCamisaManga.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (calcaFaixaReflet.equals("10")){
            edtCalca.requestFocus();
            edtCalca.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (sapatoNolmal.equals("10")){
            edtSapatoNormal.requestFocus();
            edtSapatoNormal.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (sapatoOperacao.equals("10")){
            edtSapatoOp.requestFocus();
            edtSapatoOp.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (distanciaEntreMaq.equals("10")){
            edtDistanciaEntreMaq.requestFocus();
            edtDistanciaEntreMaq.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (estacionaLocalAdeq.equals("10")){
            edtEstacionamentoLocalAdeq.requestFocus();
            edtEstacionamentoLocalAdeq.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (distanciaOpAbastc.equals("10")){
            edtDistanciaOpAbast.requestFocus();
            edtDistanciaOpAbast.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (procedSubirDescer.equals("10")){
            edtProcedSubirDescer.requestFocus();
            edtProcedSubirDescer.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (utilizacaoSaidaEmerg.equals("10")){
            edtUtilizacaoSaidaEmergencia.requestFocus();
            edtUtilizacaoSaidaEmergencia.setError(resources.getString(R.string.range_required));
            return false;
        }
        //t�cnicas de opera��o
        else if (movimentoSuavSincroni.equals("10")){
            edtMovimentosSuavesSincro.requestFocus();
            edtMovimentosSuavesSincro.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (manobrabilidadeEqu.equals("10")){
            edtManobrabilidade.requestFocus();
            edtManobrabilidade.setError(resources.getString(R.string.range_required));
            return false;
        }
        //dados t�cnicos equipamento
        else if (tipoEquip.equals("10")){
            edtTipoEquip.requestFocus();
            edtTipoEquip.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (capacidadeReserv.equals("10")){
            edtCapacidadeReservatorio.requestFocus();
            edtCapacidadeReservatorio.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (tiposLubrif.equals("10")){
            edtTiposLubrificante.requestFocus();
            edtTiposLubrificante.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (pontosLubrif.equals("10")){
            edtPontosLubrificacao.requestFocus();
            edtPontosLubrificacao.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (interpretacaoManualEquip.equals("10")){
            edtInterpretecaoManualEquip.requestFocus();
            edtInterpretecaoManualEquip.setError(resources.getString(R.string.range_required));
            return false;
        }
        //relatorios, verifica�oes, reapertos n�o precisa...

        //meio ambiente
        else if (possuiKitCont.equals("10")){
            edtPossuiKitCont.requestFocus();
            edtPossuiKitCont.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (sabeUsarSisAntCham.equals("10")){
            edtSabeUsarSisAntChama.requestFocus();
            edtSabeUsarSisAntChama.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (danosCanalEstra.equals("10")){
            edtDanosCanaletaEstrada.requestFocus();
            edtDanosCanaletaEstrada.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (danosMataNativa.equals("10")){
            edtDanosMataNativa.requestFocus();
            edtDanosMataNativa.setError(resources.getString(R.string.range_required));
            return false;
        }
        //trabalho em equipe
        if (cooperacaoEqu.equals("10")) {
            edtCooperacaoEquip.requestFocus();
            edtCooperacaoEquip.setError(resources.getString(R.string.range_required));
            return false;
        } else if (comunicacao.equals("10")) {
            edtComunicacao.requestFocus();
            edtComunicacao.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (segueNormaTrab.equals("10")) {
            edtSegueNormasTrab.requestFocus();
            edtSegueNormasTrab.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (assiduidade.equals("10")) {
            edtAssiduidade.requestFocus();
            edtAssiduidade.setError(resources.getString(R.string.range_required));
            return false;
        }
        //painel alavancas e regulagens
        else if (conheceIndicadoresPainel.equals("10")) {
            edtConhecimentoIndicador.requestFocus();
            edtConhecimentoIndicador.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (utilizacaoCorretaJoyStick.equals("10")) {
            edtUtilizacaoCorretoJoyStick.requestFocus();
            edtUtilizacaoCorretoJoyStick.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (regulagenCalibracoes.equals("10")) {
            edtRegulagenCalibracao.requestFocus();
            edtRegulagenCalibracao.setError(resources.getString(R.string.range_required));
            return false;
        }

        else if (subirPranchaMaq.equals("10")) {
            edtSubirDescerPranchaMaq.requestFocus();
            edtSubirDescerPranchaMaq.setError(resources.getString(R.string.range_required));
            return false;
        }
        else if (fixarMaqPrancha.equals("10")) {
            edtFixarMaqPrancha.requestFocus();
            edtFixarMaqPrancha.setError(resources.getString(R.string.range_required));
            return false;
        }
        return true;
    }
    View.OnClickListener onClick_btnSomar = new View.OnClickListener() {
        public void onClick(View v) {
            try
            {
                resultadoNotaSeguranca = getDouble(edtCapacete.getText().toString()) + getDouble(edtOculosProt.getText().toString())+getDouble(edtluva.getText().toString())+
                        getDouble(edtCamisaManga.getText().toString())+getDouble(edtCalca.getText().toString())+getDouble(edtSapatoNormal.getText().toString())+getDouble(edtSapatoOp.getText().toString())+
                        getDouble(edtDistanciaEntreMaq.getText().toString())+getDouble(edtEstacionamentoLocalAdeq.getText().toString())+getDouble(edtDistanciaOpAbast.getText().toString())+
                        getDouble(edtProcedSubirDescer.getText().toString())+getDouble(edtUtilizacaoSaidaEmergencia.getText().toString())+getDouble(edtProcedSubirDescer.getText().toString())+
                        getDouble(edtFixarMaqPrancha.getText().toString());

                resultadoNotaMeioAmbiente = getDouble(edtPossuiKitCont.getText().toString()) + getDouble(edtSabeUsarSisAntChama.getText().toString())+ getDouble(edtDanosCanaletaEstrada.getText().toString())+
                        getDouble(edtDanosMataNativa.getText().toString());

                resultadoNotaPlanejamento = getDouble(edtPosicionamEquip.getText().toString()) + getDouble(edtSentidoExecTrabal.getText().toString())+ getDouble(edtPosicionamPilhasLinhas.getText().toString())+
                        getDouble(edtLeituraMapas.getText().toString());

                resultadoNotaSimulador = getDouble(edtDesempenhoGerSimulador.getText().toString());

                resultadoNotaRelatoriosVerificacoesReaperto = getDouble(edtCheckListDiar.getText().toString()) + getDouble(edtRelatorioDiarEquip.getText().toString())+ getDouble(edtPreenchimentoCorretoLivOcorr.getText().toString())+
                        getDouble(edtReapertoEqui.getText().toString());

                resultadoNotaPainelAlavancaRegulag = getDouble(edtConhecimentoIndicador.getText().toString()) + getDouble(edtUtilizacaoCorretoJoyStick.getText().toString())+ getDouble(edtRegulagenCalibracao.getText().toString());

                resultadoNotaTecnicasOp = getDouble(edtMovimentosSuavesSincro.getText().toString()) + getDouble(edtManobrabilidade.getText().toString());

                resultadoNotaDadosTecEq = getDouble(edtTipoEquip.getText().toString()) + getDouble(edtCapacidadeReservatorio.getText().toString())+ getDouble(edtTiposLubrificante.getText().toString())+
                        getDouble(edtPontosLubrificacao.getText().toString())+getDouble(edtInterpretecaoManualEquip.getText().toString());

                resultadoNotaTrabalhoEquipe = getDouble(edtCooperacaoEquip.getText().toString()) + getDouble(edtComunicacao.getText().toString())+ getDouble(edtSegueNormasTrab.getText().toString())+
                        getDouble(edtAssiduidade.getText().toString());

                resultadoNotaAvaliacaoQualidade = getDouble(edtDesempenhoGerQualidade.getText().toString());

                resultadoNotaProducao = getDouble(edtDesempenhoGerProducao.getText().toString());

                resultadoNotaGeral = getDouble(edtCapacete.getText().toString()) + getDouble(edtOculosProt.getText().toString())+getDouble(edtluva.getText().toString())+
                        getDouble(edtCamisaManga.getText().toString())+getDouble(edtCalca.getText().toString())+getDouble(edtSapatoNormal.getText().toString())+getDouble(edtSapatoOp.getText().toString())+
                        getDouble(edtDistanciaEntreMaq.getText().toString())+getDouble(edtEstacionamentoLocalAdeq.getText().toString())+getDouble(edtDistanciaOpAbast.getText().toString())+
                        getDouble(edtProcedSubirDescer.getText().toString())+getDouble(edtUtilizacaoSaidaEmergencia.getText().toString())+getDouble(edtProcedSubirDescer.getText().toString())+
                        getDouble(edtFixarMaqPrancha.getText().toString())+getDouble(edtPossuiKitCont.getText().toString()) + getDouble(edtSabeUsarSisAntChama.getText().toString())+ getDouble(edtDanosCanaletaEstrada.getText().toString())+
                        getDouble(edtDanosMataNativa.getText().toString())+getDouble(edtPosicionamEquip.getText().toString()) + getDouble(edtSentidoExecTrabal.getText().toString())+ getDouble(edtPosicionamPilhasLinhas.getText().toString())+
                        getDouble(edtLeituraMapas.getText().toString())+getDouble(edtDesempenhoGerSimulador.getText().toString())+getDouble(edtCheckListDiar.getText().toString()) + getDouble(edtRelatorioDiarEquip.getText().toString())+ getDouble(edtPreenchimentoCorretoLivOcorr.getText().toString())+
                        getDouble(edtReapertoEqui.getText().toString())+getDouble(edtConhecimentoIndicador.getText().toString()) + getDouble(edtUtilizacaoCorretoJoyStick.getText().toString())+ getDouble(edtRegulagenCalibracao.getText().toString())+
                        getDouble(edtMovimentosSuavesSincro.getText().toString()) + getDouble(edtManobrabilidade.getText().toString())+ getDouble(edtTipoEquip.getText().toString()) + getDouble(edtCapacidadeReservatorio.getText().toString())+ getDouble(edtTiposLubrificante.getText().toString())+
                        getDouble(edtPontosLubrificacao.getText().toString())+getDouble(edtInterpretecaoManualEquip.getText().toString())+getDouble(edtCooperacaoEquip.getText().toString()) + getDouble(edtComunicacao.getText().toString())+ getDouble(edtSegueNormasTrab.getText().toString())+
                        getDouble(edtAssiduidade.getText().toString())+getDouble(edtDesempenhoGerQualidade.getText().toString())+getDouble(edtDesempenhoGerProducao.getText().toString());

                MostraResultado();

                Mensagem("Resultado gerado com sucesso!");
                //Gravar no LogCat uma informação para auxiliar
                //no processo de desenvolvimento e correção de bugs
                Log.i("Somar", "clicou no botão Somar");
            }
            catch (Exception e) {
                //Gravar no LogCat o erro ocorrido
                TrataErro(e, "Botão Somar");
            }
        }
    };

    private Double getDouble(String pValue)
    {
        if (pValue == null || pValue.length() == 0 || pValue.equals("."))
            return Double.valueOf(0);
        else
            return Double.parseDouble(pValue);
    }

    private void Mensagem(String pMens)
    {
        Toast.makeText(this, pMens, Toast.LENGTH_SHORT).show();
    }

    private void TrataErro(Exception e, String pMens)
    {
        Mensagem(e.getMessage());
        Log.e(getString(R.string.app_name), pMens, e);
    }

    private void MostraResultado()
    {
        String strResultNotaSeguranca = NumberFormat.getInstance().format(resultadoNotaSeguranca);
        edtnotaSeguranca.setText(strResultNotaSeguranca);
        edtnotaSeguranca.setEnabled(false);

        String strResultNotaMeioAmbiente = NumberFormat.getInstance().format(resultadoNotaMeioAmbiente);
        edtnotaMeioAmbiente.setText(strResultNotaMeioAmbiente);
        edtnotaMeioAmbiente.setEnabled(false);

        String strResultNotaPlanejamento = NumberFormat.getInstance().format(resultadoNotaPlanejamento);
        edtnotaPlanejamento.setText(strResultNotaPlanejamento);
        edtnotaPlanejamento.setEnabled(false);

        String strResultNotaSimulador = NumberFormat.getInstance().format(resultadoNotaSimulador);
        edtnotaSimulador.setText(strResultNotaSimulador);
        edtnotaSimulador.setEnabled(false);

        String strResultNotaRelatóriasVerificaçãoReapertos = NumberFormat.getInstance().format(resultadoNotaRelatoriosVerificacoesReaperto);
        edtnotaRelatoriosVerificacoesReaperto.setText(strResultNotaRelatóriasVerificaçãoReapertos);
        edtnotaRelatoriosVerificacoesReaperto.setEnabled(false);

        String strResultNotaPainelAlavancasRegulagens = NumberFormat.getInstance().format(resultadoNotaPainelAlavancaRegulag);
        edtnotaPainelAlavancaRegulag.setText(strResultNotaPainelAlavancasRegulagens);
        edtnotaPainelAlavancaRegulag.setEnabled(false);

        String strNotaTecicasOperacao = NumberFormat.getInstance().format(resultadoNotaTecnicasOp);
        edtnotaTecnicasOp.setText(strNotaTecicasOperacao);
        edtnotaTecnicasOp.setEnabled(false);

        String strTecicasNotaDadosTecnicoEquip = NumberFormat.getInstance().format(resultadoNotaDadosTecEq);
        edtnotaDadosTecEq.setText(strTecicasNotaDadosTecnicoEquip);
        edtnotaDadosTecEq.setEnabled(false);

        String strTecicasNotaTrabalhoEqui = NumberFormat.getInstance().format(resultadoNotaTrabalhoEquipe);
        edtnotaTrabalhoEquipe.setText(strTecicasNotaTrabalhoEqui);
        edtnotaTrabalhoEquipe.setEnabled(false);

        String strTecicasNotaAvaliacaoQual = NumberFormat.getInstance().format(resultadoNotaAvaliacaoQualidade);
        edtnotaAvaliacaoQualidade.setText(strTecicasNotaAvaliacaoQual);
        edtnotaAvaliacaoQualidade.setEnabled(false);

        String strTecicasNotaprodução = NumberFormat.getInstance().format(resultadoNotaProducao);
        edtnotaProducao.setText(strTecicasNotaprodução);
        edtnotaProducao.setEnabled(false);

        String strTecicasGeral = NumberFormat.getInstance().format(resultadoNotaGeral);
        edtnotaGeral.setText(strTecicasGeral);
        edtnotaGeral.setEnabled(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_simples_botao_voltar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

/*        int id = item.getItemId();
        if (id == R.id.action_voltar) {
            super.finish();
        }*/

        return super.onOptionsItemSelected(item);
    }


    private void clearErrorFields(EditText... editTexts) {
        for (EditText editText : editTexts) {
            editText.setError(null);
        }
    }
}