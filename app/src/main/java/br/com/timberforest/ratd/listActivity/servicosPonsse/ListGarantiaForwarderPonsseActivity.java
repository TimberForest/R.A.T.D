package br.com.timberforest.ratd.listActivity.servicosPonsse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.formulariosActivity.servicosPonsse.FormGarantiaForwarderPonsseActivity;
import br.com.timberforest.ratd.listAdapter.servicosPonsse.LinhaConsultarAdapterGarantiaForwarderPonsse;
import br.com.timberforest.ratd.model.servicosPonsse.GarantiaForwarderModel;
import br.com.timberforest.ratd.dao.servicosPonsse.GarantiaForwarderRepository;

import java.util.List;

public class ListGarantiaForwarderPonsseActivity extends AppCompatActivity {

    //CRIANDO UM OBJETO DO TIPO ListView PARA RECEBER OS REGISTROS DE UM ADAPTER
    ListView listViewgarantiasForwarder;

    public long getItemId(int position) {
        return position;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_garantia_forwarder_ponsse);

        //VINCULANDO O LISTVIEW DA TELA AO OBJETO CRIADO
        listViewgarantiasForwarder = (ListView)this.findViewById(R.id.listViewGarantiasForwarder);

        //CHAMA O MÉTODO QUE CARREGA AS PESSOAS CADASTRADAS NA BASE DE DADOS
        this.CarregarPessoasCadastradas();
        //CHAMA O MÉTODO QUE CRIA O EVENTO PARA O BOTÃO VOLTAR
    }

    //MÉTODO QUE CONSULTA AS PESSOAS CADASTRADAS
    protected  void CarregarPessoasCadastradas(){

        GarantiaForwarderRepository garantiaForwarderRepository =  new GarantiaForwarderRepository(this);

        //BUSCA AS PESSOAS CADASTRADAS
        List<GarantiaForwarderModel> garantiaForwarderModels = garantiaForwarderRepository.SelecionarTodos();

        //SETA O ADAPTER DA LISTA COM OS REGISTROS RETORNADOS DA BASE
        listViewgarantiasForwarder.setAdapter(new LinhaConsultarAdapterGarantiaForwarderPonsse(this, garantiaForwarderModels));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list_garantia_forwarder_ponsse, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_new) {
            Intent intent = new Intent(this, FormGarantiaForwarderPonsseActivity.class);
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
}