/*
package com.timberforest.andreives.relatorios.formulariosActivity.servicosPonsse;

import android.app.DatePickerDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
import GarantiaForwarderModel;
import GarantiaForwarderModelo;
import GarantiaHarvesterPonsseModel;
import GarantiaHarvesterPonsseModelo;

import java.util.Calendar;

public class FormGarantiaHarvesterPonsseActivity extends ActionBarActivity {



    EditText         editCliente;
    EditText         editTelefone;
    EditText         editOrdemServico;
    EditText         editNumSerie;
    EditText         editHorasMotor;
    EditText         editTextDataNascimento;


    EditText         editText159;
    EditText         editText6;
    EditText         editText160;
    EditText         editText161;
    EditText         editText162;
    EditText         editText163;
    EditText         editText164;
    EditText         editText165;
    EditText         editText166;
    EditText         editText167;
    EditText         editText168;
    EditText         editText169;
    EditText         editText170;
    EditText         editText171;
    EditText         editText172;
    EditText         editText173;
    EditText         editText174;
    EditText         editText175;
    EditText         editText176;
    EditText         editText177;
    EditText         editText38;
    EditText         editText39;
    EditText         editText40;
    EditText         editText41;
    EditText         editText42;
    EditText         editText43;
    EditText         editText44;
    EditText         editText45;
    EditText         editText46;
    EditText         editText47;
    EditText         editText178;
    EditText         editText179;
    EditText         editText180;
    EditText         editText181;
    EditText         editText182;
    EditText         editText183;
    EditText         editText184;
    EditText         editText185;
    EditText         editText186;
    EditText         editText187;
    EditText         editText188;
    EditText         editText189;
    EditText         editText190;
    EditText         editText191;
    EditText         editText192;
    EditText         editText193;
    EditText         editText194;
    EditText         editText195;
    EditText         editText196;
    EditText         editText197;
    EditText         editText198;
    EditText         editText199;
    EditText         editText200;
    EditText         editText201;
    EditText         editText202;
    EditText         editText203;
    EditText         editText204;
    EditText         editText205;
    EditText         editText206;
    EditText         editText207;
    EditText         editText208;
    EditText         editText209;
    EditText         editText210;
    EditText         editText211;
    EditText         editText212;
    EditText         editText213;
    EditText         editText214;

    RadioButton      radioButton6x6;
    RadioButton      radioButton8x8;
    RadioButton      radioButton200hrs;
    RadioButton      radioButton1800hrs;
    RadioGroup       radioGroupQtdEixo;
    RadioGroup       radioGroupQtdhorasRevisao;
    Spinner          spinnerModelo;
    Button           buttonSalvar;

    CheckBox         checkBox4;
    CheckBox         checkBox5;
    CheckBox         checkBox6;
    CheckBox         checkBox7;
    CheckBox         checkBox8;
    CheckBox         checkBox9;
    CheckBox         checkBox10;
    CheckBox         checkBox11;
    CheckBox         checkBox12;
    CheckBox         checkBox13;
    CheckBox         checkBox14;
    CheckBox         checkBox15;
    CheckBox         checkBox16;
    CheckBox         checkBox17;
    CheckBox         checkBox18;
    CheckBox         checkBox19;
    CheckBox         checkBox20;
    CheckBox         checkBox42;
    CheckBox         checkBox207;
    CheckBox         checkBox208;
    CheckBox         checkBox212;
    CheckBox         checkBox282;
    CheckBox         checkBox283;
    CheckBox         checkBox331;
    CheckBox         checkBox332;
    CheckBox         checkBox359;
    CheckBox         checkBox360;
    CheckBox         checkBox361;
    CheckBox         checkBox362;
    CheckBox         checkBox363;
    CheckBox         checkBox364;
    CheckBox         checkBox365;
    CheckBox         checkBox366;
    CheckBox         checkBox367;
    CheckBox         checkBox368;
    CheckBox         checkBox369;
    CheckBox         checkBox370;
    CheckBox         checkBox371;
    CheckBox         checkBox372;
    CheckBox         checkBox373;
    CheckBox         checkBox374;
    CheckBox         checkBox375;
    CheckBox         checkBox376;
    CheckBox         checkBox377;
    CheckBox         checkBox378;
    CheckBox         checkBox379;
    CheckBox         checkBox380;
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
    CheckBox         checkBox381;
    CheckBox         checkBox382;
    CheckBox         checkBox383;
    CheckBox         checkBox384;
    CheckBox         checkBox385;
    CheckBox         checkBox386;
    CheckBox         checkBox387;
    CheckBox         checkBox388;
    CheckBox         checkBox389;
    CheckBox         checkBox390;
    CheckBox         checkBox391;
    CheckBox         checkBox392;
    CheckBox         checkBox393;
    CheckBox         checkBox394;
    CheckBox         checkBox395;
    CheckBox         checkBox396;
    CheckBox         checkBox397;
    CheckBox         checkBox398;
    CheckBox         checkBox399;
    CheckBox         checkBox400;
    CheckBox         checkBox401;
    CheckBox         checkBox402;
    CheckBox         checkBox403;
    CheckBox         checkBox404;
    CheckBox         checkBox405;
    CheckBox         checkBox406;
    CheckBox         checkBox407;
    CheckBox         checkBox408;
    CheckBox         checkBox409;
    CheckBox         checkBox410;
    CheckBox         checkBox411;
    CheckBox         checkBox412;
    CheckBox         checkBox413;
    CheckBox         checkBox414;
    CheckBox         checkBox415;
    CheckBox         checkBox416;
    CheckBox         checkBox417;
    CheckBox         checkBox418;
    CheckBox         checkBox419;
    CheckBox         checkBox420;
    CheckBox         checkBox421;
    CheckBox         checkBox422;
    CheckBox         checkBox423;
    CheckBox         checkBox424;
    CheckBox         checkBox425;
    CheckBox         checkBox426;
    CheckBox         checkBox427;
    CheckBox         checkBox428;
    CheckBox         checkBox429;
    CheckBox         checkBox430;
    CheckBox         checkBox431;
    CheckBox         checkBox432;
    CheckBox         checkBox433;
    CheckBox         checkBox434;
    CheckBox         checkBox435;
    CheckBox         checkBox436;
    CheckBox         checkBox437;
    CheckBox         checkBox438;
    CheckBox         checkBox439;
    CheckBox         checkBox440;
    CheckBox         checkBox441;
    CheckBox         checkBox442;
    CheckBox         checkBox443;
    CheckBox         checkBox444;
    CheckBox         checkBox445;
    CheckBox         checkBox446;
    CheckBox         checkBox447;
    CheckBox         checkBox448;
    CheckBox         checkBox449;
    CheckBox         checkBox450;
    CheckBox         checkBox451;
    CheckBox         checkBox452;
    CheckBox         checkBox453;
    CheckBox         checkBox454;
    CheckBox         checkBox455;
    CheckBox         checkBox456;
    CheckBox         checkBox457;
    CheckBox         checkBox458;
    CheckBox         checkBox459;
    CheckBox         checkBox460;
    CheckBox         checkBox461;
    CheckBox         checkBox462;
    CheckBox         checkBox463;
    CheckBox         checkBox464;
    CheckBox         checkBox465;
    CheckBox         checkBox466;
    CheckBox         checkBox467;
    CheckBox         checkBox468;
    CheckBox         checkBox469;
    CheckBox         checkBox470;
    CheckBox         checkBox471;
    CheckBox         checkBox472;
    CheckBox         checkBox473;
    CheckBox         checkBox474;
    CheckBox         checkBox475;
    CheckBox         checkBox476;
    CheckBox         checkBox477;
    CheckBox         checkBox478;
    CheckBox         checkBox479;
    CheckBox         checkBox480;
    CheckBox         checkBox481;
    CheckBox         checkBox482;
    CheckBox         checkBox483;
    CheckBox         checkBox484;
    CheckBox         checkBox485;
    CheckBox         checkBox486;
    CheckBox         checkBox487;
    CheckBox         checkBox488;
    CheckBox         checkBox489;
    CheckBox         checkBox490;
    CheckBox         checkBox491;
    CheckBox         checkBox492;
    CheckBox         checkBox493;
    CheckBox         checkBox494;
    CheckBox         checkBox495;
    CheckBox         checkBox496;
    CheckBox         checkBox497;
    CheckBox         checkBox498;
    CheckBox         checkBox499;
    CheckBox         checkBox500;
    CheckBox         checkBox501;
    CheckBox         checkBox502;
    CheckBox         checkBox503;
    CheckBox         checkBox504;

    //CRIA POPUP COM O CALENDARIO
    DatePickerDialog datePickerDialogDataNascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_garantia_harvester_ponsse);

        CriarComponentes();

        CriarEventos();
    }

    //VINCULA OS COMPONENTES DA TELA COM OS DA ATIVIDADE
    protected  void CriarComponentes() {

        editCliente = (EditText) this.findViewById(R.id.editTextClienteGarantiaHarvester);

        editTelefone = (EditText) this.findViewById(R.id.editTextTelefoneClienteHarvester);

        editOrdemServico = (EditText) this.findViewById(R.id.editTextOrdemServicoHarvester);

        editNumSerie = (EditText) this.findViewById(R.id.editTextNumSerieHarvester);

        editHorasMotor = (EditText) this.findViewById(R.id.editTextHorasMotorHarvester);

        editTextDataNascimento = (EditText) this.findViewById(R.id.editTextDataGarantiaHarvester);

        editText159= (EditText) this.findViewById(R.id.editText159GarantiaHarvester);

        editText6 = (EditText) this.findViewById(R.id.editText6GarantiaHarvester);

        editText160= (EditText) this.findViewById(R.id.editText160GarantiaHarvester);

        editText161= (EditText) this.findViewById(R.id.editText161GarantiaHarvester);

        editText162= (EditText) this.findViewById(R.id.editText162GarantiaHarvester);

        editText163= (EditText) this.findViewById(R.id.editText163GarantiaHarvester);

        editText164    = (EditText) this.findViewById(R.id.editText164GarantiaHarvester);

        editText165    = (EditText) this.findViewById(R.id.editText165GarantiaHarvester);

        editText166    = (EditText) this.findViewById(R.id.editText166GarantiaHarvester);

        editText167    = (EditText) this.findViewById(R.id.editText167GarantiaHarvester);

        editText168    = (EditText) this.findViewById(R.id.editText168GarantiaHarvester);

        editText169    = (EditText) this.findViewById(R.id.editText169GarantiaHarvester);

        editText170    = (EditText) this.findViewById(R.id.editText170GarantiaHarvester);

        editText171    = (EditText) this.findViewById(R.id.editText171GarantiaHarvester);

        editText172    = (EditText) this.findViewById(R.id.editText172GarantiaHarvester);

        editText173    = (EditText) this.findViewById(R.id.editText173GarantiaHarvester);

        editText174    = (EditText) this.findViewById(R.id.editText174GarantiaHarvester);

        editText175    = (EditText) this.findViewById(R.id.editText175GarantiaHarvester);

        editText176    = (EditText) this.findViewById(R.id.editText176GarantiaHarvester);

        editText177    = (EditText) this.findViewById(R.id.editText177GarantiaHarvester);

        editText38= (EditText) this.findViewById(R.id.editText38GarantiaHarvester);

        editText39= (EditText) this.findViewById(R.id.editText39GarantiaHarvester);

        editText40= (EditText) this.findViewById(R.id.editText40GarantiaHarvester);

        editText41= (EditText) this.findViewById(R.id.editText41GarantiaHarvester);

        editText42= (EditText) this.findViewById(R.id.editText42GarantiaHarvester);

        editText43= (EditText) this.findViewById(R.id.editText43GarantiaHarvester);

        editText44    = (EditText) this.findViewById(R.id.editText44GarantiaHarvester);

        editText45    = (EditText) this.findViewById(R.id.editText45GarantiaHarvester);

        editText46    = (EditText) this.findViewById(R.id.editText46GarantiaHarvester);

        editText47    = (EditText) this.findViewById(R.id.editText47GarantiaHarvester);

        editText178    = (EditText) this.findViewById(R.id.editText178GarantiaHarvester);

        editText179    = (EditText) this.findViewById(R.id.editText179GarantiaHarvester);

        editText180    = (EditText) this.findViewById(R.id.editText180GarantiaHarvester);

        editText181    = (EditText) this.findViewById(R.id.editText181GarantiaHarvester);

        editText182    = (EditText) this.findViewById(R.id.editText182GarantiaHarvester);

        editText183    = (EditText) this.findViewById(R.id.editText183GarantiaHarvester);

        editText184    = (EditText) this.findViewById(R.id.editText184GarantiaHarvester);

        editText185    = (EditText) this.findViewById(R.id.editText185GarantiaHarvester);

        editText186    = (EditText) this.findViewById(R.id.editText186GarantiaHarvester);

        editText187    = (EditText) this.findViewById(R.id.editText187GarantiaHarvester);

        editText188= (EditText) this.findViewById(R.id.editText188GarantiaHarvester);

        editText189= (EditText) this.findViewById(R.id.editText189GarantiaHarvester);

        editText190= (EditText) this.findViewById(R.id.editText190GarantiaHarvester);

        editText191= (EditText) this.findViewById(R.id.editText191GarantiaHarvester);

        editText192= (EditText) this.findViewById(R.id.editText192GarantiaHarvester);

        editText193= (EditText) this.findViewById(R.id.editText193GarantiaHarvester);

        editText194    = (EditText) this.findViewById(R.id.editText194);

        editText195    = (EditText) this.findViewById(R.id.editText195GarantiaHarvester);

        editText196    = (EditText) this.findViewById(R.id.editText196GarantiaHarvester);

        editText197    = (EditText) this.findViewById(R.id.editText197GarantiaHarvester);

        editText198    = (EditText) this.findViewById(R.id.editText198GarantiaHarvester);

        editText199    = (EditText) this.findViewById(R.id.editText199GarantiaHarvester);

        editText200    = (EditText) this.findViewById(R.id.editText200GarantiaHarvester);

        editText201    = (EditText) this.findViewById(R.id.editText201GarantiaHarvester);

        editText202    = (EditText) this.findViewById(R.id.editText202GarantiaHarvester);

        editText203    = (EditText) this.findViewById(R.id.editText203GarantiaHarvester);

        editText204    = (EditText) this.findViewById(R.id.editText204GarantiaHarvester);

        editText205    = (EditText) this.findViewById(R.id.editText205GarantiaHarvester);

        editText206    = (EditText) this.findViewById(R.id.editText206GarantiaHarvester);

        editText207    = (EditText) this.findViewById(R.id.editText207GarantiaHarvester);

        editText208= (EditText) this.findViewById(R.id.editText208GarantiaHarvester);

        editText209= (EditText) this.findViewById(R.id.editText209GarantiaHarvester);

        editText210= (EditText) this.findViewById(R.id.editText210GarantiaHarvester);

        editText211= (EditText) this.findViewById(R.id.editText211GarantiaHarvester);

        editText212= (EditText) this.findViewById(R.id.editText212GarantiaHarvester);

        editText213= (EditText) this.findViewById(R.id.editText213GarantiaHarvester);

        editText214    = (EditText) this.findViewById(R.id.editText214GarantiaHarvester);

        radioButton6x6   = (RadioButton) this.findViewById(R.id.radioButton6x6GarantiaHarvester);

        radioButton8x8    = (RadioButton) this.findViewById(R.id.radioButton8x8GarantiaHarvester);

        radioButton200hrs   = (RadioButton) this.findViewById(R.id.radioButton200hrsGarantiaHarvester);

        radioButton1800hrs    = (RadioButton) this.findViewById(R.id.radioButton1800hrsGarantiaHarvester);

        radioGroupQtdEixo         = (RadioGroup) this.findViewById(R.id.radioGroupQtsEixosGarantiaHarvester);

        radioGroupQtdhorasRevisao         = (RadioGroup) this.findViewById(R.id.radioGroupQdtHrsRevisaoGarantiaHarvester);

       checkBox4  = (CheckBox)this.findViewById(R.id.checkBox4);
       checkBox5  = (CheckBox)this.findViewById(R.id.checkBox5);
       checkBox6  = (CheckBox)this.findViewById(R.id.checkBox6);
       checkBox7  = (CheckBox)this.findViewById(R.id.checkBox7);
       checkBox8  = (CheckBox)this.findViewById(R.id.checkBox8);
       checkBox9  = (CheckBox)this.findViewById(R.id.checkBox9);
       checkBox10  = (CheckBox)this.findViewById(R.id.checkBox10);
       checkBox11  = (CheckBox)this.findViewById(R.id.checkBox11);
       checkBox12  = (CheckBox)this.findViewById(R.id.checkBox12);
       checkBox13  = (CheckBox)this.findViewById(R.id.checkBox13);
       checkBox14  = (CheckBox)this.findViewById(R.id.checkBox14);
       checkBox15  = (CheckBox)this.findViewById(R.id.checkBox15);
       checkBox16  = (CheckBox)this.findViewById(R.id.checkBox16);
       checkBox17  = (CheckBox)this.findViewById(R.id.checkBox17);
       checkBox18  = (CheckBox)this.findViewById(R.id.checkBox18);
       checkBox19  = (CheckBox)this.findViewById(R.id.checkBox19);
       checkBox20  = (CheckBox)this.findViewById(R.id.checkBox20);
       checkBox42  = (CheckBox)this.findViewById(R.id.checkBox42);
       checkBox207  = (CheckBox)this.findViewById(R.id.checkBox207);
       checkBox208  = (CheckBox)this.findViewById(R.id.checkBox208);
       checkBox212  = (CheckBox)this.findViewById(R.id.checkBox212);
       checkBox282  = (CheckBox)this.findViewById(R.id.checkBox282);
       checkBox283  = (CheckBox)this.findViewById(R.id.checkBox283);
       checkBox331  = (CheckBox)this.findViewById(R.id.checkBox331);
       checkBox332  = (CheckBox)this.findViewById(R.id.checkBox332);
       checkBox359  = (CheckBox)this.findViewById(R.id.checkBox359);
       checkBox360  = (CheckBox)this.findViewById(R.id.checkBox360);
       checkBox361  = (CheckBox)this.findViewById(R.id.checkBox361);
       checkBox362  = (CheckBox)this.findViewById(R.id.checkBox362);
       checkBox363  = (CheckBox)this.findViewById(R.id.checkBox363);
       checkBox364  = (CheckBox)this.findViewById(R.id.checkBox364);
       checkBox365  = (CheckBox)this.findViewById(R.id.checkBox365);
       checkBox366  = (CheckBox)this.findViewById(R.id.checkBox366);
       checkBox367  = (CheckBox)this.findViewById(R.id.checkBox367);
       checkBox368  = (CheckBox)this.findViewById(R.id.checkBox368);
       checkBox369  = (CheckBox)this.findViewById(R.id.checkBox369);
       checkBox370  = (CheckBox)this.findViewById(R.id.checkBox370);
       checkBox371  = (CheckBox)this.findViewById(R.id.checkBox371);
       checkBox372  = (CheckBox)this.findViewById(R.id.checkBox372);
       checkBox373  = (CheckBox)this.findViewById(R.id.checkBox373);
       checkBox374  = (CheckBox)this.findViewById(R.id.checkBox374);
       checkBox375  = (CheckBox)this.findViewById(R.id.checkBox375);
       checkBox376  = (CheckBox)this.findViewById(R.id.checkBox376);
       checkBox377  = (CheckBox)this.findViewById(R.id.checkBox377);
       checkBox378  = (CheckBox)this.findViewById(R.id.checkBox378);
       checkBox379  = (CheckBox)this.findViewById(R.id.checkBox379);
       checkBox380  = (CheckBox)this.findViewById(R.id.checkBox380);
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
       checkBox381  = (CheckBox)this.findViewById(R.id.checkBox381);
       checkBox382  = (CheckBox)this.findViewById(R.id.checkBox382);
       checkBox383  = (CheckBox)this.findViewById(R.id.checkBox383);
       checkBox384  = (CheckBox)this.findViewById(R.id.checkBox384);
       checkBox385  = (CheckBox)this.findViewById(R.id.checkBox385);
       checkBox386  = (CheckBox)this.findViewById(R.id.checkBox386);
       checkBox387  = (CheckBox)this.findViewById(R.id.checkBox387);
       checkBox388  = (CheckBox)this.findViewById(R.id.checkBox388);
       checkBox389  = (CheckBox)this.findViewById(R.id.checkBox389);
       checkBox390  = (CheckBox)this.findViewById(R.id.checkBox390);
       checkBox391  = (CheckBox)this.findViewById(R.id.checkBox391);
       checkBox392  = (CheckBox)this.findViewById(R.id.checkBox392);
       checkBox393  = (CheckBox)this.findViewById(R.id.checkBox393);
       checkBox394  = (CheckBox)this.findViewById(R.id.checkBox394);
       checkBox395  = (CheckBox)this.findViewById(R.id.checkBox395);
       checkBox396  = (CheckBox)this.findViewById(R.id.checkBox396);
       checkBox397  = (CheckBox)this.findViewById(R.id.checkBox397);
       checkBox398  = (CheckBox)this.findViewById(R.id.checkBox398);
       checkBox399  = (CheckBox)this.findViewById(R.id.checkBox399);
       checkBox400  = (CheckBox)this.findViewById(R.id.checkBox400);
       checkBox401  = (CheckBox)this.findViewById(R.id.checkBox401);
       checkBox402  = (CheckBox)this.findViewById(R.id.checkBox402);
       checkBox403  = (CheckBox)this.findViewById(R.id.checkBox403);
       checkBox404  = (CheckBox)this.findViewById(R.id.checkBox404);
       checkBox405  = (CheckBox)this.findViewById(R.id.checkBox405);
       checkBox406  = (CheckBox)this.findViewById(R.id.checkBox406);
       checkBox407  = (CheckBox)this.findViewById(R.id.checkBox407);
       checkBox408  = (CheckBox)this.findViewById(R.id.checkBox408);
       checkBox409  = (CheckBox)this.findViewById(R.id.checkBox409);
       checkBox410  = (CheckBox)this.findViewById(R.id.checkBox410);
       checkBox411  = (CheckBox)this.findViewById(R.id.checkBox411);
       checkBox412  = (CheckBox)this.findViewById(R.id.checkBox412);
       checkBox413  = (CheckBox)this.findViewById(R.id.checkBox413);
       checkBox414  = (CheckBox)this.findViewById(R.id.checkBox414);
       checkBox415  = (CheckBox)this.findViewById(R.id.checkBox415);
       checkBox416  = (CheckBox)this.findViewById(R.id.checkBox416);
       checkBox417  = (CheckBox)this.findViewById(R.id.checkBox417);
       checkBox418  = (CheckBox)this.findViewById(R.id.checkBox418);
       checkBox419  = (CheckBox)this.findViewById(R.id.checkBox419);
       checkBox420  = (CheckBox)this.findViewById(R.id.checkBox420);
       checkBox421  = (CheckBox)this.findViewById(R.id.checkBox421);
       checkBox422  = (CheckBox)this.findViewById(R.id.checkBox422);
       checkBox423  = (CheckBox)this.findViewById(R.id.checkBox423);
       checkBox424  = (CheckBox)this.findViewById(R.id.checkBox424);
       checkBox425  = (CheckBox)this.findViewById(R.id.checkBox425);
       checkBox426  = (CheckBox)this.findViewById(R.id.checkBox426);
       checkBox427  = (CheckBox)this.findViewById(R.id.checkBox427);
       checkBox428  = (CheckBox)this.findViewById(R.id.checkBox428);
       checkBox429  = (CheckBox)this.findViewById(R.id.checkBox429);
       checkBox430  = (CheckBox)this.findViewById(R.id.checkBox430);
       checkBox431  = (CheckBox)this.findViewById(R.id.checkBox431);
       checkBox432  = (CheckBox)this.findViewById(R.id.checkBox432);
       checkBox433  = (CheckBox)this.findViewById(R.id.checkBox433);
       checkBox434  = (CheckBox)this.findViewById(R.id.checkBox434);
       checkBox435  = (CheckBox)this.findViewById(R.id.checkBox435);
       checkBox436  = (CheckBox)this.findViewById(R.id.checkBox436);
       checkBox437  = (CheckBox)this.findViewById(R.id.checkBox437);
       checkBox438  = (CheckBox)this.findViewById(R.id.checkBox438);
       checkBox439  = (CheckBox)this.findViewById(R.id.checkBox439);
       checkBox440  = (CheckBox)this.findViewById(R.id.checkBox440);
       checkBox441  = (CheckBox)this.findViewById(R.id.checkBox441);
       checkBox442  = (CheckBox)this.findViewById(R.id.checkBox442);
       checkBox443  = (CheckBox)this.findViewById(R.id.checkBox443);
       checkBox444  = (CheckBox)this.findViewById(R.id.checkBox444);
       checkBox445  = (CheckBox)this.findViewById(R.id.checkBox445);
       checkBox446  = (CheckBox)this.findViewById(R.id.checkBox446);
       checkBox447  = (CheckBox)this.findViewById(R.id.checkBox447);
       checkBox448  = (CheckBox)this.findViewById(R.id.checkBox448);
       checkBox449  = (CheckBox)this.findViewById(R.id.checkBox449);
       checkBox450  = (CheckBox)this.findViewById(R.id.checkBox450);
       checkBox451  = (CheckBox)this.findViewById(R.id.checkBox451);
       checkBox452  = (CheckBox)this.findViewById(R.id.checkBox452);
       checkBox453  = (CheckBox)this.findViewById(R.id.checkBox453);
       checkBox454  = (CheckBox)this.findViewById(R.id.checkBox454);
       checkBox455  = (CheckBox)this.findViewById(R.id.checkBox455);
       checkBox456  = (CheckBox)this.findViewById(R.id.checkBox456);
       checkBox457  = (CheckBox)this.findViewById(R.id.checkBox457);
       checkBox458  = (CheckBox)this.findViewById(R.id.checkBox458);
       checkBox459  = (CheckBox)this.findViewById(R.id.checkBox459);
       checkBox460  = (CheckBox)this.findViewById(R.id.checkBox460);
       checkBox461  = (CheckBox)this.findViewById(R.id.checkBox461);
       checkBox462  = (CheckBox)this.findViewById(R.id.checkBox462);
       checkBox463  = (CheckBox)this.findViewById(R.id.checkBox463);
       checkBox464  = (CheckBox)this.findViewById(R.id.checkBox464);
       checkBox465  = (CheckBox)this.findViewById(R.id.checkBox465);
       checkBox466  = (CheckBox)this.findViewById(R.id.checkBox466);
       checkBox467  = (CheckBox)this.findViewById(R.id.checkBox467);
       checkBox468  = (CheckBox)this.findViewById(R.id.checkBox468);
       checkBox469  = (CheckBox)this.findViewById(R.id.checkBox469);
       checkBox470  = (CheckBox)this.findViewById(R.id.checkBox470);
       checkBox471  = (CheckBox)this.findViewById(R.id.checkBox471);
       checkBox472  = (CheckBox)this.findViewById(R.id.checkBox472);
       checkBox473  = (CheckBox)this.findViewById(R.id.checkBox473);
       checkBox474  = (CheckBox)this.findViewById(R.id.checkBox474);
       checkBox475  = (CheckBox)this.findViewById(R.id.checkBox475);
       checkBox476  = (CheckBox)this.findViewById(R.id.checkBox476);
       checkBox477  = (CheckBox)this.findViewById(R.id.checkBox477);
       checkBox478  = (CheckBox)this.findViewById(R.id.checkBox478);
       checkBox479  = (CheckBox)this.findViewById(R.id.checkBox479);
       checkBox480  = (CheckBox)this.findViewById(R.id.checkBox480);
       checkBox481  = (CheckBox)this.findViewById(R.id.checkBox481);
       checkBox482  = (CheckBox)this.findViewById(R.id.checkBox482);
       checkBox483  = (CheckBox)this.findViewById(R.id.checkBox483);
       checkBox484  = (CheckBox)this.findViewById(R.id.checkBox484);
       checkBox485  = (CheckBox)this.findViewById(R.id.checkBox485);
       checkBox486  = (CheckBox)this.findViewById(R.id.checkBox486);
       checkBox487  = (CheckBox)this.findViewById(R.id.checkBox487);
       checkBox488  = (CheckBox)this.findViewById(R.id.checkBox488);
       checkBox489  = (CheckBox)this.findViewById(R.id.checkBox489);
       checkBox490  = (CheckBox)this.findViewById(R.id.checkBox490);
       checkBox491  = (CheckBox)this.findViewById(R.id.checkBox491);
       checkBox492  = (CheckBox)this.findViewById(R.id.checkBox492);
       checkBox493  = (CheckBox)this.findViewById(R.id.checkBox493);
       checkBox494  = (CheckBox)this.findViewById(R.id.checkBox494);
       checkBox495  = (CheckBox)this.findViewById(R.id.checkBox495);
       checkBox496  = (CheckBox)this.findViewById(R.id.checkBox496);
       checkBox497  = (CheckBox)this.findViewById(R.id.checkBox497);
       checkBox498  = (CheckBox)this.findViewById(R.id.checkBox498);
       checkBox499  = (CheckBox)this.findViewById(R.id.checkBox499);
       checkBox500  = (CheckBox)this.findViewById(R.id.checkBox500);
       checkBox501  = (CheckBox)this.findViewById(R.id.checkBox501);
       checkBox502  = (CheckBox)this.findViewById(R.id.checkBox502);
       checkBox503  = (CheckBox)this.findViewById(R.id.checkBox503);
       checkBox504  = (CheckBox)this.findViewById(R.id.checkBox504);
       
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
        else if(editText6.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText6.requestFocus();
        }

        else if(editText159.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.c_obrigatorio));

            editText159.requestFocus();
        }

        else if(editText160.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText160.requestFocus();
        }

        else if(editText161.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText161.requestFocus();
        }

        else if(editText162.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText162.requestFocus();
        }

        else if(editText163.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText163.requestFocus();
        }

        else if(editText164.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText164.requestFocus();
        }

        else if(editText165.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText165.requestFocus();
        }

        else if(editText166.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText166.requestFocus();
        }

        else if(editText167.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText167.requestFocus();
        }

        else if(editText168.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText168.requestFocus();
        }

        else if(editText169.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText169.requestFocus();
        }

        else if(editText170.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText170.requestFocus();
        }

        else if(editText171.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText171.requestFocus();
        }

        else if(editText172.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText172.requestFocus();
        }

        else if(editText173.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText173.requestFocus();
        }

        else if(editText174.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText174.requestFocus();
        }

        else if(editText175.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText175.requestFocus();
        }

        else if(editText176.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText176.requestFocus();
        }

        else if(editText177.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText177.requestFocus();
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

        else if(editText178.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_reserva_obrigatorio));

            editText178.requestFocus();
        }

        else if(editText179.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText179.requestFocus();
        }

        else if(editText180.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_maxima_padrao_obrigatorio));

            editText180.requestFocus();
        }

        else if(editText181.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText181.requestFocus();
        }

        else if(editText182.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_reserva_obrigatorio));

            editText182.requestFocus();
        }

        else if(editText183.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText183.requestFocus();
        }

        else if(editText184.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_maxima_padrao_obrigatorio));

            editText184.requestFocus();
        }

        //////

        else if(editText185.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText185.requestFocus();
        }

        else if(editText186.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_reserva_obrigatorio));

            editText186.requestFocus();
        }

        else if(editText187.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText187.requestFocus();
        }

        else if(editText188.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.da_padrao_obrigatorio));

            editText188.requestFocus();
        }

        else if(editText189.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText189.requestFocus();
        }

        else if(editText190.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.db_padrao_obrigatorio));

            editText190.requestFocus();
        }

        else if(editText191.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText191.requestFocus();
        }

        else if(editText192.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.pressao_alimentacao_obrigatorio));

            editText192.requestFocus();
        }

        else if(editText193.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText193.requestFocus();
        }

        else if(editText194.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.notas_obrigatorio));

            editText194.requestFocus();
        }

        else if(editText195.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText195.requestFocus();
        }

        else if(editText196.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.grau_qtd_obrigatorio));

            editText196.requestFocus();
        }

        else if(editText197.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText197.requestFocus();
        }

        else if(editText198.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText198.requestFocus();
        }

        else if(editText199.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText199.requestFocus();
        }

        else if(editText200.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText200.requestFocus();
        }

        else if(editText201.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText201.requestFocus();
        }

        else if(editText202.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText202.requestFocus();
        }

        else if(editText203.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.notas_obrigatorio));

            editText203.requestFocus();
        }

        else if(editText204.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText204.requestFocus();
        }

        else if(editText205.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.nm_obrigatorio));

            editText205.requestFocus();
        }

        else if(editText206.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.valor_padrao_obrigatorio));

            editText206.requestFocus();
        }

        else if(editText207.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText207.requestFocus();
        }

        else if(editText208.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.valor_padrao_obrigatorio));

            editText208.requestFocus();
        }

        else if(editText209.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText209.requestFocus();
        }

        else if(editText210.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.valor_padrao_obrigatorio));

            editText210.requestFocus();
        }

        else if(editText211.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText211.requestFocus();
        }

        else if(editText212.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.valor_padrao_obrigatorio));

            editText212.requestFocus();
        }

        else if(editText213.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.ajustado_obrigatorio));

            editText213.requestFocus();
        }

        else if(editText214.getText().toString().trim().equals("")){

            Uteis.Alert(this, this.getString(R.string.notas_obrigatorio));

            editText214.requestFocus();
        }
        else {

            */
/*CRIANDO UM OBJETO PESSOA*//*

            GarantiaHarvesterPonsseModel garantiaHarvesterPonsseModel = new GarantiaHarvesterPonsseModel();

            */
/*SETANDO O VALOR DO CAMPO NOME*//*

            garantiaHarvesterPonsseModel.setTelefone(editTelefone.getText().toString().trim());

            garantiaHarvesterPonsseModel.setCliente(editCliente.getText().toString().trim());

            garantiaHarvesterPonsseModel.setOrdemServico(editOrdemServico.getText().toString().trim());

            garantiaHarvesterPonsseModel.setNumDeSerie(editNumSerie.getText().toString().trim());

            garantiaHarvesterPonsseModel.setHrsMotor(editHorasMotor.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText6(editText6.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText159(editText159.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText160(editText160.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText161(editText161.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText162(editText162.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText163(editText163.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText164(editText164.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText165(editText165.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText166(editText166.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText167(editText167.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText168(editText168.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText169(editText169.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText170(editText170.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText171(editText171.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText172(editText172.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText173(editText173.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText175(editText175.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText176(editText176.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText177(editText177.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText38(editText38.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText39(editText39.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText40(editText40.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText41(editText41.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText42(editText42.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText43(editText43.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText44(editText44.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText45(editText45.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText46(editText46.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText47(editText47.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText178(editText178.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText179(editText179.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText180(editText180.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText181(editText181.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText182(editText182.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText183(editText183.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText184(editText184.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText185(editText185.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText186(editText186.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText187(editText187.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText188(editText188.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText189(editText189.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText190(editText190.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText191(editText191.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText192(editText192.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText193(editText193.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText194(editText194.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText195(editText195.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText196(editText196.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText197(editText197.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText198(editText198.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText199(editText199.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText200(editText200.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText201(editText201.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText202(editText202.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText203(editText203.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText204(editText204.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText205(editText205.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText206(editText206.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText207(editText207.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText208(editText208.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText209(editText209.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText210(editText210.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText211(editText211.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText212(editText212.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText213(editText213.getText().toString().trim());

            garantiaHarvesterPonsseModel.setEditText214(editText214.getText().toString().trim());

            */
/*SETANDO A DATA DE NASCIMENTO*//*

            garantiaHarvesterPonsseModel.setDataPreenchimennto(editTextDataNascimento.getText().toString().trim());

            */
/*REALIZANDO UM CAST PARA PEGAR O OBJETO DO modelo SELECIONADO*//*

            GarantiaHarvesterPonsseModelo garantiaHarvesterPonsseModelo = (GarantiaHarvesterPonsseModelo) spinnerModelo.getSelectedItem();

             */
/*SETANDO o modelo*//*

            garantiaHarvesterPonsseModel.setModelo(garantiaHarvesterPonsseModelo.getCodigo());


            */
/*SETANDO a qtd eixo*//*

            if (radioButton6x6.isChecked())
                garantiaHarvesterPonsseModel.setQtdEixo("6x6");
            else
                garantiaHarvesterPonsseModel.setQtdEixo("8x8");

             */
/*SETANDO O a qtd horas*//*

            if (radioButton200hrs.isChecked())
                garantiaHarvesterPonsseModel.setHrsRevisao("200Hrs");
            else
                garantiaHarvesterPonsseModel.setHrsRevisao("1800Hrs");

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox4((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox4.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox4((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox5((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox4.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox5((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox6((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox6.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox6((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox7((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox7.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox7((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox8((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox8.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox8((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox9((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox9.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox9((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox10((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox10.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox10((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox11((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox11.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox11((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox12((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox12.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox12((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox13((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox13.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox13((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox14((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox14.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox14((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox15((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox15.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox15((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox16((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox16.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox16((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox17((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox17.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox17((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox18((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox18.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox18((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox19((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox19.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox19((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox20((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox20.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox20((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox42((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox42.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox42((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox207((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox207.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox207((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox208((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox208.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox208((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox212((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox212.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox212((byte) 1);
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox282((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox282.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox282((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox283((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox283.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox283((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox331((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox331.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox331((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox332((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox332.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox332((byte) 1);

            ///Parei aqui....



             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);

              */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox140((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox140.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox140((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox209((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox209.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox209((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox210((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox210.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox210((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox211((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox211.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox211((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox213((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox213.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox213((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox214((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox214.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox214((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox215((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox215.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox215((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaForwarderModel.setCheckBox216((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox216.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox216((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox217((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox217.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox217((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox218((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox218.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox218((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox264((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox264.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox264((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox265((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox265.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox265((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox266((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox266.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox266((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox267((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox267.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox267((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox268((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox268.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox268((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox269((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox269.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox269((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox270((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox270.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox270((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox271((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox271.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox271((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox272((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox272.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox272((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox273((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox273.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox273((byte) 1);

             */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox274((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox274.isChecked())
                garantiaHarvesterPonsseModel
            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox275((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox275.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox275((byte) 1);

            */
/*SETA O REGISTRO COMO INATIVO*//*

            garantiaHarvesterPonsseModel.setCheckBox276((byte) 0);

            */
/*SE TIVER SELECIONADO SETA COMO ATIVO*//*

            if (checkBox276.isChecked())
                garantiaHarvesterPonsseModel.setCheckBox276((byte) 1);



            */
/*SALVANDO UM NOVO REGISTRO*//*

            new GarantiaForwarderRepository(this).Salvar(garantiaForwarderModel);

            */
/*MENSAGEM DE SUCESSO!*//*

            Uteis.Alert(this, this.getString(R.string.registro_salvo_sucesso));

            // AtualizarLista();

            super.finish();

            //LimparCampos();
        }

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
