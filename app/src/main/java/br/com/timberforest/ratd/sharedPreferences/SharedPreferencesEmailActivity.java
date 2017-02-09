package br.com.timberforest.ratd.sharedPreferences;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dashboards.MainActivity;

public class SharedPreferencesEmailActivity extends Activity {
    public static final String PREFS_NAME = "Preferences";
    EditText edt_email, edt_email_rigesa;

    /**Chamado quando a Activity é executada pela primeira vez.*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_email);

        edt_email = (EditText)findViewById(R.id.edt_email);
        edt_email_rigesa = (EditText)findViewById(R.id.edt_email_rigesa);

        //Restaura as preferencias gravadas
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        edt_email.setText(settings.getString("email", ""));
        edt_email_rigesa.setText(settings.getString("email_rigesa", ""));

    }
    @Override
    protected void onStop(){
        super.onStop();

    }
    public void SalvarConfig(View view){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("email", edt_email.getText().toString());
        editor.putString("email_rigesa", edt_email_rigesa.getText().toString());
        //Confirma a gravação dos dados
        editor.commit();

        Toast.makeText(getApplicationContext(), "Configurações gravadas com sucesso !", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //Evento click do botão Fechar prorama
    public void btnFechar_Click(View v){
        finish(); // fecha aplicativo
    }
}