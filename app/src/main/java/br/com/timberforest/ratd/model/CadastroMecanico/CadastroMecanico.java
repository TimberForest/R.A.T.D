package br.com.timberforest.ratd.model.CadastroMecanico;

import android.webkit.JavascriptInterface;

import java.io.Serializable;

/**
 * Created by andreives on 17/04/2015.
 */
public class CadastroMecanico implements Serializable{
    private static final long serialVersionUID = 1L;


    private Long idMecanico;
    private String nome;
    private String matricula;
    private String cargoFuncao;
    private String filial;
    private String cidade;
    private String estado;

    public CadastroMecanico(){
    }

    public CadastroMecanico(String nome, String matricula, String cargoFuncao, String filial, String cidade, String estado){
        this.nome= nome;
        this.matricula= matricula;
        this.cargoFuncao= cargoFuncao;
        this.filial= filial;
        this.cidade= cidade;
        this.estado= estado;

    }

    @JavascriptInterface
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    @JavascriptInterface
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @JavascriptInterface
    public Long getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(long idMecanico) {
        this.idMecanico = idMecanico;
    }
    @JavascriptInterface
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @JavascriptInterface
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @JavascriptInterface
    public String getCargoFuncao() {
        return cargoFuncao;
    }

    public void setCargoFuncao(String cargoFuncao) {
        this.cargoFuncao = cargoFuncao;
    }
    @JavascriptInterface
    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

}
