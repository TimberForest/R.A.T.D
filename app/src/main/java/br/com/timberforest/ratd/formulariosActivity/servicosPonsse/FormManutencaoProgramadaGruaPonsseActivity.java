/*
package com.timberforest.andreives.relatorios.formulariosActivity.servicosPonsse;
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

import com.timberforest.andreives.relatorios.R;
import Uteis;
import GarantiaForwarderRepository;
import com.timberforest.andreives.relatorios.dao.servicosPonsse.ManutencaoProgramadaGruaRepository;
import GarantiaForwarderModel;
import GarantiaForwarderModelo;
import ManutencaoProgramadaGruaModel;
import ManutencaoProgramadaGruaModelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class FormManutencaoProgramadaGruaPonsseActivity extends ActionBarActivity {

    EditText         editCliente;
    EditText         editTelefone;
    EditText         editOrdemServico;
    EditText         editNumSerie;
    EditText         editTextDataNascimento;

    EditText          editText49ManuProgGrua;
    EditText          editText50ManuProgGrua;
    EditText          editText51ManuProgGrua;
    EditText          editTextNotasForwarder;
    EditText          editText41ManuProgGrua;
    EditText          editText42ManuProgGrua;
    EditText          editText44ManuProgGrua;
    EditText          editText43ManuProgGrua;
    EditText          editText45ManuProgGrua;
    EditText          editText46ManuProgGrua;
    EditText          editText47ManuProgGrua;
    EditText          editText48ManuProgGrua;
    RadioGroup       radioGroup32BasicoManuProgGrua;
    RadioGroup       radioGroup33BasicoManuProgGrua;
    RadioGroup       radioGroup34BasicoManuProgGrua;
    RadioGroup       radioGroup35BasicoManuProgGrua;
    RadioGroup       radioGroup36BasicoManuProgGrua;
    RadioGroup       radioGroup15BasicoManuProgGrua;
    RadioGroup       radioGroup16BasicoManuProgGrua;
    RadioGroup       radioGroup17BasicoManuProgGrua;
    RadioGroup       radioGroup18BasicoManuProgGrua;
    RadioGroup       radioGroup19BasicoManuProgGrua;
    RadioGroup       radioGroup20BasicoManuProgGrua;
    RadioGroup       radioGroup21BasicoManuProgGrua;
    RadioGroup       radioGroup22BasicoManuProgGrua;
    RadioGroup       radioGroup23BasicoManuProgGrua;
    RadioGroup       radioGroup24BasicoManuProgGrua;
    RadioGroup       radioGroup25BasicoManuProgGrua;
    RadioGroup       radioGroup26BasicoManuProgGrua;
    RadioGroup       radioGroup27BasicoManuProgGrua;
    RadioGroup       radioGroup28BasicoManuProgGrua;
    RadioGroup       radioGroup29BasicoManuProgGrua;
    RadioGroup       radioGroup30BasicoManuProgGrua;
    RadioGroup       radioGroup31BasicoManuProgGrua;
    RadioGroup       radioGroupBasicCompManuProgGrua;
    RadioGroup       radioGroupQtdEixoManuProgGrua;

    RadioButton      radioButton50BasicoManuProgGrua               ;
    RadioButton      radioButton51CompletoManuProgGrua             ;
    RadioButton      radioButton134NAManuProgGrua                  ;
    RadioButton      radioButton52BasicoManuProgGrua               ;
    RadioButton      radioButton53CompletoManuProgGrua             ;
    RadioButton      radioButton135NAManuProgGrua                  ;
    RadioButton      radioButton57CompletoManuProgGrua             ;
    RadioButton      radioButton136NAManuProgGrua                  ;
    RadioButton      radioButton59radioButton49CompletoManuProgGrua;
    RadioButton      radioButton137NAManuProgGrua                  ;
    RadioButton      radioButton61CompletoManuProgGrua             ;
    RadioButton      radioButton138NAManuProgGrua                  ;
    RadioButton      radioButton21BasicoManuProgGrua               ;
    RadioButton      radioButton22CompletoManuProgGrua             ;
    RadioButton      radioButton117NAManuProgGrua                  ;
    RadioButton      radioButton23BasicoManuProgGrua               ;
    RadioButton      radioButton24CompletoManuProgGrua             ;
    RadioButton      radioButton118NAManuProgGrua                  ;
    RadioButton      radioButton26CompletoManuProgGrua             ;
    RadioButton      radioButton119NAManuProgGrua                  ;
    RadioButton      radioButton25CompletoManuProgGrua             ;
    RadioButton      radioButton120NAManuProgGrua                  ;
    RadioButton      radioButton27BasicoManuProgGrua               ;
    RadioButton      radioButton28CompletoManuProgGrua             ;
    RadioButton      radioButton121NAManuProgGrua                  ;
    RadioButton      radioButton29BasicoManuProgGrua               ;
    RadioButton      radioButton30CompletoManuProgGrua             ;
    RadioButton      radioButton122NAManuProgGrua                  ;
    RadioButton      radioButton31BasicoManuProgGrua               ;
    RadioButton      radioButton32CompletoManuProgGrua             ;
    RadioButton      radioButton123NAManuProgGrua                  ;
    RadioButton      radioButton33BasicoManuProgGrua               ;
    RadioButton      radioButton34CompletoManuProgGrua             ;
    RadioButton      radioButton124NAManuProgGrua                  ;
    RadioButton      radioButton35BasicoManuProgGrua               ;
    RadioButton      radioButton36CompletoManuProgGrua             ;
    RadioButton      radioButton125NAManuProgGrua                  ;
    RadioButton      radioButton37BasicoManuProgGrua               ;
    RadioButton      radioButton38CompletoManuProgGrua             ;
    RadioButton      radioButton126NAManuProgGrua                  ;
    RadioButton      radioButton39CompletoManuProgGrua             ;
    RadioButton      radioButton127NAManuProgGrua                  ;
    RadioButton      radioButton40BasicoManuProgGrua               ;
    RadioButton      radioButton41CompletoManuProgGrua             ;
    RadioButton      radioButton128NAManuProgGrua                  ;
    RadioButton      radioButton42BasicoManuProgGrua               ;
    RadioButton      radioButton43CompletoManuProgGrua             ;
    RadioButton      radioButton129NAManuProgGrua                  ;
    RadioButton      radioButton44BasicoManuProgGrua               ;
    RadioButton      radioButton130CompletoManuProgGrua            ;
    RadioButton      radioButton45CompletoManuProgGrua             ;
    RadioButton      radioButton131NAManuProgGrua                  ;
    RadioButton      radioButton46BasicoManuProgGrua               ;
    RadioButton      radioButton47CompletoManuProgGrua             ;
    RadioButton      radioButton132NAManuProgGrua                  ;
    RadioButton      radioButton48BasicoManuProgGrua               ;
    RadioButton      radioButton49CompletoManuProgGrua             ;
    RadioButton      radioButton133NAManuProgGrua                  ;
    RadioButton      radioButton54CompletoManuProgGrua             ;
    RadioButton      radioButton55CompletoManuProgGrua             ;
    RadioButton      radioButton6x6ManuProgGrua                    ;
    RadioButton      radioButton8x8ManuProgGrua                    ;

    Spinner          spinnerModelo;
    Button           buttonSalvar;

    CheckBox         checkBoxVfslSelecionado;
    CheckBox         checkBoxVmvmgSelecionado;
    CheckBox         checkBoxTfsaappmiplSelecionado;

    //CRIA POPUP COM O CALENDARIO
    DatePickerDialog datePickerDialogDataNascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_manutencao_programada_grua_ponsse);

        // CHAMA O METODO PARA DIZER QUAL A LOCALIZACAO,
        // USADO PARA TRADUZIR OS TEXTOS DO CALENDARIO.
        this.Localizacao();

        //VINCULA OS COMPONENTES DA TELA COM OS DA ATIVIDADE
        this.CriarComponentes();

        //CRIA OS EVENTOS DOS COMPONENTES
        this.CriarEventos();

        //CARREGA AS OPCOES DE ESTADO CIVIL
        this.CarregaModelos();
    }

    //VINCULA OS COMPONENTES DA TELA COM OS DA ATIVIDADE
    protected  void CriarComponentes(){

        editCliente            = (EditText) this.findViewById(R.id.editTextClienteGrua);

        editTelefone           = (EditText) this.findViewById(R.id.editTextTelefoneClienteGrua);

        editOrdemServico           = (EditText) this.findViewById(R.id.editTextOrdemServicoGrua);

        editNumSerie           = (EditText) this.findViewById(R.id.editTextNumSerieGrua);

        editTextDataNascimento = (EditText)this.findViewById(R.id.editTextDataGrua);

       editText49ManuProgGrua               = (EditText) this.findViewById(R.id.editText49ManuProgGrua);

       editText50ManuProgGrua               = (EditText) this.findViewById(R.id.editText50ManuProgGrua);

       editText51ManuProgGrua               = (EditText) this.findViewById(R.id.editText51ManuProgGrua);

       editTextNotasForwarder               = (EditText) this.findViewById(R.id.editTextNotasForwarder);

       editText41ManuProgGrua               = (EditText) this.findViewById(R.id.editText41ManuProgGrua);

       editText42ManuProgGrua               = (EditText) this.findViewById(R.id.editText42ManuProgGrua);

       editText44ManuProgGrua               = (EditText) this.findViewById(R.id.editText44ManuProgGrua);

       editText43ManuProgGrua               = (EditText) this.findViewById(R.id.editText43ManuProgGrua);

       editText45ManuProgGrua               = (EditText) this.findViewById(R.id.editText45ManuProgGrua);

       editText46ManuProgGrua               = (EditText) this.findViewById(R.id.editText46ManuProgGrua);

       editText47ManuProgGrua               = (EditText) this.findViewById(R.id.editText47ManuProgGrua);

       editText48ManuProgGrua               = (EditText) this.findViewById(R.id.editText48ManuProgGrua);

        radioButton50BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton50BasicoManuProgGrua                  );
        radioButton51CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton51CompletoManuProgGrua                );
        radioButton134NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton134NAManuProgGrua                     );
        radioButton52BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton52BasicoManuProgGrua                  );
        radioButton53CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton53CompletoManuProgGrua                );
        radioButton135NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton135NAManuProgGrua                     );
        radioButton57CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton57CompletoManuProgGrua                );
        radioButton136NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton136NAManuProgGrua                     );
        radioButton59radioButton49CompletoManuProgGrua  = (RadioButton) this.findViewById(R.id.radioButton59radioButton49CompletoManuProgGrua   );
        radioButton137NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton137NAManuProgGrua                     );
        radioButton61CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton61CompletoManuProgGrua                );
        radioButton138NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton138NAManuProgGrua                     );
        radioButton21BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton21BasicoManuProgGrua                  );
        radioButton22CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton22CompletoManuProgGrua                );
        radioButton117NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton117NAManuProgGrua                     );
        radioButton23BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton23BasicoManuProgGrua                  );
        radioButton24CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton24CompletoManuProgGrua                );
        radioButton118NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton118NAManuProgGrua                     );
        radioButton26CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton26CompletoManuProgGrua                );
        radioButton119NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton119NAManuProgGrua                     );
        radioButton25CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton25CompletoManuProgGrua                );
        radioButton120NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton120NAManuProgGrua                     );
        radioButton27BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton27BasicoManuProgGrua                  );
        radioButton28CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton28CompletoManuProgGrua                );
        radioButton121NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton121NAManuProgGrua                     );
        radioButton29BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton29BasicoManuProgGrua                  );
        radioButton30CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton30CompletoManuProgGrua                );
        radioButton122NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton122NAManuProgGrua                     );
        radioButton31BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton31BasicoManuProgGrua                  );
        radioButton32CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton32CompletoManuProgGrua                );
        radioButton123NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton123NAManuProgGrua                     );
        radioButton33BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton33BasicoManuProgGrua                  );
        radioButton34CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton34CompletoManuProgGrua                );
        radioButton124NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton124NAManuProgGrua                     );
        radioButton35BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton35BasicoManuProgGrua                  );
        radioButton36CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton36CompletoManuProgGrua                );
        radioButton125NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton125NAManuProgGrua                     );
        radioButton37BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton37BasicoManuProgGrua                  );
        radioButton38CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton38CompletoManuProgGrua                );
        radioButton126NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton126NAManuProgGrua                     );
        radioButton39CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton39CompletoManuProgGrua                );
        radioButton127NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton127NAManuProgGrua                     );
        radioButton40BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton40BasicoManuProgGrua                  );
        radioButton41CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton41CompletoManuProgGrua                );
        radioButton128NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton128NAManuProgGrua                     );
        radioButton42BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton42BasicoManuProgGrua                  );
        radioButton43CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton43CompletoManuProgGrua                );
        radioButton129NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton129NAManuProgGrua                     );
        radioButton44BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton44BasicoManuProgGrua                  );
        radioButton130CompletoManuProgGrua              = (RadioButton) this.findViewById(R.id.radioButton130CompletoManuProgGrua               );
        radioButton45CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton45CompletoManuProgGrua                );
        radioButton131NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton131NAManuProgGrua                     );
        radioButton46BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton46BasicoManuProgGrua                  );
        radioButton47CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton47CompletoManuProgGrua                );
        radioButton132NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton132NAManuProgGrua                     );
        radioButton48BasicoManuProgGrua                 = (RadioButton) this.findViewById(R.id.radioButton48BasicoManuProgGrua                  );
        radioButton49CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton49CompletoManuProgGrua                );
        radioButton133NAManuProgGrua                    = (RadioButton) this.findViewById(R.id.radioButton133NAManuProgGrua                     );
        radioButton54CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton54CompletoManuProgGrua                );
        radioButton55CompletoManuProgGrua               = (RadioButton) this.findViewById(R.id.radioButton55CompletoManuProgGrua                );
        radioButton6x6ManuProgGrua                      = (RadioButton) this.findViewById(R.id.radioButton6x6ManuProgGrua                       );
        radioButton8x8ManuProgGrua                      = (RadioButton) this.findViewById(R.id.radioButton8x8ManuProgGrua                       );

        radioGroup32BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup32BasicoManuProgGrua    );
        radioGroup33BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup33BasicoManuProgGrua    );
        radioGroup34BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup34BasicoManuProgGrua    );
        radioGroup35BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup35BasicoManuProgGrua    );
        radioGroup36BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup36BasicoManuProgGrua    );
        radioGroup15BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup15BasicoManuProgGrua    );
        radioGroup16BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup16BasicoManuProgGrua    );
        radioGroup17BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup17BasicoManuProgGrua    );
        radioGroup18BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup18BasicoManuProgGrua    );
        radioGroup19BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup19BasicoManuProgGrua    );
        radioGroup20BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup20BasicoManuProgGrua    );
        radioGroup21BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup21BasicoManuProgGrua    );
        radioGroup22BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup22BasicoManuProgGrua    );
        radioGroup23BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup23BasicoManuProgGrua    );
        radioGroup24BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup24BasicoManuProgGrua    );
        radioGroup25BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup25BasicoManuProgGrua    );
        radioGroup26BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup26BasicoManuProgGrua    );
        radioGroup27BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup27BasicoManuProgGrua    );
        radioGroup28BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup28BasicoManuProgGrua    );
        radioGroup29BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup29BasicoManuProgGrua    );
        radioGroup30BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup30BasicoManuProgGrua    );
        radioGroup31BasicoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroup31BasicoManuProgGrua    );
        radioGroupBasicCompManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroupBasicCompManuProgGrua    );
        radioGroupQtdEixoManuProgGrua                       = (RadioGroup) this.findViewById(R.id.radioGroupQtdEixoManuProgGrua    );

        spinnerModelo     = (Spinner)this.findViewById(R.id.spinnerModeloManuProgGrua);

        checkBoxVfslSelecionado  = (CheckBox)this.findViewById(R.id.checkBoxVfslSelecionado);
        checkBoxVmvmgSelecionado  = (CheckBox)this.findViewById(R.id.checkBoxVmvmgSelecionado);
        checkBoxTfsaappmiplSelecionado  = (CheckBox)this.findViewById(R.id.checkBoxTfsaappmiplSelecionado);

        buttonSalvar           = (Button) this.findViewById(R.id.buttonSaveManuProgGrua);



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

                //FORMATANDO O MES COM DOIS DIGITOS
                String mes = (String.valueOf((mesSelecionado + 1)).length() == 1 ? "0" + (mesSelecionado + 1 ): String.valueOf(mesSelecionado));

                editTextDataNascimento.setText(diaSelecionado + "/" + mes + "/" + anoSelecionado);

            }

        }, anoAtual, mesAtual, diaAtual);

        //CRIANDO EVENTO NO CAMPO DE DATA PARA ABRIR A POPUP
        editTextDataNascimento.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                datePickerDialogDataNascimento.show();
            }
        });

        //CRIANDO EVENTO NO CAMPO DE DATA PARA ABRIR A POPUP
        editTextDataNascimento.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                datePickerDialogDataNascimento.show();

            }
        });

        //CRIANDO EVENTO NO BOTAO SALVAR
        buttonSalvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Salvar_onClick();
            }
        });
    }


    //VALIDA OS CAMPOS E SALVA AS INFORMACOES NO BANCO DE DADOS
    protected  void Salvar_onClick(){

        if(editCliente.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.cliente_obrigatorio));

            editCliente.requestFocus();
        }
        else if(editTelefone.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.telefone_obrigatorio));

            editTelefone.requestFocus();
        }

        else if(editOrdemServico.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ordem_servico_obrigatorio));

            editOrdemServico.requestFocus();
        }

        else if(editNumSerie.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.num_serie_obrigatorio));

            editNumSerie.requestFocus();
        }


        else if(editTextDataNascimento.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.data_nascimento_obrigatorio));

            editTextDataNascimento.requestFocus();
        }

        else if(editText49ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio_valor));

            editText49ManuProgGrua.requestFocus();
        }

        else if(editText50ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio_valor));

            editText50ManuProgGrua.requestFocus();
        }

        else if(editText51ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio_valor));

            editText51ManuProgGrua.requestFocus();
        }

        else if(editTextNotasForwarder.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.notas_obrigatorio));

            editTextNotasForwarder.requestFocus();
        }

        else if(editText41ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText41ManuProgGrua.requestFocus();
        }

        else if(editText42ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText42ManuProgGrua.requestFocus();
        }

        else if(editText44ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText44ManuProgGrua.requestFocus();
        }

        else if(editText43ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText43ManuProgGrua.requestFocus();
        }

        else if(editText45ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText45ManuProgGrua.requestFocus();
        }

        else if(editText46ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText46ManuProgGrua.requestFocus();
        }

        else if(editText47ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText47ManuProgGrua.requestFocus();
        }

        else if(editText48ManuProgGrua.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText48ManuProgGrua.requestFocus();
        }

        else if(!radioButton21BasicoManuProgGrua.isChecked() && !radioButton22CompletoManuProgGrua.isChecked()&& !radioButton117NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton23BasicoManuProgGrua.isChecked() && !radioButton24CompletoManuProgGrua.isChecked()&& !radioButton118NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton54CompletoManuProgGrua.isChecked() && !radioButton55CompletoManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton6x6ManuProgGrua.isChecked() && !radioButton8x8ManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.qtd_eixo_obrigatorio));
        }

        else if(!radioButton26CompletoManuProgGrua.isChecked() && !radioButton119NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton25CompletoManuProgGrua.isChecked() && !radioButton120NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton27BasicoManuProgGrua.isChecked() && !radioButton28CompletoManuProgGrua.isChecked()&& !radioButton121NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton29BasicoManuProgGrua.isChecked() && !radioButton30CompletoManuProgGrua.isChecked()&& !radioButton122NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton31BasicoManuProgGrua.isChecked() && !radioButton32CompletoManuProgGrua.isChecked()&& !radioButton123NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton33BasicoManuProgGrua.isChecked() && !radioButton34CompletoManuProgGrua.isChecked()&& !radioButton124NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton35BasicoManuProgGrua.isChecked() && !radioButton36CompletoManuProgGrua.isChecked()&& !radioButton125NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton37BasicoManuProgGrua.isChecked() && !radioButton38CompletoManuProgGrua.isChecked()&& !radioButton126NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton39CompletoManuProgGrua.isChecked() && !radioButton127NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton40BasicoManuProgGrua.isChecked() && !radioButton41CompletoManuProgGrua.isChecked()&& !radioButton128NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton42BasicoManuProgGrua.isChecked() && !radioButton43CompletoManuProgGrua.isChecked()&& !radioButton129NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton44BasicoManuProgGrua.isChecked() && !radioButton130CompletoManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo));
        }

        else if(!radioButton45CompletoManuProgGrua.isChecked() && !radioButton131NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.completo_na));
        }

        else if(!radioButton46BasicoManuProgGrua.isChecked() && !radioButton47CompletoManuProgGrua.isChecked()&& !radioButton132NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton48BasicoManuProgGrua.isChecked() && !radioButton49CompletoManuProgGrua.isChecked()&& !radioButton133NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton50BasicoManuProgGrua.isChecked() && !radioButton51CompletoManuProgGrua.isChecked()&& !radioButton134NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton52BasicoManuProgGrua.isChecked() && !radioButton53CompletoManuProgGrua.isChecked()&& !radioButton135NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.basico_completo_na));
        }

        else if(!radioButton57CompletoManuProgGrua.isChecked() && !radioButton136NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.concluido_na));
        }

        else if(!radioButton59radioButton49CompletoManuProgGrua.isChecked() && !radioButton137NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.concluido_na));
        }

        else if(!radioButton61CompletoManuProgGrua.isChecked() && !radioButton138NAManuProgGrua.isChecked()){

            Uteis.Alert(this, this.getString(R.string.concluido_na));
        }
        else {

            */
/*CRIANDO UM OBJETO PESSOA*//*

            ManutencaoProgramadaGruaModel manutencaoProgramadaGruaModel = new ManutencaoProgramadaGruaModel();

            */
/*SETANDO O VALOR DO CAMPO NOME*//*

            manutencaoProgramadaGruaModel.setTelefone(editTelefone.getText().toString().trim());

            manutencaoProgramadaGruaModel.setCliente(editCliente.getText().toString().trim());

            manutencaoProgramadaGruaModel.setOrdemServico(editOrdemServico.getText().toString().trim());

            manutencaoProgramadaGruaModel.setNumDeSerie(editNumSerie.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText49ManuProgGrua(editText49ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText50ManuProgGrua(editText50ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText51ManuProgGrua (editText51ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditTextNotasGrua(editTextNotasForwarder.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText41ManuProgGrua(editText41ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText42ManuProgGrua(editText42ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText44ManuProgGrua(editText44ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText43ManuProgGrua(editText43ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText45ManuProgGrua(editText45ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText46ManuProgGrua(editText46ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText47ManuProgGrua(editText47ManuProgGrua.getText().toString().trim());

            manutencaoProgramadaGruaModel.setEditText48ManuProgGrua(editText48ManuProgGrua.getText().toString().trim());

            */
/*SETANDO A DATA DE NASCIMENTO*//*

            manutencaoProgramadaGruaModel.setDataPreenchimennto(editTextDataNascimento.getText().toString().trim());

            */
/*REALIZANDO UM CAST PARA PEGAR O OBJETO DO modelo SELECIONADO*//*

            ManutencaoProgramadaGruaModelo manutencaoProgramadaGruaModelo = (ManutencaoProgramadaGruaModelo) spinnerModelo.getSelectedItem();

             */
/*SETANDO o modelo*//*

            manutencaoProgramadaGruaModel.setModelo(manutencaoProgramadaGruaModelo.getCodigo());


            */
/*SETANDO a qtd eixo*//*

            if (radioButton6x6ManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroupQtdEixoManuProgGrua("6x6");
            else
                manutencaoProgramadaGruaModel.setRadioGroupQtdEixoManuProgGrua("8x8");

             */
/*SETANDO O a qtd horas*//*

            if (radioButton54CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroupBasicCompManuProgGrua("basico");
            else
                manutencaoProgramadaGruaModel.setRadioGroupBasicCompManuProgGrua("completo");


            if (radioButton21BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup15BasicoManuProgGrua("radioButton21BasicoManuProgGrua");
            else if (radioButton22CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup15BasicoManuProgGrua("radioButton22CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup15BasicoManuProgGrua("radioButton117NAManuProgGrua");

            if (radioButton23BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup16BasicoManuProgGrua("radioButton23BasicoManuProgGrua");
            else if (radioButton24CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup16BasicoManuProgGrua("radioButton24CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup16BasicoManuProgGrua("radioButton118NAManuProgGrua");

            if (radioButton26CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup17BasicoManuProgGrua("radioButton26CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup17BasicoManuProgGrua("radioButton119NAManuProgGrua");

            if (radioButton25CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup18BasicoManuProgGrua("radioButton25CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup18BasicoManuProgGrua("radioButton120NAManuProgGrua");

            if (radioButton27BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup19BasicoManuProgGrua("radioButton27BasicoManuProgGrua");
            else if (radioButton28CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup19BasicoManuProgGrua("radioButton28CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup19BasicoManuProgGrua("radioButton121NAManuProgGrua");

            if (radioButton29BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup20BasicoManuProgGrua("radioButton29BasicoManuProgGrua");
            else if (radioButton30CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup20BasicoManuProgGrua("radioButton30CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup20BasicoManuProgGrua("radioButton122NAManuProgGrua");

            if (radioButton31BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup21BasicoManuProgGrua("radioButton31BasicoManuProgGrua");
            else if (radioButton32CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup21BasicoManuProgGrua("radioButton32CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup21BasicoManuProgGrua("radioButton123NAManuProgGrua");

            if (radioButton33BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup22BasicoManuProgGrua("radioButton33BasicoManuProgGrua");
            else if (radioButton34CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup22BasicoManuProgGrua("radioButton34CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup22BasicoManuProgGrua("radioButton124NAManuProgGrua");

            if (radioButton35BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup23BasicoManuProgGrua("radioButton35BasicoManuProgGrua");
            else if (radioButton36CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup23BasicoManuProgGrua("radioButton36CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup23BasicoManuProgGrua("radioButton125NAManuProgGrua");

            if (radioButton37BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup24BasicoManuProgGrua("radioButton37BasicoManuProgGrua");
            else if (radioButton38CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup24BasicoManuProgGrua("radioButton38CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup24BasicoManuProgGrua("radioButton126NAManuProgGrua");

            if (radioButton39CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup25BasicoManuProgGrua("radioButton39CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup25BasicoManuProgGrua("radioButton127NAManuProgGrua");


            if (radioButton40BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup26BasicoManuProgGrua("radioButton40BasicoManuProgGrua");
            else if (radioButton41CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup26BasicoManuProgGrua("radioButton41CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup26BasicoManuProgGrua("radioButton128NAManuProgGrua");

            /////
            if (radioButton42BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup27BasicoManuProgGrua("radioButton42BasicoManuProgGrua");
            else if (radioButton43CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup27BasicoManuProgGrua("radioButton43CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup27BasicoManuProgGrua("radioButton129NAManuProgGrua");

            if (radioButton44BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup28BasicoManuProgGrua("radioButton44BasicoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup28BasicoManuProgGrua("radioButton130CompletoManuProgGrua");

            if (radioButton45CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup29BasicoManuProgGrua("radioButton45CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup29BasicoManuProgGrua("radioButton131NAManuProgGrua");

            if (radioButton46BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup30BasicoManuProgGrua("radioButton46BasicoManuProgGrua");
            else if (radioButton47CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup30BasicoManuProgGrua("radioButton47CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup30BasicoManuProgGrua("radioButton132NAManuProgGrua");

            if (radioButton48BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup31BasicoManuProgGrua("radioButton48BasicoManuProgGrua");
            else if (radioButton49CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup31BasicoManuProgGrua("radioButton49CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup31BasicoManuProgGrua("radioButton133NAManuProgGrua");

            if (radioButton50BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup32BasicoManuProgGrua("radioButton50BasicoManuProgGrua");
            else if (radioButton51CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup32BasicoManuProgGrua("radioButton51CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup32BasicoManuProgGrua("radioButton134NAManuProgGrua");

            if (radioButton52BasicoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup33BasicoManuProgGrua("radioButton52BasicoManuProgGrua");
            else if (radioButton53CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup33BasicoManuProgGrua("radioButton53CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup33BasicoManuProgGrua("radioButton135NAManuProgGrua");

            if (radioButton57CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup34BasicoManuProgGrua("radioButton57CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup34BasicoManuProgGrua("radioButton136NAManuProgGrua");

            if (radioButton59radioButton49CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup35BasicoManuProgGrua("radioButton59radioButton49CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup35BasicoManuProgGrua("radioButton137NAManuProgGrua");

            if (radioButton61CompletoManuProgGrua.isChecked())
                manutencaoProgramadaGruaModel.setRadioGroup36BasicoManuProgGrua("radioButton61CompletoManuProgGrua");
            else
                manutencaoProgramadaGruaModel.setRadioGroup36BasicoManuProgGrua("radioButton138NAManuProgGrua");

            */
/*SETA O REGISTRO COMO INATIVO*//*

            manutencaoProgramadaGruaModel.setCheckBoxVfslSelecionado((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBoxVfslSelecionado.isChecked())
                manutencaoProgramadaGruaModel.setCheckBoxVfslSelecionado((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            manutencaoProgramadaGruaModel.setCheckBoxVmvmgSelecionado((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBoxVmvmgSelecionado.isChecked())
                manutencaoProgramadaGruaModel.setCheckBoxVmvmgSelecionado((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            manutencaoProgramadaGruaModel.setCheckBoxTfsaappmiplSelecionado((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBoxTfsaappmiplSelecionado.isChecked())
                manutencaoProgramadaGruaModel.setCheckBoxTfsaappmiplSelecionado((byte) 1);

            */
/*SALVANDO UM NOVO REGISTRO*//*

            new ManutencaoProgramadaGruaRepository(this).salvar(manutencaoProgramadaGruaModel);

            */
/*MENSAGEM DE SUCESSO!*//*

            Uteis.Alert(this, this.getString(R.string.registro_salvo_sucesso));

            // AtualizarLista();

            super.finish();

            //LimparCampos();
        }

    }
    */
/* //LIMPA OS CAMPOS APOS SALVAR AS INFORMACOES
     protected void LimparCampos(){

         editTextNome.setText(null);
         editTextEndereco.setText(null);

         radioGroupSexo.clearCheck();

         editTextDataNascimento.setText(null);
         checkBoxRegistroAtivo.setChecked(false);
     }*//*

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

        ArrayAdapter<ManutencaoProgramadaGruaModelo> arrayAdapter;

        List<ManutencaoProgramadaGruaModelo> itens =  new ArrayList<ManutencaoProgramadaGruaModelo>();

        itens.add(new ManutencaoProgramadaGruaModelo("B", "Buffalo"));
        itens.add(new ManutencaoProgramadaGruaModelo("BK", "Buffalo King"));
        itens.add(new ManutencaoProgramadaGruaModelo("E", "Elephant"));
        itens.add(new ManutencaoProgramadaGruaModelo("EK", "Elephant King"));

        arrayAdapter = new ArrayAdapter<ManutencaoProgramadaGruaModelo>(this, android.R.layout.simple_spinner_item,itens);
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
*/
