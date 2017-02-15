package br.com.timberforest.ratd.utilitarios;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.timberforest.ratd.R;

/**
 * Created by Cayo Sander on 13/02/2017.
 * email: cayo.muniz@fatec.sp.gov.br
 */

public class Configuracoes extends AppCompatActivity {

    private EditText edt_email, edt_email_rigesa;
    private Button btn_salvar;
    private SQLiteDatabase bancoDados;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        try{
            edt_email = (EditText) findViewById(R.id.edt_email);
            edt_email_rigesa = (EditText) findViewById(R.id.edt_email_rigesa);
            btn_salvar = (Button) findViewById(R.id.btn_salvar);

            final SQLiteDatabase bancoDados = openOrCreateDatabase("configuracoes", MODE_PRIVATE, null);
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS config(emailPadrao VARCHAR, emailRigesa VARCHAR)");

            btn_salvar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String emailDigitado = edt_email.getText().toString();
                    String emailRigesaDigitado = edt_email_rigesa.getText().toString();
                    salvarConfig(emailDigitado, emailRigesaDigitado);
                }
            });
            recuperarConfig();

        }catch (Exception e){
            e.printStackTrace();
        }



    }

    private void salvarConfig(String emailDigitado, String emailRigesaDigitado) {
        try{
            if (edt_email.equals("") && edt_email_rigesa.equals("")){
                Toast.makeText(this, "Insira informações !", Toast.LENGTH_SHORT).show();
            }else{
                bancoDados.execSQL("INSERT INTO config (emailPadrao) VALUES ('" +emailDigitado+ "') ");
                bancoDados.execSQL("INSERT INTO config (emailRigesa) VALUES ('" +emailRigesaDigitado+ "') ");
                Toast.makeText(this, "Configurações salvas com sucesso!", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void recuperarConfig(){

        try{
            Cursor cursor = bancoDados.rawQuery("SELECT * from config", null);
            int indiceEmailPadrao = cursor.getColumnIndex("emailPadrao");
            int indiceEmailRigesa = cursor.getColumnIndex("emailRigesa");

            edt_email.setText(indiceEmailPadrao);
            edt_email_rigesa.setText(indiceEmailRigesa);

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}