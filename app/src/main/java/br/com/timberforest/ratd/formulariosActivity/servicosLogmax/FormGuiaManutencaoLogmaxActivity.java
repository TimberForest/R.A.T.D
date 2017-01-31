package br.com.timberforest.ratd.formulariosActivity.servicosLogmax;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraAActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraAtActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraBActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraBaActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraCActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraCvActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraDActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraEActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraFActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraGActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraHActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraIActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraIcActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraIlActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraJActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraKActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraLActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraMActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraNActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraOActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraPActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraRActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraSActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraTActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraUActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.LetraWActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero10Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero11Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero12Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero13Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero14Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero15Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero16Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero17Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero18Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero19Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero1Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero20Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero20sActivity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero21Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero22Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero2Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero3Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero4Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero5Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero6Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero7Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero8Activity;
import br.com.timberforest.ratd.guiaManutencaoLogmax.Numero9Activity;

public class FormGuiaManutencaoLogmaxActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_guia_manutencao_logmax);
    }

    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.numero1:
                startActivity(new Intent(this, Numero1Activity.class));
                break;
            case R.id.numero2:
                startActivity(new Intent(this, Numero2Activity.class));
                break;
            case R.id.numero3:
                startActivity(new Intent(this, Numero3Activity.class));
                break;
            case R.id.numero4:
                startActivity(new Intent(this, Numero4Activity.class));
                break;
            case R.id.numero5:
                startActivity(new Intent(this, Numero5Activity.class));
                break;
            case R.id.numero6:
                startActivity(new Intent(this, Numero6Activity.class));
                break;
            case R.id.numero7:
                startActivity(new Intent(this, Numero7Activity.class));
                break;
            case R.id.numero8:
                startActivity(new Intent(this, Numero8Activity.class));
                break;
            case R.id.numero9:
                startActivity(new Intent(this, Numero9Activity.class));
                break;
            case R.id.numero10:
                startActivity(new Intent(this, Numero10Activity.class));
                break;
            case R.id.numero11:
                startActivity(new Intent(this, Numero11Activity.class));
                break;
            case R.id.numero12:
                startActivity(new Intent(this, Numero12Activity.class));
                break;
            case R.id.numero13:
                startActivity(new Intent(this, Numero13Activity.class));
                break;
            case R.id.numero14:
                startActivity(new Intent(this, Numero14Activity.class));
                break;
            case R.id.numero15:
                startActivity(new Intent(this, Numero15Activity.class));
                break;
            case R.id.numero16:
                startActivity(new Intent(this, Numero16Activity.class));
                break;
            case R.id.numero17:
                startActivity(new Intent(this, Numero17Activity.class));
                break;
            case R.id.numero18:
                startActivity(new Intent(this, Numero18Activity.class));
                break;
            case R.id.numero19:
                startActivity(new Intent(this, Numero19Activity.class));
                break;
            case R.id.numero20:
                startActivity(new Intent(this, Numero20Activity.class));
                break;
            case R.id.numero20s:
                startActivity(new Intent(this, Numero20sActivity.class));
                break;
            case R.id.numero21:
                startActivity(new Intent(this, Numero21Activity.class));
                break;
            case R.id.numero22:
                startActivity(new Intent(this, Numero22Activity.class));
                break;
            case R.id.letraA:
                startActivity(new Intent(this, LetraAActivity.class));
                break;
            case R.id.letraAt:
                startActivity(new Intent(this, LetraAtActivity.class));
                break;
            case R.id.letraB:
                startActivity(new Intent(this, LetraBActivity.class));
                break;
            case R.id.letraBa:
                startActivity(new Intent(this, LetraBaActivity.class));
                break;
            case R.id.letraC:
                startActivity(new Intent(this, LetraCActivity.class));
                break;
            case R.id.letraCv:
                startActivity(new Intent(this, LetraCvActivity.class));
                break;
            case R.id.letraD:
                startActivity(new Intent(this, LetraDActivity.class));
                break;
            case R.id.letraE:
                startActivity(new Intent(this, LetraEActivity.class));
                break;
            case R.id.letraF:
                startActivity(new Intent(this, LetraFActivity.class));
                break;
            case R.id.letraG:
                startActivity(new Intent(this, LetraGActivity.class));
                break;
            case R.id.letraH:
                startActivity(new Intent(this, LetraHActivity.class));
                break;
            case R.id.letraI:
                startActivity(new Intent(this, LetraIActivity.class));
                break;
            case R.id.letraIc:
                startActivity(new Intent(this, LetraIcActivity.class));
                break;
            case R.id.letraIl:
                startActivity(new Intent(this, LetraIlActivity.class));
                break;
            case R.id.letraJv:
                startActivity(new Intent(this, LetraJActivity.class));
                break;
            case R.id.letraK:
                startActivity(new Intent(this, LetraKActivity.class));
                break;
            case R.id.letraL:
                startActivity(new Intent(this, LetraLActivity.class));
                break;
            case R.id.letraM:
                startActivity(new Intent(this, LetraMActivity.class));
                break;
            case R.id.letraN:
                startActivity(new Intent(this, LetraNActivity.class));
                break;
            case R.id.letraNv:
                startActivity(new Intent(this, LetraNActivity.class));
                break;
            case R.id.letraNvt:
                startActivity(new Intent(this, LetraNActivity.class));
                break;
            case R.id.letraO:
                startActivity(new Intent(this, LetraOActivity.class));
                break;
            case R.id.letraP:
                startActivity(new Intent(this, LetraPActivity.class));
                break;
            case R.id.letraR:
                startActivity(new Intent(this, LetraRActivity.class));
                break;
            case R.id.letraS:
                startActivity(new Intent(this, LetraSActivity.class));
                break;
            case R.id.letraT:
                startActivity(new Intent(this, LetraTActivity.class));
                break;
            case R.id.letraTv:
                startActivity(new Intent(this, LetraTActivity.class));
                break;
            case R.id.letraU:
                startActivity(new Intent(this, LetraUActivity.class));
                break;
            case R.id.letraW:
                startActivity(new Intent(this, LetraWActivity.class));
                break;
            }

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
}
