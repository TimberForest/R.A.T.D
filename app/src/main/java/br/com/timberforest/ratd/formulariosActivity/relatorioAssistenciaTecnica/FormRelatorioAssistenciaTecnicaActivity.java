package br.com.timberforest.ratd.formulariosActivity.relatorioAssistenciaTecnica;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dao.cadastroMecanico.CadastroMecanicoDao;
import br.com.timberforest.ratd.dao.relatorioAssistenciaTecnica.RelatorioAssistenciaTecnicaDao;
import br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica.ListRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;
import br.com.timberforest.ratd.utilitarios.CameraActivity;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.RelatorioAssistenciaTecnica;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento;
import br.com.timberforest.ratd.utilitarios.Utils;
import de.keyboardsurfer.android.widget.crouton.Configuration;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

import static br.com.timberforest.ratd.R.id.editGetRelatNum;
import static br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento.PREFS_NAME;

public class FormRelatorioAssistenciaTecnicaActivity extends ActionBarActivity{

    RelatorioAssistenciaTecnicaDao relatorioAssistenciaTecnicaDao = new RelatorioAssistenciaTecnicaDao();
    SharedPreferencesDeslocamento sharedPreferencesDeslocamento = new SharedPreferencesDeslocamento();
    public static final String PREF_NAME = "sharedPreferencesDeslocamento";
    public static final String PREF_ID_RATD = "idRatd";

    Long aux;
    Long aux1;
    private final  long aux2 = 1;
    private RelatorioAssistenciaTecnica relatorioAssistenciaTecnica;
    private Resources resources;
    private EditText edtChassi, edtCliente,edtModelo, edtHorimetro, edtEstadoCliente, edtCidadeCliente,edtLocalDaObra,edtDefeitoConstatado,
            edtProcedimentoAdotado,edtCodigoPeca,edtQuantidade,edtDescricao, edt_pendencias;

    private EditText edt_horas_deslocamento, edt_horas_trabalhadas, edt_horas_refeicao, edt_extras_trabalhadas, edt_extras_deslocamento, edt_km_rodado;

    final Style styleAlert = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.RED)
            .setConfiguration(new Configuration.Builder().setDuration(4000).build())
            .build();

    final Style styleConfirm = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.GREEN)
            .setConfiguration(new Configuration.Builder().setDuration(5000).build())
            .build();
    final Style styleInf = new Style.Builder()
            .setTextSize(30)
            .setBackgroundColorValue(Color.BLUE)
            .setConfiguration(new Configuration.Builder().setDuration(5000).build())
            .build();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_relatorio_assistencia_tecnica);


        EditText editGetRelatNum = (EditText) findViewById(R.id.editGetRelatNum);
        SharedPreferencesDeslocamento sharedPreferencesDeslocamento = new SharedPreferencesDeslocamento();

        List<RelatorioAssistenciaTecnica> relatorioAssistenciaTecnicas = relatorioAssistenciaTecnicaDao.ultimoRatd();
        if (relatorioAssistenciaTecnicas != null){
            if(relatorioAssistenciaTecnicas.size() > 0) {
                RelatorioAssistenciaTecnica rel = relatorioAssistenciaTecnicas.get(0);
                editGetRelatNum.setText(rel.getIdFormulario().toString());
                editGetRelatNum.setEnabled(false);

                SharedPreferences settings = getSharedPreferences(PREF_ID_RATD, 0);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("idRatd", rel.getIdFormulario().toString());
                editor.commit();

            }
        }

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
            Utils.setTextEditText(this, R.id.edt_pendencias, relatorioAssistenciaTecnica.getPendencias());
            Utils.setTextEditText(this, R.id.edt_horas_deslocamento, relatorioAssistenciaTecnica.getInicioDeslocamento());
            Utils.setTextEditText(this, R.id.edt_horas_refeicao, relatorioAssistenciaTecnica.getInicioTrabalho());
            Utils.setTextEditText(this, R.id.edt_horas_trabalhadas, relatorioAssistenciaTecnica.getInicioAlmoco());
            Utils.setTextEditText(this, R.id.edt_extras_deslocamento, relatorioAssistenciaTecnica.getFimAlmoco());
            Utils.setTextEditText(this, R.id.edt_extras_trabalhadas, relatorioAssistenciaTecnica.getFimTrabalho());
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



    //botão voltar do device
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            voltarListaAssistenciaTecnica();
        }
        return super.onKeyDown(keyCode, event);
    }

    public void voltarListaAssistenciaTecnica()  {
        //LayoutInflater é utilizado para inflar nosso layout em uma view.
        //-pegamos nossa instancia da classe
        LayoutInflater li = getLayoutInflater();

        //inflamos o layout alerta.xml na view
        View view = li.inflate(R.layout.dialog_deseja_realmente_voltar, null);
        //definimos para o botão do layout um clickListener
        view.findViewById(R.id.btn_sim).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(FormRelatorioAssistenciaTecnicaActivity.this, ListRelatorioAssistenciaTecnicaActivity.class);
                startActivity(intent);
                finish();
            }
        });
        view.findViewById(R.id.btn_nao).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                alerta.cancel();
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        alerta = builder.create();
        alerta.show();
    }

    public void importDesloc(View view){
        try{
            SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, 0);
            String desloc = sharedPreferences.getString("tempo_deslocamento","");
            String ref = sharedPreferences.getString("tempo_refeicao","");
            String serv = sharedPreferences.getString("tempo_servico","");
            String extDesl = sharedPreferences.getString("tempo_servico","");
            String extTrab = sharedPreferences.getString("tempo_servico","");
            String kmRodado = sharedPreferences.getString("tot_kmRodado","");

            edt_horas_deslocamento = (EditText) findViewById(R.id.edt_horas_deslocamento);
            edt_horas_trabalhadas = (EditText) findViewById(R.id.edt_horas_trabalhadas);
            edt_horas_refeicao = (EditText) findViewById(R.id.edt_horas_refeicao);
            edt_extras_trabalhadas = (EditText) findViewById(R.id.edt_extras_trabalhadas);
            edt_extras_deslocamento = (EditText) findViewById(R.id.edt_extras_deslocamento);
            edt_km_rodado = (EditText) findViewById(R.id.edt_km_rodado);
            edt_horas_deslocamento.setText(desloc.toString());
            edt_horas_refeicao.setText(ref.toString());
            edt_horas_trabalhadas.setText(serv.toString());
            edt_extras_deslocamento.setText(extDesl.toString());
            edt_extras_trabalhadas.setText(extTrab.toString());
            edt_km_rodado.setText(kmRodado.toString());

            Crouton.makeText(FormRelatorioAssistenciaTecnicaActivity.this, "Dados do deslocamento importados com sucesso !", styleConfirm).show();
            dialogoDeslocamento();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
/*
    public void importDeslocamento(View view){
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

            Crouton.makeText(FormRelatorioAssistenciaTecnicaActivity.this, "Dados do deslocamento importados com sucesso !", styleConfirm).show();
            dialogoDeslocamento();
        }

    }
*/


    public void abrirCamera (View view){
        startActivity(new Intent(this,CameraActivity.class));
    }

    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy  HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
    public void salvar(View view) {
        relatorioAssistenciaTecnica.setRelator(Utils.getTextFromTextView(this, R.id.editGetRelatoMec));
        relatorioAssistenciaTecnica.setData(Utils.getTextFromTextView(this, R.id.editgetDataFormulario));
        relatorioAssistenciaTecnica.setDistribuidorAssisTec(Utils.getTextFromTextView(this, R.id.editGetDistAssiTec));
        relatorioAssistenciaTecnica.setCidadeDistr(Utils.getTextFromTextView(this, R.id.editGetCidadeDist));
        relatorioAssistenciaTecnica.setEstadoDistr(Utils.getTextFromTextView(this, R.id.editGetEstadoDist));
        relatorioAssistenciaTecnica.setNumeroRelatorio(Utils.getTextFromEditText(this, editGetRelatNum));
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
        relatorioAssistenciaTecnica.setPendencias(Utils.getTextFromEditText(this, R.id.edt_pendencias));
        relatorioAssistenciaTecnica.setKmRodad(Utils.getTextFromEditText(this, R.id.edt_km_rodado));

        relatorioAssistenciaTecnica.setInicioDeslocamento(Utils.getTextFromEditText(this, R.id.edt_horas_trabalhadas));
        relatorioAssistenciaTecnica.setInicioTrabalho(Utils.getTextFromEditText(this, R.id.edt_horas_refeicao));
        relatorioAssistenciaTecnica.setInicioAlmoco(Utils.getTextFromEditText(this, R.id.edt_horas_deslocamento));
        relatorioAssistenciaTecnica.setFimAlmoco(Utils.getTextFromEditText(this, R.id.edt_extras_trabalhadas));
        relatorioAssistenciaTecnica.setFimTrabalho(Utils.getTextFromEditText(this, R.id.edt_extras_deslocamento));

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
            Intent intent = new Intent(FormRelatorioAssistenciaTecnicaActivity.this, ListRelatorioAssistenciaTecnicaActivity.class);
            startActivity(intent);
            finish();
        }

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
                alerta.cancel();
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
        editor.putString("ini_km1", "");
        editor.putString("fim_km1", "");
        editor.putString("ini_km2", "");
        editor.putString("fim_km2", "");
        editor.putString("ini_km3", "");
        editor.putString("fim_km3", "");
        editor.putString("ini_km4", "");
        editor.putString("fim_km4", "");
        editor.putString("ini_km5", "");
        editor.putString("fim_km5", "");
        editor.putString("ini_km6", "");
        editor.putString("fim_km6", "");
        editor.putString("tot_km1", "");
        editor.putString("tot_km2", "");
        editor.putString("tot_km3", "");
        editor.putString("tot_km4", "");
        editor.putString("tot_km5", "");
        editor.putString("tot_km6", "");
        editor.putString("tot_kmRodado", "");
        editor.putString("ini_desl1", "");
        editor.putString("fim_desl1", "");
        editor.putString("ini_desl2", "");
        editor.putString("fim_desl2", "");
        editor.putString("ini_desl3", "");
        editor.putString("fim_desl3", "");
        editor.putString("ini_desl4", "");
        editor.putString("fim_desl4", "");
        editor.putString("ini_desl5", "");
        editor.putString("fim_desl5", "");
        editor.putString("ini_desl6", "");
        editor.putString("fim_desl6", "");
        editor.putString("tempo_desl1", "");
        editor.putString("tempo_desl2", "");
        editor.putString("tempo_desl3", "");
        editor.putString("tempo_desl4", "");
        editor.putString("tempo_desl5", "");
        editor.putString("tempo_desl6", "");
        editor.putString("tempo_deslocamento", "");
        editor.putString("ini_serv1", "");
        editor.putString("fim_serv1", "");
        editor.putString("ini_serv2", "");
        editor.putString("fim_serv2", "");
        editor.putString("ini_serv3", "");
        editor.putString("fim_serv3", "");
        editor.putString("ini_serv4", "");
        editor.putString("fim_serv4", "");
        editor.putString("ini_serv5", "");
        editor.putString("fim_serv5", "");
        editor.putString("ini_serv6", "");
        editor.putString("fim_serv6", "");
        editor.putString("tempo_serv1", "");
        editor.putString("tempo_serv2", "");
        editor.putString("tempo_serv3", "");
        editor.putString("tempo_serv4", "");
        editor.putString("tempo_serv5", "");
        editor.putString("tempo_serv6", "");
        editor.putString("tempo_servico", "");
        editor.putString("ini_ref1", "");
        editor.putString("fim_ref1", "");
        editor.putString("ini_ref2", "");
        editor.putString("fim_ref2", "");
        editor.putString("ini_ref3", "");
        editor.putString("fim_ref3", "");
        editor.putString("ini_ref4", "");
        editor.putString("fim_ref4", "");
        editor.putString("ini_ref5", "");
        editor.putString("fim_ref5", "");
        editor.putString("ini_ref6", "");
        editor.putString("fim_ref6", "");
        editor.putString("tempo_ref1", "");
        editor.putString("tempo_ref2", "");
        editor.putString("tempo_ref3", "");
        editor.putString("tempo_ref4", "");
        editor.putString("tempo_ref5", "");
        editor.putString("tempo_ref6", "");
        editor.putString("tempo_refeicao", "");
        editor.commit();

        Toast.makeText(getApplicationContext(), "Campos de deslocamento liberados !", Toast.LENGTH_SHORT).show();
        alerta.cancel();
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
        edt_horas_deslocamento = (EditText) findViewById(R.id.edt_horas_deslocamento);
        edt_horas_deslocamento.addTextChangedListener(textWatcher);
        edt_horas_trabalhadas = (EditText) findViewById(R.id.edt_horas_trabalhadas);
        edt_horas_trabalhadas.addTextChangedListener(textWatcher);
        edt_horas_refeicao = (EditText) findViewById(R.id.edt_horas_refeicao);
        edt_horas_refeicao.addTextChangedListener(textWatcher);
        edt_extras_trabalhadas = (EditText) findViewById(R.id.edt_extras_trabalhadas);
        edt_extras_trabalhadas.addTextChangedListener(textWatcher);
        edt_extras_deslocamento = (EditText) findViewById(R.id.edt_extras_deslocamento);
        edt_extras_deslocamento.addTextChangedListener(textWatcher);
        edt_km_rodado = (EditText) findViewById(R.id.edt_km_rodado);
        edt_km_rodado.addTextChangedListener(textWatcher);
        edtCodigoPeca = (EditText) findViewById(R.id.editGetCodPec);
        edtCodigoPeca.addTextChangedListener(textWatcher);
        edtQuantidade = (EditText) findViewById(R.id.editGetPecaQtd);
        edtQuantidade.addTextChangedListener(textWatcher);
        edtDescricao = (EditText) findViewById(R.id.editGetDescPec);
        edtDescricao.addTextChangedListener(textWatcher);

        edt_horas_deslocamento.setEnabled(false);
        edt_horas_trabalhadas.setEnabled(false);
        edt_horas_refeicao.setEnabled(false);
        edt_extras_trabalhadas.setEnabled(false);
        edt_extras_deslocamento.setEnabled(false);
        edt_km_rodado.setEnabled(false);
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
    private void clearErrorFields(EditText... editTexts) {
        for (EditText editText : editTexts) {
            editText.setError(null);
        }
    }

}