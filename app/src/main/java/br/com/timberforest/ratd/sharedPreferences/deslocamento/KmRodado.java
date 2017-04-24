package br.com.timberforest.ratd.sharedPreferences.deslocamento;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dashboards.MainActivity;
import br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica.ListRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento;
import de.keyboardsurfer.android.widget.crouton.Configuration;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class KmRodado extends AppCompatActivity {

    public static final String PREFS_NAME = "sharedPreferencesDeslocamento";

    private Button btn_ini_kmRod1, btn_fim_kmRod1,btn_ini_kmRod2, btn_fim_kmRod2, btn_ini_kmRod3, btn_fim_kmRod3, btn_ini_kmRod4, btn_fim_kmRod4, btn_ini_kmRod5, btn_fim_kmRod5, btn_ini_kmRod6, btn_fim_kmRod6;
    private EditText edt_km_ini1, edt_km_fim1, edt_km_ini2, edt_km_fim2, edt_km_ini3, edt_km_fim3, edt_km_ini4, edt_km_fim4,  edt_km_ini5, edt_km_fim5, edt_km_ini6, edt_km_fim6;
    private TextView txt_kmRod1, txt_kmRod2, txt_kmRod3, txt_kmRod4, txt_kmRod5, txt_kmRod6;

    private String aux;
    private String vazio = "";

    long km1=0, km2=0, km3=0, km4=0, km5=0, km6=0, somaKm=0, kmDif=0;

    long comp1=0, comp2=0;

    final Style styleAlert = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.RED)
            .setConfiguration(new Configuration.Builder().setDuration(3000).build())
            .build();

    final Style styleConfirm = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.GREEN)
            .setConfiguration(new Configuration.Builder().setDuration(3000).build())
            .build();
    final Style styleInf = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.BLUE)
            .setConfiguration(new Configuration.Builder().setDuration(3000).build())
            .build();

    private String spIniKmRod1 = "ini_km1";
    private String spFimKmRod1 = "fim_km1";
    private String spIniKmRod2 = "ini_km2";
    private String spFimKmRod2 = "fim_km2";
    private String spIniKmRod3 = "ini_km3";
    private String spFimKmRod3 = "fim_km3";
    private String spIniKmRod4 = "ini_km4";
    private String spFimKmRod4 = "fim_km4";
    private String spIniKmRod5 = "ini_km5";
    private String spFimKmRod5 = "fim_km5";
    private String spIniKmRod6 = "ini_km6";
    private String spFimKmRod6 = "fim_km6";
    private String spTotKm1 = "tot_km1";
    private String spTotKm2 = "tot_km2";
    private String spTotKm3 = "tot_km3";
    private String spTotKm4 = "tot_km4";
    private String spTotKm5 = "tot_km5";
    private String spTotKm6 = "tot_km6";
    private String spTotalKmRodado = "tot_kmRodado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deslocamento_km_rodado);

        btn_fim_kmRod1 = (Button) findViewById(R.id.btn_fim_kmRod1);
        btn_fim_kmRod2 = (Button) findViewById(R.id.btn_fim_kmRod2);
        btn_fim_kmRod3 = (Button) findViewById(R.id.btn_fim_kmRod3);
        btn_fim_kmRod4 = (Button) findViewById(R.id.btn_fim_kmRod4);
        btn_fim_kmRod5 = (Button) findViewById(R.id.btn_fim_kmRod5);
        btn_fim_kmRod6 = (Button) findViewById(R.id.btn_fim_kmRod6);
        btn_ini_kmRod1 = (Button) findViewById(R.id.btn_ini_kmRod1);
        btn_ini_kmRod2 = (Button) findViewById(R.id.btn_ini_kmRod2);
        btn_ini_kmRod3 = (Button) findViewById(R.id.btn_ini_kmRod3);
        btn_ini_kmRod4 = (Button) findViewById(R.id.btn_ini_kmRod4);
        btn_ini_kmRod5 = (Button) findViewById(R.id.btn_ini_kmRod5);
        btn_ini_kmRod6 = (Button) findViewById(R.id.btn_ini_kmRod6);
        edt_km_fim1 = (EditText) findViewById(R.id.edt_km_fim1);
        edt_km_fim2 = (EditText) findViewById(R.id.edt_km_fim2);
        edt_km_fim3 = (EditText) findViewById(R.id.edt_km_fim3);
        edt_km_fim4 = (EditText) findViewById(R.id.edt_km_fim4);
        edt_km_fim5 = (EditText) findViewById(R.id.edt_km_fim5);
        edt_km_fim6 = (EditText) findViewById(R.id.edt_km_fim6);
        edt_km_ini1 = (EditText) findViewById(R.id.edt_km_ini1);
        edt_km_ini2 = (EditText) findViewById(R.id.edt_km_ini2);
        edt_km_ini3 = (EditText) findViewById(R.id.edt_km_ini3);
        edt_km_ini4 = (EditText) findViewById(R.id.edt_km_ini4);
        edt_km_ini5 = (EditText) findViewById(R.id.edt_km_ini5);
        edt_km_ini6 = (EditText) findViewById(R.id.edt_km_ini6);
        txt_kmRod1 = (TextView) findViewById(R.id.txt_kmRod1);
        txt_kmRod2 = (TextView) findViewById(R.id.txt_kmRod2);
        txt_kmRod3 = (TextView) findViewById(R.id.txt_kmRod3);
        txt_kmRod4 = (TextView) findViewById(R.id.txt_kmRod4);
        txt_kmRod5 = (TextView) findViewById(R.id.txt_kmRod5);
        txt_kmRod6 = (TextView) findViewById(R.id.txt_kmRod6);

        atualizarViews();
    }
    private void atualizarViews(){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        edt_km_ini1.setText(settings.getString(spIniKmRod1, vazio));
        edt_km_fim1.setText(settings.getString(spFimKmRod1, vazio));
        edt_km_ini2.setText(settings.getString(spIniKmRod2, vazio));
        edt_km_fim2.setText(settings.getString(spFimKmRod2, vazio));
        edt_km_ini3.setText(settings.getString(spIniKmRod3, vazio));
        edt_km_fim3.setText(settings.getString(spFimKmRod3, vazio));
        edt_km_ini4.setText(settings.getString(spIniKmRod4, vazio));
        edt_km_fim4.setText(settings.getString(spFimKmRod4, vazio));
        edt_km_ini5.setText(settings.getString(spIniKmRod5, vazio));
        edt_km_fim5.setText(settings.getString(spFimKmRod5, vazio));
        edt_km_ini6.setText(settings.getString(spIniKmRod6, vazio));
        edt_km_fim6.setText(settings.getString(spFimKmRod6, vazio));
        txt_kmRod1.setText(settings.getString(spTotKm1, vazio));
        txt_kmRod2.setText(settings.getString(spTotKm2, vazio));
        txt_kmRod3.setText(settings.getString(spTotKm3, vazio));
        txt_kmRod4.setText(settings.getString(spTotKm4, vazio));
        txt_kmRod5.setText(settings.getString(spTotKm5, vazio));
        txt_kmRod6.setText(settings.getString(spTotKm6, vazio));


        liberarBtn();
        bloquearViewsClicadas();
    }
    private void bloquearViewsClicadas(){
        //1
        if (edt_km_ini1.getText().toString().equals(vazio)){
        }else {
            edt_km_ini1.setEnabled(false); btn_ini_kmRod1.setEnabled(false);
        }
        if (edt_km_fim1.getText().toString().equals(vazio)){
        }else {
            edt_km_fim1.setEnabled(false); btn_fim_kmRod1.setEnabled(false);
        }

        //2
        if (edt_km_ini2.getText().toString().equals(vazio)){
        }else {
            edt_km_ini2.setEnabled(false); btn_ini_kmRod2.setEnabled(false);
        }
        if (edt_km_fim2.getText().toString().equals(vazio)){
        }else {
            edt_km_fim2.setEnabled(false); btn_fim_kmRod2.setEnabled(false);
        }

        //3
        if (edt_km_ini3.getText().toString().equals(vazio)){
        }else {
            edt_km_ini3.setEnabled(false); btn_ini_kmRod3.setEnabled(false);
        }
        if (edt_km_fim3.getText().toString().equals(vazio)){
        }else {
            edt_km_fim3.setEnabled(false); btn_fim_kmRod3.setEnabled(false);
        }

        //4
        if (edt_km_ini4.getText().toString().equals(vazio)){
        }else {
            edt_km_ini4.setEnabled(false); btn_ini_kmRod4.setEnabled(false);
        }
        if (edt_km_fim4.getText().toString().equals(vazio)){
        }else {
            edt_km_fim4.setEnabled(false); btn_fim_kmRod4.setEnabled(false);
        }

        //5
        if (edt_km_ini5.getText().toString().equals(vazio)){
        }else {
            edt_km_ini5.setEnabled(false); btn_ini_kmRod5.setEnabled(false);
        }
        if (edt_km_fim5.getText().toString().equals(vazio)){
        }else {
            edt_km_fim5.setEnabled(false); btn_fim_kmRod5.setEnabled(false);
        }

        //6
        if (edt_km_ini6.getText().toString().equals(vazio)){
        }else {
            edt_km_ini6.setEnabled(false); btn_ini_kmRod6.setEnabled(false);
        }
        if (edt_km_fim6.getText().toString().equals(vazio)){
        }else {
            edt_km_fim6.setEnabled(false); btn_fim_kmRod6.setEnabled(false);
        }
    }
    private void liberarBtn(){
        //1
        if (edt_km_ini1.getText().toString().equals(vazio)){ /*nada*/ }else { edt_km_ini1.setEnabled(false); btn_ini_kmRod1.setEnabled(false); }
        if (edt_km_ini1.getText().toString().equals(vazio)) {
            edt_km_fim1.setEnabled(false); btn_fim_kmRod1.setEnabled(false);
        }else{
            edt_km_fim1.setEnabled(true); btn_fim_kmRod1.setEnabled(true);
        }
        //2
        if (edt_km_fim1.getText().toString().equals(vazio)) {
            edt_km_ini2.setEnabled(false); btn_ini_kmRod2.setEnabled(false);
        }else{
            edt_km_ini2.setEnabled(true); btn_ini_kmRod2.setEnabled(true);
        }
        if (edt_km_ini2.getText().toString().equals(vazio)) {
            edt_km_fim2.setEnabled(false); btn_fim_kmRod2.setEnabled(false);
        }else {
            edt_km_fim2.setEnabled(true); btn_fim_kmRod2.setEnabled(true);
        }
        if (edt_km_fim2.getText().toString().equals(vazio)) {
            edt_km_ini3.setEnabled(false); btn_ini_kmRod3.setEnabled(false);
        }else {
            edt_km_ini3.setEnabled(true); btn_ini_kmRod3.setEnabled(true);
        }
        if (edt_km_ini3.getText().toString().equals(vazio)) {
            edt_km_fim3.setEnabled(false); btn_fim_kmRod3.setEnabled(false);
        }else {
            edt_km_fim3.setEnabled(true); btn_fim_kmRod3.setEnabled(true);
        }
        if (edt_km_fim3.getText().toString().equals(vazio)) {
            edt_km_ini4.setEnabled(false); btn_ini_kmRod4.setEnabled(false);
        }else {
            edt_km_ini4.setEnabled(true); btn_ini_kmRod4.setEnabled(true);
        }
        if (edt_km_ini4.getText().toString().equals(vazio)) {
            edt_km_fim4.setEnabled(false); btn_fim_kmRod4.setEnabled(false);
        }else {
            edt_km_fim4.setEnabled(true); btn_fim_kmRod4.setEnabled(true);
        }
        if (edt_km_fim4.getText().toString().equals(vazio)) {
            edt_km_ini5.setEnabled(false); btn_ini_kmRod5.setEnabled(false);
        }else {
            edt_km_ini5.setEnabled(true); btn_ini_kmRod5.setEnabled(true);
        }
        if (edt_km_ini5.getText().toString().equals(vazio)) {
            edt_km_fim5.setEnabled(false); btn_fim_kmRod5.setEnabled(false);
        }else {
            edt_km_fim5.setEnabled(true); btn_fim_kmRod5.setEnabled(true);
        }
        if (edt_km_fim5.getText().toString().equals(vazio)) {
            edt_km_ini6.setEnabled(false); btn_ini_kmRod6.setEnabled(false);
        }else {
            edt_km_ini6.setEnabled(true); btn_ini_kmRod6.setEnabled(true);
        }
        if (edt_km_ini6.getText().toString().equals(vazio)){
            edt_km_fim6.setEnabled(false); btn_fim_kmRod6.setEnabled(false);
        }else {
            edt_km_fim6.setEnabled(true); btn_fim_kmRod6.setEnabled(true);
        }

    }
    public void msgIni(String km){
        Toast.makeText(getApplicationContext(), "km inicial gravado com sucesso: "+km, Toast.LENGTH_SHORT).show();
    }
    public void msgFim(String km){
        Toast.makeText(getApplicationContext(), "km final gravado com sucesso: "+km, Toast.LENGTH_SHORT).show();
    }
    public void gravarKmDesl(TextView txt_kmRod1, TextView txt_kmRod2, TextView txt_kmRod3, TextView txt_kmRod4, TextView txt_kmRod5, TextView txt_kmRod6){

        String st1 = txt_kmRod1.getText().toString();
        String st2 = txt_kmRod2.getText().toString();
        String st3 = txt_kmRod3.getText().toString();
        String st4 = txt_kmRod4.getText().toString();
        String st5 = txt_kmRod5.getText().toString();
        String st6 = txt_kmRod6.getText().toString();

        if(st1.equals(vazio)){
        }else km1 = Long.parseLong(st1);
        if(st2.equals(vazio)){
        }else km2 = Long.parseLong(st2);
        if(st3.equals(vazio)){
        }else km3 = Long.parseLong(st3);
        if(st4.equals(vazio)){
        }else km4 = Long.parseLong(st4);
        if(st5.equals(vazio)){
        }else km5 = Long.parseLong(st5);
        if(st6.equals(vazio)){
        }else km6 = Long.parseLong(st6);

        somaKm= km1+km2+km3+km4+km5+km6;

        gravarKmTot(somaKm);
    }
    public void goToDeslc(){
        Intent it = new Intent(KmRodado.this, DeslocamentoActivity.class);
        startActivity(it);
        finish();
    }
    public void gravarKmTot(long total){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        String aux = String.valueOf(total);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(spTotalKmRodado, aux);
        editor.commit();
        Log.i("info","Total deslocado: "+aux);
        goToDeslc();
    }
    public void gravarKmDif(long total, String chaveValorTotal){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        String aux = String.valueOf(total);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValorTotal, aux);
        editor.commit();
        atualizarViewsFinal();
    }
    public void gravarKmIni(String chaveValor, String total){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, total);
        editor.commit();
        msgIni(aux);
        goToDeslc();

    }
    public void gravarKmFim(String chaveValor, long total){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        String aux = String.valueOf(total);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, aux);
        editor.commit();
        msgFim(aux);
    }
    public void continuaMetodo(EditText edt1, EditText edt2, String chaveValor, String chaveValorTotal){
        long aux1 = Long.parseLong(edt1.getText().toString());
        long aux2 = Long.parseLong(edt2.getText().toString());

        if (aux2 < aux1) {
            Crouton.makeText(KmRodado.this, "Km final informado é menor que o Km inicial !", styleAlert).show();
        } else if (aux1 == aux2) {
            Crouton.makeText(KmRodado.this, "Km final informado é igual ao Km inicial !", styleAlert).show();
        } else {
            kmDif=aux2-aux1;
            gravarKmFim(chaveValor, aux2);
            gravarKmDif(kmDif, chaveValorTotal);
            Crouton.makeText(KmRodado.this, "Km final gravado com sucesso ! " + edt2.getText().toString(), styleConfirm).show();
        }
    }
    public void selecionarOpcao(View view){
        switch (view.getId()) {
            // 1
            case R.id.btn_ini_kmRod1:
                aux = edt_km_ini1.getText().toString();
                if (aux.equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    comp1 = Long.parseLong(aux);
                    if (comp1!= 0){
                        gravarKmIni(spIniKmRod1, aux);
                    }
                }
                break;
            case R.id.btn_fim_kmRod1:

                if (edt_km_fim1.getText().toString().equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    continuaMetodo(edt_km_ini1, edt_km_fim1, spFimKmRod1, spTotKm1);
                }
                break;
            // 2
            case R.id.btn_ini_kmRod2:
                aux = edt_km_ini2.getText().toString();
                if (aux.equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    comp1 = Long.parseLong(aux);
                    if (comp1!= 0){
                        gravarKmIni(spIniKmRod2, aux);
                    }
                }
                break;
            case R.id.btn_fim_kmRod2:
                if (edt_km_fim2.getText().toString().equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    continuaMetodo(edt_km_ini2, edt_km_fim2, spFimKmRod2, spTotKm2);
                }
                break;
            // 3
            case R.id.btn_ini_kmRod3:
                aux = edt_km_ini3.getText().toString();
                if (aux.equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    comp1 = Long.parseLong(aux);
                    if (comp1!= 0){
                        gravarKmIni(spIniKmRod3, aux);
                    }
                }
                break;
            case R.id.btn_fim_kmRod3:
                if (edt_km_fim3.getText().toString().equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    continuaMetodo(edt_km_ini3, edt_km_fim3, spFimKmRod3, spTotKm3);
                }
                break;
            // 4
            case R.id.btn_ini_kmRod4:
                aux = edt_km_ini4.getText().toString();
                if (aux.equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    comp1 = Long.parseLong(aux);
                    if (comp1!= 0){
                        gravarKmIni(spIniKmRod4, aux);
                    }
                }
                break;
            case R.id.btn_fim_kmRod4:
                if (edt_km_fim4.getText().toString().equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    continuaMetodo(edt_km_ini4, edt_km_fim4, spFimKmRod4, spTotKm4);
                }
                break;
            // 5
            case R.id.btn_ini_kmRod5:
                aux = edt_km_ini5.getText().toString();
                if (aux.equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    comp1 = Long.parseLong(aux);
                    if (comp1!= 0){
                        gravarKmIni(spIniKmRod5, aux);
                    }
                }
                break;
            case R.id.btn_fim_kmRod5:
                if (edt_km_fim5.getText().toString().equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    continuaMetodo(edt_km_ini5, edt_km_fim5, spFimKmRod5, spTotKm5);
                }
                break;
            // 6
            case R.id.btn_ini_kmRod6:
                aux = edt_km_ini6.getText().toString();
                if (aux.equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    comp1 = Long.parseLong(aux);
                    if (comp1!= 0){
                        gravarKmIni(spIniKmRod6, aux);
                    }
                }
                break;
            case R.id.btn_fim_kmRod6:
                if (edt_km_fim6.getText().toString().equals(vazio)){
                    Crouton.makeText(KmRodado.this, "Informe um valor válido ! ", styleAlert).show();
                }else {
                    continuaMetodo(edt_km_ini6, edt_km_fim6, spFimKmRod6, spTotKm6);
                }
                break;
        }
    }

    private void atualizarViewsFinal(){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        txt_kmRod1.setText(settings.getString(spTotKm1, vazio));
        txt_kmRod2.setText(settings.getString(spTotKm2, vazio));
        txt_kmRod3.setText(settings.getString(spTotKm3, vazio));
        txt_kmRod4.setText(settings.getString(spTotKm4, vazio));
        txt_kmRod5.setText(settings.getString(spTotKm5, vazio));
        txt_kmRod6.setText(settings.getString(spTotKm6, vazio));

        gravarKmDesl(txt_kmRod1, txt_kmRod2, txt_kmRod3, txt_kmRod4, txt_kmRod5, txt_kmRod6);
    }
}