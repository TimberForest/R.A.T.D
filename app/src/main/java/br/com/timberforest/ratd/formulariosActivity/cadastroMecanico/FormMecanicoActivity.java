package br.com.timberforest.ratd.formulariosActivity.cadastroMecanico;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.timberforest.ratd.utilitarios.Utils;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.cadastroMecanico.CadastroMecanicoDao;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;

public class FormMecanicoActivity extends ActionBarActivity {
    CadastroMecanicoDao cadastroMecanicoDao = new CadastroMecanicoDao();
    private CadastroMecanico mecanico;

    private EditText edtNome;
    private EditText edtMatricula;
    private EditText edtCargoFuncao;
    private EditText edtFilial;
    private EditText edtCidade;
    private EditText edtEstado;

    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_relatorio_avaliacao_operacional);
        setContentView(R.layout.activity_form_cadastro_mecanico);
        initViews();
        if (getIntent().hasExtra("CadastroMecanico")) {
            mecanico = (CadastroMecanico) getIntent().getExtras().get("CadastroMecanico");

            Utils.setTextEditText(this, R.id.editNomeMecanico, mecanico.getNome());
            Utils.setTextEditText(this, R.id.editMatriculaMecanico, mecanico.getMatricula());
            Utils.setTextEditText(this, R.id.editCargoMecanico, mecanico.getCargoFuncao());
            Utils.setTextEditText(this, R.id.editFilialMecanico, mecanico.getFilial());
            Utils.setTextEditText(this, R.id.editCidadeMecanico, mecanico.getCidade());
            Utils.setTextEditText(this, R.id.editEstadoMecanico, mecanico.getEstado());
        } else {
            mecanico = new CadastroMecanico();
        }
    }
    public void salavarPerfilMecanico(View view){
        mecanico.setNome(Utils.getTextFromEditText(this, R.id.editNomeMecanico));
        mecanico.setMatricula(Utils.getTextFromEditText(this, R.id.editMatriculaMecanico));
        mecanico.setCargoFuncao(Utils.getTextFromEditText(this, R.id.editCargoMecanico));
        mecanico.setFilial(Utils.getTextFromEditText(this, R.id.editFilialMecanico));
        mecanico.setCidade(Utils.getTextFromEditText(this, R.id.editCidadeMecanico));
        mecanico.setEstado(Utils.getTextFromEditText(this, R.id.editEstadoMecanico));
        String msgSalvarMecanico = getResources().getString(R.string.mecanicoSalvo);
        if (validateFields()) {
            cadastroMecanicoDao.salvar(mecanico);
            Toast.makeText(this, msgSalvarMecanico, Toast.LENGTH_LONG).show();
            super.finish();
        }
    }
    private void initViews() {
        resources = getResources();
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                callClearErrors(s);
            }
        };
        edtNome = (EditText) findViewById(R.id.editNomeMecanico);
        edtNome.addTextChangedListener(textWatcher);
        edtMatricula= (EditText) findViewById(R.id.editMatriculaMecanico);
        edtMatricula.addTextChangedListener(textWatcher);
        edtCargoFuncao= (EditText) findViewById(R.id.editCargoMecanico);
        edtCargoFuncao.addTextChangedListener(textWatcher);
        edtFilial= (EditText) findViewById(R.id.editFilialMecanico);
        edtFilial.addTextChangedListener(textWatcher);
        edtCidade= (EditText) findViewById(R.id.editCidadeMecanico);
        edtCidade.addTextChangedListener(textWatcher);
        edtEstado= (EditText) findViewById(R.id.editEstadoMecanico);
        edtEstado.addTextChangedListener(textWatcher);
    }
    private void callClearErrors(Editable s) {
    }
    private boolean validateFields() {
        String nome = mecanico.getNome().toString().trim();
        String matricula= mecanico.getMatricula().toString().trim();
        String cargoFuncao = mecanico.getCargoFuncao().toString().trim();
        String filial = mecanico.getFilial().toString().trim();
        String cidade = mecanico.getCidade().toString().trim();
        String estado = mecanico.getEstado().toString().trim();

        return (!isEmptyFields(nome, matricula, cargoFuncao, filial, cidade, estado));
    }
    private boolean isEmptyFields(String nome , String matricula, String cargoFuncao, String filial, String cidade, String estado) {
        if (TextUtils.isEmpty(nome)) {
            edtNome.requestFocus();
            edtNome.setError(resources.getString(R.string.nome_required));
            return true;
        }
        else if(TextUtils.isEmpty(matricula)) {
            edtMatricula.requestFocus();
            edtMatricula.setError(resources.getString(R.string.matricula_required));
            return true;
        }
        else if(TextUtils.isEmpty(cargoFuncao)) {
            edtCargoFuncao.requestFocus();
            edtCargoFuncao.setError(resources.getString(R.string.cargo_funcao_required));
            return true;
        }
        else if(TextUtils.isEmpty(filial)) {
            edtFilial.requestFocus();
            edtFilial.setError(resources.getString(R.string.filial_required));
            return true;
        }
        else if(TextUtils.isEmpty(cidade)) {
            edtCidade.requestFocus();
            edtCidade.setError(resources.getString(R.string.cidade_required));
            return true;
        }
        else if(TextUtils.isEmpty(estado)) {
            edtEstado.requestFocus();
            edtEstado.setError(resources.getString(R.string.estado_required));
            return true;
        }
        return false;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simples_botao_voltar, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_voltar) {
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void clearErrorFields(EditText... editTexts) {
        for (EditText editText : editTexts) {
            editText.setError(null);
        }
    }

}
