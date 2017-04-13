package br.com.timberforest.ratd.sharedPreferences.deslocamento;

import android.content.Intent;
import android.content.SharedPreferences;
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

public class DeslocamentoActivity extends AppCompatActivity{

    public static final String PREFS_NAME = "sharedPreferencesDeslocamento";

    private Button btn_ini_desl1, btn_fim_desl1, btn_ini_desl2, btn_fim_desl2, btn_ini_desl3, btn_fim_desl3,btn_ini_desl4,
            btn_fim_desl4, btn_ini_desl5, btn_fim_desl5, btn_ini_desl6, btn_fim_desl6;
    private TextView txt_ini_desl1, txt_fim_desl1, txt_ini_desl2, txt_fim_desl2, txt_ini_desl3, txt_fim_desl3, txt_ini_desl4, txt_fim_desl4,
            txt_ini_desl5, txt_fim_desl5, txt_ini_desl6, txt_fim_desl6;

    private TextView txt_tempo_desl1, txt_tempo_desl2, txt_tempo_desl3, txt_tempo_desl4, txt_tempo_desl5, txt_tempo_desl6;

    private String spIniDesl1 = "ini_desl1";
    private String spFimDesl1 = "fim_desl1";
    private String spIniDesl2 = "ini_desl2";
    private String spFimDesl2 = "fim_desl2";
    private String spIniDesl3 = "ini_desl3";
    private String spFimDesl3 = "fim_desl3";
    private String spIniDesl4 = "ini_desl4";
    private String spFimDesl4 = "fim_desl4";
    private String spIniDesl5 = "ini_desl5";
    private String spFimDesl5 = "fim_desl5";
    private String spIniDesl6 = "ini_desl6";
    private String spFimDesl6 = "fim_desl6";
    private String spTempoDesl1 = "tempo_desl1";
    private String spTempoDesl2 = "tempo_desl2";
    private String spTempoDesl3 = "tempo_desl3";
    private String spTempoDesl4 = "tempo_desl4";
    private String spTempoDesl5 = "tempo_desl5";
    private String spTempoDesl6 = "tempo_desl6";
    private String spTotalDeslocamento = "tempo_deslocamento";

    long lh1 =0, lh2 =0, lh3 =0, lh4 =0, lh5 =0, lh6 =0, horasSoma =0, diffHours =0;
    long lm1 =0, lm2 =0, lm3 =0, lm4 =0, lm5 =0, lm6 =0, diffMinutes =0;


    private String msgIniDesl = "Inicio do Deslocamento: ";
    private String msgSucesso = " Gravado com sucesso !";
    private String msgFimDesl = "Fim do Deslocamento: ";
    private String DataFormat = "HH:mm";
    private String vazio = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deslocamento);

        btn_ini_desl1 = (Button) findViewById(R.id.btn_ini_desl1);
        btn_fim_desl1 = (Button) findViewById(R.id.btn_fim_desl1);
        btn_ini_desl2 = (Button) findViewById(R.id.btn_ini_desl2);
        btn_fim_desl2 = (Button) findViewById(R.id.btn_fim_desl2);
        btn_ini_desl3 = (Button) findViewById(R.id.btn_ini_desl3);
        btn_fim_desl3 = (Button) findViewById(R.id.btn_fim_desl3);
        btn_ini_desl4 = (Button) findViewById(R.id.btn_ini_desl4);
        btn_fim_desl4 = (Button) findViewById(R.id.btn_fim_desl4);
        btn_ini_desl5 = (Button) findViewById(R.id.btn_ini_desl5);
        btn_fim_desl5 = (Button) findViewById(R.id.btn_fim_desl5);
        btn_ini_desl6 = (Button) findViewById(R.id.btn_ini_desl6);
        btn_fim_desl6 = (Button) findViewById(R.id.btn_fim_desl6);
        txt_ini_desl1 = (TextView) findViewById(R.id.txt_ini_desl1);
        txt_fim_desl1 = (TextView) findViewById(R.id.txt_fim_desl1);
        txt_ini_desl2 = (TextView) findViewById(R.id.txt_ini_desl2);
        txt_fim_desl2 = (TextView) findViewById(R.id.txt_fim_desl2);
        txt_ini_desl3 = (TextView) findViewById(R.id.txt_ini_desl3);
        txt_fim_desl3 = (TextView) findViewById(R.id.txt_fim_desl3);
        txt_ini_desl4 = (TextView) findViewById(R.id.txt_ini_desl4);
        txt_fim_desl4 = (TextView) findViewById(R.id.txt_fim_desl4);
        txt_ini_desl5 = (TextView) findViewById(R.id.txt_ini_desl5);
        txt_fim_desl5 = (TextView) findViewById(R.id.txt_fim_desl5);
        txt_ini_desl6 = (TextView) findViewById(R.id.txt_ini_desl6);
        txt_fim_desl6 = (TextView) findViewById(R.id.txt_fim_desl6);

        txt_tempo_desl1 = (TextView) findViewById(R.id.txt_tempo_desl1);
        txt_tempo_desl2 = (TextView) findViewById(R.id.txt_tempo_desl2);
        txt_tempo_desl3 = (TextView) findViewById(R.id.txt_tempo_desl3);
        txt_tempo_desl4 = (TextView) findViewById(R.id.txt_tempo_desl4);
        txt_tempo_desl5 = (TextView) findViewById(R.id.txt_tempo_desl5);
        txt_tempo_desl6 = (TextView) findViewById(R.id.txt_tempo_desl6);

        atualizaCampos();
    }
    public void goToMain(){
        Intent intent = new Intent(DeslocamentoActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void msgIni(String data){
        Toast.makeText(getApplicationContext(), msgIniDesl+data+msgSucesso, Toast.LENGTH_SHORT).show();
    }
    public void msgFim(String data){
        Toast.makeText(getApplicationContext(), msgFimDesl+data+msgSucesso, Toast.LENGTH_SHORT).show();
    }
    public void gravarDeslIni(String chaveValor){
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
    public void gravarDeslFim(String chaveValor){
        //recupera hora atual
        SimpleDateFormat sdf = new SimpleDateFormat(DataFormat);
        Date hora = Calendar.getInstance().getTime();
        final String dataFormatada = sdf.format(hora);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, dataFormatada);
        editor.commit();
        msgFim(dataFormatada);
        calcTotDesl();
        goToMain();

    }
    public void gravarDeslTot(String chaveValor, String total){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, total);
        editor.commit();
    }
    public void deslocamentoClick(View view){
        switch (view.getId()) {
            // 1
            case R.id.btn_ini_desl1:
                gravarDeslIni(spIniDesl1);
                break;
            case R.id.btn_fim_desl1:
                gravarDeslFim(spFimDesl1);
                break;
            // 2
            case R.id.btn_ini_desl2:
                gravarDeslIni(spIniDesl2);
                break;
            case R.id.btn_fim_desl2:
                gravarDeslFim(spFimDesl2);
                break;
            //3
            case R.id.btn_ini_desl3:
                gravarDeslIni(spIniDesl3);
                break;
            case R.id.btn_fim_desl3:
                gravarDeslFim(spFimDesl3);
                break;
            //4
            case R.id.btn_ini_desl4:
                gravarDeslIni(spIniDesl4);
                break;
            case R.id.btn_fim_desl4:
                gravarDeslFim(spFimDesl4);
                break;
            //5
            case R.id.btn_ini_desl5:
                gravarDeslIni(spIniDesl5);
                break;
            case R.id.btn_fim_desl5:
                gravarDeslFim(spFimDesl5);
                break;
            //6
            case R.id.btn_ini_desl6:
                gravarDeslIni(spIniDesl6);
                break;
            case R.id.btn_fim_desl6:
                gravarDeslFim(spFimDesl6);
                break;
        }
    }
    private void atualizaCampos() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        txt_ini_desl1.setText(settings.getString(spIniDesl1, vazio));
        txt_fim_desl1.setText(settings.getString(spFimDesl1, vazio));
        txt_ini_desl2.setText(settings.getString(spIniDesl2, vazio));
        txt_fim_desl2.setText(settings.getString(spFimDesl2, vazio));
        txt_ini_desl3.setText(settings.getString(spIniDesl3, vazio));
        txt_fim_desl3.setText(settings.getString(spFimDesl3, vazio));
        txt_ini_desl4.setText(settings.getString(spIniDesl4, vazio));
        txt_fim_desl4.setText(settings.getString(spFimDesl4, vazio));
        txt_ini_desl5.setText(settings.getString(spIniDesl5, vazio));
        txt_fim_desl5.setText(settings.getString(spFimDesl5, vazio));
        txt_ini_desl6.setText(settings.getString(spIniDesl6, vazio));
        txt_fim_desl6.setText(settings.getString(spFimDesl6, vazio));

        txt_tempo_desl1.setText(settings.getString(spTempoDesl1, vazio));
        txt_tempo_desl2.setText(settings.getString(spTempoDesl2, vazio));
        txt_tempo_desl3.setText(settings.getString(spTempoDesl3, vazio));
        txt_tempo_desl4.setText(settings.getString(spTempoDesl4, vazio));
        txt_tempo_desl5.setText(settings.getString(spTempoDesl5, vazio));
        txt_tempo_desl6.setText(settings.getString(spTempoDesl6, vazio));

        verAltBtnIni();
    }
    private void verAltBtnIni() {
        if (txt_fim_desl1.getText().toString().equals(vazio)){
            btn_ini_desl2.setEnabled(false);
        } else {
            btn_ini_desl2.setEnabled(true);
        }
        if (txt_fim_desl2.getText().toString().equals(vazio)){
            btn_ini_desl3.setEnabled(false);
        } else {
            btn_ini_desl3.setEnabled(true);
        }
        if (txt_fim_desl3.getText().toString().equals(vazio)){
            btn_ini_desl4.setEnabled(false);
        } else {
            btn_ini_desl4.setEnabled(true);
        }
        if (txt_fim_desl4.getText().toString().equals(vazio)){
            btn_ini_desl5.setEnabled(false);
        } else {
            btn_ini_desl5.setEnabled(true);
        }
        if (txt_fim_desl5.getText().toString().equals(vazio)){
            btn_ini_desl6.setEnabled(false);
        } else {
            btn_ini_desl6.setEnabled(true);
        }

        verAltBtnFim();
    }
    public void verAltBtnFim(){
        if (txt_ini_desl1.getText().toString().equals(vazio)){
            btn_fim_desl1.setEnabled(false);
        } else {
            btn_fim_desl1.setEnabled(true);
        }

        if (txt_ini_desl2.getText().toString().equals(vazio)){
            btn_fim_desl2.setEnabled(false);
        } else {
            btn_fim_desl2.setEnabled(true);
        }

        if (txt_ini_desl3.getText().toString().equals(vazio)){
            btn_fim_desl3.setEnabled(false);
        } else {
            btn_fim_desl3.setEnabled(true);
        }

        if (txt_ini_desl4.getText().toString().equals(vazio)){
            btn_fim_desl4.setEnabled(false);
        } else {
            btn_fim_desl4.setEnabled(true);
        }

        if (txt_ini_desl5.getText().toString().equals(vazio)){
            btn_fim_desl5.setEnabled(false);
        } else {
            btn_fim_desl5.setEnabled(true);
        }

        if (txt_ini_desl6.getText().toString().equals(vazio)){
            btn_fim_desl6.setEnabled(false);
        } else {
            btn_fim_desl6.setEnabled(true);
        }
        botaoClicado();
    }
    public void botaoClicado(){
        //1
        if (txt_ini_desl1.getText().toString().equals(vazio)){
        } else {
            btn_ini_desl1.setEnabled(false);
        }
        if (txt_fim_desl1.getText().toString().equals(vazio)){
        } else {
            btn_fim_desl1.setEnabled(false);
        }
        //2
        if (txt_ini_desl2.getText().toString().equals(vazio)){
        } else {
            btn_ini_desl2.setEnabled(false);
        }
        if (txt_fim_desl2.getText().toString().equals(vazio)){
        } else {
            btn_fim_desl2.setEnabled(false);
        }
        //3
        if (txt_ini_desl3.getText().toString().equals(vazio)){
        } else {
            btn_ini_desl3.setEnabled(false);
        }
        if (txt_fim_desl3.getText().toString().equals(vazio)){
        } else {
            btn_fim_desl3.setEnabled(false);
        }
        //4
        if (txt_ini_desl4.getText().toString().equals(vazio)){
        } else {
            btn_ini_desl4.setEnabled(false);
        }
        if (txt_fim_desl4.getText().toString().equals(vazio)){
        } else {
            btn_fim_desl4.setEnabled(false);
        }
        //5
        if (txt_ini_desl5.getText().toString().equals(vazio)){
        } else {
            btn_ini_desl5.setEnabled(false);
        }
        if (txt_fim_desl5.getText().toString().equals(vazio)){
        } else {
            btn_fim_desl5.setEnabled(false);
        }
        //6
        if (txt_ini_desl6.getText().toString().equals(vazio)){
        } else {
            btn_ini_desl6.setEnabled(false);
        }
        if (txt_fim_desl6.getText().toString().equals(vazio)){
        } else {
            btn_fim_desl6.setEnabled(false);
        }

        calcTotDesl();
    }
    public void calcTotDesl(){
        //1
        if (txt_ini_desl1.getText().toString().equals("") && txt_fim_desl1.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_desl1, txt_fim_desl1, spTempoDesl1);
        }
        //2
        if (txt_ini_desl2.getText().toString().equals("") && txt_fim_desl2.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_desl2, txt_fim_desl2, spTempoDesl2);
        }
        //3
        if (txt_ini_desl3.getText().toString().equals("") && txt_fim_desl3.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_desl3, txt_fim_desl3, spTempoDesl3);
        }
        //4
        if (txt_ini_desl4.getText().toString().equals("") && txt_fim_desl4.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_desl4, txt_fim_desl4, spTempoDesl4);
        }
        //5
        if (txt_ini_desl5.getText().toString().equals("") && txt_fim_desl5.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_desl5, txt_fim_desl5, spTempoDesl5);
        }
        //6
        if (txt_ini_desl6.getText().toString().equals("") && txt_fim_desl6.getText().toString().equals("")){
        }else {
            comparaHora(txt_ini_desl6, txt_fim_desl6, spTempoDesl6);
        }
    }
    public void comparaHora(TextView campoIni, TextView CampoFim, String chaveValorSP){

        try {
            String horaIni = campoIni.getText().toString();
            String horaFim = CampoFim.getText().toString();

            Date ini = new SimpleDateFormat("HH:mm").parse(horaIni);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(ini);

            Date fim = new SimpleDateFormat("HH:mm").parse(horaFim);
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

            horaDiferenca = String.valueOf(diffHours);
            horaDiferenca = horaDiferenca.replace(".", "");
            if(diffMinutes<10){
                minutosDiferenca = "0"+ String.valueOf(diffMinutes);
            } else {
                minutosDiferenca = String.valueOf(diffMinutes);
            }
//            minutosDiferenca = String.valueOf(diffMinutes);
            String diferenca = horaDiferenca+":"+minutosDiferenca;
            Log.i("info", "comparaHora - Intervalo :"+diferenca);
            gravarDeslTot(chaveValorSP, diferenca);
            Log.i("info", "***********************************");
        }catch (Exception e){
            e.printStackTrace();
        }
        atualizaCamposNovamente();
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

            if(tempo1.getText().equals(vazio)){
            }else {
                h1 = h1.substring(0,1);
                m1 = m1.substring(2,4);
                lh1 = Long.parseLong(h1);
                lm1 = Long.parseLong(m1);
            }
            if (tempo2.getText().equals(vazio)){
            }else {
                h2 = h2.substring(0,1);
                m2 = m2.substring(2,4);
                lh2 = Long.parseLong(h2);
                lm2 = Long.parseLong(m2);
            }
            if (tempo3.getText().equals(vazio)){
            }else {
                h3 = h3.substring(0,1);
                m3 = m3.substring(2,4);
                lh3 = Long.parseLong(h3);
                lm3 = Long.parseLong(m3);
            }
            if (tempo4.getText().equals(vazio)){
            }else {
                h4 = h4.substring(0,1);
                m4 = m4.substring(2,4);
                lh4 = Long.parseLong(h4);
                lm4 = Long.parseLong(m4);
            }
            if (tempo5.getText().equals(vazio)){
            }else {
                h5 = h5.substring(0,1);
                m5 = m5.substring(2,4);
                lh5 = Long.parseLong(h5);
                lm5 = Long.parseLong(m5);
            }
            if (tempo6.getText().equals(vazio)){
            }else {
                h6 = h6.substring(0,1);
                m6 = m6.substring(2,4);
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
            if (horasSoma<10) resultado = "0"+String.valueOf(horasSoma);

            if(diffMinutes<10){
                minutosDiferenca = "0"+ String.valueOf(diffMinutes);
            } else {
                minutosDiferenca = String.valueOf(diffMinutes);
            }
            resultado = horasSoma +":"+minutosDiferenca;

            gravarDeslTot(spTotalDeslocamento, resultado);
            Log.i("info", "*---*---*---*---*---*---*---*---*");
            Log.i("info", "Total deslocamento: "+resultado);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void atualizaCamposNovamente() {

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        txt_ini_desl1.setText(settings.getString(spIniDesl1, vazio));
        txt_fim_desl1.setText(settings.getString(spFimDesl1, vazio));
        txt_ini_desl2.setText(settings.getString(spIniDesl2, vazio));
        txt_fim_desl2.setText(settings.getString(spFimDesl2, vazio));
        txt_ini_desl3.setText(settings.getString(spIniDesl3, vazio));
        txt_fim_desl3.setText(settings.getString(spFimDesl3, vazio));
        txt_ini_desl4.setText(settings.getString(spIniDesl4, vazio));
        txt_fim_desl4.setText(settings.getString(spFimDesl4, vazio));
        txt_ini_desl5.setText(settings.getString(spIniDesl5, vazio));
        txt_fim_desl5.setText(settings.getString(spFimDesl5, vazio));
        txt_ini_desl6.setText(settings.getString(spIniDesl6, vazio));
        txt_fim_desl6.setText(settings.getString(spFimDesl6, vazio));
        txt_tempo_desl1.setText(settings.getString(spTempoDesl1, vazio));
        txt_tempo_desl2.setText(settings.getString(spTempoDesl2, vazio));
        txt_tempo_desl3.setText(settings.getString(spTempoDesl3, vazio));
        txt_tempo_desl4.setText(settings.getString(spTempoDesl4, vazio));
        txt_tempo_desl5.setText(settings.getString(spTempoDesl5, vazio));
        txt_tempo_desl6.setText(settings.getString(spTempoDesl6, vazio));

        totalDeslocamento(txt_tempo_desl1, txt_tempo_desl2, txt_tempo_desl3, txt_tempo_desl4, txt_tempo_desl5, txt_tempo_desl6);
    }

}