package br.com.timberforest.ratd.formulariosActivity.servicosLogmax.revisao500Hrs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import br.com.timberforest.ratd.R;
public class FormRevisao500Hrs5000DActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_revisao500_hrs5000_d);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_simples_botao_voltar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_voltar) {
            super.finish();
        }

        return super.onOptionsItemSelected(item);
    }
    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.linearLayout324:
                startActivity(new Intent(this, DesenhoBlocoHidraulicoCabecoteLogMax5000Activity.class));
                break;
            case R.id.linearLayout325:
                startActivity(new Intent(this, DesenhoBlocoHidraulicoCabecoteLogMax5000Activity.class));
                break;
            case R.id.linearLayout327:
                startActivity(new Intent(this, DesenhoBlocoHidraulicoCabecoteLogMax5000Activity.class));
                break;
            case R.id.linearLayout326:
                startActivity(new Intent(this, DesenhoBlocoHidraulicoCabecoteLogMax5000Activity.class));
                break;
            case R.id.linearLayout323:
                startActivity(new Intent(this, DesenhoBlocoHidraulicoCabecoteLogMax5000Activity.class));
                break;
            case R.id.linearLayout331:
                startActivity(new Intent(this, DesenhoBlocoHidraulicoCabecoteLogMax5000Activity.class));
                break;
        }
    }
}
