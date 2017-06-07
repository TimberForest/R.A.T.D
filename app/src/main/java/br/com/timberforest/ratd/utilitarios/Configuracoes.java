package br.com.timberforest.ratd.utilitarios;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesEmailActivity;

/**
 * Created by Cayo Sander on 13/02/2017.
 * email: cayo.muniz@fatec.sp.gov.br
 */

public class Configuracoes extends Activity {

    public String googlePlayEndereco = "https://play.google.com/store/apps/details?id=";
    public String RATD = "br.com.timberforest.ratd";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

    }

    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.btn_confi_email:
                startActivity(new Intent(this, SharedPreferencesEmailActivity.class));
                break;
            case R.id.btn_atualizar:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(googlePlayEndereco + RATD)));
                break;
        }
    }

}