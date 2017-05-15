package br.com.timberforest.ratd.model.relatorioAssitenciaTecnica;

import android.webkit.JavascriptInterface;

import java.io.Serializable;

/**
 * Created by andreives on 17/04/2015.
 */
public class RelatorioAssistenciaTecnica implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long idFormulario;
    private String relator;
    private String data;
    private String numeroRelatorio;
    private String numeroChassi;
    private String modelo;
    private String horimetro;
    private String distribuidorAssisTec;
    private String cidadeDistr;
    private String estadoDistr;
    private String cliente;
    private String cidadeCli;
    private String estadoCli;
    private String localObra;
    private String materialTransp;
    private String defeitoCostatado;
    private String procedAdot;


    private String deslocamento;
    private String trabalho;
    private String refeicao;
    private String extraServ;
    private String extraDesl;
    private String kmRodad;

    private String pendencias;
    private String getCodPec;
    private String getPecaQtd;
    private String getDescPec;

    public RelatorioAssistenciaTecnica(){
    }

    public RelatorioAssistenciaTecnica(Long idFormulario, String relator, String data, String numeroRelatorio, String numeroChassi, String modelo, String horimetro, String distribuidorAssisTec, String cidadeDistr, String estadoDistr, String cliente, String cidadeCli, String estadoCli, String localObra, String materialTransp, String defeitoCostatado, String procedAdot, String deslocamento, String trabalho, String refeicao, String extraServ, String extraDesl, String kmRodad, String pendencias, String getCodPec, String getPecaQtd, String getDescPec) {
        this.idFormulario = idFormulario;
        this.relator = relator;
        this.data = data;
        this.numeroRelatorio = numeroRelatorio;
        this.numeroChassi = numeroChassi;
        this.modelo = modelo;
        this.horimetro = horimetro;
        this.distribuidorAssisTec = distribuidorAssisTec;
        this.cidadeDistr = cidadeDistr;
        this.estadoDistr = estadoDistr;
        this.cliente = cliente;
        this.cidadeCli = cidadeCli;
        this.estadoCli = estadoCli;
        this.localObra = localObra;
        this.materialTransp = materialTransp;
        this.defeitoCostatado = defeitoCostatado;
        this.procedAdot = procedAdot;
        this.deslocamento = deslocamento;
        this.trabalho = trabalho;
        this.refeicao = refeicao;
        this.extraServ = extraServ;
        this.extraDesl = extraDesl;
        this.kmRodad = kmRodad;
        this.pendencias = pendencias;
        this.getCodPec = getCodPec;
        this.getPecaQtd = getPecaQtd;
        this.getDescPec = getDescPec;
    }

    @JavascriptInterface
    public String getDefeitoCostatado() {
        return defeitoCostatado;
    }

    public void setDefeitoCostatado(String defeitoCostatado) {
        this.defeitoCostatado = defeitoCostatado;
    }

    @JavascriptInterface
    public String getPendencias() {
        return pendencias;
    }

    public void setPendencias(String pendencias) {
        this.pendencias = pendencias;
    }

    @JavascriptInterface
    public String getProcedAdot() {
        return procedAdot;
    }

    public void setProcedAdot(String procedAdot) {
        this.procedAdot = procedAdot;
    }
    @JavascriptInterface
    public String getKmRodad() {
        return kmRodad;
    }

    public void setKmRodad(String kmRodad) {
        this.kmRodad = kmRodad;
    }

    @JavascriptInterface
    public String getGetCodPec() {
        return getCodPec;
    }

    public void setGetCodPec(String getCodPec) {
        this.getCodPec = getCodPec;
    }
    @JavascriptInterface
    public String getPecaQtd() {
        return getPecaQtd;
    }

    public void setPecaQtd(String getPecaQtd) {
        this.getPecaQtd = getPecaQtd;
    }
    @JavascriptInterface
    public String getGetDescPec() {
        return getDescPec;
    }

    public void setGetDescPec(String getDescPec) {
        this.getDescPec = getDescPec;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @JavascriptInterface
    public Long getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(Long idFormulario) {
        this.idFormulario = idFormulario;
    }
    @JavascriptInterface
    public String getRelator() {
        return relator;
    }

    public void setRelator(String relator) {
        this.relator = relator;
    }
    @JavascriptInterface
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    @JavascriptInterface
    public String getNumeroRelatorio() {
        return numeroRelatorio;
    }

    public void setNumeroRelatorio(String numeroRelatorio) {
        this.numeroRelatorio = numeroRelatorio;
    }
    @JavascriptInterface
    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }
    @JavascriptInterface
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @JavascriptInterface
    public String getHorimetro() {
        return horimetro;
    }

    public void setHorimetro(String horimetro) {
        this.horimetro = horimetro;
    }
    @JavascriptInterface
    public String getDistribuidorAssisTec() {
        return distribuidorAssisTec;
    }

    public void setDistribuidorAssisTec(String distribuidorAssisTec) {
        this.distribuidorAssisTec = distribuidorAssisTec;
    }
    @JavascriptInterface
    public String getCidadeDistr() {
        return cidadeDistr;
    }

    public void setCidadeDistr(String cidadeDistr) {
        this.cidadeDistr = cidadeDistr;
    }
    @JavascriptInterface
    public String getEstadoDistr() {
        return estadoDistr;
    }

    public void setEstadoDistr(String estadoDistr) {
        this.estadoDistr = estadoDistr;
    }
    @JavascriptInterface
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    @JavascriptInterface
    public String getCidadeCli() {
        return cidadeCli;
    }

    public void setCidadeCli(String cidadeCli) {
        this.cidadeCli = cidadeCli;
    }
    @JavascriptInterface
    public String getEstadoCli() {
        return estadoCli;
    }

    public void setEstadoCli(String estadoCli) {
        this.estadoCli = estadoCli;
    }
    @JavascriptInterface
    public String getLocalObra() {
        return localObra;
    }

    public void setLocalObra(String localObra) {
        this.localObra = localObra;
    }

    public String getGetPecaQtd() {
        return getPecaQtd;
    }

    public void setGetPecaQtd(String getPecaQtd) {
        this.getPecaQtd = getPecaQtd;
    }

    public String getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(String deslocamento) {
        this.deslocamento = deslocamento;
    }

    @JavascriptInterface
    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    @JavascriptInterface
    public String getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(String refeicao) {
        this.refeicao = refeicao;
    }
    @JavascriptInterface
    public String getExtraServ() {
        return extraServ;
    }

    public void setExtraServ(String extraServ) {
        this.extraServ = extraServ;
    }
    @JavascriptInterface
    public String getExtraDesl() {
        return extraDesl;
    }

    public void setExtraDesl(String extraDesl) {
        this.extraDesl = extraDesl;
    }

    @JavascriptInterface
    public String getMaterialTransp() {
        return materialTransp;
    }

    public void setMaterialTransp(String materialTransp) {
        this.materialTransp = materialTransp;

    }

}
