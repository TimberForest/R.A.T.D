package br.com.timberforest.ratd.formulariosActivity.servicosPonsse;

import android.app.DatePickerDialog;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.UteisDBPonsse.Uteis;
import br.com.timberforest.ratd.model.servicosPonsse.ManutencaoProgForwarderModel;
import br.com.timberforest.ratd.model.servicosPonsse.ManutencaoProgForwarderModelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class FormManutencaoProgramadaForwarderPonsseActivity extends ActionBarActivity {

    EditText         editTextClienteManuForwarder;
    EditText         editTextTelefoneClienteManuForwarder;
    EditText         editTextordemServicoManuForwarder;
    EditText         editTextNumSerieManuForwarder;
    EditText         editText3NmManuForwarder;
    EditText         editText38NmManuForwarder;;
    EditText         editText39NmManuForwarder;
    EditText         editText40NmManuForwarder;
    EditText         editTextNotasForwarder;
    EditText         textViewDataManutencaoForwarder;

    RadioGroup      radioGroup6ManuForwarder;
    RadioGroup      radioGroup7ManuForwarder;
    RadioGroup      radioGroup8ManuForwarder;
    RadioGroup      radioGroup9ManuForwarder;
    RadioGroup      radioGroup14ManuForwarder;
    RadioGroup      radioGroup2ManuForwarder;
    RadioGroup      radioGroup3ManuForwarder;
    RadioGroup      radioGroup4ManuForwarder;
    RadioGroup      radioGroup30ManuForwarder;
    RadioGroup      radioGroup5ManuForwarder;
    RadioGroup      radioGroupBasicoCompManuForwarder;
    RadioGroup      radioGroup13ManuForwarder;
    RadioGroup      radioGroup31ManuForwarder;
    RadioGroup      radioGroup10ManuForwarder;
    RadioGroup      radioGroup20ManuForwarder;
    RadioGroup      radioGroup11ManuForwarder;
    RadioGroup      radioGroupQtdeixoManuForwarder;


    RadioButton      radioButton10CompletoManuForwarder;
    RadioButton      radioButton106NAManuForwarder     ;
    RadioButton      radioButton11CompletoManuForwarder;
    RadioButton      radioButton107NAManuForwarder     ;
    RadioButton      radioButton12CompletoManuForwarder;
    RadioButton      radioButton108NAManuForwarder     ;
    RadioButton      radioButton13CompletoManuForwarder;
    RadioButton      radioButton109NAManuForwarder     ;
    RadioButton      radioButton14CompletoManuForwarder;
    RadioButton      radioButton105NAManuForwarder     ;
    RadioButton      radioButton5CompletoManuForwarder ;
    RadioButton      radioButton111NAManuForwarder     ;
    RadioButton      radioButton6CompletoManuForwarder ;
    RadioButton      radioButton112NAManuForwarder     ;
    RadioButton      radioButton7CompletoManuForwarder ;
    RadioButton      radioButton113NAManuForwarder     ;
    RadioButton      radioButton8CompletoManuForwarder ;
    RadioButton      radioButton114NAManuForwarder     ;
    RadioButton      radioButton9CompletoManuForwarder ;
    RadioButton      radioButton110NAManuForwarder     ;
    RadioButton      radioButtonBasicoManuForwarder    ;
    RadioButton      radioButton2CompletoManuForwarder ;
    RadioButton      radioButton3CompletoManuForwarder ;
    RadioButton      radioButton116NAManuForwarder     ;
    RadioButton      radioButton4CompletoManuForwarder ;
    RadioButton      radioButton115NAManuForwarder     ;
    RadioButton      radioButton15CompletoManuForwarder;
    RadioButton      radioButton16NAManuForwarder      ;
    RadioButton      radioButton17CompletoManuForwarder;
    RadioButton      radioButton18NAManuForwarder      ;
    RadioButton      radioButton19CompletoManuForwarder;
    RadioButton      radioButton20NAManuForwarder      ;
    RadioButton      radioButton43                     ;
    RadioButton      radioButton51                     ;

    Spinner          spinnerModelo;
    Button           buttonSalvarManuForwarder;

    CheckBox checkBox505TarefasAdicioanisManuForwarder;
    CheckBox checkBox237;
    CheckBox checkBox238;
    CheckBox checkBox239;

    //CRIA POPUP COM O CALENDÁRIO
    DatePickerDialog datePickerDialogDataNascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_manutencao_programada_forwarder_ponsse);

        // CHAMA O METODO PARA DIZER QUAL A LOCALIZAÇÃO,
        // USADO PARA TRADUZIR OS TEXTOS DO CALENDÁRIO.
        this.Localizacao();

        //VINCULA OS COMPONENTES DA TELA COM OS DA ATIVIDADE
        this.CriarComponentes();

        //CRIA OS EVENTOS DOS COMPONENTES
        this.CriarEventos();

        //CARREGA AS OPÇÕES DE ESTADO CIVIL
        this.CarregaModelos();
    }

    //VINCULA OS COMPONENTES DA TELA COM OS DA ATIVIDADE
    protected  void CriarComponentes(){

        editTextClienteManuForwarder            = (EditText) this.findViewById(R.id.editTextClienteManuForwarder            );
        editTextTelefoneClienteManuForwarder    = (EditText) this.findViewById(R.id.editTextTelefoneClienteManuForwarder    );
        editTextordemServicoManuForwarder       = (EditText) this.findViewById(R.id.editTextordemServicoManuForwarder       );
        editTextNumSerieManuForwarder           = (EditText) this.findViewById(R.id.editTextNumSerieManuForwarder           );
        editText3NmManuForwarder                = (EditText) this.findViewById(R.id.editText3NmManuForwarder                );
        editText38NmManuForwarder               = (EditText) this.findViewById(R.id.editText38NmManuForwarder               );
        editText39NmManuForwarder               = (EditText) this.findViewById(R.id.editText39NmManuForwarder               );
        editText40NmManuForwarder               = (EditText) this.findViewById(R.id.editText40NmManuForwarder               );
        editTextNotasForwarder                  = (EditText) this.findViewById(R.id.editTextNotasManuForwarder                  );
        textViewDataManutencaoForwarder          = (EditText)this.findViewById(R.id.textViewDataManutencaoForwarder);

        radioButton10CompletoManuForwarder   = (RadioButton) this.findViewById(R.id.radioButton10CompletoManuForwarder      );
        radioButton106NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton106NAManuForwarder           );
        radioButton11CompletoManuForwarder   = (RadioButton) this.findViewById(R.id.radioButton11CompletoManuForwarder      );
        radioButton107NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton107NAManuForwarder           );
        radioButton12CompletoManuForwarder   = (RadioButton) this.findViewById(R.id.radioButton12CompletoManuForwarder      );
        radioButton108NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton108NAManuForwarder           );
        radioButton13CompletoManuForwarder   = (RadioButton) this.findViewById(R.id.radioButton13CompletoManuForwarder      );
        radioButton109NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton109NAManuForwarder           );
        radioButton14CompletoManuForwarder   = (RadioButton) this.findViewById(R.id.radioButton14CompletoManuForwarder      );
        radioButton105NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton105NAManuForwarder           );
        radioButton5CompletoManuForwarder    = (RadioButton) this.findViewById(R.id.radioButton5CompletoManuForwarder       );
        radioButton111NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton111NAManuForwarder           );
        radioButton6CompletoManuForwarder    = (RadioButton) this.findViewById(R.id.radioButton6CompletoManuForwarder       );
        radioButton112NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton112NAManuForwarder           );
        radioButton7CompletoManuForwarder    = (RadioButton) this.findViewById(R.id.radioButton7CompletoManuForwarder       );
        radioButton113NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton113NAManuForwarder           );
        radioButton8CompletoManuForwarder    = (RadioButton) this.findViewById(R.id.radioButton8CompletoManuForwarder       );
        radioButton114NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton114NAManuForwarder           );
        radioButton9CompletoManuForwarder    = (RadioButton) this.findViewById(R.id.radioButton9CompletoManuForwarder       );
        radioButton110NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton110NAManuForwarder           );
        radioButtonBasicoManuForwarder       = (RadioButton) this.findViewById(R.id.radioButtonBasicoManuForwarder          );
        radioButton2CompletoManuForwarder    = (RadioButton) this.findViewById(R.id.radioButton2CompletoManuForwarder       );
        radioButton3CompletoManuForwarder    = (RadioButton) this.findViewById(R.id.radioButton3CompletoManuForwarder       );
        radioButton116NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton116NAManuForwarder           );
        radioButton4CompletoManuForwarder    = (RadioButton) this.findViewById(R.id.radioButton4CompletoManuForwarder       );
        radioButton115NAManuForwarder        = (RadioButton) this.findViewById(R.id.radioButton115NAManuForwarder           );
        radioButton15CompletoManuForwarder   = (RadioButton) this.findViewById(R.id.radioButton15CompletoManuForwarder      );
        radioButton16NAManuForwarder         = (RadioButton) this.findViewById(R.id.radioButton16NAManuForwarder            );
        radioButton17CompletoManuForwarder   = (RadioButton) this.findViewById(R.id.radioButton17CompletoManuForwarder      );
        radioButton18NAManuForwarder         = (RadioButton) this.findViewById(R.id.radioButton18NAManuForwarder            );
        radioButton19CompletoManuForwarder   = (RadioButton) this.findViewById(R.id.radioButton19CompletoManuForwarder      );
        radioButton20NAManuForwarder         = (RadioButton) this.findViewById(R.id.radioButton20NAManuForwarder            );
        radioButton43                        = (RadioButton) this.findViewById(R.id.radioButton43                           );
        radioButton51                        = (RadioButton) this.findViewById(R.id.radioButton51                           );

        radioGroup6ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup6ManuForwarder);
        radioGroup7ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup7ManuForwarder);
        radioGroup8ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup8ManuForwarder);
        radioGroup9ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup9ManuForwarder);
        radioGroup14ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup14ManuForwarder);
        radioGroup2ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup2ManuForwarder);
        radioGroup3ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup3ManuForwarder);
        radioGroup4ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup4ManuForwarder);
        radioGroup30ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup30ManuForwarder);
        radioGroup5ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup5ManuForwarder);
        radioGroupBasicoCompManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroupBasicoCompManuForwarder);
        radioGroup13ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup13ManuForwarder);
        radioGroup31ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup31ManuForwarder);
        radioGroup10ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup10ManuForwarder);
        radioGroup20ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup20ManuForwarder);
        radioGroup11ManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroup11ManuForwarder);
        radioGroupQtdeixoManuForwarder         = (RadioGroup) this.findViewById(R.id.radioGroupQtdeixoManuForwarder);

        spinnerModelo     = (Spinner)this.findViewById(R.id.spinnerModeloModeloForwarder);

        checkBox505TarefasAdicioanisManuForwarder    = (CheckBox)this.findViewById(R.id.checkBox505TarefasAdicioanisManuForwarder);
        checkBox237                                  = (CheckBox)this.findViewById(R.id.checkBox237Selecionado);
        checkBox238                                  = (CheckBox)this.findViewById(R.id.checkBox238Selecionado);
        checkBox239                                  = (CheckBox)this.findViewById(R.id.checkBox239Selecionado);

        buttonSalvarManuForwarder           = (Button) this.findViewById(R.id.buttonSalvarManuForwarder);

    }


    //CRIA OS EVENTOS DOS COMPONENTES
    protected  void CriarEventos(){


        final Calendar calendarDataAtual = Calendar.getInstance();
        int anoAtual   = calendarDataAtual.get(Calendar.YEAR);
        int mesAtual   = calendarDataAtual.get(Calendar.MONTH);
        int diaAtual   = calendarDataAtual.get(Calendar.DAY_OF_MONTH);

        //MONTANDO O OBJETO DE DATA PARA PREENCHER O CAMPOS QUANDO  FOR SELECIONADO
        //FORMATO DD/MM/YYYY
        datePickerDialogDataNascimento = new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int anoSelecionado, int mesSelecionado, int diaSelecionado) {

                //FORMATANDO O MÊS COM DOIS DÍGITOS
                String mes = (String.valueOf((mesSelecionado + 1)).length() == 1 ? "0" + (mesSelecionado + 1 ): String.valueOf(mesSelecionado));

                textViewDataManutencaoForwarder.setText(diaSelecionado + "/" + mes + "/" + anoSelecionado);

            }

        }, anoAtual, mesAtual, diaAtual);



        //CRIANDO EVENTO NO CAMPO DE DATA PARA ABRIR A POPUP
        textViewDataManutencaoForwarder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                datePickerDialogDataNascimento.show();
            }
        });


        //CRIANDO EVENTO NO CAMPO DE DATA PARA ABRIR A POPUP
        textViewDataManutencaoForwarder.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                datePickerDialogDataNascimento.show();

            }
        });

        //CRIANDO EVENTO NO BOTÃO SALVAR
        buttonSalvarManuForwarder.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Salvar_onClick();
            }
        });
    }

    //VALIDA OS CAMPOS E SALVA AS INFORMACOES NO BANCO DE DADOS
    protected  void Salvar_onClick(){

        if(editTextClienteManuForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.cliente_obrigatorio));

            editTextClienteManuForwarder.requestFocus();
        }
        else if(editTextTelefoneClienteManuForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.telefone_obrigatorio));

            editTextTelefoneClienteManuForwarder.requestFocus();
        }

        else if(editTextordemServicoManuForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ordem_servico_obrigatorio));

            editTextordemServicoManuForwarder.requestFocus();
        }

        else if(editTextNumSerieManuForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.num_serie_obrigatorio));

            editTextNumSerieManuForwarder.requestFocus();
        }

        else if(editTextNotasForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.notas_obrigatorio));

            editTextNotasForwarder.requestFocus();
        }

        else if(textViewDataManutencaoForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.data_nascimento_obrigatorio));

            textViewDataManutencaoForwarder.requestFocus();
        }

        else if(editText3NmManuForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText3NmManuForwarder.requestFocus();
        }

        else if(editText38NmManuForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText38NmManuForwarder.requestFocus();
        }

        else if(editText39NmManuForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText39NmManuForwarder.requestFocus();
        }

        else if(editText40NmManuForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText40NmManuForwarder.requestFocus();
        }

        else if(!radioButtonBasicoManuForwarder.isChecked() && !radioButton2CompletoManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo));
        }

        else if(!radioButton43.isChecked() && !radioButton51.isChecked()){

            Uteis.Alert(this, this.getString(R.string.qtd_eixo_obrigatorio));
        }

        else if(!radioButton14CompletoManuForwarder.isChecked() && !radioButton105NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton10CompletoManuForwarder.isChecked() && !radioButton106NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton11CompletoManuForwarder.isChecked() && !radioButton107NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton12CompletoManuForwarder.isChecked() && !radioButton108NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton13CompletoManuForwarder.isChecked() && !radioButton109NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton9CompletoManuForwarder.isChecked() && !radioButton110NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton5CompletoManuForwarder.isChecked() && !radioButton111NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton6CompletoManuForwarder.isChecked() && !radioButton112NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton7CompletoManuForwarder.isChecked() && !radioButton113NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton8CompletoManuForwarder.isChecked() && !radioButton114NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton4CompletoManuForwarder.isChecked() && !radioButton115NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton3CompletoManuForwarder.isChecked() && !radioButton116NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton15CompletoManuForwarder.isChecked() && !radioButton16NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.concluido_na));
        }

        else if(!radioButton17CompletoManuForwarder.isChecked() && !radioButton18NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.concluido_na));
        }

        else if(!radioButton19CompletoManuForwarder.isChecked() && !radioButton20NAManuForwarder.isChecked()){

            Uteis.Alert(this, this.getString(R.string.concluido_na));
        }

        else {

            /*CRIANDO UM OBJETO PESSOA*/
            ManutencaoProgForwarderModel manutencaoProgForwarderModel= new ManutencaoProgForwarderModel();

            /*SETANDO O VALOR DO CAMPO NOME*/
            manutencaoProgForwarderModel.setEditTextTelefoneClienteManuForwarder(editTextClienteManuForwarder             .getText().toString().trim());

            manutencaoProgForwarderModel.setEditTextClienteManuForwarder        (editTextTelefoneClienteManuForwarder     .getText().toString().trim());

            manutencaoProgForwarderModel.setEditTextordemServicoManuForwarder   (editTextordemServicoManuForwarder        .getText().toString().trim());

            manutencaoProgForwarderModel.setEditTextNumSerieManuForwarder       (editTextNumSerieManuForwarder            .getText().toString().trim());

            manutencaoProgForwarderModel.setEditText3NmManuForwarder            (editText3NmManuForwarder                 .getText().toString().trim());

            manutencaoProgForwarderModel.setEditText38NmManuForwarder           (editText38NmManuForwarder                .getText().toString().trim());

            manutencaoProgForwarderModel.setEditText39NmManuForwarder           (editText39NmManuForwarder                .getText().toString().trim());

            manutencaoProgForwarderModel.setEditText40NmManuForwarder           (editText40NmManuForwarder                .getText().toString().trim());

            //manutencaoProgForwarderModel.setEditTextNotasForwarder              (editTextNotasForwarder                   .getText().toString().trim());

            /*SETANDO A DATA DE NASCIMENTO*/
            //manutencaoProgForwarderModel.setEditTextDataManuProgForwarder(textViewDataManutencaoForwarder.getText().toString().trim());

            /*REALIZANDO UM CAST PARA PEGAR O OBJETO DO modelo SELECIONADO*/
            ManutencaoProgForwarderModelo manutencaoProgForwarderModelo= (ManutencaoProgForwarderModelo) spinnerModelo.getSelectedItem();

             /*SETANDO o modelo*/
            //manutencaoProgForwarderModel.setModelo(manutencaoProgForwarderModelo.getCodigo());

            /*SETANDO a qtd eixo*/
            if (radioButton43.isChecked())
                manutencaoProgForwarderModel.setRadioGroupQtdeixoManuForwarder("6x6");
            else
                manutencaoProgForwarderModel.setRadioGroupQtdeixoManuForwarder("8x8");

             /*SETANDO O a qtd horas*/
            if (radioButtonBasicoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroupBasicoCompManuForwarder("basico");
            else
                manutencaoProgForwarderModel.setRadioGroupBasicoCompManuForwarder("completo");

            if (radioButton14CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup14ManuForwarder("radioButton14CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup14ManuForwarder("radioButton105NAManuForwarder");

            if (radioButton10CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup6ManuForwarder("radioButton10CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup6ManuForwarder("radioButton106NAManuForwarder");

            if (radioButton11CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup7ManuForwarder("radioButton11CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup7ManuForwarder("radioButton107NAManuForwarder");

            if (radioButton12CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup8ManuForwarder("radioButton12CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup8ManuForwarder("radioButton108NAManuForwarder");

            if (radioButton13CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup20ManuForwarder("radioButton13CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup20ManuForwarder("radioButton109NAManuForwarder");

            if (radioButton9CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup5ManuForwarder("radioButton9CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup5ManuForwarder("radioButton110NAManuForwarder");

            if (radioButton5CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup2ManuForwarder("radioButton5CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup2ManuForwarder("radioButton111NAManuForwarder");

            if (radioButton6CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup3ManuForwarder("radioButton6CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup3ManuForwarder("radioButton112NAManuForwarder");

            if (radioButton7CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup4ManuForwarder("radioButton7CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup4ManuForwarder("radioButton113NAManuForwarder");

            if (radioButton8CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup30ManuForwarder("radioButton37BasicoManuProgGrua");
            else
                manutencaoProgForwarderModel.setRadioGroup30ManuForwarder("radioButton114NAManuForwarder");

            if (radioButton4CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup31ManuForwarder("radioButton4CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup31ManuForwarder("radioButton115NAManuForwarder");

            if (radioButton3CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup13ManuForwarder("radioButton3CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup13ManuForwarder("radioButton116NAManuForwarder");

            if (radioButton15CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup10ManuForwarder("radioButton15CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup10ManuForwarder("radioButton16NAManuForwarder");

            if (radioButton17CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup9ManuForwarder("radioButton44BasicoManuProgGrua");
            else
                manutencaoProgForwarderModel.setRadioGroup9ManuForwarder("radioButton18NAManuForwarder");

            if (radioButton19CompletoManuForwarder.isChecked())
                manutencaoProgForwarderModel.setRadioGroup11ManuForwarder("radioButton19CompletoManuForwarder");
            else
                manutencaoProgForwarderModel.setRadioGroup11ManuForwarder("radioButton20NAManuForwarder");

            /*SETA O REGISTRO COMO INATIVO*/
            manutencaoProgForwarderModel.setCheckBox505TarefasAdicioanisManuForwarder((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox505TarefasAdicioanisManuForwarder.isChecked())
                manutencaoProgForwarderModel.setCheckBox505TarefasAdicioanisManuForwarder((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
          /*  manutencaoProgForwarderModel.setCheckBox237((byte) 0);

            *//*SE TIVER SELECIONADO SETA COMO ATIVO*//*
            if (checkBox237.isChecked())
                manutencaoProgForwarderModel.setCheckBox237((byte) 1);

             *//*SETA O REGISTRO COMO INATIVO*//*
            manutencaoProgForwarderModel.setCheckBox238((byte) 0);

            *//*SE TIVER SELECIONADO SETA COMO ATIVO*//*
            if (checkBox238.isChecked())
                manutencaoProgForwarderModel.setCheckBox238((byte) 1);

             *//*SETA O REGISTRO COMO INATIVO*//*
            manutencaoProgForwarderModel.setCheckBox239((byte) 0);

            *//*SE TIVER SELECIONADO SETA COMO ATIVO*//*
            if (checkBox239.isChecked())
                manutencaoProgForwarderModel.setCheckBox239((byte) 1);

            *//*SALVANDO UM NOVO REGISTRO*//*
            new ManutencaoProgForwarderRepository(this).Salvar(manutencaoProgForwarderModel);*/

            /*MENSAGEM DE SUCESSO!*/
            Uteis.Alert(this, this.getString(R.string.registro_salvo_sucesso));

            // AtualizarLista();

            super.finish();

            //LimparCampos();
        }

    }
    /* //LIMPA OS CAMPOS APOS SALVAR AS INFORMACOES
     protected void LimparCampos(){

         editTextNome.setText(null);
         editTextEndereco.setText(null);

         radioGroupSexo.clearCheck();

         editTextDataNascimento.setText(null);
         checkBoxRegistroAtivo.setChecked(false);
     }*/
    //DIZ QUAL A LOCALIZACAO PARA TRADUZIR OS TEXTOS DO CALENDARIO.
    protected  void Localizacao(){

        Locale locale = new Locale("pt", "BR");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getResources().updateConfiguration(config, null);

    }

    //CARREGA AS OPCOES DE ESTADO CIVIL PARA O COMPONENTE SPINNER
    protected  void CarregaModelos(){

        ArrayAdapter<ManutencaoProgForwarderModelo> arrayAdapter;

        List<ManutencaoProgForwarderModelo> itens =  new ArrayList<ManutencaoProgForwarderModelo>();

        itens.add(new ManutencaoProgForwarderModelo("B", "Buffalo"));
        itens.add(new ManutencaoProgForwarderModelo("BK", "Buffalo King"));
        itens.add(new ManutencaoProgForwarderModelo("E", "Elephant"));
        itens.add(new ManutencaoProgForwarderModelo("EK", "Elephant King"));

        arrayAdapter = new ArrayAdapter<ManutencaoProgForwarderModelo>(this, android.R.layout.simple_spinner_item,itens);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerModelo.setAdapter(arrayAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simples_botao_voltar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_voltar) {
            super.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
