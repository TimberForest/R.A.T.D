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
    Button btn_ini_desl, btn_ini_trab, btn_ini_alm, btn_fim_alm, btn_fim_trab, btn_fim_desl;
    TextView txt_ini_desl, txt_ini_trab, txt_ini_alm, txt_fim_alm, txt_fim_trab, txt_fim_desl;
    Button btn_limpar;

    //recupera hora atual
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
    final String dataFormatada = sdf.format(hora);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_deslocamento);

        txt_ini_desl = (TextView) findViewById(R.id.txt_ini_desl);
        txt_ini_trab = (TextView) findViewById(R.id.txt_ini_trab);
        txt_ini_alm = (TextView) findViewById(R.id.txt_ini_alm);
        txt_fim_alm = (TextView) findViewById(R.id.txt_fim_alm);
        txt_fim_trab = (TextView) findViewById(R.id.txt_fim_trab);
        txt_fim_desl = (TextView) findViewById(R.id.txt_fim_desl);

        //Restaura as preferencias gravadas
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        txt_ini_desl.setText(settings.getString("inicio_deslocamento",""));
        txt_ini_trab.setText(settings.getString("inicio_trabalho",""));
        txt_ini_alm.setText(settings.getString("inicio_almoço",""));
        txt_fim_alm.setText(settings.getString("fim_almoço",""));
        txt_fim_trab.setText(settings.getString("fim_trabalho",""));
        txt_fim_desl.setText(settings.getString("fim_deslocamento",""));
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
                editor.commit();
                Intent intent = new Intent(SharedPreferencesDeslocamento.this, MainActivity.class);
                startActivity(intent);
            }
        });
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
