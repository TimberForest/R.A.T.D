package br.com.timberforest.ratd.dashboards;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import br.com.timberforest.ratd.R;
import de.keyboardsurfer.android.widget.crouton.Configuration;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class ServicosPonsseActivity extends Activity {

    final Style styleAlert = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.RED)
            .setConfiguration(new Configuration.Builder().setDuration(2000).build())
            .build();

    final Style styleConfirm = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.GREEN)
            .setConfiguration(new Configuration.Builder().setDuration(2000).build())
            .build();
    final Style styleInf = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.BLUE)
            .setConfiguration(new Configuration.Builder().setDuration(2000).build())
            .build();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos_ponsse);
    }
    //botão voltar do device
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent intent = new Intent(ServicosPonsseActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }


    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.manutencaoProgBasCompGruaButton:
/*                Intent intent = new Intent(ServicosPonsseActivity.this, FormManutencaoProgramadaGruaPonsseActivity.class);
                startActivity(intent);*/
                Crouton.makeText(ServicosPonsseActivity.this, "Relatório em desenvolvimento !", styleInf).show();
                break;
            case R.id.manutencaoProgBasCompCabecoteButton:
/*                Intent it = new Intent(ServicosPonsseActivity.this, FormManutencaoPragramadaCabecotePonsseActivity.class);
                startActivity(it);*/
                Crouton.makeText(ServicosPonsseActivity.this, "Relatório em desenvolvimento !", styleInf).show();
                break;
            case R.id.manutencaoProgBasCompForwarderButton:
 /*               Intent ite = new Intent(ServicosPonsseActivity.this, FormManutencaoProgramadaForwarderPonsseActivity.class);
                startActivity(ite);*/
                Crouton.makeText(ServicosPonsseActivity.this, "Relatório em desenvolvimento !", styleInf).show();
                break;
            case R.id.manutencaoProgBasCompMaquinaBaseButton:
/*                Intent i = new Intent(ServicosPonsseActivity.this, FormManutencaoProgramadaMaquinaBasePonsseActivity.class);
                startActivity(i);*/
                Crouton.makeText(ServicosPonsseActivity.this, "Relatório em desenvolvimento !", styleInf).show();
                break;
            case R.id.garantiaForwarderButton:
/*                Intent inte = new Intent(ServicosPonsseActivity.this, FormGarantiaForwarderPonsseActivity.class);
                startActivity(inte);*/
                Crouton.makeText(ServicosPonsseActivity.this, "Relatório em desenvolvimento !", styleInf).show();
                break;
            case R.id.garantiaHarvesterButton:
/*                Intent inten = new Intent(ServicosPonsseActivity.this, FormGarantiaHarvesterPonsseActivity.class);
                startActivity(inten);*/
                Crouton.makeText(ServicosPonsseActivity.this, "Relatório em desenvolvimento !", styleInf).show();
                break;
            case R.id.imageView2:
/*                Intent intente = new Intent(ServicosPonsseActivity.this, FormGarantiaForwarderPonsseActivity.class);
                startActivity(intente);*/
                Crouton.makeText(ServicosPonsseActivity.this, "Relatório em desenvolvimento !", styleInf).show();
                break;
        }
    }
}
