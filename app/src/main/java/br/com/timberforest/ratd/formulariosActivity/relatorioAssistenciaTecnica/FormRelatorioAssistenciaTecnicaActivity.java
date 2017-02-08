package br.com.timberforest.ratd.formulariosActivity.relatorioAssistenciaTecnica;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
//import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.relatorioAssistenciaTecnica.RelatorioAssistenciaTecnicaDao;
import br.com.timberforest.ratd.dao.cadastroMecanico.CadastroMecanicoDao;
import br.com.timberforest.ratd.dashboards.MainActivity;
import br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica.ListRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.CameraActivity;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.RelatorioAssistenciaTecnica;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento;
import br.com.timberforest.ratd.utilitarios.Utils;

import static br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento.PREFS_NAME;

public class FormRelatorioAssistenciaTecnicaActivity extends ActionBarActivity{

    RelatorioAssistenciaTecnicaDao relatorioAssistenciaTecnicaDao = new RelatorioAssistenciaTecnicaDao();
    SharedPreferencesDeslocamento sharedPreferencesDeslocamento = new SharedPreferencesDeslocamento();
    public static final String PREF_NAME = "Preferences";

    private RelatorioAssistenciaTecnica relatorioAssistenciaTecnica;
    private Resources resources;
    private EditText edtChassi;
    private EditText edtCliente;
    private EditText edtModelo;
    private EditText edtHorimetro;
    private EditText edtCidadeCliente;
    private EditText edtEstadoCliente;
    private EditText edtLocalDaObra;
    private EditText edtDefeitoConstatado;
    private EditText edtProcedimentoAdotado;

    private EditText edt_inicio_trabalho;
    private EditText edt_inicio_deslocamento;
    private EditText edt_inicio_almoco;
    private EditText edt_fim_almoco;
    private EditText edt_fim_trabalho;
    private EditText edt_fim_deslocamento;
    private EditText edt_km_rodado;

    private EditText edtCodigoPeca;
    private EditText edtQuantidade;
    private EditText edtDescricao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_relatorio_assistencia_tecnica);

        SharedPreferencesDeslocamento sharedPreferencesDeslocamento = new SharedPreferencesDeslocamento();

        importarDeslocamento();

        initViews();
        CadastroMecanicoDao cadastroMecanicoDao = new CadastroMecanicoDao();

        List<CadastroMecanico> mecanicos = cadastroMecanicoDao.busca();
        if(mecanicos.size() > 0) {
            CadastroMecanico mecanico = mecanicos.get(0);

            TextView  relatorTextView = (TextView) findViewById(R.id.editGetRelatoMec);
            relatorTextView.setText(mecanico.getNome());
            TextView filialMecanicoTextView= (TextView) findViewById(R.id.editGetDistAssiTec);
            filialMecanicoTextView.setText(mecanico.getFilial());
            TextView cidadelMecanicoTextView= (TextView) findViewById(R.id.editGetCidadeDist);
            cidadelMecanicoTextView.setText(mecanico.getCidade());
            TextView estadoMecanicoTextView= (TextView) findViewById(R.id.editGetEstadoDist);
            estadoMecanicoTextView.setText(mecanico.getEstado());
        }
        TextView textFormularioData = (TextView) findViewById(R.id.editgetDataFormulario);
        textFormularioData.setText(getDateTime());

        if (getIntent().hasExtra("relatorioAssistenciaTecnica")) {
            relatorioAssistenciaTecnica = (RelatorioAssistenciaTecnica) getIntent().getExtras().get("relatorioAssistenciaTecnica");

            Utils.setTextFromTextView(this, R.id.editGetRelatoMec, relatorioAssistenciaTecnica.getRelator());
            Utils.setTextFromTextView(this, R.id.editgetDataFormulario, relatorioAssistenciaTecnica.getData());
            Utils.setTextFromTextView(this, R.id.editGetDistAssiTec, relatorioAssistenciaTecnica.getDistribuidorAssisTec());
            Utils.setTextFromTextView(this, R.id.editGetCidadeDist, relatorioAssistenciaTecnica.getCidadeDistr());
            Utils.setTextFromTextView(this, R.id.editGetEstadoDist, relatorioAssistenciaTecnica.getEstadoDistr());
            Utils.setTextEditText(this, R.id.editGetRelatNum, relatorioAssistenciaTecnica.getNumeroRelatorio());
            Utils.setTextEditText(this, R.id.editGetChassiN, relatorioAssistenciaTecnica.getNumeroChassi());
            Utils.setTextEditText(this, R.id.editGetModelo, relatorioAssistenciaTecnica.getModelo());
            Utils.setTextEditText(this, R.id.editGetHorimetro, relatorioAssistenciaTecnica.getHorimetro());
            Utils.setTextEditText(this, R.id.editGetCliente, relatorioAssistenciaTecnica.getCliente());
            Utils.setTextEditText(this, R.id.editGetCidadeClin, relatorioAssistenciaTecnica.getCidadeCli());
            Utils.setTextEditText(this, R.id.editGetEstadoClin, relatorioAssistenciaTecnica.getEstadoCli());
            Utils.setTextEditText(this, R.id.editGetLocalObra, relatorioAssistenciaTecnica.getLocalObra());
            Utils.setTextEditText(this, R.id.editGetMaterialTransp, relatorioAssistenciaTecnica.getMaterialTransp());
            Utils.setTextEditText(this, R.id.editGetDefeitoConstado, relatorioAssistenciaTecnica.getDefeitoCostatado());
            Utils.setTextEditText(this, R.id.editGetProcAdot, relatorioAssistenciaTecnica.getProcedAdot());

            Utils.setTextEditText(this, R.id.edt_inicio_deslocamento, relatorioAssistenciaTecnica.getInicioDeslocamento());
            Utils.setTextEditText(this, R.id.edt_inicio_trabalho, relatorioAssistenciaTecnica.getInicioTrabalho());
            Utils.setTextEditText(this, R.id.edt_inicio_almoco, relatorioAssistenciaTecnica.getInicioAlmoco());
            Utils.setTextEditText(this, R.id.edt_fim_almoco, relatorioAssistenciaTecnica.getFimAlmoco());
            Utils.setTextEditText(this, R.id.edt_fim_trabalho, relatorioAssistenciaTecnica.getFimTrabalho());
            Utils.setTextEditText(this, R.id.edt_fim_deslocamento, relatorioAssistenciaTecnica.getFimDeslocamento());
            Utils.setTextEditText(this, R.id.edt_km_rodado, relatorioAssistenciaTecnica.getKmRodad());

            Utils.setTextEditText(this, R.id.editGetCodPec, relatorioAssistenciaTecnica.getGetCodPec());
            Utils.setTextEditText(this, R.id.editGetPecaQtd, relatorioAssistenciaTecnica.getPecaQtd());
            Utils.setTextEditText(this, R.id.editGetDescPec, relatorioAssistenciaTecnica.getGetDescPec());
            Utils.setTextEditText(this, R.id.editGetCodPec1, relatorioAssistenciaTecnica.getGetCodPec1());
            Utils.setTextEditText(this, R.id.editGetPecaQtd1, relatorioAssistenciaTecnica.getGetPecaQtd1());
            Utils.setTextEditText(this, R.id.editGetDescPec1, relatorioAssistenciaTecnica.getGetDescPec1());
        } else {
            relatorioAssistenciaTecnica = new RelatorioAssistenciaTecnica();
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            
        }

        return super.onKeyDown(keyCode, event);
    }

// importando o deslocamento e travando os edt para edição
    public void importarDeslocamento(){
        SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, 0);
        String iniDes = sharedPreferences.getString("inicio_deslocamento", "");
        String iniTrab = sharedPreferences.getString("inicio_trabalho", "");
        String iniAlm = sharedPreferences.getString("inicio_almoço", "");
        String fimAlm = sharedPreferences.getString("fim_almoço", "");
        String fimTrab = sharedPreferences.getString("fim_trabalho", "");
        String fimDesl = sharedPreferences.getString("fim_deslocamento", "");
        String kmRod = sharedPreferences.getString("km_rodado", "");

        if(iniDes.toString().equals("") || iniTrab.toString().equals("") || iniAlm.toString().equals("") || fimAlm.toString().equals("")
                || fimTrab.toString().equals("") || fimDesl.toString().equals("") || kmRod.toString().equals("")){

            Toast.makeText(getApplicationContext(), "Informações de deslocamento incompletas !!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, SharedPreferencesDeslocamento.class);
            startActivity(intent);

        }else {
            EditText  edt_inicio_deslocamento = (EditText) findViewById(R.id.edt_inicio_deslocamento);
            edt_inicio_deslocamento.setText(iniDes.toString());
            edt_inicio_deslocamento.setEnabled(false);

            EditText  edt_inicio_trabalho = (EditText) findViewById(R.id.edt_inicio_trabalho);
            edt_inicio_trabalho.setText(iniTrab.toString());
            edt_inicio_trabalho.setEnabled(false);

            EditText  edt_inicio_almoco = (EditText) findViewById(R.id.edt_inicio_almoco);
            edt_inicio_almoco.setText(iniAlm.toString());
            edt_inicio_almoco.setEnabled(false);

            EditText  edt_fim_almoco = (EditText) findViewById(R.id.edt_fim_almoco);
            edt_fim_almoco.setText(fimAlm.toString());
            edt_fim_almoco.setEnabled(false);

            EditText  edt_fim_trabalho = (EditText) findViewById(R.id.edt_fim_trabalho);
            edt_fim_trabalho.setText(fimTrab.toString());
            edt_fim_trabalho.setEnabled(false);

            EditText  edt_fim_deslocamento = (EditText) findViewById(R.id.edt_fim_deslocamento);
            edt_fim_deslocamento.setText(fimDesl.toString());
            edt_fim_deslocamento.setEnabled(false);

            EditText  edt_km_rodado = (EditText) findViewById(R.id.edt_km_rodado);
            edt_km_rodado.setText(kmRod.toString());
            edt_km_rodado.setEnabled(false);
        }

    }
    public void abrirCamera (View view){
        startActivity(new Intent(this,CameraActivity.class));
    }

    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    public void salvar(View view) {
        relatorioAssistenciaTecnica.setRelator(Utils.getTextFromTextView(this, R.id.editGetRelatoMec));
        relatorioAssistenciaTecnica.setData(Utils.getTextFromTextView(this, R.id.editgetDataFormulario));
        relatorioAssistenciaTecnica.setDistribuidorAssisTec(Utils.getTextFromTextView(this, R.id.editGetDistAssiTec));
        relatorioAssistenciaTecnica.setCidadeDistr(Utils.getTextFromTextView(this, R.id.editGetCidadeDist));
        relatorioAssistenciaTecnica.setEstadoDistr(Utils.getTextFromTextView(this, R.id.editGetEstadoDist));
        relatorioAssistenciaTecnica.setNumeroRelatorio(Utils.getTextFromEditText(this, R.id.editGetRelatNum));
        relatorioAssistenciaTecnica.setNumeroChassi(Utils.getTextFromEditText(this, R.id.editGetChassiN));
        relatorioAssistenciaTecnica.setModelo(Utils.getTextFromEditText(this, R.id.editGetModelo));
        relatorioAssistenciaTecnica.setHorimetro(Utils.getTextFromEditText(this, R.id.editGetHorimetro));
        relatorioAssistenciaTecnica.setCliente(Utils.getTextFromEditText(this, R.id.editGetCliente));
        relatorioAssistenciaTecnica.setCidadeCli(Utils.getTextFromEditText(this, R.id.editGetCidadeClin));
        relatorioAssistenciaTecnica.setEstadoCli(Utils.getTextFromEditText(this, R.id.editGetEstadoClin));
        relatorioAssistenciaTecnica.setLocalObra(Utils.getTextFromEditText(this, R.id.editGetLocalObra));
        relatorioAssistenciaTecnica.setMaterialTransp(Utils.getTextFromEditText(this, R.id.editGetMaterialTransp));
        relatorioAssistenciaTecnica.setDefeitoCostatado(Utils.getTextFromEditText(this, R.id.editGetDefeitoConstado));
        relatorioAssistenciaTecnica.setProcedAdot(Utils.getTextFromEditText(this, R.id.editGetProcAdot));

        relatorioAssistenciaTecnica.setKmRodad(Utils.getTextFromEditText(this, R.id.edt_km_rodado));

        relatorioAssistenciaTecnica.setInicioDeslocamento(Utils.getTextFromEditText(this, R.id.edt_inicio_deslocamento));
        relatorioAssistenciaTecnica.setInicioTrabalho(Utils.getTextFromEditText(this, R.id.edt_inicio_trabalho));
        relatorioAssistenciaTecnica.setInicioAlmoco(Utils.getTextFromEditText(this, R.id.edt_inicio_almoco));
        relatorioAssistenciaTecnica.setFimAlmoco(Utils.getTextFromEditText(this, R.id.edt_fim_almoco));
        relatorioAssistenciaTecnica.setFimTrabalho(Utils.getTextFromEditText(this, R.id.edt_fim_trabalho));
        relatorioAssistenciaTecnica.setFimDeslocamento(Utils.getTextFromEditText(this, R.id.edt_fim_deslocamento));

        relatorioAssistenciaTecnica.setGetCodPec(Utils.getTextFromEditText(this, R.id.editGetCodPec));
        relatorioAssistenciaTecnica.setPecaQtd(Utils.getTextFromEditText(this, R.id.editGetPecaQtd));
        relatorioAssistenciaTecnica.setGetDescPec(Utils.getTextFromEditText(this, R.id.editGetDescPec));
        relatorioAssistenciaTecnica.setGetCodPec1(Utils.getTextFromEditText(this, R.id.editGetCodPec1));
        relatorioAssistenciaTecnica.setGetPecaQtd1(Utils.getTextFromEditText(this, R.id.editGetPecaQtd1));
        relatorioAssistenciaTecnica.setGetDescPec1(Utils.getTextFromEditText(this, R.id.editGetDescPec1));

        String msgFormulario = getResources().getString(R.string.relatorio_assistencia_tecnica_salvo);

        if (validateFields()) {
            relatorioAssistenciaTecnicaDao.salvar(relatorioAssistenciaTecnica);
            Toast.makeText(this, msgFormulario, Toast.LENGTH_LONG).show();
        }
        dialogoDeslocamento();
    }
    private AlertDialog alerta;
    private void dialogoDeslocamento()  {
        //LayoutInflater é utilizado para inflar nosso layout em uma view.
        //-pegamos nossa instancia da classe
        LayoutInflater li = getLayoutInflater();

        //inflamos o layout alerta.xml na view
        View view = li.inflate(R.layout.dialog_assistencia_tecnica_deslocamento, null);
        //definimos para o botão do layout um clickListener
        view.findViewById(R.id.btn_sim).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(FormRelatorioAssistenciaTecnicaActivity.this, ListRelatorioAssistenciaTecnicaActivity.class);
                startActivity(intent);
            }
        });
        view.findViewById(R.id.btn_nao).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                limparDeslocamento();
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        alerta = builder.create();
        alerta.show();
    }
    public void limparDeslocamento(){
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putString("inicio_deslocamento", "");
        editor.putString("inicio_trabalho","");
        editor.putString("inicio_almoço","");
        editor.putString("fim_almoço","");
        editor.putString("fim_trabalho","");
        editor.putString("fim_deslocamento","");
        editor.putString("km_inicial","");
        editor.putString("km_final","");
        editor.putString("km_rodado","");
        editor.commit();

        Toast.makeText(getApplicationContext(), "Campos de deslocamento liberados !", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ListRelatorioAssistenciaTecnicaActivity.class);
        startActivity(intent);
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
            public void afterTextChanged(Editable s) {callClearErrors(s);
            }
        };
        edtChassi= (EditText)findViewById(R.id.editGetChassiN);
        edtChassi.addTextChangedListener(textWatcher);
        edtCliente= (EditText)findViewById(R.id.editGetCliente);
        edtCliente.addTextChangedListener(textWatcher);
        edtModelo= (EditText)findViewById(R.id.editGetModelo);
        edtModelo.addTextChangedListener(textWatcher);
        edtHorimetro= (EditText)findViewById(R.id.editGetHorimetro);
        edtHorimetro.addTextChangedListener(textWatcher);
        edtCidadeCliente= (EditText)findViewById(R.id.editGetCidadeClin);
        edtCidadeCliente.addTextChangedListener(textWatcher);
        edtEstadoCliente= (EditText)findViewById(R.id.editGetEstadoClin);
        edtEstadoCliente.addTextChangedListener(textWatcher);
        edtLocalDaObra= (EditText)findViewById(R.id.editGetLocalObra);
        edtLocalDaObra.addTextChangedListener(textWatcher);
        edtDefeitoConstatado = (EditText) findViewById(R.id.editGetDefeitoConstado);
        edtDefeitoConstatado.addTextChangedListener(textWatcher);
        edtProcedimentoAdotado = (EditText) findViewById(R.id.editGetProcAdot);
        edtProcedimentoAdotado.addTextChangedListener(textWatcher);
        edt_inicio_deslocamento = (EditText) findViewById(R.id.edt_inicio_deslocamento);
        edt_inicio_deslocamento.addTextChangedListener(textWatcher);
        edt_inicio_trabalho = (EditText) findViewById(R.id.edt_inicio_trabalho);
        edt_inicio_trabalho.addTextChangedListener(textWatcher);
        edt_inicio_almoco = (EditText) findViewById(R.id.edt_inicio_almoco);
        edt_inicio_almoco.addTextChangedListener(textWatcher);
        edt_fim_almoco = (EditText) findViewById(R.id.edt_fim_almoco);
        edt_fim_almoco.addTextChangedListener(textWatcher);
        edt_fim_trabalho = (EditText) findViewById(R.id.edt_fim_trabalho);
        edt_fim_trabalho.addTextChangedListener(textWatcher);
        edt_fim_deslocamento = (EditText) findViewById(R.id.edt_fim_deslocamento);
        edt_fim_deslocamento.addTextChangedListener(textWatcher);
        edt_km_rodado = (EditText) findViewById(R.id.edt_km_rodado);
        edt_km_rodado.addTextChangedListener(textWatcher);
        edtCodigoPeca = (EditText) findViewById(R.id.editGetCodPec);
        edtCodigoPeca.addTextChangedListener(textWatcher);
        edtQuantidade = (EditText) findViewById(R.id.editGetPecaQtd);
        edtQuantidade.addTextChangedListener(textWatcher);
        edtDescricao = (EditText) findViewById(R.id.editGetDescPec);
        edtDescricao.addTextChangedListener(textWatcher);
    }
    private void callClearErrors(Editable s) {}
    private boolean validateFields() {
        String cliente = relatorioAssistenciaTecnica.getCliente().toString().trim();
        String chassi = relatorioAssistenciaTecnica.getNumeroChassi().toString().trim();
        String modelo = relatorioAssistenciaTecnica.getModelo().toString().trim();
        String horimetro = relatorioAssistenciaTecnica.getHorimetro().toString().trim();
        String cidadeCliente= relatorioAssistenciaTecnica.getCidadeCli().toString().trim();
        String estadoCliente= relatorioAssistenciaTecnica.getEstadoCli().toString().trim();
        String localDaObra= relatorioAssistenciaTecnica.getLocalObra().toString().trim();
        String defeitoConstatado = relatorioAssistenciaTecnica.getDefeitoCostatado().toString().trim();
        String procedimentoAdotado = relatorioAssistenciaTecnica.getProcedAdot().toString().trim();
        String codigoPeca = relatorioAssistenciaTecnica.getGetCodPec().toString().trim();
        String quantidade = relatorioAssistenciaTecnica.getPecaQtd().toString().trim();
        String descricao = relatorioAssistenciaTecnica.getGetDescPec().toString().trim();
        return (!isEmptyFields(cliente, chassi, modelo, horimetro, cidadeCliente, estadoCliente, localDaObra, defeitoConstatado,
                procedimentoAdotado, codigoPeca, quantidade, descricao));
    }
    private boolean isEmptyFields(String cliente , String chassi, String modelo, String horimitro, String cidadeCliente,
                                  String estadoCliente, String localDaObra, String defeitoConstatado , String procedimentoAdotado,
                                  String codigoPeca , String quantidade, String descricao) {
        if (TextUtils.isEmpty(chassi)) {
            edtChassi.requestFocus();
            edtChassi.setError(resources.getString(R.string.chassi_required));
            return true;
        }else if(TextUtils.isEmpty(cliente)) {
            edtCliente.requestFocus();
            edtCliente.setError(resources.getString(R.string.cliente_required));
            return true;
        }else if(TextUtils.isEmpty(modelo)) {
            edtModelo.requestFocus();
            edtModelo.setError(resources.getString(R.string.modelo_required));
            return true;
        }else if(TextUtils.isEmpty(horimitro)) {
            edtHorimetro.requestFocus();
            edtHorimetro.setError(resources.getString(R.string.horimetro_required));
            return true;
        }else if(TextUtils.isEmpty(cidadeCliente)) {
            edtCidadeCliente.requestFocus();
            edtCidadeCliente.setError(resources.getString(R.string.cidade_cliente_required));
            return true;
        }else if(TextUtils.isEmpty(estadoCliente)) {
            edtEstadoCliente.requestFocus();
            edtEstadoCliente.setError(resources.getString(R.string.estado_cliente_required));
            return true;
        }else if(TextUtils.isEmpty(localDaObra)) {
            edtLocalDaObra.requestFocus();
            edtLocalDaObra.setError(resources.getString(R.string.local_da_obra_required));
            return true;
        }else if (TextUtils.isEmpty(defeitoConstatado)) {
            edtDefeitoConstatado.requestFocus();
            edtDefeitoConstatado.setError(resources.getString(R.string.defeito_constatado_required));
            return true;
        }else if (TextUtils.isEmpty(procedimentoAdotado)) {
            edtProcedimentoAdotado.requestFocus();
            edtProcedimentoAdotado.setError(resources.getString(R.string.procedimento_adotado_required));
            return true;
        }else if(TextUtils.isEmpty(codigoPeca)) {
            edtCodigoPeca.requestFocus();
            edtCodigoPeca.setError(resources.getString(R.string.codigo_peca_required));
            return true;
        }else if(TextUtils.isEmpty(quantidade)) {
            edtQuantidade.requestFocus();
            edtQuantidade.setError(resources.getString(R.string.quantidade_required));
            return true;
        }else if(TextUtils.isEmpty(descricao)) {
            edtDescricao.requestFocus();
            edtDescricao.setError(resources.getString(R.string.descricao_required));
            return true;
        }return false;
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
    private void clearErrorFields(EditText... editTexts) {
        for (EditText editText : editTexts) {
            editText.setError(null);
        }
    }
}

