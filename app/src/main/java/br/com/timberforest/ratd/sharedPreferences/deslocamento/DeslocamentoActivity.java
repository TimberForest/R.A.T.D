package br.com.timberforest.ratd.sharedPreferences.deslocamento;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dashboards.MainActivity;
import br.com.timberforest.ratd.dashboards.ServicosLogMaxActivity;
import br.com.timberforest.ratd.dashboards.ServicosPonsseActivity;
import br.com.timberforest.ratd.listActivity.cadastroMecanico.ListCadastroMecanicoActivity;
import br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica.ListRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.listActivity.relatorioAvaliacaoOperacional.ListRelatorioAvaliacaoOperacionalActivity;
import de.keyboardsurfer.android.widget.crouton.Configuration;
import de.keyboardsurfer.android.widget.crouton.Style;

public class DeslocamentoActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "sharedPreferencesDeslocamento";

    private Button btn_ini_desl1, btn_fim_desl1, btn_ini_desl2, btn_fim_desl2, btn_ini_desl3, btn_fim_desl3,btn_ini_desl4,
            btn_fim_desl4, btn_ini_desl5, btn_fim_desl5, btn_ini_desl6, btn_fim_desl6;
    private TextView txt_ini_desl1, txt_fim_desl1, txt_ini_desl2, txt_fim_desl2, txt_ini_desl3, txt_fim_desl3, txt_ini_desl4, txt_fim_desl4,
            txt_ini_desl5, txt_fim_desl5, txt_ini_desl6, txt_fim_desl6;

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

        atualizaCampos();


    }
    public void goToMain(){
        Intent intent = new Intent(DeslocamentoActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void mensagemGravar(String data){
        Toast.makeText(getApplicationContext(), "Inicio do Deslocamento:"+data+" Gravado !", Toast.LENGTH_SHORT).show();
    }
    public void mensagemGravado(String campo){
        Toast.makeText(getApplicationContext(), "Inicio de Deslocamento já foi informado: " + campo + "", Toast.LENGTH_SHORT).show();
    }
    public void deslocamentoClick(View view){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        switch (view.getId()) {
            // 1
            case R.id.btn_ini_desl1:
                if (txt_ini_desl1.getText().toString().equals("")) {
                    editor.putString("ini_desl1", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl1.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_desl1:
                if (txt_fim_desl1.getText().toString().equals("")) {
                    editor.putString("fim_desl1", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl1.getText().toString());
                    goToMain();
                }
                break;
            // 2
            case R.id.btn_ini_desl2:
                if (txt_ini_desl2.getText().toString().equals("")) {
                    editor.putString("ini_desl2", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl2.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_desl2:
                if (txt_fim_desl2.getText().toString().equals("")) {
                    editor.putString("fim_desl2", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl2.getText().toString());
                    goToMain();
                }
                break;
            //3
            case R.id.btn_ini_desl3:
                if (txt_ini_desl3.getText().toString().equals("")) {
                    editor.putString("ini_desl3", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl3.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_desl3:
                if (txt_fim_desl3.getText().toString().equals("")) {
                    editor.putString("fim_desl3", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl3.getText().toString());
                    goToMain();
                }
                break;
            //4
            case R.id.btn_ini_desl4:
                if (txt_ini_desl4.getText().toString().equals("")) {
                    editor.putString("ini_desl4", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl4.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_desl4:
                if (txt_fim_desl4.getText().toString().equals("")) {
                    editor.putString("fim_desl4", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl4.getText().toString());
                    goToMain();
                }
                break;
            //5
            case R.id.btn_ini_desl5:
                if (txt_ini_desl5.getText().toString().equals("")) {
                    editor.putString("ini_desl5", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl5.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_desl5:
                if (txt_fim_desl5.getText().toString().equals("")) {
                    editor.putString("fim_desl5", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl5.getText().toString());
                    goToMain();
                }
                break;
            //6
            case R.id.btn_ini_desl6:
                if (txt_ini_desl6.getText().toString().equals("")) {
                    editor.putString("ini_desl6", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl6.getText().toString());
                    goToMain();
                }
                break;
            case R.id.btn_fim_desl6:
                if (txt_fim_desl6.getText().toString().equals("")) {
                    editor.putString("fim_desl6", dataFormatada);
                    mensagemGravar(dataFormatada);
                    goToMain();
                } else {
                    mensagemGravado(txt_ini_desl6.getText().toString());
                    goToMain();
                }
                break;
        }
        editor.commit();
    }
    private void atualizaCampos() {

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        txt_ini_desl1.setText(settings.getString("ini_desl1", ""));
        txt_fim_desl1.setText(settings.getString("fim_desl1", ""));
        txt_ini_desl2.setText(settings.getString("ini_desl2", ""));
        txt_fim_desl2.setText(settings.getString("fim_desl2", ""));
        txt_ini_desl3.setText(settings.getString("ini_desl3", ""));
        txt_fim_desl3.setText(settings.getString("fim_desl3", ""));
        txt_ini_desl4.setText(settings.getString("ini_desl4", ""));
        txt_fim_desl4.setText(settings.getString("fim_desl4", ""));
        txt_ini_desl5.setText(settings.getString("ini_desl5", ""));
        txt_fim_desl5.setText(settings.getString("fim_desl5", ""));
        txt_ini_desl6.setText(settings.getString("ini_desl6", ""));
        txt_fim_desl6.setText(settings.getString("fim_desl6", ""));

        verAltBtnIni();
    }
    private void verAltBtnIni() {
        if (txt_fim_desl1.getText().toString().equals("")){
            btn_ini_desl2.setEnabled(false);
        } else {
            btn_ini_desl2.setEnabled(true);
        }
        if (txt_fim_desl2.getText().toString().equals("")){
            btn_ini_desl3.setEnabled(false);
        } else {
            btn_ini_desl3.setEnabled(true);
        }
        if (txt_fim_desl3.getText().toString().equals("")){
            btn_ini_desl4.setEnabled(false);
        } else {
            btn_ini_desl4.setEnabled(true);
        }
        if (txt_fim_desl4.getText().toString().equals("")){
            btn_ini_desl5.setEnabled(false);
        } else {
            btn_ini_desl5.setEnabled(true);
        }
        if (txt_fim_desl5.getText().toString().equals("")){
            btn_ini_desl6.setEnabled(false);
        } else {
            btn_ini_desl6.setEnabled(true);
        }

        verAltBtnFim();
    }
    public void verAltBtnFim(){
        if (txt_ini_desl1.getText().toString().equals("")){
            btn_fim_desl1.setEnabled(false);
        } else {
            btn_fim_desl1.setEnabled(true);
        }

        if (txt_ini_desl2.getText().toString().equals("")){
            btn_fim_desl2.setEnabled(false);
        } else {
            btn_fim_desl2.setEnabled(true);
        }

        if (txt_ini_desl3.getText().toString().equals("")){
            btn_fim_desl3.setEnabled(false);
        } else {
            btn_fim_desl3.setEnabled(true);
        }

        if (txt_ini_desl4.getText().toString().equals("")){
            btn_fim_desl4.setEnabled(false);
        } else {
            btn_fim_desl4.setEnabled(true);
        }

        if (txt_ini_desl5.getText().toString().equals("")){
            btn_fim_desl5.setEnabled(false);
        } else {
            btn_fim_desl5.setEnabled(true);
        }

        if (txt_ini_desl6.getText().toString().equals("")){
            btn_fim_desl6.setEnabled(false);
        } else {
            btn_fim_desl6.setEnabled(true);
        }
        botaoClicado();
    }
    public void botaoClicado(){
        //1
        if (txt_ini_desl1.getText().toString().equals("")){
        } else {
            btn_ini_desl1.setEnabled(false);
        }
        if (txt_fim_desl1.getText().toString().equals("")){
        } else {
            btn_fim_desl1.setEnabled(false);
        }
        //2
        if (txt_ini_desl2.getText().toString().equals("")){
        } else {
            btn_ini_desl2.setEnabled(false);
        }
        if (txt_fim_desl2.getText().toString().equals("")){
        } else {
            btn_fim_desl2.setEnabled(false);
        }
        //3
        if (txt_ini_desl3.getText().toString().equals("")){
        } else {
            btn_ini_desl3.setEnabled(false);
        }
        if (txt_fim_desl3.getText().toString().equals("")){
        } else {
            btn_fim_desl3.setEnabled(false);
        }
        //4
        if (txt_ini_desl4.getText().toString().equals("")){
        } else {
            btn_ini_desl4.setEnabled(false);
        }
        if (txt_fim_desl4.getText().toString().equals("")){
        } else {
            btn_fim_desl4.setEnabled(false);
        }
        //5
        if (txt_ini_desl5.getText().toString().equals("")){
        } else {
            btn_ini_desl5.setEnabled(false);
        }
        if (txt_fim_desl5.getText().toString().equals("")){
        } else {
            btn_fim_desl5.setEnabled(false);
        }
        //6
        if (txt_ini_desl6.getText().toString().equals("")){
        } else {
            btn_ini_desl6.setEnabled(false);
        }
        if (txt_fim_desl6.getText().toString().equals("")){
        } else {
            btn_fim_desl6.setEnabled(false);
        }

    }
}

