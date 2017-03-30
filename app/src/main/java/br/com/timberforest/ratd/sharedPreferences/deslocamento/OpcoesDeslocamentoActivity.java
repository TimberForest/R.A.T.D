package br.com.timberforest.ratd.sharedPreferences.deslocamento;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.timberforest.ratd.R;

public class OpcoesDeslocamentoActivity extends Activity {

    private Button btn_refeicao, btn_servico, btn_deslocamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deslocamento_opcoes);

        btn_deslocamento = (Button) findViewById(R.id.btn_deslocamento);
        btn_refeicao = (Button) findViewById(R.id.btn_refeicao);
        btn_servico = (Button) findViewById(R.id.btn_servico);

        btn_deslocamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), DeslocamentoActivity.class);
                startActivity(it);
                finish();
            }
        });

        btn_servico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), TrabalhoActivity.class);
                startActivity(it);
                finish();
            }
        });
        btn_refeicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), RefeicaoActivity.class);
                startActivity(it);
                finish();
            }
        });

    }
}