package br.com.timberforest.ratd.dashboards;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.formulariosActivity.servicosLogmax.revisao500Hrs.FormRevisao500Hrs10000XTActivity;
import br.com.timberforest.ratd.formulariosActivity.servicosLogmax.revisao500Hrs.FormRevisao500Hrs4000BActivity;
import br.com.timberforest.ratd.formulariosActivity.servicosLogmax.revisao500Hrs.FormRevisao500Hrs5000DActivity;
import br.com.timberforest.ratd.formulariosActivity.servicosLogmax.revisao500Hrs.FormRevisao500Hrs6000BActivity;
import br.com.timberforest.ratd.formulariosActivity.servicosLogmax.revisao500Hrs.FormRevisao500Hrs7000CActivity;
import br.com.timberforest.ratd.formulariosActivity.servicosLogmax.revisao500Hrs.FormRevisao500Hrs7000XTActivity;
import br.com.timberforest.ratd.formulariosActivity.servicosLogmax.revisao500Hrs.FormRevisao500HrsE6Activity;

public class DashRevisao500hrsLogMaxModelosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_revisao500hrs_log_max_modelos);

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
            case R.id.revisao500Hrs4000B:
                startActivity(new Intent(this, FormRevisao500Hrs4000BActivity.class));
                break;
            case R.id.revisao500Hrs5000D:
                startActivity(new Intent(this, FormRevisao500Hrs5000DActivity.class));
                break;
            case R.id.revisao500Hrs6000B:
                startActivity(new Intent(this, FormRevisao500Hrs6000BActivity.class));
                break;
            case R.id.revisao500Hrse6:
                startActivity(new Intent(this, FormRevisao500HrsE6Activity.class));
                break;
            case R.id.revisao500Hrs7000C:
                startActivity(new Intent(this, FormRevisao500Hrs7000CActivity.class));
                break;
            case R.id.revisao500Hrs7000XT:
                startActivity(new Intent(this, FormRevisao500Hrs7000XTActivity.class));
                break;
            case R.id.revisao500Hrs10000XT:
                startActivity(new Intent(this, FormRevisao500Hrs10000XTActivity.class));
                break;
        }
      }
    }


