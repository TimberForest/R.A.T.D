package br.com.timberforest.ratd.sharedPreferences.deslocamento;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dashboards.MainActivity;
import de.keyboardsurfer.android.widget.crouton.Configuration;
import de.keyboardsurfer.android.widget.crouton.Style;

public class RefeicaoActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "sharedPreferencesDeslocamento";

    private Button btn_ini_ref1,btn_fim_ref1,btn_ini_ref2,btn_fim_ref2,btn_ini_ref3,btn_fim_ref3,btn_ini_ref4,
            btn_fim_ref4,btn_ini_ref5, btn_fim_ref5,btn_ini_ref6,btn_fim_ref6;

    private TextView txt_ini_ref1,txt_fim_ref1,txt_ini_ref2,txt_fim_ref2,txt_ini_ref3,txt_fim_ref3,txt_ini_ref4,
            txt_fim_ref4,txt_ini_ref5,txt_fim_ref5,txt_ini_ref6,txt_fim_ref6;
    private TextView txt_tempo_ref1, txt_tempo_ref2, txt_tempo_ref3, txt_tempo_ref4, txt_tempo_ref5, txt_tempo_ref6;

    private String spIniRef1 = "ini_ref1";
    private String spFimRef1 = "fim_ref1";
    private String spIniRef2 = "ini_ref2";
    private String spFimRef2 = "fim_ref2";
    private String spIniRef3 = "ini_ref3";
    private String spFimRef3 = "fim_ref3";
    private String spIniRef4 = "ini_ref4";
    private String spFimRef4 = "fim_ref4";
    private String spIniRef5 = "ini_ref5";
    private String spFimRef5 = "fim_ref5";
    private String spIniRef6 = "ini_ref6";
    private String spFimRef6 = "fim_ref6";
    private String spTempoRef1 = "tempo_ref1";
    private String spTempoRef2 = "tempo_ref2";
    private String spTempoRef3 = "tempo_ref3";
    private String spTempoRef4 = "tempo_ref4";
    private String spTempoRef5 = "tempo_ref5";
    private String spTempoRef6 = "tempo_ref6";
    private String spTotalRef = "tempo_refeicao";

    private String msgIniRef = "Inicio da Refeição: ";
    private String msgSucesso = " Gravado com sucesso !";
    private String msgFimRef = "Fim da Refeição: ";
    private String DataFormat = "HH:mm";
    private String vazio = "";

    long lh1 =0, lh2 =0, lh3 =0, lh4 =0, lh5 =0, lh6 =0, horasSoma =0, diffHours =0;
    long lm1 =0, lm2 =0, lm3 =0, lm4 =0, lm5 =0, lm6 =0, diffMinutes =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deslocamento_refeicao);

        btn_ini_ref1 = (Button) findViewById(R.id.btn_ini_ref1);
        btn_fim_ref1 = (Button) findViewById(R.id.btn_fim_ref1);
        btn_ini_ref2 = (Button) findViewById(R.id.btn_ini_ref2);
        btn_fim_ref2 = (Button) findViewById(R.id.btn_fim_ref2);
        btn_ini_ref3 = (Button) findViewById(R.id.btn_ini_ref3);
        btn_fim_ref3 = (Button) findViewById(R.id.btn_fim_ref3);
        btn_ini_ref4 = (Button) findViewById(R.id.btn_ini_ref4);
        btn_fim_ref4 = (Button) findViewById(R.id.btn_fim_ref4);
        btn_ini_ref5 = (Button) findViewById(R.id.btn_ini_ref5);
        btn_fim_ref5 = (Button) findViewById(R.id.btn_fim_ref5);
        btn_ini_ref6 = (Button) findViewById(R.id.btn_ini_ref6);
        btn_fim_ref6 = (Button) findViewById(R.id.btn_fim_ref6);
        txt_ini_ref1 = (TextView) findViewById(R.id.txt_ini_ref1);
        txt_fim_ref1 = (TextView) findViewById(R.id.txt_fim_ref1);
        txt_ini_ref2 = (TextView) findViewById(R.id.txt_ini_ref2);
        txt_fim_ref2 = (TextView) findViewById(R.id.txt_fim_ref2);
        txt_ini_ref3 = (TextView) findViewById(R.id.txt_ini_ref3);
        txt_fim_ref3 = (TextView) findViewById(R.id.txt_fim_ref3);
        txt_ini_ref4 = (TextView) findViewById(R.id.txt_ini_ref4);
        txt_fim_ref4 = (TextView) findViewById(R.id.txt_fim_ref4);
        txt_ini_ref5 = (TextView) findViewById(R.id.txt_ini_ref5);
        txt_fim_ref5 = (TextView) findViewById(R.id.txt_fim_ref5);
        txt_ini_ref6 = (TextView) findViewById(R.id.txt_ini_ref6);
        txt_fim_ref6 = (TextView) findViewById(R.id.txt_fim_ref6);
        txt_tempo_ref1 = (TextView) findViewById(R.id.txt_tempo_ref1);
        txt_tempo_ref2 = (TextView) findViewById(R.id.txt_tempo_ref2);
        txt_tempo_ref3 = (TextView) findViewById(R.id.txt_tempo_ref3);
        txt_tempo_ref4 = (TextView) findViewById(R.id.txt_tempo_ref4);
        txt_tempo_ref5 = (TextView) findViewById(R.id.txt_tempo_ref5);
        txt_tempo_ref6 = (TextView) findViewById(R.id.txt_tempo_ref6);

        atualizaCampos();
    }
    public void goToMain(){
        Intent intent = new Intent(RefeicaoActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void msgIni(String data){
        Toast.makeText(getApplicationContext(), msgIniRef+data+msgSucesso, Toast.LENGTH_SHORT).show();
    }
    public void msgFim(String data){
        Toast.makeText(getApplicationContext(), msgFimRef+data+msgSucesso, Toast.LENGTH_SHORT).show();
    }
    public void gravarRefIni(String chaveValor){
        //recupera hora atual
        SimpleDateFormat sdf = new SimpleDateFormat(DataFormat);
        Date hora = Calendar.getInstance().getTime();
        final String dataFormatada = sdf.format(hora);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, dataFormatada);
        editor.commit();
        msgIni(dataFormatada);
        goToMain();

    }
    public void gravarRefFim(String chaveValor){
        //recupera hora atual
        SimpleDateFormat sdf = new SimpleDateFormat(DataFormat);
        Date hora = Calendar.getInstance().getTime();
        final String dataFormatada = sdf.format(hora);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, dataFormatada);
        editor.commit();
        msgFim(dataFormatada);
        atualizaViews();
    }
    public void deslocamentoClick(View view){
        switch (view.getId()) {
            // 1
            case R.id.btn_ini_ref1:
                gravarRefIni(spIniRef1);
                break;
            case R.id.btn_fim_ref1:
                gravarRefFim(spFimRef1);
                break;
            // 2
            case R.id.btn_ini_ref2:
                gravarRefIni(spIniRef2);
                break;
            case R.id.btn_fim_ref2:
                gravarRefFim(spFimRef2);
                break;
            //3
            case R.id.btn_ini_ref3:
                gravarRefIni(spIniRef3);
                break;
            case R.id.btn_fim_ref3:
                gravarRefFim(spFimRef3);
                break;
            //4
            case R.id.btn_ini_ref4:
                gravarRefIni(spIniRef4);
                break;
            case R.id.btn_fim_ref4:
                gravarRefFim(spFimRef4);
                break;
            //5
            case R.id.btn_ini_ref5:
                gravarRefIni(spIniRef5);
                break;
            case R.id.btn_fim_ref5:
                gravarRefFim(spFimRef5);
                break;
            //6
            case R.id.btn_ini_ref6:
                gravarRefIni(spIniRef6);
                break;
            case R.id.btn_fim_ref6:
                gravarRefFim(spFimRef6);
                break;
        }
    }
    private void atualizaCampos() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        txt_ini_ref1.setText(settings.getString(spIniRef1, vazio));
        txt_fim_ref1.setText(settings.getString(spFimRef1, vazio));
        txt_ini_ref2.setText(settings.getString(spIniRef2, vazio));
        txt_fim_ref2.setText(settings.getString(spFimRef2, vazio));
        txt_ini_ref3.setText(settings.getString(spIniRef3, vazio));
        txt_fim_ref3.setText(settings.getString(spFimRef3, vazio));
        txt_ini_ref4.setText(settings.getString(spIniRef4, vazio));
        txt_fim_ref4.setText(settings.getString(spFimRef4, vazio));
        txt_ini_ref5.setText(settings.getString(spIniRef5, vazio));
        txt_fim_ref5.setText(settings.getString(spFimRef5, vazio));
        txt_ini_ref6.setText(settings.getString(spIniRef6, vazio));
        txt_fim_ref6.setText(settings.getString(spFimRef6, vazio));

        txt_tempo_ref1.setText(settings.getString(spTempoRef1, vazio));
        txt_tempo_ref2.setText(settings.getString(spTempoRef2, vazio));
        txt_tempo_ref3.setText(settings.getString(spTempoRef3, vazio));
        txt_tempo_ref4.setText(settings.getString(spTempoRef4, vazio));
        txt_tempo_ref5.setText(settings.getString(spTempoRef5, vazio));
        txt_tempo_ref6.setText(settings.getString(spTempoRef6, vazio));

        verAltBtnIni();
    }
    private void verAltBtnIni() {
        if (txt_fim_ref1.getText().toString().equals(vazio)){
            btn_ini_ref2.setEnabled(false);
        } else {
            btn_ini_ref2.setEnabled(true);
        }
        if (txt_fim_ref2.getText().toString().equals(vazio)){
            btn_ini_ref3.setEnabled(false);
        } else {
            btn_ini_ref3.setEnabled(true);
        }
        if (txt_fim_ref3.getText().toString().equals(vazio)){
            btn_ini_ref4.setEnabled(false);
        } else {
            btn_ini_ref4.setEnabled(true);
        }
        if (txt_fim_ref4.getText().toString().equals(vazio)){
            btn_ini_ref5.setEnabled(false);
        } else {
            btn_ini_ref5.setEnabled(true);
        }
        if (txt_fim_ref5.getText().toString().equals(vazio)){
            btn_ini_ref6.setEnabled(false);
        } else {
            btn_ini_ref6.setEnabled(true);
        }
        verAltBtnFim();
    }
    public void verAltBtnFim(){
        if (txt_ini_ref1.getText().toString().equals(vazio)){
            btn_fim_ref1.setEnabled(false);
        } else {
            btn_fim_ref1.setEnabled(true);
        }
        if (txt_ini_ref2.getText().toString().equals(vazio)){
            btn_fim_ref2.setEnabled(false);
        } else {
            btn_fim_ref2.setEnabled(true);
        }
        if (txt_ini_ref3.getText().toString().equals(vazio)){
            btn_fim_ref3.setEnabled(false);
        } else {
            btn_fim_ref3.setEnabled(true);
        }
        if (txt_ini_ref4.getText().toString().equals(vazio)){
            btn_fim_ref4.setEnabled(false);
        } else {
            btn_fim_ref4.setEnabled(true);
        }
        if (txt_ini_ref5.getText().toString().equals(vazio)){
            btn_fim_ref5.setEnabled(false);
        } else {
            btn_fim_ref5.setEnabled(true);
        }
        if (txt_ini_ref6.getText().toString().equals(vazio)){
            btn_fim_ref6.setEnabled(false);
        } else {
            btn_fim_ref6.setEnabled(true);
        }
        botaoClicado();
    }
    public void botaoClicado(){
        //1
        if (txt_ini_ref1.getText().toString().equals(vazio)){
        } else {
            btn_ini_ref1.setEnabled(false);
        }
        if (txt_fim_ref1.getText().toString().equals(vazio)){
        } else {
            btn_fim_ref1.setEnabled(false);
        }
        //2
        if (txt_ini_ref2.getText().toString().equals(vazio)){
        } else {
            btn_ini_ref2.setEnabled(false);
        }
        if (txt_fim_ref2.getText().toString().equals(vazio)){
        } else {
            btn_fim_ref2.setEnabled(false);
        }
        //3
        if (txt_ini_ref3.getText().toString().equals(vazio)){
        } else {
            btn_ini_ref3.setEnabled(false);
        }
        if (txt_fim_ref3.getText().toString().equals(vazio)){
        } else {
            btn_fim_ref3.setEnabled(false);
        }
        //4
        if (txt_ini_ref4.getText().toString().equals(vazio)){
        } else {
            btn_ini_ref4.setEnabled(false);
        }
        if (txt_fim_ref4.getText().toString().equals(vazio)){
        } else {
            btn_fim_ref4.setEnabled(false);
        }
        //5
        if (txt_ini_ref5.getText().toString().equals(vazio)){
        } else {
            btn_ini_ref5.setEnabled(false);
        }
        if (txt_fim_ref5.getText().toString().equals(vazio)){
        } else {
            btn_fim_ref5.setEnabled(false);
        }
        //6
        if (txt_ini_ref6.getText().toString().equals(vazio)){
        } else {
            btn_ini_ref6.setEnabled(false);
        }
        if (txt_fim_ref6.getText().toString().equals(vazio)){
        } else {
            btn_fim_ref6.setEnabled(false);
        }
    }
    public void gravarDeslDif(String chaveValor, String total){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, total);
        editor.commit();
        Log.i("info", "gravarRefDif: "+total);
        atualizaCamposNovamente();
    }
    public void gravarDeslTot(String chaveValor, String total){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, total);
        editor.commit();
        Log.i("info", "gravarRefTot: "+total);
        goToMain();
    }
    public void calcTotDesl(){
        //1
        if (txt_ini_ref1.getText().toString().equals("") && txt_fim_ref1.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_ref1, txt_fim_ref1, spTempoRef1);
        }
        //2
        if (txt_ini_ref2.getText().toString().equals("") && txt_fim_ref2.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_ref2, txt_fim_ref2, spTempoRef2);
        }
        //3
        if (txt_ini_ref3.getText().toString().equals("") && txt_fim_ref3.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_ref3, txt_fim_ref3, spTempoRef3);
        }
        //4
        if (txt_ini_ref4.getText().toString().equals("") && txt_fim_ref4.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_ref4, txt_fim_ref4, spTempoRef4);
        }
        //5
        if (txt_ini_ref5.getText().toString().equals("") && txt_fim_ref5.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_ref5, txt_fim_ref5, spTempoRef5);
        }
        //6
        if (txt_ini_ref6.getText().toString().equals("") && txt_fim_ref6.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_ref6, txt_fim_ref6, spTempoRef6);
        }
    }
    public void comparaHora(TextView campoIni, TextView CampoFim, String chaveValorSP){

        try {
            String horaIni = campoIni.getText().toString();
            String horaFim = CampoFim.getText().toString();

            Date ini = new SimpleDateFormat(DataFormat).parse(horaIni);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(ini);

            Date fim = new SimpleDateFormat(DataFormat).parse(horaFim);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(fim);
            calendar2.add(Calendar.DATE, 1);

            long diffHours =0;

            Date x = calendar1.getTime();
            Date xy = calendar2.getTime();
            long diff = xy.getTime() - x.getTime();
            long diffMinutes = (diff / (60 * 1000) -1440 );

            if (diffMinutes>=1440){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1440;
            }else
            if (diffMinutes>=1360){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1380;
            }else
            if (diffMinutes>=1320){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1320;
            }else
            if (diffMinutes>=1260){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1260;
            }else
            if (diffMinutes>=1200){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1200;
            }else
            if (diffMinutes>=1140){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1140;
            }else
            if (diffMinutes>=1080){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1080;
            }else
            if (diffMinutes>=1020){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1020;
            }else
            if (diffMinutes>=960){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-960;
            }else
            if (diffMinutes>=900){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-900;
            }else
            if (diffMinutes>=840){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-840;
            }else
            if (diffMinutes>=780){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-780;
            }else
            if (diffMinutes>=720){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-720;
            }else
            if (diffMinutes>=660){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-660;
            }else
            if (diffMinutes>=600){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-600;
            }else
            if (diffMinutes>=540){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-540;
            }else
            if (diffMinutes>=480){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-480;
            }else
            if (diffMinutes>=420){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-420;
            }else
            if (diffMinutes>=360){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-360;
            }else
            if (diffMinutes>=300){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-300;
            }else
            if (diffMinutes>=240){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-240;
            }else
            if (diffMinutes>=180){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-180;
            }else
            if (diffMinutes>=120){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-120;

            }else
            if (diffMinutes>=60) {
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-60;
            }

            String horaDiferenca, minutosDiferenca = null;

            if (diffHours>0){
                horaDiferenca = String.valueOf(diffHours);
                horaDiferenca = horaDiferenca.replace(".", "");
            }else {
                horaDiferenca="00";
            }

            if (diffMinutes==0){
                minutosDiferenca="00";
            }else if(diffMinutes<10){
                minutosDiferenca = "0"+ String.valueOf(diffMinutes);
            } else {
                minutosDiferenca = String.valueOf(diffMinutes);
            }
//            minutosDiferenca = String.valueOf(diffMinutes);
            String diferenca = horaDiferenca+":"+minutosDiferenca;
            gravarDeslDif(chaveValorSP, diferenca);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void totalDeslocamento(TextView tempo1, TextView tempo2, TextView tempo3, TextView tempo4, TextView tempo5, TextView tempo6) {
        try {
            String h1 = tempo1.getText().toString();
            String h2 = tempo2.getText().toString();
            String h3 = tempo3.getText().toString();
            String h4 = tempo4.getText().toString();
            String h5 = tempo5.getText().toString();
            String h6 = tempo6.getText().toString();

            String m1 = tempo1.getText().toString();
            String m2 = tempo2.getText().toString();
            String m3 = tempo3.getText().toString();
            String m4 = tempo4.getText().toString();
            String m5 = tempo5.getText().toString();
            String m6 = tempo6.getText().toString();

            if (tempo1.getText().equals(vazio)){
                lh1=0; lm1=0;
            }else {
                h1 = h1.substring(0,2);
                m1 = m1.substring(3,5);
                lh1 = Long.parseLong(h1);
                lm1 = Long.parseLong(m1);
            }
            if (tempo2.getText().equals(vazio)){
                lh2=0; lm2=0;
            }else {
                h2 = h2.substring(0,2);
                m2 = m2.substring(3,5);
                lh2 = Long.parseLong(h2);
                lm2 = Long.parseLong(m2);
            }
            if (tempo3.getText().equals(vazio)){
                lh3=0; lm3=0;
            }else {
                h3 = h3.substring(0,2);
                m3 = m3.substring(3,5);
                lh3 = Long.parseLong(h3);
                lm3 = Long.parseLong(m3);
            }
            if (tempo4.getText().equals(vazio)){
                lh4=0; lm4=0;
            }else {
                h4 = h4.substring(0,2);
                m4 = m4.substring(3,5);
                lh4 = Long.parseLong(h4);
                lm4 = Long.parseLong(m4);
            }
            if (tempo5.getText().equals(vazio)){
                lh5=0; lm5=0;
            }else {
                h5 = h5.substring(0,2);
                m5 = m5.substring(3,5);
                lh5 = Long.parseLong(h5);
                lm5 = Long.parseLong(m5);
            }
            if (tempo6.getText().equals(vazio)){
                lh6=0; lm6=0;
            }else {
                h6 = h6.substring(0,2);
                m6 = m6.substring(3,5);
                lh6 = Long.parseLong(h6);
                lm6 = Long.parseLong(m6);
            }

            horasSoma = lh1+lh2+lh3+lh4+lh5+lh6;
            diffMinutes = lm1+lm2+lm3+lm4+lm5+lm6;

            if (diffMinutes>=1440){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1440;
            }else
            if (diffMinutes>=1360){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1380;
            }else
            if (diffMinutes>=1320){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1320;
            }else
            if (diffMinutes>=1260){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1260;
            }else
            if (diffMinutes>=1200){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1200;
            }else
            if (diffMinutes>=1140){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1140;
            }else
            if (diffMinutes>=1080){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1080;
            }else
            if (diffMinutes>=1020){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-1020;
            }else
            if (diffMinutes>=960){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-960;
            }else
            if (diffMinutes>=900){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-900;
            }else
            if (diffMinutes>=840){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-840;
            }else
            if (diffMinutes>=780){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-780;
            }else
            if (diffMinutes>=720){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-720;
            }else
            if (diffMinutes>=660){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-660;
            }else
            if (diffMinutes>=600){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-600;
            }else
            if (diffMinutes>=540){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-540;
            }else
            if (diffMinutes>=480){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-480;
            }else
            if (diffMinutes>=420){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-420;
            }else
            if (diffMinutes>=360){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-360;
            }else
            if (diffMinutes>=300){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-300;
            }else
            if (diffMinutes>=240){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-240;
            }else
            if (diffMinutes>=180){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-180;
            }else
            if (diffMinutes>=120){
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-120;

            }else if (diffMinutes>=60) {
                diffHours = diffMinutes/60;
                diffMinutes=diffMinutes-60;
            }

            horasSoma +=diffHours;

            String resultado = "", minutosDiferenca;

            if(diffMinutes<10){
                minutosDiferenca = "0"+ String.valueOf(diffMinutes);
            } else {
                minutosDiferenca = String.valueOf(diffMinutes);
            }
            resultado = horasSoma +":"+minutosDiferenca;

            gravarDeslTot(spTotalRef, resultado);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void atualizaViews() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        txt_fim_ref1.setText(settings.getString(spFimRef1, vazio));
        txt_fim_ref2.setText(settings.getString(spFimRef2, vazio));
        txt_fim_ref3.setText(settings.getString(spFimRef3, vazio));
        txt_fim_ref4.setText(settings.getString(spFimRef4, vazio));
        txt_fim_ref5.setText(settings.getString(spFimRef5, vazio));
        txt_fim_ref6.setText(settings.getString(spFimRef6, vazio));
        txt_tempo_ref1.setText(settings.getString(spTempoRef1, vazio));
        txt_tempo_ref2.setText(settings.getString(spTempoRef2, vazio));
        txt_tempo_ref3.setText(settings.getString(spTempoRef3, vazio));
        txt_tempo_ref4.setText(settings.getString(spTempoRef4, vazio));
        txt_tempo_ref5.setText(settings.getString(spTempoRef5, vazio));
        txt_tempo_ref6.setText(settings.getString(spTempoRef6, vazio));
        calcTotDesl();
    }
    private void atualizaCamposNovamente() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        txt_tempo_ref1.setText(settings.getString(spTempoRef1, vazio));
        txt_tempo_ref2.setText(settings.getString(spTempoRef2, vazio));
        txt_tempo_ref3.setText(settings.getString(spTempoRef3, vazio));
        txt_tempo_ref4.setText(settings.getString(spTempoRef4, vazio));
        txt_tempo_ref5.setText(settings.getString(spTempoRef5, vazio));
        txt_tempo_ref6.setText(settings.getString(spTempoRef6, vazio));

        totalDeslocamento(txt_tempo_ref1, txt_tempo_ref2, txt_tempo_ref3, txt_tempo_ref4, txt_tempo_ref5, txt_tempo_ref6);
    }
}
