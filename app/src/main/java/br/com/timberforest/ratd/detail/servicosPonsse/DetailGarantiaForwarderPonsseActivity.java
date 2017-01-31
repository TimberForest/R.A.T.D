package br.com.timberforest.ratd.detail.servicosPonsse;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.model.servicosPonsse.GarantiaForwarderModel;
import br.com.timberforest.ratd.model.servicosPonsse.GarantiaForwarderModelo;
import br.com.timberforest.ratd.dao.servicosPonsse.GarantiaForwarderRepository;

import java.util.ArrayList;
import java.util.List;

public class DetailGarantiaForwarderPonsseActivity extends ActionBarActivity {

    TextView         textViewTelefone;
    RadioButton      radioButton6x6;
    RadioButton      radioButton8x8;
    RadioGroup       radioGroupQtdEixo;
    RadioButton      radioButton200hrs;
    RadioButton      radioButton1800hrs;
    RadioGroup       radioGroupQtdHorasRevisao;

    TextView         textViewCliente;
    TextView         textViewOrdemServico;
    TextView         textViewNumSerie;
    TextView         textViewHorasMotor;

    TextView          editText68;
    TextView          editText69;
    TextView          editText70;
    TextView          editText71;
    TextView          editText72;
    TextView          editText3;
    TextView          editText136;
    TextView          editText146;
    TextView          editText147;
    TextView          editText149;
    TextView          editText150;
    TextView          editText151;
    TextView          editText152;
    TextView          editText38 ;
    TextView          editText39 ;
    TextView          editText40 ;
    TextView          editText41 ;
    TextView          editText42 ;
    TextView          editText43 ;
    TextView          editText44 ;
    TextView          editText45 ;
    TextView          editText46 ;
    TextView          editText47 ;
    TextView          editText48 ;
    TextView          editText49 ;
    TextView          editText50 ;
    TextView          editText51 ;
    TextView          editText56 ;
    TextView          editText57 ;
    TextView          editText58 ;
    TextView          editText59 ;
    TextView          editText154;
    TextView          editText153;
    TextView          editText155;
    TextView          editText156;
    TextView          editText157;
    TextView          editText158;


    TextView         textViewDataNascimento;
    TextView         textViewModelo;
    CheckBox         checkBoxRegistroAtivo;
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

    GarantiaForwarderRepository garantiaForwarderRepository;
    GarantiaForwarderModel  garantiaForwarderModel;

    List<GarantiaForwarderModel> garantiaModels =  new ArrayList<GarantiaForwarderModel>();

    ArrayAdapter<GarantiaForwarderModelo> arrayAdapterModelos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_garantia_forwarder_ponsse);

        this.CriarComponentes();

        this.CarregaModelos();

        this.CarregaValoresCampos();

    }

    //VINCULA OS COMPONENTES DA TELA COM OS DA ATIVIDADE
    protected  void CriarComponentes(){

        textViewTelefone           = (TextView) this.findViewById(R.id.editTextTelefoneClienteForwarderDetail);

        textViewDataNascimento = (TextView)this.findViewById(R.id.textViewDataGruaDetail);

        radioButton6x6   = (RadioButton) this.findViewById(R.id.radioButton6x6Detail);

        radioButton8x8    = (RadioButton) this.findViewById(R.id.radioButton8x8Detail);

        radioGroupQtdEixo         = (RadioGroup) this.findViewById(R.id.radioGroupDetail);

        radioButton200hrs   = (RadioButton) this.findViewById(R.id.radioButton200hrsDetail);

        radioButton1800hrs    = (RadioButton) this.findViewById(R.id.radioButton1800hrsDetail);

        radioGroupQtdHorasRevisao         = (RadioGroup) this.findViewById(R.id.radioGroupRevisaoDetail);

        textViewCliente  = (TextView) this.findViewById(R.id.editTextClienteGarantiaForwarderDetail);

        textViewOrdemServico           = (TextView) this.findViewById(R.id.editTextOrdemServicoForwarderDetail);

        textViewNumSerie           = (TextView) this.findViewById(R.id.editTextNumSerieForwarderDetail);

        textViewHorasMotor           = (TextView) this.findViewById(R.id.editTextHorasMotorForwarderDetail);

        editText68           = (TextView) this.findViewById(R.id.editText68Detail);
        editText69       = (TextView) this.findViewById(R.id.editText69Detail);
        editText70         = (TextView) this.findViewById(R.id.editText70Detail);
        editText71           = (TextView) this.findViewById(R.id.editText71Detail);
        editText72       = (TextView) this.findViewById(R.id.editText72Detail);
        editText3        = (TextView) this.findViewById(R.id.editText3Detail);
        editText136           = (TextView) this.findViewById(R.id.editText136Detail);
        editText146       = (TextView) this.findViewById(R.id.editText146Detail);
        editText147         = (TextView) this.findViewById(R.id.editText147Detail);
        editText149           = (TextView) this.findViewById(R.id.editText149Detail);
        editText150       = (TextView) this.findViewById(R.id.editText150Detail);
        editText151         = (TextView) this.findViewById(R.id.editText151Detail);
        editText152           = (TextView) this.findViewById(R.id.editText152Detail);
        editText38        = (TextView) this.findViewById(R.id.editText38GarantiaHarvester);
        editText39          = (TextView) this.findViewById(R.id.editText39GarantiaHarvester);
        editText40            = (TextView) this.findViewById(R.id.editText40GarantiaHarvester);
        editText41        = (TextView) this.findViewById(R.id.editText41GarantiaHarvester);
        editText42          = (TextView) this.findViewById(R.id.editText42GarantiaHarvester);
        editText43            = (TextView) this.findViewById(R.id.editText43GarantiaHarvester);
        editText44        = (TextView) this.findViewById(R.id.editText44GarantiaHarvester);
        editText45          = (TextView) this.findViewById(R.id.editText45GarantiaHarvester);
        editText46            = (TextView) this.findViewById(R.id.editText46GarantiaHarvester);
        editText47        = (TextView) this.findViewById(R.id.editText47GarantiaHarvester);
        editText48          = (TextView) this.findViewById(R.id.editText48Detail);
        editText49            = (TextView) this.findViewById(R.id.editText49Detail);
        editText50        = (TextView) this.findViewById(R.id.editText50Detail);
        editText51          = (TextView) this.findViewById(R.id.editText51Detail);
        editText56            = (TextView) this.findViewById(R.id.editText56Detail);
        editText57        = (TextView) this.findViewById(R.id.editText57Detail);
        editText58          = (TextView) this.findViewById(R.id.editText58Detail);
        editText59            = (TextView) this.findViewById(R.id.editText59Detail);
        editText154       = (TextView) this.findViewById(R.id.editText154Detail);
        editText153         = (TextView) this.findViewById(R.id.editText153Detail);
        editText155           = (TextView) this.findViewById(R.id.editText155Detail);
        editText156       = (TextView) this.findViewById(R.id.editText156Detail);
        editText157         = (TextView) this.findViewById(R.id.editText157Detail);
        editText158           = (TextView) this.findViewById(R.id.editText158Detail);

        textViewModelo     = (TextView)this.findViewById(R.id.modelo_forwarderDetail);

        buttonSalvar           = (Button) this.findViewById(R.id.btnSave);

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
        checkBox55  = (CheckBox)this.findViewById(R.id.checkBox55);
        checkBox56  = (CheckBox)this.findViewById(R.id.checkBox56);
        checkBox57  = (CheckBox)this.findViewById(R.id.checkBox57);
        checkBox58  = (CheckBox)this.findViewById(R.id.checkBox58);
        checkBox59  = (CheckBox)this.findViewById(R.id.checkBox59);
        checkBox60  = (CheckBox)this.findViewById(R.id.checkBox60);
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
    }

    protected  void CarregaModelos(){

        List<GarantiaForwarderModelo> itens =  new ArrayList<GarantiaForwarderModelo>();

        itens.add(new GarantiaForwarderModelo("B", "Buffalo"));
        itens.add(new GarantiaForwarderModelo("BK", "Buffalo King"));
        itens.add(new GarantiaForwarderModelo("E", "Elephant"));
        itens.add(new GarantiaForwarderModelo("EK", "Elephant King"));

        arrayAdapterModelos = new ArrayAdapter<GarantiaForwarderModelo>(this, android.R.layout.simple_spinner_item,itens);
        arrayAdapterModelos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //spinnerModelo.setAdapter(arrayAdapterModelos);
    }

   /* protected void PosicionaModelo(String chaveModelo){

        for(int index = 0; index < arrayAdapterModelos.getCount();index++){

            if(((GarantiaForwarderModelo)arrayAdapterModelos.getItem(index)).getCodigo().equals(chaveModelo)){

                spinnerModelo.setSelection(index);
                break;
            }
        }
    }*/

    protected  void CarregaValoresCampos(){

        GarantiaForwarderRepository garantiaForwarderRepository = new GarantiaForwarderRepository(this);

        //PEGA O ID PESSOA QUE FOI PASSADO COMO PARAMETRO ENTRE AS TELAS
        Bundle extra =  this.getIntent().getExtras();
        Integer id_ = extra.getInt("id_");

        //CONSULTA UMA PESSOA POR ID
        GarantiaForwarderModel garantiaForwarderModel = garantiaForwarderRepository.GetGarantiaForwarder(id_);

        //SETA O CODIGO NA VIEW
        textViewTelefone.setText(String.valueOf(garantiaForwarderModel.getCodigo()));

        //SETA A DATA DE NASCIMENTO
        textViewDataNascimento.setText(garantiaForwarderModel.getDataPreenchimennto());

        textViewCliente.setText(garantiaForwarderModel.getCliente());

        textViewTelefone.setText(garantiaForwarderModel.getTelefone());

        textViewNumSerie.setText(garantiaForwarderModel.getNumDeSerie());

        textViewHorasMotor.setText(garantiaForwarderModel.getHrsMotor());

        textViewOrdemServico.setText(garantiaForwarderModel.getOrdemServico());

        editText68.setText(garantiaForwarderModel.getEditText68());
        editText69.setText(garantiaForwarderModel.getEditText69());
        editText70.setText(garantiaForwarderModel.getEditText70());
        editText71.setText(garantiaForwarderModel.getEditText71());
        editText72.setText(garantiaForwarderModel.getEditText72());
        editText3.setText(garantiaForwarderModel.getEditText3());
        editText136.setText(garantiaForwarderModel.getEditText136());
        editText146.setText(garantiaForwarderModel.getEditText146());
        editText147.setText(garantiaForwarderModel.getEditText147());
        editText149.setText(garantiaForwarderModel.getEditText149());
        editText150.setText(garantiaForwarderModel.getEditText150());
        editText151.setText(garantiaForwarderModel.getEditText151());
        editText152.setText(garantiaForwarderModel.getEditText152());
        editText38.setText(garantiaForwarderModel.getEditText38());
        editText39.setText(garantiaForwarderModel.getEditText39());
        editText40.setText(garantiaForwarderModel.getEditText40());
        editText41.setText(garantiaForwarderModel.getEditText41());
        editText42.setText(garantiaForwarderModel.getEditText42());
        editText43.setText(garantiaForwarderModel.getEditText43());
        editText44.setText(garantiaForwarderModel.getEditText44());
        editText45.setText(garantiaForwarderModel.getEditText45());
        editText46.setText(garantiaForwarderModel.getEditText46());
        editText47.setText(garantiaForwarderModel.getEditText47());
        editText48.setText(garantiaForwarderModel.getEditText48());
        editText49.setText(garantiaForwarderModel.getEditText49());
        editText50.setText(garantiaForwarderModel.getEditText50());
        editText51.setText(garantiaForwarderModel.getEditText51());
        editText56.setText(garantiaForwarderModel.getEditText56());
        editText57.setText(garantiaForwarderModel.getEditText57());
        editText58.setText(garantiaForwarderModel.getEditText58());
        editText59.setText(garantiaForwarderModel.getEditText59());
        editText154.setText(garantiaForwarderModel.getEditText154());
        editText153.setText(garantiaForwarderModel.getEditText153());
        editText155.setText(garantiaForwarderModel.getEditText155());
        editText156.setText(garantiaForwarderModel.getEditText156());
        editText157.setText(garantiaForwarderModel.getEditText157());
        editText158.setText(garantiaForwarderModel.getEditText158());



        //SETA O qtd eixo NA VIEW
        if(garantiaForwarderModel.getQtdEixo().equals("6x6"))
            radioButton6x6.setChecked(true);
        else
            radioButton8x8.setChecked(true);

        //SETA O qtd horas NA VIEW
        if(garantiaForwarderModel.getHrsRevisao().equals("200Hrs"))
            radioButton200hrs.setChecked(true);
        else
            radioButton1800hrs.setChecked(true);

        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getRegistroAtivo() == 1)
            checkBoxRegistroAtivo.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox140() == 1)
            checkBox140.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox209() == 1)
            checkBox209.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox210() == 1)
            checkBox210.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox211() == 1)
            checkBox211.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox213() == 1)
            checkBox213.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox214() == 1)
            checkBox214.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox215() == 1)
            checkBox215.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox216() == 1)
            checkBox216.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox217() == 1)
            checkBox217.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox218() == 1)
            checkBox218.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox264() == 1)
            checkBox264.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox265() == 1)
            checkBox265.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox266() == 1)
            checkBox266.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox267() == 1)
            checkBox267.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox268() == 1)
            checkBox268.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox269() == 1)
            checkBox269.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox270() == 1)
            checkBox270.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox271() == 1)
            checkBox271.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox272() == 1)
            checkBox272.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox273() == 1)
            checkBox273.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox274() == 1)
            checkBox274.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox275() == 1)
            checkBox275.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox276() == 1)
            checkBox276.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox278() == 1)
            checkBox278.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox279() == 1)
            checkBox279.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox280() == 1)
            checkBox280.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox281() == 1)
            checkBox281.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox284() == 1)
            checkBox284.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox285() == 1)
            checkBox285.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox286() == 1)
            checkBox286.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox287() == 1)
            checkBox287.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox288() == 1)
            checkBox288.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox289() == 1)
            checkBox289.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox290() == 1)
            checkBox290.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox291() == 1)
            checkBox291.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox292() == 1)
            checkBox292.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox293() == 1)
            checkBox293.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox294() == 1)
            checkBox294.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox295() == 1)
            checkBox295.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox296() == 1)
            checkBox296.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox297() == 1)
            checkBox297.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox298() == 1)
            checkBox298.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox299() == 1)
            checkBox299.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox55() == 1)
            checkBox55.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox56() == 1)
            checkBox56.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox57() == 1)
            checkBox57.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox58() == 1)
            checkBox58.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox59() == 1)
            checkBox59.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox60() == 1)
            checkBox60.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox103() == 1)
            checkBox103.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox104() == 1)
            checkBox104.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox105() == 1)
            checkBox105.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox106() == 1)
            checkBox106.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox107() == 1)
            checkBox107.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox108() == 1)
            checkBox108.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox109() == 1)
            checkBox109.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox110() == 1)
            checkBox110.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox111() == 1)
            checkBox111.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox112() == 1)
            checkBox112.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox113() == 1)
            checkBox113.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox114() == 1)
            checkBox114.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox115() == 1)
            checkBox115.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox116() == 1)
            checkBox116.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox300() == 1)
            checkBox300.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox301() == 1)
            checkBox301.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox302() == 1)
            checkBox302.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox303() == 1)
            checkBox303.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox304() == 1)
            checkBox304.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox305() == 1)
            checkBox305.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox306() == 1)
            checkBox306.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox307() == 1)
            checkBox307.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox308() == 1)
            checkBox308.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox309() == 1)
            checkBox309.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox310() == 1)
            checkBox310.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox311() == 1)
            checkBox311.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox312() == 1)
            checkBox312.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox313() == 1)
            checkBox313.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox314() == 1)
            checkBox314.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox315() == 1)
            checkBox315.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox316() == 1)
            checkBox316.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox317() == 1)
            checkBox317.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox318() == 1)
            checkBox318.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox319() == 1)
            checkBox319.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox320() == 1)
            checkBox320.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox321() == 1)
            checkBox321.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox322() == 1)
            checkBox322.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox323() == 1)
            checkBox323.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox324() == 1)
            checkBox324.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox325() == 1)
            checkBox325.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox326() == 1)
            checkBox326.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox327() == 1)
            checkBox327.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox328() == 1)
            checkBox328.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox329() == 1)
            checkBox329.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox330() == 1)
            checkBox330.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox333() == 1)
            checkBox333.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox334() == 1)
            checkBox334.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox335() == 1)
            checkBox335.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox336() == 1)
            checkBox336.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox337() == 1)
            checkBox337.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox338() == 1)
            checkBox338.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox339() == 1)
            checkBox339.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox340() == 1)
            checkBox340.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox341() == 1)
            checkBox341.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox342() == 1)
            checkBox342.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox343() == 1)
            checkBox343.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox344() == 1)
            checkBox344.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox345() == 1)
            checkBox345.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox346() == 1)
            checkBox346.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox347() == 1)
            checkBox347.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox348() == 1)
            checkBox348.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox349() == 1)
            checkBox349.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox350() == 1)
            checkBox350.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox351() == 1)
            checkBox351.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox352() == 1)
            checkBox352.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox353() == 1)
            checkBox353.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox354() == 1)
            checkBox354.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox355() == 1)
            checkBox355.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox356() == 1)
            checkBox356.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox357() == 1)
            checkBox357.setChecked(true);
        //SETA SE O  REGISTRO ESTA ATIVO
        if(garantiaForwarderModel.getCheckBox358() == 1)
            checkBox358.setChecked(true);

    }
    public String GetModelo(String codigoModelo){

        if(codigoModelo.equals("B"))
            return "Buffalo";
        else if(codigoModelo.equals("BK"))
            return "Buffalo King";
        else if(codigoModelo.equals("E"))
            return "Elephant";
        else
            return "Elephant King";

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail_garantia_forwarder_ponsse, menu);
        return true;
    }
}
