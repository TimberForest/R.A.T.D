package br.com.timberforest.ratd.formulariosActivity.servicosPonsse;

import android.app.DatePickerDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
import br.com.timberforest.ratd.model.servicosPonsse.GarantiaForwarderModel;
import br.com.timberforest.ratd.model.servicosPonsse.GarantiaForwarderModelo;
import br.com.timberforest.ratd.dao.servicosPonsse.GarantiaForwarderRepository;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class FormGarantiaForwarderPonsseActivity extends AppCompatActivity {

    EditText          editText158;
    RadioButton      radioButton6x6;

    RadioButton      radioButton8x8;
    RadioButton      radioButton200hrs;
    RadioButton      radioButton1800hrs;
    RadioGroup       radioGroupQtdEixo;

    RadioGroup       radioGroupQtdhorasRevisao;
    Spinner          spinnerModelo;

    Button           buttonSalvar;
    CheckBox         checkBox140;

    CheckBox         checkBox209;
    CheckBox         checkBox210;
    CheckBox         checkBox211;
    CheckBox         checkBox213;
    CheckBox         checkBox214;
    CheckBox         checkBox215;
    CheckBox         checkBox216;
    CheckBox         checkBox217;
    CheckBox         checkBox218;
    CheckBox         checkBox264;
    CheckBox         checkBox265;
    CheckBox         checkBox266;
    CheckBox         checkBox267;
    CheckBox         checkBox268;
    CheckBox         checkBox269;
    CheckBox         checkBox270;
    CheckBox         checkBox271;
    CheckBox         checkBox272;
    CheckBox         checkBox273;
    CheckBox         checkBox274;
    CheckBox         checkBox275;
    CheckBox         checkBox276;
    CheckBox         checkBox277;
    CheckBox         checkBox278;
    CheckBox         checkBox279;
    CheckBox         checkBox280;
    CheckBox         checkBox281;
    CheckBox         checkBox284;
    CheckBox         checkBox285;
    CheckBox         checkBox286;
    CheckBox         checkBox287;
    CheckBox         checkBox288;
    CheckBox         checkBox289;
    CheckBox         checkBox290;
    CheckBox         checkBox291;
    CheckBox         checkBox292;
    CheckBox         checkBox293;
    CheckBox         checkBox294;
    CheckBox         checkBox295;
    CheckBox         checkBox296;
    CheckBox         checkBox297;
    CheckBox         checkBox298;
    CheckBox         checkBox299;
    CheckBox         checkBox55;
    CheckBox         checkBox56;
    CheckBox         checkBox57;
    CheckBox         checkBox58;
    CheckBox         checkBox59;
    CheckBox         checkBox60;
    CheckBox         checkBox103;
    CheckBox         checkBox104;
    CheckBox         checkBox105;
    CheckBox         checkBox106;
    CheckBox         checkBox107;
    CheckBox         checkBox108;
    CheckBox         checkBox109;
    CheckBox         checkBox110;
    CheckBox         checkBox111;
    CheckBox         checkBox112;
    CheckBox         checkBox113;
    CheckBox         checkBox114;
    CheckBox         checkBox115;
    CheckBox         checkBox116;
    CheckBox         checkBox300;
    CheckBox         checkBox301;
    CheckBox         checkBox302;
    CheckBox         checkBox303;
    CheckBox         checkBox304;
    CheckBox         checkBox305;
    CheckBox         checkBox306;
    CheckBox         checkBox307;
    CheckBox         checkBox308;
    CheckBox         checkBox309;
    CheckBox         checkBox310;
    CheckBox         checkBox311;
    CheckBox         checkBox312;
    CheckBox         checkBox313;
    CheckBox         checkBox314;
    CheckBox         checkBox315;
    CheckBox         checkBox316;
    CheckBox         checkBox317;
    CheckBox         checkBox318;
    CheckBox         checkBox319;
    CheckBox         checkBox320;
    CheckBox         checkBox321;
    CheckBox         checkBox322;
    CheckBox         checkBox323;
    CheckBox         checkBox324;
    CheckBox         checkBox325;
    CheckBox         checkBox326;
    CheckBox         checkBox327;
    CheckBox         checkBox328;
    CheckBox         checkBox329;
    CheckBox         checkBox330;
    CheckBox         checkBox333;
    CheckBox         checkBox334;
    CheckBox         checkBox335;
    CheckBox         checkBox336;
    CheckBox         checkBox337;
    CheckBox         checkBox338;
    CheckBox         checkBox339;
    CheckBox         checkBox340;
    CheckBox         checkBox341;
    CheckBox         checkBox342;
    CheckBox         checkBox343;
    CheckBox         checkBox344;
    CheckBox         checkBox345;
    CheckBox         checkBox346;
    CheckBox         checkBox347;
    CheckBox         checkBox348;
    CheckBox         checkBox349;
    CheckBox         checkBox350;
    CheckBox         checkBox351;
    CheckBox         checkBox352;
    CheckBox         checkBox353;
    CheckBox         checkBox354;
    CheckBox         checkBox355;
    CheckBox         checkBox356;
    CheckBox         checkBox357;
    CheckBox         checkBox358;
    //CRIA POPUP COM O CALENDARIO
    DatePickerDialog datePickerDialogDataNascimento;

   /* //CRIANDO UMA LISTA DE PESSOAS
    List<GarantiaForwarderModel> garantiaForwarderModels =  new ArrayList<GarantiaForwarderModel>();*/

   /* GarantiaForwarderRepository garantiaForwarderRepository;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_garantia_forwarder_ponsse);

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

        editCliente            = (EditText) this.findViewById(R.id.editTextClienteGarantiaForwarder);

        editTelefone           = (EditText) this.findViewById(R.id.editTextTelefoneClienteForwarder);

        editOrdemServico           = (EditText) this.findViewById(R.id.editTextOrdemServicoForwarder);

        editNumSerie           = (EditText) this.findViewById(R.id.editTextNumSerieForwarder);

        editHorasMotor           = (EditText) this.findViewById(R.id.editTextHorasMotorForwarder);

        editTextDataNascimento = (EditText)this.findViewById(R.id.editTextDataNascimento);

        editText68            = (EditText) this.findViewById(R.id.editText68);

        editText69           = (EditText) this.findViewById(R.id.editText69);

        editText70            = (EditText) this.findViewById(R.id.editText70);

        editText71           = (EditText) this.findViewById(R.id.editText71);

        editText72            = (EditText) this.findViewById(R.id.editText72);

     /*   editText3           = (EditText) this.findViewById(R.id.editText3Detail);

        editText136            = (EditText) this.findViewById(R.id.editText136Detail);

        editText146           = (EditText) this.findViewById(R.id.editText146Detail);

        editText147            = (EditText) this.findViewById(R.id.editText147Detail);*/

        editText149           = (EditText) this.findViewById(R.id.editText149);

        editText150            = (EditText) this.findViewById(R.id.editText150);

        editText151           = (EditText) this.findViewById(R.id.editText151);

        editText152            = (EditText) this.findViewById(R.id.editText152);

        editText38           = (EditText) this.findViewById(R.id.editText38GarantiaHarvester);

        editText39            = (EditText) this.findViewById(R.id.editText39GarantiaHarvester);

        editText40           = (EditText) this.findViewById(R.id.editText40GarantiaHarvester);

        editText41            = (EditText) this.findViewById(R.id.editText41GarantiaHarvester);

        editText42           = (EditText) this.findViewById(R.id.editText42GarantiaHarvester);

        editText43            = (EditText) this.findViewById(R.id.editText43GarantiaHarvester);

        editText44           = (EditText) this.findViewById(R.id.editText44GarantiaHarvester);

        editText45            = (EditText) this.findViewById(R.id.editText45GarantiaHarvester);

        editText46           = (EditText) this.findViewById(R.id.editText46GarantiaHarvester);

        editText47            = (EditText) this.findViewById(R.id.editText47GarantiaHarvester);

        editText48           = (EditText) this.findViewById(R.id.editText48Detail);

        editText49            = (EditText) this.findViewById(R.id.editText49Detail);

        editText50           = (EditText) this.findViewById(R.id.editText50Detail);

        editText51            = (EditText) this.findViewById(R.id.editText51Detail);

        editText56           = (EditText) this.findViewById(R.id.editText56Detail);

        editText57            = (EditText) this.findViewById(R.id.editText57Detail);

        editText58           = (EditText) this.findViewById(R.id.editText58Detail);

        editText59            = (EditText) this.findViewById(R.id.editText59);

        editText154           = (EditText) this.findViewById(R.id.editText154);

        editText153            = (EditText) this.findViewById(R.id.editText153);

        editText155           = (EditText) this.findViewById(R.id.editText155);

        editText156            = (EditText) this.findViewById(R.id.editText156);

        editText157           = (EditText) this.findViewById(R.id.editText157);

        editText158            = (EditText) this.findViewById(R.id.editText158);

        radioButton6x6   = (RadioButton) this.findViewById(R.id.radioButton6x6);

        radioButton8x8    = (RadioButton) this.findViewById(R.id.radioButton8x8);

        radioButton200hrs   = (RadioButton) this.findViewById(R.id.radioButton200Hrs);

        radioButton1800hrs    = (RadioButton) this.findViewById(R.id.radioButton1800Hrs);

        radioGroupQtdEixo         = (RadioGroup) this.findViewById(R.id.radioGroupQtdEixo);

        radioGroupQtdhorasRevisao         = (RadioGroup) this.findViewById(R.id.radioGroupQtdhoras);

        spinnerModelo     = (Spinner)this.findViewById(R.id.spinnerModelo);

        checkBox140  = (CheckBox)this.findViewById(R.id.checkBox140);
        checkBox209  = (CheckBox)this.findViewById(R.id.checkBox209);
        checkBox210  = (CheckBox)this.findViewById(R.id.checkBox210);
        checkBox211  = (CheckBox)this.findViewById(R.id.checkBox211);
        checkBox213  = (CheckBox)this.findViewById(R.id.checkBox213);
        checkBox214  = (CheckBox)this.findViewById(R.id.checkBox214);
        checkBox215  = (CheckBox)this.findViewById(R.id.checkBox215);
        checkBox216  = (CheckBox)this.findViewById(R.id.checkBox216);
        checkBox217  = (CheckBox)this.findViewById(R.id.checkBox217);
        checkBox218  = (CheckBox)this.findViewById(R.id.checkBox218);
        checkBox264  = (CheckBox)this.findViewById(R.id.checkBox264);
        checkBox265  = (CheckBox)this.findViewById(R.id.checkBox265);
        checkBox266  = (CheckBox)this.findViewById(R.id.checkBox266);
        checkBox267  = (CheckBox)this.findViewById(R.id.checkBox267);
        checkBox268  = (CheckBox)this.findViewById(R.id.checkBox268);
        checkBox269  = (CheckBox)this.findViewById(R.id.checkBox269);
        checkBox270  = (CheckBox)this.findViewById(R.id.checkBox270);
        checkBox271  = (CheckBox)this.findViewById(R.id.checkBox271);
        checkBox272  = (CheckBox)this.findViewById(R.id.checkBox272);
        checkBox273  = (CheckBox)this.findViewById(R.id.checkBox273);
        checkBox274  = (CheckBox)this.findViewById(R.id.checkBox274);
        checkBox275  = (CheckBox)this.findViewById(R.id.checkBox275);
        checkBox276  = (CheckBox)this.findViewById(R.id.checkBox276);
        checkBox277  = (CheckBox)this.findViewById(R.id.checkBox277);
        checkBox278  = (CheckBox)this.findViewById(R.id.checkBox278);
        checkBox279  = (CheckBox)this.findViewById(R.id.checkBox279);
        checkBox280  = (CheckBox)this.findViewById(R.id.checkBox280);
        checkBox281  = (CheckBox)this.findViewById(R.id.checkBox281);
        checkBox284  = (CheckBox)this.findViewById(R.id.checkBox284);
        checkBox285  = (CheckBox)this.findViewById(R.id.checkBox285);
        checkBox286  = (CheckBox)this.findViewById(R.id.checkBox286);
        checkBox287  = (CheckBox)this.findViewById(R.id.checkBox287);
        checkBox288  = (CheckBox)this.findViewById(R.id.checkBox288);
        checkBox289  = (CheckBox)this.findViewById(R.id.checkBox289);
        checkBox290  = (CheckBox)this.findViewById(R.id.checkBox290);
        checkBox291  = (CheckBox)this.findViewById(R.id.checkBox291);
        checkBox292  = (CheckBox)this.findViewById(R.id.checkBox292);
        checkBox293  = (CheckBox)this.findViewById(R.id.checkBox293);
        checkBox294  = (CheckBox)this.findViewById(R.id.checkBox294);
        checkBox295  = (CheckBox)this.findViewById(R.id.checkBox295);
        checkBox296  = (CheckBox)this.findViewById(R.id.checkBox296);
        checkBox297  = (CheckBox)this.findViewById(R.id.checkBox297);
        checkBox298  = (CheckBox)this.findViewById(R.id.checkBox298);
        checkBox299  = (CheckBox)this.findViewById(R.id.checkBox299);
        checkBox55   = (CheckBox)this.findViewById(R.id.checkBox55);
        checkBox56   = (CheckBox)this.findViewById(R.id.checkBox56);
        checkBox57   = (CheckBox)this.findViewById(R.id.checkBox57);
        checkBox58   = (CheckBox)this.findViewById(R.id.checkBox58);
        checkBox59   = (CheckBox)this.findViewById(R.id.checkBox59);
        checkBox60   = (CheckBox)this.findViewById(R.id.checkBox60);
        checkBox103  = (CheckBox)this.findViewById(R.id.checkBox103);
        checkBox104  = (CheckBox)this.findViewById(R.id.checkBox104);
        checkBox105  = (CheckBox)this.findViewById(R.id.checkBox105);
        checkBox106  = (CheckBox)this.findViewById(R.id.checkBox106);
        checkBox107  = (CheckBox)this.findViewById(R.id.checkBox107);
        checkBox108  = (CheckBox)this.findViewById(R.id.checkBox108);
        checkBox109  = (CheckBox)this.findViewById(R.id.checkBox109);
        checkBox110  = (CheckBox)this.findViewById(R.id.checkBox110);
        checkBox111  = (CheckBox)this.findViewById(R.id.checkBox111);
        checkBox112  = (CheckBox)this.findViewById(R.id.checkBox112);
        checkBox113  = (CheckBox)this.findViewById(R.id.checkBox113);
        checkBox114  = (CheckBox)this.findViewById(R.id.checkBox114);
        checkBox115  = (CheckBox)this.findViewById(R.id.checkBox115);
        checkBox116  = (CheckBox)this.findViewById(R.id.checkBox116);
        checkBox300  = (CheckBox)this.findViewById(R.id.checkBox300);
        checkBox301  = (CheckBox)this.findViewById(R.id.checkBox301);
        checkBox302  = (CheckBox)this.findViewById(R.id.checkBox302);
        checkBox303  = (CheckBox)this.findViewById(R.id.checkBox303);
        checkBox304  = (CheckBox)this.findViewById(R.id.checkBox304);
        checkBox305  = (CheckBox)this.findViewById(R.id.checkBox305);
        checkBox306  = (CheckBox)this.findViewById(R.id.checkBox306);
        checkBox307  = (CheckBox)this.findViewById(R.id.checkBox307);
        checkBox308  = (CheckBox)this.findViewById(R.id.checkBox308);
        checkBox309  = (CheckBox)this.findViewById(R.id.checkBox309);
        checkBox310  = (CheckBox)this.findViewById(R.id.checkBox310);
        checkBox311  = (CheckBox)this.findViewById(R.id.checkBox311);
        checkBox312  = (CheckBox)this.findViewById(R.id.checkBox312);
        checkBox313  = (CheckBox)this.findViewById(R.id.checkBox313);
        checkBox314  = (CheckBox)this.findViewById(R.id.checkBox314);
        checkBox315  = (CheckBox)this.findViewById(R.id.checkBox315);
        checkBox316  = (CheckBox)this.findViewById(R.id.checkBox316);
        checkBox317  = (CheckBox)this.findViewById(R.id.checkBox317);
        checkBox318  = (CheckBox)this.findViewById(R.id.checkBox318);
        checkBox319  = (CheckBox)this.findViewById(R.id.checkBox319);
        checkBox320  = (CheckBox)this.findViewById(R.id.checkBox320);
        checkBox321  = (CheckBox)this.findViewById(R.id.checkBox321);
        checkBox322  = (CheckBox)this.findViewById(R.id.checkBox322);
        checkBox323  = (CheckBox)this.findViewById(R.id.checkBox323);
        checkBox324  = (CheckBox)this.findViewById(R.id.checkBox324);
        checkBox325  = (CheckBox)this.findViewById(R.id.checkBox325);
        checkBox326  = (CheckBox)this.findViewById(R.id.checkBox326);
        checkBox327  = (CheckBox)this.findViewById(R.id.checkBox327);
        checkBox328  = (CheckBox)this.findViewById(R.id.checkBox328);
        checkBox329  = (CheckBox)this.findViewById(R.id.checkBox329);
        checkBox330  = (CheckBox)this.findViewById(R.id.checkBox330);
        checkBox333  = (CheckBox)this.findViewById(R.id.checkBox333);
        checkBox334  = (CheckBox)this.findViewById(R.id.checkBox334);
        checkBox335  = (CheckBox)this.findViewById(R.id.checkBox335);
        checkBox336  = (CheckBox)this.findViewById(R.id.checkBox336);
        checkBox337  = (CheckBox)this.findViewById(R.id.checkBox337);
        checkBox338  = (CheckBox)this.findViewById(R.id.checkBox338);
        checkBox339  = (CheckBox)this.findViewById(R.id.checkBox339);
        checkBox340  = (CheckBox)this.findViewById(R.id.checkBox340);
        checkBox341  = (CheckBox)this.findViewById(R.id.checkBox341);
        checkBox342  = (CheckBox)this.findViewById(R.id.checkBox342);
        checkBox343  = (CheckBox)this.findViewById(R.id.checkBox343);
        checkBox344  = (CheckBox)this.findViewById(R.id.checkBox344);
        checkBox345  = (CheckBox)this.findViewById(R.id.checkBox345);
        checkBox346  = (CheckBox)this.findViewById(R.id.checkBox346);
        checkBox347  = (CheckBox)this.findViewById(R.id.checkBox347);
        checkBox348  = (CheckBox)this.findViewById(R.id.checkBox348);
        checkBox349  = (CheckBox)this.findViewById(R.id.checkBox349);
        checkBox350  = (CheckBox)this.findViewById(R.id.checkBox350);
        checkBox351  = (CheckBox)this.findViewById(R.id.checkBox351);
        checkBox352  = (CheckBox)this.findViewById(R.id.checkBox352);
        checkBox353  = (CheckBox)this.findViewById(R.id.checkBox353);
        checkBox354  = (CheckBox)this.findViewById(R.id.checkBox354);
        checkBox355  = (CheckBox)this.findViewById(R.id.checkBox355);
        checkBox356  = (CheckBox)this.findViewById(R.id.checkBox356);
        checkBox357  = (CheckBox)this.findViewById(R.id.checkBox357);
        checkBox358  = (CheckBox)this.findViewById(R.id.checkBox358);

        buttonSalvar           = (Button) this.findViewById(R.id.btnSave);

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

        else if(editHorasMotor.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.horas_motor_obrigatorio));

            editHorasMotor.requestFocus();
        }

        else if(editTextDataNascimento.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.data_nascimento_obrigatorio));

            editTextDataNascimento.requestFocus();
        }

        else if(!radioButton6x6.isChecked() && !radioButton8x8.isChecked()){

            Uteis.Alert(this, this.getString(R.string.qtd_eixo_obrigatorio));
        }

        else if(!radioButton200hrs.isChecked() && !radioButton1800hrs.isChecked()){

            Uteis.Alert(this, this.getString(R.string.qtd_horas_obrigatorio));
        }

        ///////
        else if(editText68.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText68.requestFocus();
        }

        else if(editText69.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.c_obrigatorio));

            editText69.requestFocus();
        }

        else if(editText70.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText70.requestFocus();
        }

        else if(editText71.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText71.requestFocus();
        }

        else if(editText72.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText72.requestFocus();
        }

        else if(editText3.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText3.requestFocus();
        }

        else if(editText136.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText136.requestFocus();
        }

        else if(editText146.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText146.requestFocus();
        }

        else if(editText147.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText147.requestFocus();
        }

        else if(editText149.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText149.requestFocus();
        }

        else if(editText150.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText150.requestFocus();
        }

        else if(editText151.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText151.requestFocus();
        }

        else if(editText152.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText152.requestFocus();
        }

        else if(editText38.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.da_padrao_obrigatorio));

            editText38.requestFocus();
        }

        else if(editText39.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText39.requestFocus();
        }

        else if(editText40.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.db_padrao_obrigatorio));

            editText40.requestFocus();
        }

        else if(editText41.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText41.requestFocus();
        }

        else if(editText42.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_alimentacao_obrigatorio));

            editText42.requestFocus();
        }

        else if(editText43.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText43.requestFocus();
        }

        else if(editText44.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_reserva_obrigatorio));

            editText44.requestFocus();
        }

        else if(editText45.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText45.requestFocus();
        }

        else if(editText46.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_maxima_padrao_obrigatorio));

            editText46.requestFocus();
        }

        else if(editText47.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText47.requestFocus();
        }

        else if(editText48.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_reserva_obrigatorio));

            editText48.requestFocus();
        }

        else if(editText49.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText49.requestFocus();
        }

        else if(editText50.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_maxima_padrao_obrigatorio));

            editText50.requestFocus();
        }

        else if(editText51.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText51.requestFocus();
        }

        else if(editText56.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_reserva_obrigatorio));

            editText56.requestFocus();
        }

        else if(editText57.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText57.requestFocus();
        }

        else if(editText58.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_maxima_padrao_obrigatorio));

            editText58.requestFocus();
        }

        else if(editText59.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText59.requestFocus();
        }

        else if(editText154.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.notas_obrigatorio));

            editText154.requestFocus();
        }

        else if(editText153.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText153.requestFocus();
        }

        else if(editText155.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText155.requestFocus();
        }

        else if(editText156.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText156.requestFocus();
        }

        else if(editText157.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.notas_obrigatorio));

            editText157.requestFocus();
        }

        else if(editText158.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText158.requestFocus();
        }

        else {

            /*CRIANDO UM OBJETO PESSOA*/
            GarantiaForwarderModel garantiaForwarderModel = new GarantiaForwarderModel();

            /*SETANDO O VALOR DO CAMPO NOME*/
            garantiaForwarderModel.setTelefone(editTelefone.getText().toString().trim());

            garantiaForwarderModel.setCliente(editCliente.getText().toString().trim());

            garantiaForwarderModel.setOrdemServico(editOrdemServico.getText().toString().trim());

            garantiaForwarderModel.setNumDeSerie(editNumSerie.getText().toString().trim());

            garantiaForwarderModel.setHrsMotor(editHorasMotor.getText().toString().trim());

            garantiaForwarderModel.setEditText68(editText68.getText().toString().trim());

            garantiaForwarderModel.setEditText69(editText69.getText().toString().trim());

            garantiaForwarderModel.setEditText70(editText70.getText().toString().trim());

            garantiaForwarderModel.setEditText71(editText71.getText().toString().trim());

            garantiaForwarderModel.setEditText72(editText72.getText().toString().trim());

            garantiaForwarderModel.setEditText3(editText3.getText().toString().trim());

            garantiaForwarderModel.setEditText136(editText136.getText().toString().trim());

            garantiaForwarderModel.setEditText146(editText146.getText().toString().trim());

            garantiaForwarderModel.setEditText147(editText147.getText().toString().trim());

            garantiaForwarderModel.setEditText149(editText149.getText().toString().trim());

            garantiaForwarderModel.setEditText150(editText150.getText().toString().trim());

            garantiaForwarderModel.setEditText151(editText151.getText().toString().trim());

            garantiaForwarderModel.setEditText152(editText152.getText().toString().trim());

            garantiaForwarderModel.setEditText38(editText38.getText().toString().trim());

            garantiaForwarderModel.setEditText39(editText39.getText().toString().trim());

            garantiaForwarderModel.setEditText40(editText40.getText().toString().trim());

            garantiaForwarderModel.setEditText41(editText41.getText().toString().trim());

            garantiaForwarderModel.setEditText42(editText42.getText().toString().trim());

            garantiaForwarderModel.setEditText43(editText43.getText().toString().trim());

            garantiaForwarderModel.setEditText44(editText44.getText().toString().trim());

            garantiaForwarderModel.setEditText45(editText45.getText().toString().trim());

            garantiaForwarderModel.setEditText46(editText46.getText().toString().trim());

            garantiaForwarderModel.setEditText47(editText47.getText().toString().trim());

            garantiaForwarderModel.setEditText48(editText48.getText().toString().trim());

            garantiaForwarderModel.setEditText49(editText49.getText().toString().trim());

            garantiaForwarderModel.setEditText50(editText50.getText().toString().trim());

            garantiaForwarderModel.setEditText51(editText51.getText().toString().trim());

            garantiaForwarderModel.setEditText56(editText56.getText().toString().trim());

            garantiaForwarderModel.setEditText57(editText57.getText().toString().trim());

            garantiaForwarderModel.setEditText58(editText58.getText().toString().trim());

            garantiaForwarderModel.setEditText59(editText59.getText().toString().trim());

            garantiaForwarderModel.setEditText154(editText154.getText().toString().trim());

            garantiaForwarderModel.setEditText153(editText153.getText().toString().trim());

            garantiaForwarderModel.setEditText155(editText155.getText().toString().trim());

            garantiaForwarderModel.setEditText156(editText156.getText().toString().trim());

            garantiaForwarderModel.setEditText157(editText157.getText().toString().trim());

            garantiaForwarderModel.setEditText158(editText158.getText().toString().trim());

            /*SETANDO A DATA DE NASCIMENTO*/
            garantiaForwarderModel.setDataPreenchimennto(editTextDataNascimento.getText().toString().trim());

            /*REALIZANDO UM CAST PARA PEGAR O OBJETO DO modelo SELECIONADO*/
            GarantiaForwarderModelo garantiaForwarderModelo = (GarantiaForwarderModelo) spinnerModelo.getSelectedItem();

             /*SETANDO o modelo*/
            garantiaForwarderModel.setModelo(garantiaForwarderModelo.getCodigo());


            /*SETANDO a qtd eixo*/
            if (radioButton6x6.isChecked())
                garantiaForwarderModel.setQtdEixo("6x6");
            else
                garantiaForwarderModel.setQtdEixo("8x8");

             /*SETANDO O a qtd horas*/
            if (radioButton200hrs.isChecked())
                garantiaForwarderModel.setHrsRevisao("200Hrs");
            else
                garantiaForwarderModel.setHrsRevisao("1800Hrs");

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox140((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox140.isChecked())
                garantiaForwarderModel.setCheckBox140((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox209((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox209.isChecked())
                garantiaForwarderModel.setCheckBox209((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox210((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox210.isChecked())
                garantiaForwarderModel.setCheckBox210((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox211((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox211.isChecked())
                garantiaForwarderModel.setCheckBox211((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox213((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox213.isChecked())
                garantiaForwarderModel.setCheckBox213((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox214((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox214.isChecked())
                garantiaForwarderModel.setCheckBox214((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox215((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox215.isChecked())
                garantiaForwarderModel.setCheckBox215((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox216((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox216.isChecked())
                garantiaForwarderModel.setCheckBox216((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox217((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox217.isChecked())
                garantiaForwarderModel.setCheckBox217((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox218((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox218.isChecked())
                garantiaForwarderModel.setCheckBox218((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox264((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox264.isChecked())
                garantiaForwarderModel.setCheckBox264((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox265((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox265.isChecked())
                garantiaForwarderModel.setCheckBox265((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox266((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox266.isChecked())
                garantiaForwarderModel.setCheckBox266((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox267((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox267.isChecked())
                garantiaForwarderModel.setCheckBox267((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox268((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox268.isChecked())
                garantiaForwarderModel.setCheckBox268((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox269((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox269.isChecked())
                garantiaForwarderModel.setCheckBox269((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox270((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox270.isChecked())
                garantiaForwarderModel.setCheckBox270((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox271((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox271.isChecked())
                garantiaForwarderModel.setCheckBox271((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox272((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox272.isChecked())
                garantiaForwarderModel.setCheckBox272((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox273((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox273.isChecked())
                garantiaForwarderModel.setCheckBox273((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox274((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox274.isChecked())
                garantiaForwarderModel.setCheckBox274((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox275((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox275.isChecked())
                garantiaForwarderModel.setCheckBox275((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox276((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox276.isChecked())
                garantiaForwarderModel.setCheckBox276((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox277((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox277.isChecked())
                garantiaForwarderModel.setCheckBox277((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox278((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox278.isChecked())
                garantiaForwarderModel.setCheckBox278((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox279((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox279.isChecked())
                garantiaForwarderModel.setCheckBox279((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox280((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox280.isChecked())
                garantiaForwarderModel.setCheckBox280((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox281((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox281.isChecked())
                garantiaForwarderModel.setCheckBox281((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox284((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox284.isChecked())
                garantiaForwarderModel.setCheckBox284((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox285((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox285.isChecked())
                garantiaForwarderModel.setCheckBox285((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox286((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox286.isChecked())
                garantiaForwarderModel.setCheckBox286((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox287((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox287.isChecked())
                garantiaForwarderModel.setCheckBox287((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox288((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox288.isChecked())
                garantiaForwarderModel.setCheckBox288((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox289((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox289.isChecked())
                garantiaForwarderModel.setCheckBox289((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox290((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox290.isChecked())
                garantiaForwarderModel.setCheckBox290((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox291((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox291.isChecked())
                garantiaForwarderModel.setCheckBox291((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox291((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox291.isChecked())
                garantiaForwarderModel.setCheckBox291((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox292((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox292.isChecked())
                garantiaForwarderModel.setCheckBox292((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox293((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox293.isChecked())
                garantiaForwarderModel.setCheckBox293((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox294((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox294.isChecked())
                garantiaForwarderModel.setCheckBox294((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox295((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox295.isChecked())
                garantiaForwarderModel.setCheckBox295((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox296((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox296.isChecked())
                garantiaForwarderModel.setCheckBox296((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox297((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox297.isChecked())
                garantiaForwarderModel.setCheckBox297((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox298((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox298.isChecked())
                garantiaForwarderModel.setCheckBox298((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox299((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox299.isChecked())
                garantiaForwarderModel.setCheckBox299((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox55((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox55.isChecked())
                garantiaForwarderModel.setCheckBox55((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox56((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox56.isChecked())
                garantiaForwarderModel.setCheckBox56((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox57((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox57.isChecked())
                garantiaForwarderModel.setCheckBox57((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox58((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox58.isChecked())
                garantiaForwarderModel.setCheckBox58((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox59((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox59.isChecked())
                garantiaForwarderModel.setCheckBox59((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox60((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox60.isChecked())
                garantiaForwarderModel.setCheckBox60((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox103((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox103.isChecked())
                garantiaForwarderModel.setCheckBox103((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox104((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox104.isChecked())
                garantiaForwarderModel.setCheckBox104((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox105((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox105.isChecked())
                garantiaForwarderModel.setCheckBox105((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox106((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox106.isChecked())
                garantiaForwarderModel.setCheckBox106((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox107((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox107.isChecked())
                garantiaForwarderModel.setCheckBox107((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox108((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox108.isChecked())
                garantiaForwarderModel.setCheckBox108((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox109((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox109.isChecked())
                garantiaForwarderModel.setCheckBox109((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox110((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox110.isChecked())
                garantiaForwarderModel.setCheckBox110((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox111((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox111.isChecked())
                garantiaForwarderModel.setCheckBox111((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox112((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox112.isChecked())
                garantiaForwarderModel.setCheckBox112((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox113((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox113.isChecked())
                garantiaForwarderModel.setCheckBox113((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox114((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox114.isChecked())
                garantiaForwarderModel.setCheckBox114((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox115((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox115.isChecked())
                garantiaForwarderModel.setCheckBox115((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox116((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox116.isChecked())
                garantiaForwarderModel.setCheckBox116((byte) 1);
             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox300((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox300.isChecked())
                garantiaForwarderModel.setCheckBox300((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox301((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox301.isChecked())
                garantiaForwarderModel.setCheckBox301((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox302((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox302.isChecked())
                garantiaForwarderModel.setCheckBox302((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox303((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox303.isChecked())
                garantiaForwarderModel.setCheckBox303((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox304((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox304.isChecked())
                garantiaForwarderModel.setCheckBox304((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox305((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox305.isChecked())
                garantiaForwarderModel.setCheckBox305((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox306((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox306.isChecked())
                garantiaForwarderModel.setCheckBox306((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox307((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox307.isChecked())
                garantiaForwarderModel.setCheckBox307((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox308((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox308.isChecked())
                garantiaForwarderModel.setCheckBox308((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox309((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox309.isChecked())
                garantiaForwarderModel.setCheckBox309((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox310((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox310.isChecked())
                garantiaForwarderModel.setCheckBox310((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox310((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox310.isChecked())
                garantiaForwarderModel.setCheckBox310((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox311((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox311.isChecked())
                garantiaForwarderModel.setCheckBox311((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox312((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox312.isChecked())
                garantiaForwarderModel.setCheckBox312((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox313((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox313.isChecked())
                garantiaForwarderModel.setCheckBox313((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox314((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox314.isChecked())
                garantiaForwarderModel.setCheckBox314((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox315((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox315.isChecked())
                garantiaForwarderModel.setCheckBox315((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox316((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox316.isChecked())
                garantiaForwarderModel.setCheckBox316((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox317((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox317.isChecked())
                garantiaForwarderModel.setCheckBox317((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox318((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox318.isChecked())
                garantiaForwarderModel.setCheckBox318((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox319((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox319.isChecked())
                garantiaForwarderModel.setCheckBox319((byte) 1);
             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox320((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox320.isChecked())
                garantiaForwarderModel.setCheckBox320((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox321((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox321.isChecked())
                garantiaForwarderModel.setCheckBox321((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox322((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox322.isChecked())
                garantiaForwarderModel.setCheckBox322((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox323((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox323.isChecked())
                garantiaForwarderModel.setCheckBox323((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox324((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox324.isChecked())
                garantiaForwarderModel.setCheckBox324((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox325((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox325.isChecked())
                garantiaForwarderModel.setCheckBox325((byte) 1);
             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox326((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox326.isChecked())
                garantiaForwarderModel.setCheckBox326((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox327((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox327.isChecked())
                garantiaForwarderModel.setCheckBox327((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox328((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox328.isChecked())
                garantiaForwarderModel.setCheckBox328((byte) 1);

              /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox329((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox329.isChecked())
                garantiaForwarderModel.setCheckBox329((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox330((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox330.isChecked())
                garantiaForwarderModel.setCheckBox330((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox333((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox333.isChecked())
                garantiaForwarderModel.setCheckBox333((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox334((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox334.isChecked())
                garantiaForwarderModel.setCheckBox334((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox335((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox335.isChecked())
                garantiaForwarderModel.setCheckBox335((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox336((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox336.isChecked())
                garantiaForwarderModel.setCheckBox336((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox337((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox337.isChecked())
                garantiaForwarderModel.setCheckBox337((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox338((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox338.isChecked())
                garantiaForwarderModel.setCheckBox338((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox339((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox339.isChecked())
                garantiaForwarderModel.setCheckBox339((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox340((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox340.isChecked())
                garantiaForwarderModel.setCheckBox340((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox341((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox341.isChecked())
                garantiaForwarderModel.setCheckBox341((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox342((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox342.isChecked())
                garantiaForwarderModel.setCheckBox342((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox343((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox343.isChecked())
                garantiaForwarderModel.setCheckBox343((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox344((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox344.isChecked())
                garantiaForwarderModel.setCheckBox344((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox345((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox345.isChecked())
                garantiaForwarderModel.setCheckBox345((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox346((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox346.isChecked())
                garantiaForwarderModel.setCheckBox346((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox347((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox347.isChecked())
                garantiaForwarderModel.setCheckBox347((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox348((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox348.isChecked())
                garantiaForwarderModel.setCheckBox348((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox349((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox349.isChecked())
                garantiaForwarderModel.setCheckBox349((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox350((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox350.isChecked())
                garantiaForwarderModel.setCheckBox350((byte) 1);
             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox351((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox351.isChecked())
                garantiaForwarderModel.setCheckBox351((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox352((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox352.isChecked())
                garantiaForwarderModel.setCheckBox352((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox353((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox353.isChecked())
                garantiaForwarderModel.setCheckBox353((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox354((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox354.isChecked())
                garantiaForwarderModel.setCheckBox354((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox355((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox355.isChecked())
                garantiaForwarderModel.setCheckBox355((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox356((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox356.isChecked())
                garantiaForwarderModel.setCheckBox356((byte) 1);

             /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox357((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox357.isChecked())
                garantiaForwarderModel.setCheckBox357((byte) 1);

            /*SETA O REGISTRO COMO INATIVO*/
            garantiaForwarderModel.setCheckBox358((byte) 0);

            /*SE TIVER SELECIONADO SETA COMO ATIVO*/
            if (checkBox358.isChecked())
                garantiaForwarderModel.setCheckBox358((byte) 1);



            /*SALVANDO UM NOVO REGISTRO*/
            new GarantiaForwarderRepository(this).Salvar(garantiaForwarderModel);

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

        ArrayAdapter<GarantiaForwarderModelo> arrayAdapter;

        List<GarantiaForwarderModelo> itens =  new ArrayList<GarantiaForwarderModelo>();

        itens.add(new GarantiaForwarderModelo("B", "Buffalo"));
        itens.add(new GarantiaForwarderModelo("BK", "Buffalo King"));
        itens.add(new GarantiaForwarderModelo("E", "Elephant"));
        itens.add(new GarantiaForwarderModelo("EK", "Elephant King"));

        arrayAdapter = new ArrayAdapter<GarantiaForwarderModelo>(this, android.R.layout.simple_spinner_item,itens);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerModelo.setAdapter(arrayAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_simples_botao_voltar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_voltar) {
            super.finish();
        }

        return super.onOptionsItemSelected(item);
    }
    private void clearErrorFields(EditText... editTexts) {
        for (EditText editText : editTexts) {
            editText.setError(null);
        }
    }
    EditText         editCliente;
    EditText         editTelefone;
    EditText         editOrdemServico;
    EditText         editNumSerie;
    EditText         editHorasMotor;
    EditText         editTextDataNascimento;

    EditText          editText68;
    EditText          editText69;
    EditText          editText70;
    EditText          editText71;
    EditText          editText72;
    EditText          editText3;
    EditText          editText136;
    EditText          editText146;
    EditText          editText147;
    EditText          editText149;
    EditText          editText150;
    EditText          editText151;
    EditText          editText152;
    EditText          editText38 ;
    EditText          editText39 ;
    EditText          editText40 ;
    EditText          editText41 ;
    EditText          editText42 ;
    EditText          editText43 ;
    EditText          editText44 ;
    EditText          editText45 ;
    EditText          editText46 ;
    EditText          editText47 ;
    EditText          editText48 ;
    EditText          editText49 ;
    EditText          editText50 ;
    EditText          editText51 ;
    EditText          editText56 ;
    EditText          editText57 ;
    EditText          editText58 ;
    EditText          editText59 ;
    EditText          editText154;
    EditText          editText153;
    EditText          editText155;
    EditText          editText156;
    EditText          editText157;
}
