/*
package com.timberforest.andreives.relatorios.listActivity.servicosPonsse;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.timberforest.andreives.relatorios.R;
import CadastroMecanicoDao;
import GarantiaForwarderRepository;
import com.timberforest.andreives.relatorios.dao.servicosPonsse.ManutencaoProgramadaGruaRepository;
import FormGarantiaForwarderPonsseActivity;
import com.timberforest.andreives.relatorios.formulariosActivity.servicosPonsse.FormManutencaoProgramadaGruaPonsseActivity;
import LinhaConsultarAdapterGarantiaForwarderPonsse;
import com.timberforest.andreives.relatorios.listAdapter.servicosPonsse.LinhaConsultarAdapterManutencaoProgGruaPonsse;
import GarantiaForwarderModel;
import ManutencaoProgramadaGruaModel;

import java.util.List;

public class ListManutencaoProgGruaPonsseActivity extends AppCompatActivity {

    //CRIANDO UM OBJETO DO TIPO ListView PARA RECEBER OS REGISTROS DE UM ADAPTER
    ListView listViewgarantiasGrua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_manutencao_programada_grua_ponsse);

        //VINCULANDO O LISTVIEW DA TELA AO OBJETO CRIADO
        listViewgarantiasGrua = (ListView)this.findViewById(R.id.listViewGarantiasGrua);

        //CHAMA O MÉTODO QUE CARREGA AS PESSOAS CADASTRADAS NA BASE DE DADOS
        this.CarregarPessoasCadastradas();
        //CHAMA O MÉTODO QUE CRIA O EVENTO PARA O BOTÃO VOLTAR
    }

    //MÉTODO QUE CONSULTA AS PESSOAS CADASTRADAS
    protected  void CarregarPessoasCadastradas(){


        ManutencaoProgramadaGruaRepository manutencaoProgramadaGruaRepository=  new ManutencaoProgramadaGruaRepository(this);
        //BUSCA AS PESSOAS CADASTRADAS
        List<ManutencaoProgramadaGruaModel> manutencaoProgramadaGruaModels = manutencaoProgramadaGruaRepository.SelecionarTodos();

        //SETA O ADAPTER DA LISTA COM OS REGISTROS RETORNADOS DA BASE
        listViewgarantiasGrua.setAdapter(new LinhaConsultarAdapterManutencaoProgGruaPonsse(this, manutencaoProgramadaGruaModels));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list_garantia_forwarder_ponsse, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_new) {
            Intent intent = new Intent(this, FormManutencaoProgramadaGruaPonsseActivity.class);
            startActivity(intent);
            return true;
        }
        if(item.getItemId()==R.id.action_refresh) {
            CarregarPessoasCadastradas();
        }
        if(item.getItemId()==R.id.action_voltar) {
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}*/
