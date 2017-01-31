package br.com.timberforest.ratd.model.servicosPonsse;

/**
 * Created by andre.vieira on 22/07/2016.
 */
public class GarantiaHarvesterPonsseModelo {
    private String  codigo;
    private String  descricao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /*RETORNA A DESCRICAO NO COMPONENTE SPINNER */
    @Override
    public String toString() {
        return this.descricao;
    }

    public GarantiaHarvesterPonsseModelo(){

    }
    public GarantiaHarvesterPonsseModelo(String codigo, String descricao){

        this.codigo    = codigo;
        this.descricao = descricao;

    }
}
