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
    private String kmRodad;
    private String hrsTrablh;
    private String hrsDesloc;
    private String hrsExtrTrab;
    private String hrsExtrDesloc;
    private String getCodPec;
    private String getPecaQtd;
    private String getDescPec;
    private String getCodPec1;
    private String getPecaQtd1;
    private String getDescPec1;

    public RelatorioAssistenciaTecnica(){
    }

    public RelatorioAssistenciaTecnica(String relator, String data, String numeroRelatorio, String numeroChassi,
                                       String modelo, String horimetro, String distribuidorAssisTec, String cidadeDistr,
                                       String estadoDistr, String cliente, String cidadeCli, String estadoCli, String localObra,
                                       String materialTransp, String defeitoCostatado, String procedAdot, String kmRodad, String hrsExtrTrab,
                                       String hrsDesloc, String getCodPec, String getPecaQtd, String getDescPec, String getCodPec1, String getPecaQtd1, String getDescPec1){
        this.relator= relator;
        this.data= data;
        this.numeroRelatorio= numeroRelatorio;
        this.numeroChassi= numeroChassi;
        this.modelo= modelo;
        this.horimetro= horimetro;
        this.distribuidorAssisTec= distribuidorAssisTec;
        this.cidadeDistr= cidadeDistr;
        this.estadoDistr= estadoDistr;
        this.cliente= cliente;
        this.cidadeCli= cidadeCli;
        this.estadoCli= estadoCli;
        this.localObra= localObra;
        this.materialTransp= materialTransp;
        this.defeitoCostatado= defeitoCostatado;
        this.procedAdot= procedAdot;
        this.kmRodad= kmRodad;
        this.hrsExtrTrab= hrsExtrTrab;
        this.hrsExtrDesloc= hrsDesloc;
        this.getCodPec= getCodPec;
        this.getPecaQtd= getPecaQtd;
        this.getDescPec= getDescPec;
        this.getCodPec1= getCodPec1;
        this.getPecaQtd1= getPecaQtd1;
        this.getDescPec1= getDescPec1;


    }

    @JavascriptInterface
    public String getDefeitoCostatado() {
        return defeitoCostatado;
    }

    public void setDefeitoCostatado(String defeitoCostatado) {
        this.defeitoCostatado = defeitoCostatado;
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
    public String getHrsTrablh() {
        return hrsTrablh;
    }

    public void setHrsTrablh(String hrsTrablh) {
        this.hrsTrablh = hrsTrablh;
    }
    @JavascriptInterface
    public String getHrsDesloc() {
        return hrsDesloc;
    }

    public void setHrsDesloc(String hrsDesloc) {
        this.hrsDesloc = hrsDesloc;
    }
    @JavascriptInterface
    public String getHrsExtrTrab() {
        return hrsExtrTrab;
    }

    public void setHrsExtrTrab(String hrsExtrTrab) {
        this.hrsExtrTrab = hrsExtrTrab;
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

    @JavascriptInterface
    public String getHrsExtrDesloc() {
        return hrsExtrDesloc;
    }

    public void setHrsExtrDesloc(String hrsExtrDesloc) {
        this.hrsExtrDesloc = hrsExtrDesloc;
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

    @JavascriptInterface
    public String getGetCodPec1() {
        return getCodPec1;
    }

    public void setGetCodPec1(String getCodPec1) {
        this.getCodPec1 = getCodPec1;
    }
    @JavascriptInterface
    public String getGetPecaQtd1() {
        return getPecaQtd1;
    }

    public void setGetPecaQtd1(String getPecaQtd1) {
        this.getPecaQtd1 = getPecaQtd1;
    }
    @JavascriptInterface
    public String getGetDescPec1() {
        return getDescPec1;
    }

    public void setGetDescPec1(String getDescPec1) {
        this.getDescPec1 = getDescPec1;
    }

    @JavascriptInterface
    public String getMaterialTransp() {
        return materialTransp;
    }

    public void setMaterialTransp(String materialTransp) {
        this.materialTransp = materialTransp;

    }

}
