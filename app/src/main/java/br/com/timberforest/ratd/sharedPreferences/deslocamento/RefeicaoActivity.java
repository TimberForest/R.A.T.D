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

    //recupera hora atual
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
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
    public void mensagemGravar(String data){
        Toast.makeText(getApplicationContext(), "Inicio da Refeição: "+data+" Gravado !", Toast.LENGTH_SHORT).show();
    }
    public void mensagemGravado(String campo){
        Toast.makeText(getApplicationContext(), "Inicio da Refeição já foi informado: " + campo + "", Toast.LENGTH_SHORT).show();
    }
    public void deslocamentoClick(View view){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        switch (view.getId()) {
            // 1
            case R.id.btn_ini_ref1:
                if (txt_ini_ref1.getText().toString().equals("")) {
                    editor.putString("ini_ref1", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref1.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_ref1:
                if (txt_fim_ref1.getText().toString().equals("")) {
                    editor.putString("fim_ref1", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref1.getText().toString());
                    goToMain();
                }
                break;
            // 2
            case R.id.btn_ini_ref2:
                if (txt_ini_ref2.getText().toString().equals("")) {
                    editor.putString("ini_ref2", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref2.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_ref2:
                if (txt_fim_ref2.getText().toString().equals("")) {
                    editor.putString("fim_ref2", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref2.getText().toString());
                    goToMain();
                }
                break;
            //3
            case R.id.btn_ini_ref3:
                if (txt_ini_ref3.getText().toString().equals("")) {
                    editor.putString("ini_ref3", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref3.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_ref3:
                if (txt_fim_ref3.getText().toString().equals("")) {
                    editor.putString("fim_ref3", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref3.getText().toString());
                    goToMain();
                }
                break;
            //4
            case R.id.btn_ini_ref4:
                if (txt_ini_ref4.getText().toString().equals("")) {
                    editor.putString("ini_ref4", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref4.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_ref4:
                if (txt_fim_ref4.getText().toString().equals("")) {
                    editor.putString("fim_ref4", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref4.getText().toString());
                    goToMain();
                }
                break;
            //5
            case R.id.btn_ini_ref5:
                if (txt_ini_ref5.getText().toString().equals("")) {
                    editor.putString("ini_ref5", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref5.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_ref5:
                if (txt_fim_ref5.getText().toString().equals("")) {
                    editor.putString("fim_ref5", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref5.getText().toString());
                    goToMain();
                }
                break;
            //6
            case R.id.btn_ini_ref6:
                if (txt_ini_ref6.getText().toString().equals("")) {
                    editor.putString("ini_ref6", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref6.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_ref6:
                if (txt_fim_ref6.getText().toString().equals("")) {
                    editor.putString("fim_ref6", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_ref6.getText().toString());
                    goToMain();
                }
                break;
        }
        editor.commit();
    }
    private void atualizaCampos() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        txt_ini_ref1.setText(settings.getString("ini_ref1", ""));
        txt_fim_ref1.setText(settings.getString("fim_ref1", ""));
        txt_ini_ref2.setText(settings.getString("ini_ref2", ""));
        txt_fim_ref2.setText(settings.getString("fim_ref2", ""));
        txt_ini_ref3.setText(settings.getString("ini_ref3", ""));
        txt_fim_ref3.setText(settings.getString("fim_ref3", ""));
        txt_ini_ref4.setText(settings.getString("ini_ref4", ""));
        txt_fim_ref4.setText(settings.getString("fim_ref4", ""));
        txt_ini_ref5.setText(settings.getString("ini_ref5", ""));
        txt_fim_ref5.setText(settings.getString("fim_ref5", ""));
        txt_ini_ref6.setText(settings.getString("ini_ref6", ""));
        txt_fim_ref6.setText(settings.getString("fim_ref6", ""));
        verAltBtnIni();
    }
    private void verAltBtnIni() {
        if (txt_fim_ref1.getText().toString().equals("")){
            btn_ini_ref2.setEnabled(false);
        } else {
            btn_ini_ref2.setEnabled(true);
        }
        if (txt_fim_ref2.getText().toString().equals("")){
            btn_ini_ref3.setEnabled(false);
        } else {
            btn_ini_ref3.setEnabled(true);
        }
        if (txt_fim_ref3.getText().toString().equals("")){
            btn_ini_ref4.setEnabled(false);
        } else {
            btn_ini_ref4.setEnabled(true);
        }
        if (txt_fim_ref4.getText().toString().equals("")){
            btn_ini_ref5.setEnabled(false);
        } else {
            btn_ini_ref5.setEnabled(true);
        }
        if (txt_fim_ref5.getText().toString().equals("")){
            btn_ini_ref6.setEnabled(false);
        } else {
            btn_ini_ref6.setEnabled(true);
        }
        verAltBtnFim();
    }
    public void verAltBtnFim(){
        if (txt_ini_ref1.getText().toString().equals("")){
            btn_fim_ref1.setEnabled(false);
        } else {
            btn_fim_ref1.setEnabled(true);
        }
        if (txt_ini_ref2.getText().toString().equals("")){
            btn_fim_ref2.setEnabled(false);
        } else {
            btn_fim_ref2.setEnabled(true);
        }
        if (txt_ini_ref3.getText().toString().equals("")){
            btn_fim_ref3.setEnabled(false);
        } else {
            btn_fim_ref3.setEnabled(true);
        }
        if (txt_ini_ref4.getText().toString().equals("")){
            btn_fim_ref4.setEnabled(false);
        } else {
            btn_fim_ref4.setEnabled(true);
        }
        if (txt_ini_ref5.getText().toString().equals("")){
            btn_fim_ref5.setEnabled(false);
        } else {
            btn_fim_ref5.setEnabled(true);
        }
        if (txt_ini_ref6.getText().toString().equals("")){
            btn_fim_ref6.setEnabled(false);
        } else {
            btn_fim_ref6.setEnabled(true);
        }
        botaoClicado();
    }
    public void botaoClicado(){
        //1
        if (txt_ini_ref1.getText().toString().equals("")){
        } else {
            btn_ini_ref1.setEnabled(false);
        }
        if (txt_fim_ref1.getText().toString().equals("")){
        } else {
            btn_fim_ref1.setEnabled(false);
        }
        //2
        if (txt_ini_ref2.getText().toString().equals("")){
        } else {
            btn_ini_ref2.setEnabled(false);
        }
        if (txt_fim_ref2.getText().toString().equals("")){
        } else {
            btn_fim_ref2.setEnabled(false);
        }
        //3
        if (txt_ini_ref3.getText().toString().equals("")){
        } else {
            btn_ini_ref3.setEnabled(false);
        }
        if (txt_fim_ref3.getText().toString().equals("")){
        } else {
            btn_fim_ref3.setEnabled(false);
        }
        //4
        if (txt_ini_ref4.getText().toString().equals("")){
        } else {
            btn_ini_ref4.setEnabled(false);
        }
        if (txt_fim_ref4.getText().toString().equals("")){
        } else {
            btn_fim_ref4.setEnabled(false);
        }
        //5
        if (txt_ini_ref5.getText().toString().equals("")){
        } else {
            btn_ini_ref5.setEnabled(false);
        }
        if (txt_fim_ref5.getText().toString().equals("")){
        } else {
            btn_fim_ref5.setEnabled(false);
        }
        //6
        if (txt_ini_ref6.getText().toString().equals("")){
        } else {
            btn_ini_ref6.setEnabled(false);
        }
        if (txt_fim_ref6.getText().toString().equals("")){
        } else {
            btn_fim_ref6.setEnabled(false);
        }
    }
}
