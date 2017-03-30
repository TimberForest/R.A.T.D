package br.com.timberforest.ratd.detail.cadastroMecanico;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.cadastroMecanico.CadastroMecanicoDao;
import br.com.timberforest.ratd.formulariosActivity.cadastroMecanico.FormMecanicoActivity;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;

public class DetailMecanicoActivity extends ActionBarActivity {
    private CadastroMecanicoDao cadastroMecanicoDao = new CadastroMecanicoDao();
    private CadastroMecanico mecanico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_cadastro_mecanico);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        mecanico = (CadastroMecanico) getIntent().getExtras().get("CadastroMecanico");

        atualizarTela();
    }
    private void atualizarTela(){
        TextView textMecanicoNome = (TextView) findViewById(R.id.textNomeDatailMecanico);
        TextView textMecanicoMatricula = (TextView) findViewById(R.id.textMatriculaDatailMecanico);
        TextView textMecanicoCargoFuncao = (TextView) findViewById(R.id.textCargoDatailMecanico);
        TextView textMecanicoFilial = (TextView) findViewById(R.id.textFilialDatailMecanico);
        TextView textMecanicoCidade= (TextView) findViewById(R.id.textCidadeDatailMecanico);
        TextView textMecanicoEstado= (TextView) findViewById(R.id.textEstadoDatailMecanico);

        textMecanicoNome.setText(mecanico.getNome());
        textMecanicoMatricula.setText(mecanico.getMatricula());
        textMecanicoCargoFuncao.setText(mecanico.getCargoFuncao());
        textMecanicoFilial.setText(mecanico.getFilial());
        textMecanicoCidade.setText(mecanico.getCidade());
        textMecanicoEstado.setText(mecanico.getEstado());
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_mecanico_detail, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_edit) {
            Intent intent = new Intent(this, FormMecanicoActivity.class);
            intent.putExtra("CadastroMecanico", mecanico);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.home){
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onResume(){
        super.onResume();
        if (mecanico!=null){
            mecanico= cadastroMecanicoDao.buscaPorId(mecanico.getIdMecanico());
            atualizarTela();
        }
    }
}
