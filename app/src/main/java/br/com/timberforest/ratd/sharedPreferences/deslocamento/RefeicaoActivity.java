package br.com.timberforest.ratd.sharedPreferences.deslocamento;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    public static final String PREFS_NAME = "sharedPreferencesRefeicao";

    private Button btn_ini_ref1,btn_fim_ref1,btn_ini_ref2,btn_fim_ref2,btn_ini_ref3,btn_fim_ref3,btn_ini_ref4,
            btn_fim_ref4,btn_ini_ref5, btn_fim_ref5,btn_ini_ref6,btn_fim_ref6;

    private TextView txt_ini_ref1,txt_fim_ref1,txt_ini_ref2,txt_fim_ref2,txt_ini_ref3,txt_fim_ref3,txt_ini_ref4,
            txt_fim_ref4,txt_ini_ref5,txt_fim_ref5,txt_ini_ref6,txt_fim_ref6;

    final Style styleAlert = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.RED)
            .setConfiguration(new Configuration.Builder().setDuration(4000).build())
            .build();

    final Style styleConfirm = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.GREEN)
            .setConfiguration(new Configuration.Builder().setDuration(4000).build())
            .build();
    final Style styleInf = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.BLUE)
            .setConfiguration(new Configuration.Builder().setDuration(4000).build())
            .build();

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

    private String msgIniRef = "Inicio da Refeição: ";
    private String msgSucesso = " Gravado com sucesso !";
    private String msgFimRef = "Fim da Refeição: ";

    private String vazio = "";

    //recupera hora atual
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm" + " - "+ "dd/MM/yyyy");
    Date hora = Calendar.getInstance().getTime();
    final String dataFormatada = sdf.format(hora);

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
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, dataFormatada);
        editor.commit();
        msgIni(dataFormatada);
        goToMain();

    }
    public void gravarRefFim(String chaveValor){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, dataFormatada);
        editor.commit();
        msgFim(dataFormatada);
        goToMain();

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
}
