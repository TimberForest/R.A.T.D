package br.com.timberforest.ratd.model.servicosPonsse;

import android.webkit.JavascriptInterface;

import java.io.Serializable;

/**
 * Created by andre.vieira on 21/10/2015.
 */
public class ManutencaoProgramadaGruaModel implements Serializable{
    private static final long serialVersionUID = 1L;

    public ManutencaoProgramadaGruaModel(){
    }

    public ManutencaoProgramadaGruaModel(Integer codigo, String cliente, String telefone, String dataPreenchimennto, String ordemServico, String modelo,
                                         String editText49ManuProgGrua, String editText50ManuProgGrua, String editTextNotasGrua, String editText41ManuProgGrua, String editText42ManuProgGrua,
                                         String editText44ManuProgGrua, String editText45ManuProgGrua, String editText46ManuProgGrua, String editText47ManuProgGrua, String editText48ManuProgGrua,
                                         String radioGroup32BasicoManuProgGrua, String radioGroup33BasicoManuProgGrua, String radioGroup34BasicoManuProgGrua, String radioGroup35BasicoManuProgGrua, String radioGroup36BasicoManuProgGrua,
                                         String radioGroup15BasicoManuProgGrua, String radioGroup16BasicoManuProgGrua, String radioGroup17BasicoManuProgGrua, String radioGroup18BasicoManuProgGrua, String radioGroup19BasicoManuProgGrua,
                                         String radioGroup20BasicoManuProgGrua, String radioGroup21BasicoManuProgGrua, String radioGroup22BasicoManuProgGrua, String radioGroup23BasicoManuProgGrua, String radioGroup24BasicoManuProgGrua,
                                         String radioGroup25BasicoManuProgGrua, String radioGroup26BasicoManuProgGrua, String radioGroup27BasicoManuProgGrua, String radioGroup28BasicoManuProgGrua, String radioGroup29BasicoManuProgGrua,
                                         String radioGroup30BasicoManuProgGrua, String radioGroup31BasicoManuProgGrua, String radioGroupBasicCompManuProgGrua, String radioGroupQtdEixoManuProgGrua, byte checkBoxVfslSelecionado ,
                                         byte checkBoxTfsaappmiplSelecionado, byte checkBoxVmvmgSelecionado){
        this.codigo= codigo;
        this.cliente= cliente;
        this.telefone= telefone;
        this.dataPreenchimennto= dataPreenchimennto;
        this.numDeSerie= numDeSerie;
        this.modelo= modelo;

        this.editText49ManuProgGrua = editText49ManuProgGrua;
        this.editText50ManuProgGrua = editText50ManuProgGrua;
        this.editText51ManuProgGrua = editText51ManuProgGrua;
        this.editTextNotasGrua = editTextNotasGrua;
        this.editText41ManuProgGrua = editText41ManuProgGrua;
        this.editText42ManuProgGrua = editText42ManuProgGrua;
        this.editText44ManuProgGrua = editText44ManuProgGrua;
        this.editText43ManuProgGrua = editText43ManuProgGrua;
        this.editText45ManuProgGrua = editText45ManuProgGrua;
        this.editText46ManuProgGrua = editText46ManuProgGrua;
        this.editText47ManuProgGrua = editText47ManuProgGrua;
        this.editText48ManuProgGrua = editText48ManuProgGrua;
        this.radioGroup32BasicoManuProgGrua = radioGroup32BasicoManuProgGrua;
        this.radioGroup33BasicoManuProgGrua = radioGroup33BasicoManuProgGrua;
        this.radioGroup34BasicoManuProgGrua = radioGroup34BasicoManuProgGrua;
        this.radioGroup35BasicoManuProgGrua = radioGroup35BasicoManuProgGrua;
        this.radioGroup36BasicoManuProgGrua = radioGroup36BasicoManuProgGrua;
        this.radioGroup15BasicoManuProgGrua = radioGroup15BasicoManuProgGrua;
        this.radioGroup16BasicoManuProgGrua = radioGroup16BasicoManuProgGrua;
        this.radioGroup17BasicoManuProgGrua = radioGroup17BasicoManuProgGrua;
        this.radioGroup18BasicoManuProgGrua = radioGroup18BasicoManuProgGrua;
        this.radioGroup19BasicoManuProgGrua = radioGroup19BasicoManuProgGrua;
        this.radioGroup20BasicoManuProgGrua = radioGroup20BasicoManuProgGrua;
        this.radioGroup21BasicoManuProgGrua = radioGroup21BasicoManuProgGrua;
        this.radioGroup22BasicoManuProgGrua = radioGroup22BasicoManuProgGrua;
        this.radioGroup23BasicoManuProgGrua = radioGroup23BasicoManuProgGrua;
        this.radioGroup24BasicoManuProgGrua = radioGroup24BasicoManuProgGrua;
        this.radioGroup25BasicoManuProgGrua = radioGroup25BasicoManuProgGrua;
        this.radioGroup26BasicoManuProgGrua = radioGroup26BasicoManuProgGrua;
        this.radioGroup27BasicoManuProgGrua = radioGroup27BasicoManuProgGrua;
        this.radioGroup28BasicoManuProgGrua = radioGroup28BasicoManuProgGrua;
        this.radioGroup29BasicoManuProgGrua = radioGroup29BasicoManuProgGrua;
        this.radioGroup30BasicoManuProgGrua = radioGroup30BasicoManuProgGrua;
        this.radioGroup31BasicoManuProgGrua = radioGroup31BasicoManuProgGrua;
        this.radioGroupBasicCompManuProgGrua = radioGroupBasicCompManuProgGrua;
        this.radioGroupQtdEixoManuProgGrua = radioGroupQtdEixoManuProgGrua;
        this.checkBoxVfslSelecionado = checkBoxVfslSelecionado;
        this.checkBoxVmvmgSelecionado = checkBoxVmvmgSelecionado;
        this.checkBoxTfsaappmiplSelecionado = checkBoxTfsaappmiplSelecionado;


    }
    private Integer codigo;
    private String  cliente;
    private String  telefone;
    private String  dataPreenchimennto;
    private String  ordemServico;
    private String  numDeSerie;
    private String  modelo;

    private String      editText49ManuProgGrua;
    private String      editText50ManuProgGrua;
    private String      editText51ManuProgGrua;
    private String      editTextNotasGrua;
    private String      editText41ManuProgGrua;
    private String      editText42ManuProgGrua;
    private String      editText44ManuProgGrua;
    private String      editText43ManuProgGrua;
    private String      editText45ManuProgGrua;
    private String      editText46ManuProgGrua;
    private String      editText47ManuProgGrua;
    private String      editText48ManuProgGrua;
    private String      radioGroup32BasicoManuProgGrua;
    private String      radioGroup33BasicoManuProgGrua;
    private String      radioGroup34BasicoManuProgGrua;
    private String      radioGroup35BasicoManuProgGrua;
    private String      radioGroup36BasicoManuProgGrua;
    private String      radioGroup15BasicoManuProgGrua;
    private String      radioGroup16BasicoManuProgGrua;
    private String      radioGroup17BasicoManuProgGrua;
    private String      radioGroup18BasicoManuProgGrua;
    private String      radioGroup19BasicoManuProgGrua;
    private String      radioGroup20BasicoManuProgGrua;
    private String      radioGroup21BasicoManuProgGrua;
    private String      radioGroup22BasicoManuProgGrua;
    private String      radioGroup23BasicoManuProgGrua;
    private String      radioGroup24BasicoManuProgGrua;
    private String      radioGroup25BasicoManuProgGrua;
    private String      radioGroup26BasicoManuProgGrua;
    private String      radioGroup27BasicoManuProgGrua;
    private String      radioGroup28BasicoManuProgGrua;
    private String      radioGroup29BasicoManuProgGrua;
    private String      radioGroup30BasicoManuProgGrua;
    private String      radioGroup31BasicoManuProgGrua;
    private String      radioGroupBasicCompManuProgGrua;
    private String      radioGroupQtdEixoManuProgGrua;
    private byte        checkBoxVfslSelecionado;
    private byte        checkBoxVmvmgSelecionado;
    private byte        checkBoxTfsaappmiplSelecionado;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    @JavascriptInterface
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    @JavascriptInterface
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @JavascriptInterface
    public String getDataPreenchimennto() {
        return dataPreenchimennto;
    }

    public void setDataPreenchimennto(String dataPreenchimennto) {
        this.dataPreenchimennto = dataPreenchimennto;
    }
    @JavascriptInterface
    public String getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(String ordemServico) {
        this.ordemServico = ordemServico;
    }
    @JavascriptInterface
    public String getNumDeSerie() {
        return numDeSerie;
    }

    public void setNumDeSerie(String numDeSerie) {
        this.numDeSerie = numDeSerie;
    }
    @JavascriptInterface
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @JavascriptInterface
    public String getEditText49ManuProgGrua() {
        return editText49ManuProgGrua;
    }

    public void setEditText49ManuProgGrua(String editText49ManuProgGrua) {
        this.editText49ManuProgGrua = editText49ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditText50ManuProgGrua() {
        return editText50ManuProgGrua;
    }

    public void setEditText50ManuProgGrua(String editText50ManuProgGrua) {
        this.editText50ManuProgGrua = editText50ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditText51ManuProgGrua() {
        return editText51ManuProgGrua;
    }

    public void setEditText51ManuProgGrua(String editText51ManuProgGrua) {
        this.editText51ManuProgGrua = editText51ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditTextNotasGrua() {
        return editTextNotasGrua;
    }

    public void setEditTextNotasGrua(String editTextNotasGrua) {
        this.editTextNotasGrua = editTextNotasGrua;
    }
    @JavascriptInterface
    public String getEditText41ManuProgGrua() {
        return editText41ManuProgGrua;
    }

    public void setEditText41ManuProgGrua(String editText41ManuProgGrua) {
        this.editText41ManuProgGrua = editText41ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditText42ManuProgGrua() {
        return editText42ManuProgGrua;
    }

    public void setEditText42ManuProgGrua(String editText42ManuProgGrua) {
        this.editText42ManuProgGrua = editText42ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditText44ManuProgGrua() {
        return editText44ManuProgGrua;
    }

    public void setEditText44ManuProgGrua(String editText44ManuProgGrua) {
        this.editText44ManuProgGrua = editText44ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditText43ManuProgGrua() {
        return editText43ManuProgGrua;
    }

    public void setEditText43ManuProgGrua(String editText43ManuProgGrua) {
        this.editText43ManuProgGrua = editText43ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditText45ManuProgGrua() {
        return editText45ManuProgGrua;
    }

    public void setEditText45ManuProgGrua(String editText45ManuProgGrua) {
        this.editText45ManuProgGrua = editText45ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditText46ManuProgGrua() {
        return editText46ManuProgGrua;
    }

    public void setEditText46ManuProgGrua(String editText46ManuProgGrua) {
        this.editText46ManuProgGrua = editText46ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditText47ManuProgGrua() {
        return editText47ManuProgGrua;
    }

    public void setEditText47ManuProgGrua(String editText47ManuProgGrua) {
        this.editText47ManuProgGrua = editText47ManuProgGrua;
    }
    @JavascriptInterface
    public String getEditText48ManuProgGrua() {
        return editText48ManuProgGrua;
    }

    public void setEditText48ManuProgGrua(String editText48ManuProgGrua) {
        this.editText48ManuProgGrua = editText48ManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup32BasicoManuProgGrua() {
        return radioGroup32BasicoManuProgGrua;
    }

    public void setRadioGroup32BasicoManuProgGrua(String radioGroup32BasicoManuProgGrua) {
        this.radioGroup32BasicoManuProgGrua = radioGroup32BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup33BasicoManuProgGrua() {
        return radioGroup33BasicoManuProgGrua;
    }

    public void setRadioGroup33BasicoManuProgGrua(String radioGroup33BasicoManuProgGrua) {
        this.radioGroup33BasicoManuProgGrua = radioGroup33BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup34BasicoManuProgGrua() {
        return radioGroup34BasicoManuProgGrua;
    }

    public void setRadioGroup34BasicoManuProgGrua(String radioGroup34BasicoManuProgGrua) {
        this.radioGroup34BasicoManuProgGrua = radioGroup34BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup35BasicoManuProgGrua() {
        return radioGroup35BasicoManuProgGrua;
    }

    public void setRadioGroup35BasicoManuProgGrua(String radioGroup35BasicoManuProgGrua) {
        this.radioGroup35BasicoManuProgGrua = radioGroup35BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup36BasicoManuProgGrua() {
        return radioGroup36BasicoManuProgGrua;
    }

    public void setRadioGroup36BasicoManuProgGrua(String radioGroup36BasicoManuProgGrua) {
        this.radioGroup36BasicoManuProgGrua = radioGroup36BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup15BasicoManuProgGrua() {
        return radioGroup15BasicoManuProgGrua;
    }

    public void setRadioGroup15BasicoManuProgGrua(String radioGroup15BasicoManuProgGrua) {
        this.radioGroup15BasicoManuProgGrua = radioGroup15BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup16BasicoManuProgGrua() {
        return radioGroup16BasicoManuProgGrua;
    }

    public void setRadioGroup16BasicoManuProgGrua(String radioGroup16BasicoManuProgGrua) {
        this.radioGroup16BasicoManuProgGrua = radioGroup16BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup17BasicoManuProgGrua() {
        return radioGroup17BasicoManuProgGrua;
    }

    public void setRadioGroup17BasicoManuProgGrua(String radioGroup17BasicoManuProgGrua) {
        this.radioGroup17BasicoManuProgGrua = radioGroup17BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup18BasicoManuProgGrua() {
        return radioGroup18BasicoManuProgGrua;
    }

    public void setRadioGroup18BasicoManuProgGrua(String radioGroup18BasicoManuProgGrua) {
        this.radioGroup18BasicoManuProgGrua = radioGroup18BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup19BasicoManuProgGrua() {
        return radioGroup19BasicoManuProgGrua;
    }

    public void setRadioGroup19BasicoManuProgGrua(String radioGroup19BasicoManuProgGrua) {
        this.radioGroup19BasicoManuProgGrua = radioGroup19BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup20BasicoManuProgGrua() {
        return radioGroup20BasicoManuProgGrua;
    }

    public void setRadioGroup20BasicoManuProgGrua(String radioGroup20BasicoManuProgGrua) {
        this.radioGroup20BasicoManuProgGrua = radioGroup20BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup21BasicoManuProgGrua() {
        return radioGroup21BasicoManuProgGrua;
    }

    public void setRadioGroup21BasicoManuProgGrua(String radioGroup21BasicoManuProgGrua) {
        this.radioGroup21BasicoManuProgGrua = radioGroup21BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup22BasicoManuProgGrua() {
        return radioGroup22BasicoManuProgGrua;
    }

    public void setRadioGroup22BasicoManuProgGrua(String radioGroup22BasicoManuProgGrua) {
        this.radioGroup22BasicoManuProgGrua = radioGroup22BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup23BasicoManuProgGrua() {
        return radioGroup23BasicoManuProgGrua;
    }

    public void setRadioGroup23BasicoManuProgGrua(String radioGroup23BasicoManuProgGrua) {
        this.radioGroup23BasicoManuProgGrua = radioGroup23BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup24BasicoManuProgGrua() {
        return radioGroup24BasicoManuProgGrua;
    }

    public void setRadioGroup24BasicoManuProgGrua(String radioGroup24BasicoManuProgGrua) {
        this.radioGroup24BasicoManuProgGrua = radioGroup24BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup25BasicoManuProgGrua() {
        return radioGroup25BasicoManuProgGrua;
    }

    public void setRadioGroup25BasicoManuProgGrua(String radioGroup25BasicoManuProgGrua) {
        this.radioGroup25BasicoManuProgGrua = radioGroup25BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup26BasicoManuProgGrua() {
        return radioGroup26BasicoManuProgGrua;
    }

    public void setRadioGroup26BasicoManuProgGrua(String radioGroup26BasicoManuProgGrua) {
        this.radioGroup26BasicoManuProgGrua = radioGroup26BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup27BasicoManuProgGrua() {
        return radioGroup27BasicoManuProgGrua;
    }

    public void setRadioGroup27BasicoManuProgGrua(String radioGroup27BasicoManuProgGrua) {
        this.radioGroup27BasicoManuProgGrua = radioGroup27BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup28BasicoManuProgGrua() {
        return radioGroup28BasicoManuProgGrua;
    }

    public void setRadioGroup28BasicoManuProgGrua(String radioGroup28BasicoManuProgGrua) {
        this.radioGroup28BasicoManuProgGrua = radioGroup28BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup29BasicoManuProgGrua() {
        return radioGroup29BasicoManuProgGrua;
    }

    public void setRadioGroup29BasicoManuProgGrua(String radioGroup29BasicoManuProgGrua) {
        this.radioGroup29BasicoManuProgGrua = radioGroup29BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup30BasicoManuProgGrua() {
        return radioGroup30BasicoManuProgGrua;
    }

    public void setRadioGroup30BasicoManuProgGrua(String radioGroup30BasicoManuProgGrua) {
        this.radioGroup30BasicoManuProgGrua = radioGroup30BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroup31BasicoManuProgGrua() {
        return radioGroup31BasicoManuProgGrua;
    }

    public void setRadioGroup31BasicoManuProgGrua(String radioGroup31BasicoManuProgGrua) {
        this.radioGroup31BasicoManuProgGrua = radioGroup31BasicoManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroupBasicCompManuProgGrua() {
        return radioGroupBasicCompManuProgGrua;
    }

    public void setRadioGroupBasicCompManuProgGrua(String radioGroupBasicCompManuProgGrua) {
        this.radioGroupBasicCompManuProgGrua = radioGroupBasicCompManuProgGrua;
    }
    @JavascriptInterface
    public String getRadioGroupQtdEixoManuProgGrua() {
        return radioGroupQtdEixoManuProgGrua;
    }

    public void setRadioGroupQtdEixoManuProgGrua(String radioGroupQtdEixoManuProgGrua) {
        this.radioGroupQtdEixoManuProgGrua = radioGroupQtdEixoManuProgGrua;
    }
    @JavascriptInterface
    public byte getCheckBoxVfslSelecionado() {
        return checkBoxVfslSelecionado;
    }

    public void setCheckBoxVfslSelecionado(byte checkBoxVfslSelecionado) {
        this.checkBoxVfslSelecionado = checkBoxVfslSelecionado;
    }
    @JavascriptInterface
    public byte getCheckBoxVmvmgSelecionado() {
        return checkBoxVmvmgSelecionado;
    }

    public void setCheckBoxVmvmgSelecionado(byte checkBoxVmvmgSelecionado) {
        this.checkBoxVmvmgSelecionado = checkBoxVmvmgSelecionado;
    }
    @JavascriptInterface
    public byte getCheckBoxTfsaappmiplSelecionado() {
        return checkBoxTfsaappmiplSelecionado;
    }

    public void setCheckBoxTfsaappmiplSelecionado(byte checkBoxTfsaappmiplSelecionado) {
        this.checkBoxTfsaappmiplSelecionado = checkBoxTfsaappmiplSelecionado;
    }
}
