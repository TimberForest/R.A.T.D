package br.com.timberforest.ratd.model.servicosPonsse;

import java.io.Serializable;
import java.io.StringReader;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ManutencaoProgForwarderModel extends RealmObject {
    public static final String ID = "com.timberforest.andreives.relatorios.model.servicosPonsse.RealmObject.ID";

    @PrimaryKey
    private long    codigo;

    private String  editTextClienteManuForwarder;
    private String  editTextTelefoneClienteManuForwarder;
    private String  editTextordemServicoManuForwarder;
    private String  editTextNumSerieManuForwarder;
    private String  editText3NmManuForwarder;
    private String  editText38NmManuForwarder;
    private String  editText39NmManuForwarder;
    private String  editText40NmManuForwarder;
    private String  editTextNotasManuForwarder;

    private String  spinnerModeloModeloForwarder;

    private String  radioGroup6ManuForwarder;
    private String  radioGroup7ManuForwarder;
    private String  radioGroup8ManuForwarder;
    private String  radioGroup20ManuForwarder;
    private String  radioGroup14ManuForwarder;
    private String  radioGroup2ManuForwarder;
    private String  radioGroup3ManuForwarder;
    private String  radioGroup4ManuForwarder;
    private String  radioGroup30ManuForwarder;
    private String  radioGroup5ManuForwarder;
    private String  radioGroupBasicoCompManuForwarder;
    private String  radioGroup13ManuForwarder;
    private String  radioGroup31ManuForwarder;
    private String  radioGroup10ManuForwarder;
    private String  radioGroup9ManuForwarder;
    private String  radioGroup11ManuForwarder;
    private String  radioGroupQtdeixoManuForwarder;

    private byte    checkBox505TarefasAdicioanisManuForwarder;
    private byte    checkBox237Selecionado;
    private byte    checkBox238Selecionado;
    private byte    checkBox239Selecionado;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getEditTextClienteManuForwarder() {
        return editTextClienteManuForwarder==null?"":editTextClienteManuForwarder;
    }

    public void setEditTextClienteManuForwarder(String editTextClienteManuForwarder) {
        this.editTextClienteManuForwarder = editTextClienteManuForwarder;
    }

    public String getEditTextTelefoneClienteManuForwarder() {
        return editTextTelefoneClienteManuForwarder== null ? "" : editTextTelefoneClienteManuForwarder;
    }

    public void setEditTextTelefoneClienteManuForwarder(String editTextTelefoneClienteManuForwarder) {
        this.editTextTelefoneClienteManuForwarder = editTextTelefoneClienteManuForwarder;
    }

    public String getEditTextordemServicoManuForwarder() {
        return editTextordemServicoManuForwarder== null ? "" : editTextordemServicoManuForwarder;
    }

    public void setEditTextordemServicoManuForwarder(String editTextordemServicoManuForwarder) {
        this.editTextordemServicoManuForwarder = editTextordemServicoManuForwarder;
    }

    public String getEditTextNumSerieManuForwarder() {
        return editTextNumSerieManuForwarder== null ? "" : editTextNumSerieManuForwarder;
    }

    public void setEditTextNumSerieManuForwarder(String editTextNumSerieManuForwarder) {
        this.editTextNumSerieManuForwarder = editTextNumSerieManuForwarder;
    }

    public String getEditText3NmManuForwarder() {
        return editText3NmManuForwarder== null ? "" : editText3NmManuForwarder;
    }

    public void setEditText3NmManuForwarder(String editText3NmManuForwarder) {
        this.editText3NmManuForwarder = editText3NmManuForwarder;
    }

    public String getEditText38NmManuForwarder() {
        return editText38NmManuForwarder== null ? "" : editText38NmManuForwarder;
    }

    public void setEditText38NmManuForwarder(String editText38NmManuForwarder) {
        this.editText38NmManuForwarder = editText38NmManuForwarder;
    }

    public String getEditText39NmManuForwarder() {
        return editText39NmManuForwarder== null ? "" : editText39NmManuForwarder;
    }

    public void setEditText39NmManuForwarder(String editText39NmManuForwarder) {
        this.editText39NmManuForwarder = editText39NmManuForwarder;
    }

    public String getEditText40NmManuForwarder() {
        return editText40NmManuForwarder== null ? "" : editText40NmManuForwarder;
    }

    public void setEditText40NmManuForwarder(String editText40NmManuForwarder) {
        this.editText40NmManuForwarder = editText40NmManuForwarder;
    }

    public String getEditTextNotasManuForwarder() {
        return editTextNotasManuForwarder== null ? "" : editTextNotasManuForwarder;
    }

    public void setEditTextNotasManuForwarder(String editTextNotasManuForwarder) {
        this.editTextNotasManuForwarder = editTextNotasManuForwarder;
    }


    public String getSpinnerModeloModeloForwarder() {
        return spinnerModeloModeloForwarder== null ? "" : spinnerModeloModeloForwarder;
    }

    public void setSpinnerModeloModeloForwarder(String spinnerModeloModeloForwarder) {
        this.spinnerModeloModeloForwarder = spinnerModeloModeloForwarder;
    }

    public String getRadioGroup6ManuForwarder() {
        return radioGroup6ManuForwarder== null ? "" : radioGroup6ManuForwarder;
    }

    public void setRadioGroup6ManuForwarder(String radioGroup6ManuForwarder) {
        this.radioGroup6ManuForwarder = radioGroup6ManuForwarder;
    }

    public String getRadioGroup7ManuForwarder() {
        return radioGroup7ManuForwarder== null ? "" : radioGroup7ManuForwarder;
    }

    public void setRadioGroup7ManuForwarder(String radioGroup7ManuForwarder) {
        this.radioGroup7ManuForwarder = radioGroup7ManuForwarder;
    }

    public String getRadioGroup8ManuForwarder() {
        return radioGroup8ManuForwarder== null ? "" : radioGroup8ManuForwarder;
    }

    public void setRadioGroup8ManuForwarder(String radioGroup8ManuForwarder) {
        this.radioGroup8ManuForwarder = radioGroup8ManuForwarder;
    }

    public String getRadioGroup20ManuForwarder() {
        return radioGroup20ManuForwarder== null ? "" : radioGroup20ManuForwarder;
    }

    public void setRadioGroup20ManuForwarder(String radioGroup20ManuForwarder) {
        this.radioGroup20ManuForwarder = radioGroup20ManuForwarder;
    }

    public String getRadioGroup14ManuForwarder() {
        return radioGroup14ManuForwarder== null ? "" : radioGroup14ManuForwarder;
    }

    public void setRadioGroup14ManuForwarder(String radioGroup14ManuForwarder) {
        this.radioGroup14ManuForwarder = radioGroup14ManuForwarder;
    }

    public String getRadioGroup2ManuForwarder() {
        return radioGroup2ManuForwarder== null ? "" : radioGroup2ManuForwarder;
    }

    public void setRadioGroup2ManuForwarder(String radioGroup2ManuForwarder) {
        this.radioGroup2ManuForwarder = radioGroup2ManuForwarder;
    }

    public String getRadioGroup3ManuForwarder() {
        return radioGroup3ManuForwarder== null ? "" : radioGroup3ManuForwarder;
    }

    public void setRadioGroup3ManuForwarder(String radioGroup3ManuForwarder) {
        this.radioGroup3ManuForwarder = radioGroup3ManuForwarder;
    }

    public String getRadioGroup4ManuForwarder() {
        return radioGroup4ManuForwarder== null ? "" : radioGroup4ManuForwarder;
    }

    public void setRadioGroup4ManuForwarder(String radioGroup4ManuForwarder) {
        this.radioGroup4ManuForwarder = radioGroup4ManuForwarder;
    }

    public String getRadioGroup30ManuForwarder() {
        return radioGroup30ManuForwarder== null ? "" : radioGroup30ManuForwarder;
    }

    public void setRadioGroup30ManuForwarder(String radioGroup30ManuForwarder) {
        this.radioGroup30ManuForwarder = radioGroup30ManuForwarder;
    }

    public String getRadioGroup5ManuForwarder() {
        return radioGroup5ManuForwarder== null ? "" : radioGroup5ManuForwarder;
    }

    public void setRadioGroup5ManuForwarder(String radioGroup5ManuForwarder) {
        this.radioGroup5ManuForwarder = radioGroup5ManuForwarder;
    }

    public String getRadioGroupBasicoCompManuForwarder() {
        return radioGroupBasicoCompManuForwarder== null ? "" : radioGroupBasicoCompManuForwarder;
    }

    public void setRadioGroupBasicoCompManuForwarder(String radioGroupBasicoCompManuForwarder) {
        this.radioGroupBasicoCompManuForwarder = radioGroupBasicoCompManuForwarder;
    }

    public String getRadioGroup13ManuForwarder() {
        return radioGroup13ManuForwarder== null ? "" : radioGroup13ManuForwarder;
    }

    public void setRadioGroup13ManuForwarder(String radioGroup13ManuForwarder) {
        this.radioGroup13ManuForwarder = radioGroup13ManuForwarder;
    }

    public String getRadioGroup31ManuForwarder() {
        return radioGroup31ManuForwarder== null ? "" : radioGroup31ManuForwarder;
    }

    public void setRadioGroup31ManuForwarder(String radioGroup31ManuForwarder) {
        this.radioGroup31ManuForwarder = radioGroup31ManuForwarder;
    }

    public String getRadioGroup10ManuForwarder() {
        return radioGroup10ManuForwarder== null ? "" : radioGroup10ManuForwarder;
    }

    public void setRadioGroup10ManuForwarder(String radioGroup10ManuForwarder) {
        this.radioGroup10ManuForwarder = radioGroup10ManuForwarder;
    }

    public String getRadioGroup9ManuForwarder() {
        return radioGroup9ManuForwarder== null ? "" : radioGroup9ManuForwarder;
    }

    public void setRadioGroup9ManuForwarder(String radioGroup9ManuForwarder) {
        this.radioGroup9ManuForwarder = radioGroup9ManuForwarder;
    }

    public String getRadioGroup11ManuForwarder() {
        return radioGroup11ManuForwarder== null ? "" : radioGroup11ManuForwarder;
    }

    public void setRadioGroup11ManuForwarder(String radioGroup11ManuForwarder) {
        this.radioGroup11ManuForwarder = radioGroup11ManuForwarder;
    }

    public String getRadioGroupQtdeixoManuForwarder() {
        return radioGroupQtdeixoManuForwarder== null ? "" : radioGroupQtdeixoManuForwarder;
    }

    public void setRadioGroupQtdeixoManuForwarder(String radioGroupQtdeixoManuForwarder) {
        this.radioGroupQtdeixoManuForwarder = radioGroupQtdeixoManuForwarder;
    }

    public byte getCheckBox505TarefasAdicioanisManuForwarder() {
        return checkBox505TarefasAdicioanisManuForwarder;
    }

    public void setCheckBox505TarefasAdicioanisManuForwarder(byte checkBox505TarefasAdicioanisManuForwarder) {
        this.checkBox505TarefasAdicioanisManuForwarder = checkBox505TarefasAdicioanisManuForwarder;
    }

    public byte getCheckBox237Selecionado() {
        return checkBox237Selecionado;
    }

    public void setCheckBox237Selecionado(byte checkBox237Selecionado) {
        this.checkBox237Selecionado = checkBox237Selecionado;
    }

    public byte getCheckBox238Selecionado() {
        return checkBox238Selecionado;
    }

    public void setCheckBox238Selecionado(byte checkBox238Selecionado) {
        this.checkBox238Selecionado = checkBox238Selecionado;
    }

    public byte getCheckBox239Selecionado() {
        return checkBox239Selecionado;
    }

    public void setCheckBox239Selecionado(byte checkBox239Selecionado) {
        this.checkBox239Selecionado = checkBox239Selecionado;
    }
}
