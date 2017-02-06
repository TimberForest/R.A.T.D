package br.com.timberforest.ratd.sharedPreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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

import static br.com.timberforest.ratd.R.id.btn_limpar;
import static br.com.timberforest.ratd.R.id.edt_email;

public class SharedPreferencesDeslocamento extends AppCompatActivity {
    public static final String PREFS_NAME = "Preferences";
    Button btn_ini_desl, btn_ini_trab, btn_ini_alm, btn_fim_alm, btn_fim_trab, btn_fim_desl, btn_km_inicial, btn_km_final;
    TextView txt_ini_desl, txt_ini_trab, txt_ini_alm, txt_fim_alm, txt_fim_trab, txt_fim_desl, txt_km_rodado, aux;
    EditText edt_km_inicial, edt_km_final;
    Button btn_limpar;

    //recupera hora atual
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
    final String dataFormatada = sdf.format(hora);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_deslocamento);

        btn_km_inicial = (Button) findViewById(R.id.btn_km_inicial);
        btn_km_final = (Button) findViewById(R.id.btn_km_final);
        edt_km_final = (EditText) findViewById(R.id.edt_km_final);
        edt_km_inicial = (EditText) findViewById(R.id.edt_km_inicial);
        txt_km_rodado = (TextView) findViewById(R.id.txt_km_rodado);

        txt_ini_desl = (TextView) findViewById(R.id.txt_ini_desl);
        txt_ini_trab = (TextView) findViewById(R.id.txt_ini_trab);
        txt_ini_alm = (TextView) findViewById(R.id.txt_ini_alm);
        txt_fim_alm = (TextView) findViewById(R.id.txt_fim_alm);
        txt_fim_trab = (TextView) findViewById(R.id.txt_fim_trab);
        txt_fim_desl = (TextView) findViewById(R.id.txt_fim_desl);

        //Restaura as preferencias gravadas
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
/*        txt_ini_desl.setText(settings.getString("inicio_deslocamento",""));
        txt_ini_trab.setText(settings.getString("inicio_trabalho",""));
        txt_ini_alm.setText(settings.getString("inicio_almoço",""));
        txt_fim_alm.setText(settings.getString("fim_almoço",""));
        txt_fim_trab.setText(settings.getString("fim_trabalho",""));
        txt_fim_desl.setText(settings.getString("fim_deslocamento",""));

        edt_km_inicial.setText(settings.getString("km_inicial",""));
        edt_km_final.setText(settings.getString("km_final",""));
        txt_km_rodado.setText(settings.getString("km_rodado",""));*/
        //
        //botões gravar horarios
        btn_ini_desl = (Button) findViewById(R.id.btn_ini_desl);
        btn_ini_trab = (Button) findViewById(R.id.btn_ini_trab);
        btn_ini_alm = (Button) findViewById(R.id.btn_ini_alm);
        btn_fim_alm = (Button) findViewById(R.id.btn_fim_alm);
        btn_fim_trab = (Button) findViewById(R.id.btn_fim_trab);
        btn_fim_desl = (Button) findViewById(R.id.btn_fim_desl);

/*
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        final String dataFormatada = sdf.format(hora);
*/
        atualizaCampos();

        btn_ini_desl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniDesl();
            }
        });
        btn_ini_trab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniTrab();
            }
        });
        btn_ini_alm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniAlm();
            }
        });
        btn_fim_alm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               fimAlm();
            }
        });
        btn_fim_trab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fimTrab();
            }
        });
        btn_fim_desl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fimDesl();
            }
        });

        btn_km_inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                SharedPreferences.Editor editor = settings.edit();
                if (edt_km_inicial.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Campo Km inicial sem informação, insira informações para poder gravar !", Toast.LENGTH_LONG).show();
                }else{
                    editor.putString("km_inicial", edt_km_inicial.getText().toString());
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Km inicial gravado com sucesso !"+edt_km_inicial.getText().toString(), Toast.LENGTH_LONG).show();
                    atualizaCampos();
                }
            }
        });
        btn_km_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                SharedPreferences.Editor editor = settings.edit();

                long aux1 = Long.parseLong(edt_km_inicial.getText().toString());
                long aux2 = Long.parseLong(edt_km_final.getText().toString());

                if (edt_km_final.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Campo Km final sem informação, insira informações para poder gravar !", Toast.LENGTH_LONG).show();
                    atualizaCampos();
                } else
                if (edt_km_inicial.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Campo Km inicial sem informação, insira informações para poder gravar !", Toast.LENGTH_LONG).show();
                    atualizaCampos();
                }else
                if(aux2<aux1){
                    Toast.makeText(getApplicationContext(), "Km final informado é menor que o Km inicial !", Toast.LENGTH_LONG).show();
                }else
                 {
                        editor.putString("km_final", edt_km_final.getText().toString());
                        editor.commit();
                        Toast.makeText(getApplicationContext(), "Km final gravado com sucesso !"+edt_km_final.getText().toString(), Toast.LENGTH_SHORT).show();
                        calculaKmRodado();
                    }
            }
        });

        btn_limpar = (Button) findViewById(R.id.btn_limpar);
        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("inicio_deslocamento", "");
                editor.putString("inicio_trabalho","");
                editor.putString("inicio_almoço","");
                editor.putString("fim_almoço","");
                editor.putString("fim_trabalho","");
                editor.putString("fim_deslocamento","");
                editor.putString("km_inicial","");
                editor.putString("km_final","");
                editor.putString("km_rodado","");
                editor.commit();

                atualizaCampos();
            }
        });
    }

    private void atualizaCampos() {

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        txt_ini_desl.setText(settings.getString("inicio_deslocamento",""));
        txt_ini_trab.setText(settings.getString("inicio_trabalho",""));
        txt_ini_alm.setText(settings.getString("inicio_almoço",""));
        txt_fim_alm.setText(settings.getString("fim_almoço",""));
        txt_fim_trab.setText(settings.getString("fim_trabalho",""));
        txt_fim_desl.setText(settings.getString("fim_deslocamento",""));

        edt_km_inicial.setText(settings.getString("km_inicial",""));
        edt_km_final.setText(settings.getString("km_final",""));
        txt_km_rodado.setText(settings.getString("km_rodado",""));

/*        if(edt_km_inicial.equals("")){
            edt_km_final.setEnabled(false);
        }else{
            edt_km_final.setEnabled(false);
            Toast.makeText(getApplicationContext(), "nÃO DEU BOM", Toast.LENGTH_SHORT).show();
        }*/
        verificaAlteracaoEdt();
    }

    private void verificaAlteracaoEdt() {
        /*if (edt_km_inicial.getText().toString().equals("")) {
            edt_km_inicial.setEnabled(true);
            btn_km_inicial.setEnabled(true);

            btn_km_final.setEnabled(false);
            edt_km_final.setEnabled(false);
        }else{
            edt_km_inicial.setEnabled(false);
            btn_km_inicial.setEnabled(false);
        }*/

        if (edt_km_inicial.getText().toString().equals("") && edt_km_final.getText().toString().equals("")) {
            btn_km_inicial.setEnabled(true);
            edt_km_inicial.setEnabled(true);

            edt_km_final.setEnabled(false);
            btn_km_final.setEnabled(false);
        }else{
            edt_km_final.setEnabled(true);
            btn_km_final.setEnabled(true);

            btn_km_inicial.setEnabled(false);
            edt_km_inicial.setEnabled(false);
        }

        if (edt_km_final.getText().toString().equals("")){

        }else {
            edt_km_final.setEnabled(false);
            btn_km_final.setEnabled(false);
        }
    }


    private void calculaKmRodado() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        long aux1 = Long.parseLong(edt_km_inicial.getText().toString());
        long aux2 = Long.parseLong(edt_km_final.getText().toString());
        long aux=aux2-aux1;
        editor.putString("km_rodado", ""+aux);
        editor.commit();
        Toast.makeText(getApplicationContext(), aux+" Foram rodados !", Toast.LENGTH_SHORT).show();
        atualizaCampos();
    }

    public void iniDesl(){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if(txt_ini_desl.getText().toString().equals("")){
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("inicio_deslocamento", dataFormatada);
            editor.commit();
            Toast.makeText(getApplicationContext(), "Inicio do Deslocamento:"+dataFormatada+" Gravado !", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Inicio de deslocamento já foi informado: "+txt_ini_desl.getText().toString()+"", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void iniTrab(){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if(txt_ini_trab.getText().toString().equals("")){
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("inicio_trabalho", dataFormatada);
            editor.commit();
            Toast.makeText(getApplicationContext(), "Inicio do Deslocamento:"+dataFormatada+" Gravado !", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Inicio de deslocamento já foi informado: "+txt_ini_trab.getText().toString()+"", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void iniAlm(){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if(txt_ini_alm.getText().toString().equals("")){
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("inicio_almoço", dataFormatada);
            editor.commit();
            Toast.makeText(getApplicationContext(), "Inicio do Deslocamento:"+dataFormatada+" Gravado !", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Inicio de deslocamento já foi informado: "+txt_ini_alm.getText().toString()+"", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void fimAlm(){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if(txt_fim_alm.getText().toString().equals("")){
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("fim_almoço", dataFormatada);
            editor.commit();
            Toast.makeText(getApplicationContext(), "Inicio do Deslocamento:"+dataFormatada+" Gravado !", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Inicio de deslocamento já foi informado: "+txt_fim_alm.getText().toString()+"", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }
    }
    public void fimTrab(){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if(txt_fim_trab.getText().toString().equals("")){
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("fim_trabalho", dataFormatada);
            editor.commit();
            Toast.makeText(getApplicationContext(), "Inicio do Deslocamento:"+dataFormatada+" Gravado !", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Inicio de deslocamento já foi informado: "+txt_fim_trab.getText().toString()+"", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void fimDesl(){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if(txt_fim_desl.getText().toString().equals("")){
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("fim_deslocamento", dataFormatada);
            editor.commit();
            Toast.makeText(getApplicationContext(), "Inicio do Deslocamento:"+dataFormatada+" Gravado !", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Inicio de deslocamento já foi informado: "+txt_fim_desl.getText().toString()+"", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
            startActivity(intent);
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_simples_botao_voltar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== R.id.action_voltar) {
            super.finish();
        }

        return super.onOptionsItemSelected(item);
    }


}
