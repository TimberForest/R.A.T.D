package br.com.timberforest.ratd.listAdapter.servicosPonsse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.detail.servicosPonsse.DetailGarantiaForwarderPonsseActivity;
import br.com.timberforest.ratd.listActivity.servicosPonsse.ListGarantiaForwarderPonsseActivity;
import br.com.timberforest.ratd.model.servicosPonsse.GarantiaForwarderModel;
import br.com.timberforest.ratd.dao.servicosPonsse.GarantiaForwarderRepository;

import java.util.ArrayList;
import java.util.List;

public class LinhaConsultarAdapterGarantiaForwarderPonsse extends BaseAdapter {

    GarantiaForwarderModel garantiaForwarderModel;

    //CRIANDO UM OBJETO LayoutInflater PARA FAZER LINK A NOSSA VIEW(activity_linha_consultar.xml)
    private static LayoutInflater layoutInflater = null;

    //CRIANDO UMA LISTA DE PESSOAS
    List<GarantiaForwarderModel> garantiaForwarderModels =  new ArrayList<GarantiaForwarderModel>();

    //CIRANDO UM OBJETO DA NOSSA CLASSE QUE FAZ ACESSO AO BANCO DE DADOS
    GarantiaForwarderRepository garantiaForwarderRepository;

    //CRIANDO UM OBJETO DA NOSSA ATIVIDADE QUE CONTEM A LISTA
    private ListGarantiaForwarderPonsseActivity listGarantiaForwarderPonsseActivity;

    //CONSTRUTOR QUE VAI RECEBER A NOSSA ATIVIDADE COMO PARAMETRO E A LISTA DE PESSOAS QUE VAI RETORNAR
    //DA NOSSA BASE DE DADOS

    public LinhaConsultarAdapterGarantiaForwarderPonsse(ListGarantiaForwarderPonsseActivity listGarantiaForwarderPonsseActivity, List<GarantiaForwarderModel> garantiaForwarderModels) {

        this.garantiaForwarderModels       =  garantiaForwarderModels;
        this.listGarantiaForwarderPonsseActivity = listGarantiaForwarderPonsseActivity;
        this.layoutInflater     = (LayoutInflater) this.listGarantiaForwarderPonsseActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.garantiaForwarderRepository = new GarantiaForwarderRepository(listGarantiaForwarderPonsseActivity);
    }

    public LinhaConsultarAdapterGarantiaForwarderPonsse(ListGarantiaForwarderPonsseActivity linhaConsultarAdapter) {
    }

    //RETORNA A QUANTIDADE DE REGISTROS DA LISTA
    @Override
    public int getCount(){

        return garantiaForwarderModels.size();
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    //ESSE MÉTODO SETA OS VALORES DE UM ITEM DA NOSSA LISTA DE PESSOAS PARA UMA LINHA DO NOSSO LISVIEW
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        //CRIANDO UM OBJETO DO TIPO View PARA ACESSAR O NOSSO ARQUIVO DE LAYOUT activity_linha_consultar.xml
        final View viewLinhaLista = layoutInflater.inflate(R.layout.activity_linha_consultar,null);

        //VINCULANDO OS CAMPOS DO ARQUIVO DE LAYOUT(activity_linha_consultar.xml) AOS OBJETOS DECLARADOS.

        //CAMPO QUE VAI MOSTRAR O CÓDIGO DA PESSOA
        TextView textViewCodigo          = (TextView) viewLinhaLista.findViewById(R.id.textViewCodigo);

        //CAMPO QUE VAI MOSTRAR O NOME DA PESSOA
        TextView textViewCliente            = (TextView) viewLinhaLista.findViewById(R.id.textViewNomeClienteList);

        //CAMPOS QUE VAI MOSTRAR O SEXO DA PESSOA
        TextView textViewQtdEixos            = (TextView) viewLinhaLista.findViewById(R.id.textViewQdtEixos);

        //CAMPO QUE VAI MOSTRAR O ESTADO CIVIL
        TextView textViewModelo     = (TextView) viewLinhaLista.findViewById(R.id.textViewModelo);

        //CAMPO QUE VAI MOSTRAR A DATA DE NASCIMENTO
        TextView textViewNascimento      = (TextView) viewLinhaLista.findViewById(R.id.textViewNascimento);

        //CRIANDO O BOTÃO  EXCLUIR PARA DELETARMOS UM REGISTRO DO BANCO DE DADOS
        Button buttonExcluir             = (Button)   viewLinhaLista.findViewById(R.id.buttonExcluir);

        //CRIANDO O BOTÃO PARA EDITAR UM REGISTRO CADASTRADO
        Button buttonEditar            = (Button)   viewLinhaLista.findViewById(R.id.buttonEditar);

        //SETANDO O CÓDIGO NO CAMPO DA NOSSA VIEW
        textViewCodigo.setText(String.valueOf(garantiaForwarderModels.get(position).getCodigo()));

        //SETANDO O SEXO NO CAMPO DA NOSSA VIEW
        if(garantiaForwarderModels.get(position).getQtdEixo().equals("6x6"))
            textViewQtdEixos.setText("6x6");
        else
            textViewQtdEixos.setText("8x8");

        //SETANDO O ESTADO CIVIL
        textViewModelo.setText(this.GetModelo(garantiaForwarderModels.get(position).getModelo()));

        //SETANDO O ESTADO CIVIL
        textViewCliente.setText((garantiaForwarderModels.get(position).getCliente()));

        //SETANDO A DATA DE NASCIMENTO
        textViewNascimento.setText(garantiaForwarderModels.get(position).getDataPreenchimennto());

        //CRIANDO EVENTO CLICK PARA O BOTÃO DE EXCLUIR REGISTRO
        buttonEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRedirecionar = new Intent(listGarantiaForwarderPonsseActivity, DetailGarantiaForwarderPonsseActivity.class);

                intentRedirecionar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                intentRedirecionar.putExtra("id_", garantiaForwarderModels.get(position).getCodigo());

                listGarantiaForwarderPonsseActivity.startActivity(intentRedirecionar);
            }
        });

        //CRIANDO EVENTO CLICK PARA O BOTÃO DE EXCLUIR REGISTRO
        buttonExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //EXCLUINDO UM REGISTRO
                garantiaForwarderRepository.excluir(garantiaForwarderModels.get(position).getCodigo());

                //MOSTRA A MENSAGEM APÓS EXCLUIR UM REGISTRO
                Toast.makeText(listGarantiaForwarderPonsseActivity, "Registro excluido com sucesso!", Toast.LENGTH_LONG).show();

                //CHAMA O MÉTODO QUE ATUALIZA A LISTA COM OS REGISTROS QUE AINDA ESTÃO NA BASE
                AtualizarLista();
            }
        });
        return viewLinhaLista;
    }

    //MÉTODO QUE RETORNA A DESCRIÇÃO DO ESTADO CIVIL POR CÓDIGO
    public String GetModelo(String codigoModelo){

        if(codigoModelo.equals("B"))
            return "Buffalo";
        else if(codigoModelo.equals("BK"))
            return "Buffalo King";
        else if(codigoModelo.equals("E"))
            return "Elephant";
        else
            return "Elephant King";
    }

    //ATUALIZA A LISTTA DEPOIS DE EXCLUIR UM REGISTRO
    public void AtualizarLista(){
        this.garantiaForwarderModels.clear();
        this.garantiaForwarderModels = garantiaForwarderRepository.SelecionarTodos();
        this.notifyDataSetChanged();
    }
}