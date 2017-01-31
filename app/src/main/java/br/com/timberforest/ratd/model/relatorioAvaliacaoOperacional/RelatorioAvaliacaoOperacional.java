package br.com.timberforest.ratd.model.relatorioAvaliacaoOperacional;

import android.webkit.JavascriptInterface;

import java.io.Serializable;

/**
 * Created by andre.vieira on 16/09/2015.
 */
public class RelatorioAvaliacaoOperacional implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idRelatorioOperacional;
    private String data;
    private String nomeOpAval;
    private String nomeEmpresAval;
    private String idDeFrotaMaq;
    private String nomeMecanicoAval;
    private String capacete;
    private String oculosDeProtecao;
    private String luva;
    private String camisaMangaLonga;
    private String calcaFaixaRefle;
    private String sapatoNormal;
    private String sapatoOperador;
    private String distanciaEntreMaq;
    private String estacionaLocalAdequado;
    private String distanciaOperadorAbastecimento;
    private String procedimentoSubirDescer;
    private String utilizacaoCorretaSaidaEmenrgencia;
    private String possuiKitContencao;
    private String sabeUsarSistAntChama;
    private String danosCanaletasEstarada;
    private String danosMataNativa;
    private String tiposEquip;
    private String capacidadeReservatorio;
    private String tiposLubrificante;
    private String pontosLubrificao;
    private String interpretacaoManualEquip;
    private String conhecimentoIndicadoresPainel;
    private String utilizacaoCorretaFuncoesJoyStick;
    private String regulagensCalibracoe;
    private String checkListDiario;
    private String relatorioDarioEquip;
    private String preenchimentlivroOcorrencia;
    private String reapertoEquip;
    private String cooperacaoEquip;
    private String comunicacao;
    private String segueNormasTrab;
    private String assiduidade;
    private String movimentosSuavesSincro;
    private String manobrabilidadeEquip;
    private String posicionaEquip;
    private String sentidoExecucaoTrab;
    private String posicaoPilhasLinhas;
    private String leituraMapas;
    private String desempenhoGeralQualidade;
    private String desempenhoGeralProd;
    private String desempenhoGeralSimulador;
    private String obsRelatorioOp;



    private String subirDescerPranMaq;
    private String fixarMaqPrancha;


    private String notaSeguranca;
    private String notaMeioAmbiente;
    private String notaPlanejamento;
    private String notaSimulador;
    private String notaRelatoriosVerificacoesReaperto;
    private String notaPainelAlavancaRegulag;
    private String notaTecnicasOp;
    private String notaDadosTecEq;
    private String notaTrabalhoEquipe;
    private String notaAvaliacaoQualidade;
    private String notaProducao;
    private String notaGeral;

    public RelatorioAvaliacaoOperacional() {

    }

    public RelatorioAvaliacaoOperacional(String capacete, String oculosDeProtecao, String luva, String camisaMangaLonga, String calcaFaixaRefle, String sapatoNormal,
                                         String sapatoOperador, String distanciaEntreMaq, String estacionaLocalAdequado, String distanciaOperadorAbastecimento, String procedimentoSubirDescer,
                                         String utilizacaoCorretaSaidaEmenrgencia, String possuiKitContencao, String sabeUsarSistAntChama, String danosCanaletasEstarada, String danosMataNativa,
                                         String tiposEquip, String capacidadeReservatorio, String tiposLubrificante, String pontosLubrificao, String interpretacaoManualEquip, String conhecimentoIndicadoresPainel,
                                         String utilizacaoCorretaFuncoesJoyStick, String regulagensCalibracoe, String checkListDiario, String relatorioDarioEquip, String preenchimentlivroOcorrencia,
                                         String reapertoEquip, String cooperacaoEquip, String comunicacao, String segueNormasTrab, String assiduidade, String movimentosSuavesSincro, String manobrabilidadeEquip,
                                         String posicionaEquip, String sentidoExecucaoTrab, String posicaoPilhasLinhas, String leituraMapas, String desempenhoGeralQualidade, String desempenhoGeralProd,
                                         String desempenhoGeralSimulador, String data, String notaSeguranca, String notaMeioAmbiente, String notaPlanejamento, String notaSimulador, String notaRelatoriosVerificacoesReaperto,
                                         String notaPainelAlavancaRegulag, String notaTecnicasOp, String notaDadosTecEq, String notaTrabalhoEquipe, String notaAvaliacaoQualidade, String notaProducao, String notaGeral,
                                         String subirDescerPranMaq, String fixarMaqPrancha, String obsRelatorioOp) {
        this.capacete = capacete;
        this.oculosDeProtecao = oculosDeProtecao;
        this.luva = luva;
        this.camisaMangaLonga = camisaMangaLonga;
        this.calcaFaixaRefle = calcaFaixaRefle;
        this.sapatoNormal = sapatoNormal;
        this.sapatoOperador = sapatoOperador;
        this.distanciaEntreMaq = distanciaEntreMaq;
        this.estacionaLocalAdequado = estacionaLocalAdequado;
        this.distanciaOperadorAbastecimento = distanciaOperadorAbastecimento;
        this.procedimentoSubirDescer = procedimentoSubirDescer;
        this.utilizacaoCorretaSaidaEmenrgencia = utilizacaoCorretaSaidaEmenrgencia;
        this.possuiKitContencao = possuiKitContencao;
        this.sabeUsarSistAntChama = sabeUsarSistAntChama;
        this.danosCanaletasEstarada = danosCanaletasEstarada;
        this.danosMataNativa = danosMataNativa;
        this.tiposEquip = tiposEquip;
        this.capacidadeReservatorio = capacidadeReservatorio;
        this.tiposLubrificante = tiposLubrificante;
        this.pontosLubrificao = pontosLubrificao;
        this.interpretacaoManualEquip = interpretacaoManualEquip;
        this.conhecimentoIndicadoresPainel = conhecimentoIndicadoresPainel;
        this.utilizacaoCorretaFuncoesJoyStick = utilizacaoCorretaFuncoesJoyStick;
        this.regulagensCalibracoe = regulagensCalibracoe;
        this.checkListDiario = checkListDiario;
        this.relatorioDarioEquip = relatorioDarioEquip;
        this.preenchimentlivroOcorrencia = preenchimentlivroOcorrencia;
        this.reapertoEquip = reapertoEquip;
        this.cooperacaoEquip = cooperacaoEquip;
        this.comunicacao = comunicacao;
        this.segueNormasTrab = segueNormasTrab;
        this.assiduidade = assiduidade;
        this.movimentosSuavesSincro = movimentosSuavesSincro;
        this.manobrabilidadeEquip = manobrabilidadeEquip;
        this.posicionaEquip = posicionaEquip;
        this.sentidoExecucaoTrab = sentidoExecucaoTrab;
        this.posicaoPilhasLinhas = posicaoPilhasLinhas;
        this.leituraMapas = leituraMapas;
        this.desempenhoGeralQualidade = desempenhoGeralQualidade;
        this.desempenhoGeralProd = desempenhoGeralProd;
        this.desempenhoGeralSimulador = desempenhoGeralSimulador;
        this.obsRelatorioOp = obsRelatorioOp;

        this.subirDescerPranMaq = subirDescerPranMaq;
        this.fixarMaqPrancha = fixarMaqPrancha;

        this.notaSeguranca = notaSeguranca;
        this.notaMeioAmbiente = notaMeioAmbiente;
        this.notaPlanejamento = notaPlanejamento;
        this.notaSimulador = notaSimulador;
        this.notaRelatoriosVerificacoesReaperto = notaRelatoriosVerificacoesReaperto;
        this.notaPainelAlavancaRegulag = notaPainelAlavancaRegulag;
        this.notaTecnicasOp = notaTecnicasOp;
        this.notaDadosTecEq = notaDadosTecEq;
        this.notaTrabalhoEquipe = notaTrabalhoEquipe;
        this.notaAvaliacaoQualidade = notaAvaliacaoQualidade;
        this.notaProducao = notaProducao;
        this.notaGeral = notaGeral;


        this.data = data;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdRelatorioOperacional() {
        return idRelatorioOperacional;
    }

    public void setIdRelatorioOperacional(Long idRelatorioOperacional) {
        this.idRelatorioOperacional = idRelatorioOperacional;
    }

    @JavascriptInterface
    public String getCapacete() {
        return capacete;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    @JavascriptInterface
    public String getOculosDeProtecao() {
        return oculosDeProtecao;
    }

    public void setOculosDeProtecao(String oculosDeProtecao) {
        this.oculosDeProtecao = oculosDeProtecao;
    }

    @JavascriptInterface
    public String getLuva() {
        return luva;
    }

    public void setLuva(String luva) {
        this.luva = luva;
    }

    @JavascriptInterface
    public String getCamisaMangaLonga() {
        return camisaMangaLonga;
    }

    public void setCamisaMangaLonga(String camisaMangaLonga) {
        this.camisaMangaLonga = camisaMangaLonga;
    }

    @JavascriptInterface
    public String getCalcaFaixaRefle() {
        return calcaFaixaRefle;
    }

    public void setCalcaFaixaRefle(String calcaFaixaRefle) {
        this.calcaFaixaRefle = calcaFaixaRefle;
    }

    @JavascriptInterface
    public String getSapatoNormal() {
        return sapatoNormal;
    }

    public void setSapatoNormal(String sapatoNormal) {
        this.sapatoNormal = sapatoNormal;
    }

    @JavascriptInterface
    public String getSapatoOperador() {
        return sapatoOperador;
    }

    public void setSapatoOperador(String sapatoOperador) {
        this.sapatoOperador = sapatoOperador;
    }

    @JavascriptInterface
    public String getDistanciaEntreMaq() {
        return distanciaEntreMaq;
    }

    public void setDistanciaEntreMaq(String distanciaEntreMaq) {
        this.distanciaEntreMaq = distanciaEntreMaq;
    }

    @JavascriptInterface
    public String getEstacionaLocalAdequado() {
        return estacionaLocalAdequado;
    }

    public void setEstacionaLocalAdequado(String estacionaLocalAdequado) {
        this.estacionaLocalAdequado = estacionaLocalAdequado;
    }

    @JavascriptInterface
    public String getDistanciaOperadorAbastecimento() {
        return distanciaOperadorAbastecimento;
    }

    public void setDistanciaOperadorAbastecimento(String distanciaOperadorAbastecimento) {
        this.distanciaOperadorAbastecimento = distanciaOperadorAbastecimento;
    }

    @JavascriptInterface
    public String getProcedimentoSubirDescer() {
        return procedimentoSubirDescer;
    }

    public void setProcedimentoSubirDescer(String procedimentoSubirDescer) {
        this.procedimentoSubirDescer = procedimentoSubirDescer;
    }

    @JavascriptInterface
    public String getUtilizacaoCorretaSaidaEmenrgencia() {
        return utilizacaoCorretaSaidaEmenrgencia;
    }

    public void setUtilizacaoCorretaSaidaEmenrgencia(String utilizacaoCorretaSaidaEmenrgencia) {
        this.utilizacaoCorretaSaidaEmenrgencia = utilizacaoCorretaSaidaEmenrgencia;
    }

    @JavascriptInterface
    public String getPossuiKitContencao() {
        return possuiKitContencao;
    }

    public void setPossuiKitContencao(String possuiKitContencao) {
        this.possuiKitContencao = possuiKitContencao;
    }

    @JavascriptInterface
    public String getSabeUsarSistAntChama() {
        return sabeUsarSistAntChama;
    }

    public void setSabeUsarSistAntChama(String sabeUsarSistAntChama) {
        this.sabeUsarSistAntChama = sabeUsarSistAntChama;
    }

    @JavascriptInterface
    public String getDanosCanaletasEstarada() {
        return danosCanaletasEstarada;
    }

    public void setDanosCanaletasEstarada(String danosCanaletasEstarada) {
        this.danosCanaletasEstarada = danosCanaletasEstarada;
    }

    @JavascriptInterface
    public String getDanosMataNativa() {
        return danosMataNativa;
    }

    public void setDanosMataNativa(String danosMataNativa) {
        this.danosMataNativa = danosMataNativa;
    }

    @JavascriptInterface
    public String getTiposEquip() {
        return tiposEquip;
    }

    public void setTiposEquip(String tiposEquip) {
        this.tiposEquip = tiposEquip;
    }

    @JavascriptInterface
    public String getCapacidadeReservatorio() {
        return capacidadeReservatorio;
    }

    public void setCapacidadeReservatorio(String capacidadeReservatorio) {
        this.capacidadeReservatorio = capacidadeReservatorio;
    }

    @JavascriptInterface
    public String getTiposLubrificante() {
        return tiposLubrificante;
    }

    public void setTiposLubrificante(String tiposLubrificante) {
        this.tiposLubrificante = tiposLubrificante;
    }

    @JavascriptInterface
    public String getPontosLubrificao() {
        return pontosLubrificao;
    }

    public void setPontosLubrificao(String pontosLubrificao) {
        this.pontosLubrificao = pontosLubrificao;
    }

    @JavascriptInterface
    public String getInterpretacaoManualEquip() {
        return interpretacaoManualEquip;
    }

    public void setInterpretacaoManualEquip(String interpretacaoManualEquip) {
        this.interpretacaoManualEquip = interpretacaoManualEquip;
    }

    @JavascriptInterface
    public String getConhecimentoIndicadoresPinel() {
        return conhecimentoIndicadoresPainel;
    }

    public void setConhecimentoIndicadoresPinel(String conhecimentoIndicadoresPinel) {
        this.conhecimentoIndicadoresPainel = conhecimentoIndicadoresPinel;
    }

    @JavascriptInterface
    public String getUtilizacaoCorretaFuncoesJoyStick() {
        return utilizacaoCorretaFuncoesJoyStick;
    }

    public void setUtilizacaoCorretaFuncoesJoyStick(String utilizacaoCorretaFuncoesJoyStick) {
        this.utilizacaoCorretaFuncoesJoyStick = utilizacaoCorretaFuncoesJoyStick;
    }

    @JavascriptInterface
    public String getRegulagensCalibracoe() {
        return regulagensCalibracoe;
    }

    public void setRegulagensCalibracoe(String regulagensCalibracoe) {
        this.regulagensCalibracoe = regulagensCalibracoe;
    }

    @JavascriptInterface
    public String getCheckListDiario() {
        return checkListDiario;
    }

    public void setCheckListDiario(String checkListDiario) {
        this.checkListDiario = checkListDiario;
    }

    @JavascriptInterface
    public String getRelatorioDarioEquip() {
        return relatorioDarioEquip;
    }

    public void setRelatorioDarioEquip(String relatorioDarioEquip) {
        this.relatorioDarioEquip = relatorioDarioEquip;
    }

    @JavascriptInterface
    public String getPreenchimentlivroOcorrencia() {
        return preenchimentlivroOcorrencia;
    }

    public void setPreenchimentlivroOcorrencia(String preenchimentlivroOcorrencia) {
        this.preenchimentlivroOcorrencia = preenchimentlivroOcorrencia;
    }

    @JavascriptInterface
    public String getReapertoEquip() {
        return reapertoEquip;
    }

    public void setReapertoEquip(String reapertoEquip) {
        this.reapertoEquip = reapertoEquip;
    }

    @JavascriptInterface
    public String getCooperacaoEquip() {
        return cooperacaoEquip;
    }

    public void setCooperacaoEquip(String cooperacaoEquip) {
        this.cooperacaoEquip = cooperacaoEquip;
    }

    @JavascriptInterface
    public String getComunicacao() {
        return comunicacao;
    }

    public void setComunicacao(String comunicacao) {
        this.comunicacao = comunicacao;
    }

    @JavascriptInterface
    public String getSegueNormasTrab() {
        return segueNormasTrab;
    }

    public void setSegueNormasTrab(String segueNormasTrab) {
        this.segueNormasTrab = segueNormasTrab;
    }

    @JavascriptInterface
    public String getAssiduidade() {
        return assiduidade;
    }

    public void setAssiduidade(String assiduidade) {
        this.assiduidade = assiduidade;
    }

    @JavascriptInterface
    public String getMovimentosSuavesSincro() {
        return movimentosSuavesSincro;
    }

    public void setMovimentosSuavesSincro(String movimentosSuavesSincro) {
        this.movimentosSuavesSincro = movimentosSuavesSincro;
    }

    @JavascriptInterface
    public String getManobrabilidadeEquip() {
        return manobrabilidadeEquip;
    }

    public void setManobrabilidadeEquip(String manobrabilidadeEquip) {
        this.manobrabilidadeEquip = manobrabilidadeEquip;
    }

    @JavascriptInterface
    public String getPosicionaEquip() {
        return posicionaEquip;
    }

    public void setPosicionaEquip(String posicionaEquip) {
        this.posicionaEquip = posicionaEquip;
    }

    @JavascriptInterface
    public String getSentidoExecucaoTrab() {
        return sentidoExecucaoTrab;
    }

    public void setSentidoExecucaoTrab(String sentidoExecucaoTrab) {
        this.sentidoExecucaoTrab = sentidoExecucaoTrab;
    }

    @JavascriptInterface
    public String getPosicaoPilhasLinhas() {
        return posicaoPilhasLinhas;
    }

    public void setPosicaoPilhasLinhas(String posicaoPilhasLinhas) {
        this.posicaoPilhasLinhas = posicaoPilhasLinhas;
    }

    @JavascriptInterface
    public String getLeituraMapas() {
        return leituraMapas;
    }

    public void setLeituraMapas(String leituraMapas) {
        this.leituraMapas = leituraMapas;
    }

    @JavascriptInterface
    public String getDesempenhoGeralQualidade() {
        return desempenhoGeralQualidade;
    }

    public void setDesempenhoGeralQualidade(String desempenhoGeralQualidade) {
        this.desempenhoGeralQualidade = desempenhoGeralQualidade;
    }

    @JavascriptInterface
    public String getDesempenhoGeralProd() {
        return desempenhoGeralProd;
    }

    public void setDesempenhoGeralProd(String desempenhoGeralProd) {
        this.desempenhoGeralProd = desempenhoGeralProd;
    }

    @JavascriptInterface
    public String getDesempenhoGeralSimulador() {
        return desempenhoGeralSimulador;
    }

    public void setDesempenhoGeralSimulador(String desempenhoGeralSimulador) {
        this.desempenhoGeralSimulador = desempenhoGeralSimulador;
    }

    @JavascriptInterface
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @JavascriptInterface
    public String getNomeOpAval() {
        return nomeOpAval;
    }

    public void setNomeOpAval(String nomeOpAval) {
        this.nomeOpAval = nomeOpAval;
    }

    @JavascriptInterface
    public String getNomeEmpresAval() {
        return nomeEmpresAval;
    }

    public void setNomeEmpresAval(String nomeEmpresAval) {
        this.nomeEmpresAval = nomeEmpresAval;
    }

    @JavascriptInterface
    public String getIdDeFrotaMaq() {
        return idDeFrotaMaq;
    }

    public void setIdDeFrotaMaq(String idDeFrotaMaq) {
        this.idDeFrotaMaq = idDeFrotaMaq;
    }

    @JavascriptInterface
    public String getConhecimentoIndicadoresPainel() {
        return conhecimentoIndicadoresPainel;
    }

    public void setConhecimentoIndicadoresPainel(String conhecimentoIndicadoresPainel) {
        this.conhecimentoIndicadoresPainel = conhecimentoIndicadoresPainel;
    }

    @JavascriptInterface
    public String getNomeMecanicoAval() {
        return nomeMecanicoAval;
    }

    public void setNomeMecanicoAval(String nomeMecanicoAval) {
        this.nomeMecanicoAval = nomeMecanicoAval;
    }

    @JavascriptInterface
    public String getNotaMeioAmbiente() {
        return notaMeioAmbiente;
    }

    public void setNotaMeioAmbiente(String notaMeioAmbiente) {
        this.notaMeioAmbiente = notaMeioAmbiente;
    }

    @JavascriptInterface
    public String getNotaPlanejamento() {
        return notaPlanejamento;
    }

    public void setNotaPlanejamento(String notaPlanejamento) {
        this.notaPlanejamento = notaPlanejamento;
    }

    @JavascriptInterface
    public String getNotaSimulador() {
        return notaSimulador;
    }

    public void setNotaSimulador(String notaSimulador) {
        this.notaSimulador = notaSimulador;
    }

    @JavascriptInterface
    public String getNotaRelatoriosVerificacoesReaperto() {
        return notaRelatoriosVerificacoesReaperto;
    }

    public void setNotaRelatoriosVerificacoesReaperto(String notaRelatoriosVerificacoesReaperto) {
        this.notaRelatoriosVerificacoesReaperto = notaRelatoriosVerificacoesReaperto;
    }

    @JavascriptInterface
    public String getNotaPainelAlavancaRegulag() {
        return notaPainelAlavancaRegulag;
    }

    public void setNotaPainelAlavancaRegulag(String notaPainelAlavancaRegulag) {
        this.notaPainelAlavancaRegulag = notaPainelAlavancaRegulag;
    }

    @JavascriptInterface
    public String getNotaTecnicasOp() {
        return notaTecnicasOp;
    }

    public void setNotaTecnicasOp(String notaTecnicasOp) {
        this.notaTecnicasOp = notaTecnicasOp;
    }

    @JavascriptInterface
    public String getNotaDadosTecEq() {
        return notaDadosTecEq;
    }

    public void setNotaDadosTecEq(String notaDadosTecEq) {
        this.notaDadosTecEq = notaDadosTecEq;
    }

    @JavascriptInterface
    public String getNotaTrabalhoEquipe() {
        return notaTrabalhoEquipe;
    }

    public void setNotaTrabalhoEquipe(String notaTrabalhoEquipe) {
        this.notaTrabalhoEquipe = notaTrabalhoEquipe;
    }

    @JavascriptInterface
    public String getNotaAvaliacaoQualidade() {
        return notaAvaliacaoQualidade;
    }

    public void setNotaAvaliacaoQualidade(String notaAvaliacaoQualidade) {
        this.notaAvaliacaoQualidade = notaAvaliacaoQualidade;
    }

    @JavascriptInterface
    public String getNotaProducao() {
        return notaProducao;
    }

    public void setNotaProducao(String notaProducao) {
        this.notaProducao = notaProducao;
    }

    @JavascriptInterface
    public String getNotaGeral() {
        return notaGeral;
    }

    public void setNotaGeral(String notaGeral) {
        this.notaGeral = notaGeral;
    }
    @JavascriptInterface
    public String getNotaSeguranca() {
        return notaSeguranca;
    }

    public void setNotaSeguranca(String notaSeguranca) {
        this.notaSeguranca = notaSeguranca;
    }

    @JavascriptInterface
    public String getSubirDescerPranMaq() {
        return subirDescerPranMaq;
    }

    public void setSubirDescerPranMaq(String subirDescerPranMaq) {
        this.subirDescerPranMaq = subirDescerPranMaq;
    }

    @JavascriptInterface
    public String getFixarMaqPrancha() {
        return fixarMaqPrancha;
    }

    public void setFixarMaqPrancha(String fixarMaqPrancha) {
        this.fixarMaqPrancha = fixarMaqPrancha;
    }

    @JavascriptInterface
    public String getObsRelatorioOp() {
        return obsRelatorioOp;
    }

    public void setObsRelatorioOp(String obsRelatorioOp) {
        this.obsRelatorioOp = obsRelatorioOp;
    }

}