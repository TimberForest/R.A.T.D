package br.com.timberforest.ratd.sharedPreferences.deslocamento;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dashboards.MainActivity;

public class TrabalhoActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "sharedPreferencesServico";

    private Button btn_ini_serv1,btn_fim_serv1,btn_ini_serv2,btn_fim_serv2,btn_ini_serv3,btn_fim_serv3,btn_ini_serv4,
            btn_fim_serv4,btn_ini_serv5, btn_fim_serv5,btn_ini_serv6,btn_fim_serv6;
    private TextView txt_ini_serv1,txt_fim_serv1,txt_ini_serv2,txt_fim_serv2,txt_ini_serv3,txt_fim_serv3,txt_ini_serv4,
            txt_fim_serv4,txt_ini_serv5,txt_fim_serv5,txt_ini_serv6,txt_fim_serv6;

    private String spIniServ1 = "ini_serv1";
    private String spFimServ1 = "fim_serv1";
    private String spIniServ2 = "ini_serv2";
    private String spFimServ2 = "fim_serv2";
    private String spIniServ3 = "ini_serv3";
    private String spFimServ3 = "fim_serv3";
    private String spIniServ4 = "ini_serv4";
    private String spFimServ4 = "fim_serv4";
    private String spIniServ5 = "ini_serv5";
    private String spFimServ5 = "fim_serv5";
    private String spIniServ6 = "ini_serv6";
    private String spFimServ6 = "fim_serv6";

    private String msgIniServ = "Inicio do Serviço: ";
    private String msgSucesso = " Gravado com sucesso !";
    private String msgFimServ = "Fim do Serviço: ";

    private String vazio = "";


    //recupera hora atual
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm" + " - "+ "dd/MM/yyyy");
    Date hora = Calendar.getInstance().getTime();
    final String dataFormatada = sdf.format(hora);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deslocamento_trabalho);

        btn_ini_serv1 = (Button) findViewById(R.id.btn_ini_serv1);
        btn_fim_serv1 = (Button) findViewById(R.id.btn_fim_serv1);
        btn_ini_serv2 = (Button) findViewById(R.id.btn_ini_serv2);
        btn_fim_serv2 = (Button) findViewById(R.id.btn_fim_serv2);
        btn_ini_serv3 = (Button) findViewById(R.id.btn_ini_serv3);
        btn_fim_serv3 = (Button) findViewById(R.id.btn_fim_serv3);
        btn_ini_serv4 = (Button) findViewById(R.id.btn_ini_serv4);
        btn_fim_serv4 = (Button) findViewById(R.id.btn_fim_serv4);
        btn_ini_serv5 = (Button) findViewById(R.id.btn_ini_serv5);
        btn_fim_serv5 = (Button) findViewById(R.id.btn_fim_serv5);
        btn_ini_serv6 = (Button) findViewById(R.id.btn_ini_serv6);
        btn_fim_serv6 = (Button) findViewById(R.id.btn_fim_serv6);
        txt_ini_serv1 = (TextView) findViewById(R.id.txt_ini_serv1);
        txt_fim_serv1 = (TextView) findViewById(R.id.txt_fim_serv1);
        txt_ini_serv2 = (TextView) findViewById(R.id.txt_ini_serv2);
        txt_fim_serv2 = (TextView) findViewById(R.id.txt_fim_serv2);
        txt_ini_serv3 = (TextView) findViewById(R.id.txt_ini_serv3);
        txt_fim_serv3 = (TextView) findViewById(R.id.txt_fim_serv3);
        txt_ini_serv4 = (TextView) findViewById(R.id.txt_ini_serv4);
        txt_fim_serv4 = (TextView) findViewById(R.id.txt_fim_serv4);
        txt_ini_serv5 = (TextView) findViewById(R.id.txt_ini_serv5);
        txt_fim_serv5 = (TextView) findViewById(R.id.txt_fim_serv5);
        txt_ini_serv6 = (TextView) findViewById(R.id.txt_ini_serv6);
        txt_fim_serv6 = (TextView) findViewById(R.id.txt_fim_serv6);

        atualizaCampos();
    }

    public void goToMain(){
        Intent intent = new Intent(TrabalhoActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void msgIni(String data){
        Toast.makeText(getApplicationContext(), msgIniServ+data+msgSucesso, Toast.LENGTH_SHORT).show();
    }
    public void msgFim(String data){
        Toast.makeText(getApplicationContext(), msgFimServ+data+msgSucesso, Toast.LENGTH_SHORT).show();
    }
    public void gravarServIni(String chaveValor){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(chaveValor, dataFormatada);
        editor.commit();
        msgIni(dataFormatada);
        goToMain();

    }
    public void gravarServFim(String chaveValor){
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
            case R.id.btn_ini_serv1:
                gravarServIni(spIniServ1);
                break;
            case R.id.btn_fim_serv1:
                gravarServFim(spFimServ1);
                break;
            // 2
            case R.id.btn_ini_serv2:
                gravarServIni(spIniServ2);
                break;
            case R.id.btn_fim_serv2:
                gravarServFim(spFimServ2);
                break;
            //3
            case R.id.btn_ini_serv3:
                gravarServIni(spIniServ3);
                break;
            case R.id.btn_fim_serv3:
                gravarServFim(spFimServ3);
                break;
            //4
            case R.id.btn_ini_serv4:
                gravarServIni(spIniServ4);
                break;
            case R.id.btn_fim_serv4:
                gravarServFim(spFimServ4);
                break;
            //5
            case R.id.btn_ini_serv5:
                gravarServIni(spIniServ5);
                break;
            case R.id.btn_fim_serv5:
                gravarServFim(spFimServ5);
                break;
            //6
            case R.id.btn_ini_serv6:
                gravarServIni(spIniServ6);
                break;
            case R.id.btn_fim_serv6:
                gravarServFim(spFimServ6);
                break;
        }
    }
    private void atualizaCampos() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        txt_ini_serv1.setText(settings.getString(spIniServ1, vazio));
        txt_fim_serv1.setText(settings.getString(spFimServ1, vazio));
        txt_ini_serv2.setText(settings.getString(spIniServ2, vazio));
        txt_fim_serv2.setText(settings.getString(spFimServ2, vazio));
        txt_ini_serv3.setText(settings.getString(spIniServ3, vazio));
        txt_fim_serv3.setText(settings.getString(spFimServ3, vazio));
        txt_ini_serv4.setText(settings.getString(spIniServ4, vazio));
        txt_fim_serv4.setText(settings.getString(spFimServ4, vazio));
        txt_ini_serv5.setText(settings.getString(spIniServ5, vazio));
        txt_fim_serv5.setText(settings.getString(spFimServ5, vazio));
        txt_ini_serv6.setText(settings.getString(spIniServ6, vazio));
        txt_fim_serv6.setText(settings.getString(spFimServ6, vazio));

        verAltBtnIni();
    }
    private void verAltBtnIni() {
        if (txt_fim_serv1.getText().toString().equals(vazio)){
            btn_ini_serv2.setEnabled(false);
        } else {
            btn_ini_serv2.setEnabled(true);
        }
        if (txt_fim_serv2.getText().toString().equals(vazio)){
            btn_ini_serv3.setEnabled(false);
        } else {
            btn_ini_serv3.setEnabled(true);
        }
        if (txt_fim_serv3.getText().toString().equals(vazio)){
            btn_ini_serv4.setEnabled(false);
        } else {
            btn_ini_serv4.setEnabled(true);
        }
        if (txt_fim_serv4.getText().toString().equals(vazio)){
            btn_ini_serv5.setEnabled(false);
        } else {
            btn_ini_serv5.setEnabled(true);
        }
        if (txt_fim_serv5.getText().toString().equals(vazio)){
            btn_ini_serv6.setEnabled(false);
        } else {
            btn_ini_serv6.setEnabled(true);
        }
        verAltBtnFim();
    }
    public void verAltBtnFim(){
        if (txt_ini_serv1.getText().toString().equals(vazio)){
            btn_fim_serv1.setEnabled(false);
        } else {
            btn_fim_serv1.setEnabled(true);
        }
        if (txt_ini_serv2.getText().toString().equals(vazio)){
            btn_fim_serv2.setEnabled(false);
        } else {
            btn_fim_serv2.setEnabled(true);
        }
        if (txt_ini_serv3.getText().toString().equals(vazio)){
            btn_fim_serv3.setEnabled(false);
        } else {
            btn_fim_serv3.setEnabled(true);
        }
        if (txt_ini_serv4.getText().toString().equals(vazio)){
            btn_fim_serv4.setEnabled(false);
        } else {
            btn_fim_serv4.setEnabled(true);
        }
        if (txt_ini_serv5.getText().toString().equals(vazio)){
            btn_fim_serv5.setEnabled(false);
        } else {
            btn_fim_serv5.setEnabled(true);
        }
        if (txt_ini_serv6.getText().toString().equals(vazio)){
            btn_fim_serv6.setEnabled(false);
        } else {
            btn_fim_serv6.setEnabled(true);
        }
        botaoClicado();
    }
    public void botaoClicado(){
        //1
        if (txt_ini_serv1.getText().toString().equals(vazio)){
        } else {
            btn_ini_serv1.setEnabled(false);
        }
        if (txt_fim_serv1.getText().toString().equals(vazio)){
        } else {
            btn_fim_serv1.setEnabled(false);
        }
        //2
        if (txt_ini_serv2.getText().toString().equals(vazio)){
        } else {
            btn_ini_serv2.setEnabled(false);
        }
        if (txt_fim_serv2.getText().toString().equals(vazio)){
        } else {
            btn_fim_serv2.setEnabled(false);
        }
        //3
        if (txt_ini_serv3.getText().toString().equals(vazio)){
        } else {
            btn_ini_serv3.setEnabled(false);
        }
        if (txt_fim_serv3.getText().toString().equals(vazio)){
        } else {
            btn_fim_serv3.setEnabled(false);
        }
        //4
        if (txt_ini_serv4.getText().toString().equals(vazio)){
        } else {
            btn_ini_serv4.setEnabled(false);
        }
        if (txt_fim_serv4.getText().toString().equals(vazio)){
        } else {
            btn_fim_serv4.setEnabled(false);
        }
        //5
        if (txt_ini_serv5.getText().toString().equals(vazio)){
        } else {
            btn_ini_serv5.setEnabled(false);
        }
        if (txt_fim_serv5.getText().toString().equals(vazio)){
        } else {
            btn_fim_serv5.setEnabled(false);
        }
        //6
        if (txt_ini_serv6.getText().toString().equals(vazio)){
        } else {
            btn_ini_serv6.setEnabled(false);
        }
        if (txt_fim_serv6.getText().toString().equals(vazio)){
        } else {
            btn_fim_serv6.setEnabled(false);
        }
    }



}