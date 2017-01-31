/*
package com.timberforest.andreives.relatorios.listAdapter.servicosPonsse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.timberforest.andreives.relatorios.R;
import GarantiaForwarderRepository;
import com.timberforest.andreives.relatorios.dao.servicosPonsse.ManutencaoProgramadaGruaRepository;
import DetailGarantiaForwarderPonsseActivity;
import DetailManutencaoProgramadaGruaPonsseActivity;
import ListGarantiaForwarderPonsseActivity;
import com.timberforest.andreives.relatorios.listActivity.servicosPonsse.ListManutencaoProgGruaPonsseActivity;
import GarantiaForwarderModel;
import ManutencaoProgramadaGruaModel;

import java.util.ArrayList;
import java.util.List;

public class LinhaConsultarAdapterManutencaoProgGruaPonsse extends BaseAdapter {

    ManutencaoProgramadaGruaModel manutencaoProgramadaGruaModel;

    //CRIANDO UM OBJETO LayoutInflater PARA FAZER LINK A NOSSA VIEW(activity_linha_consultar.xml)
    private static LayoutInflater layoutInflater = null;

    //CRIANDO UMA LISTA DE PESSOAS
    List<ManutencaoProgramadaGruaModel> manutencaoProgramadaGruaModels =  new ArrayList<ManutencaoProgramadaGruaModel>();

    //CIRANDO UM OBJETO DA NOSSA CLASSE QUE FAZ ACESSO AO BANCO DE DADOS
    ManutencaoProgramadaGruaRepository manutencaoProgramadaGruaRepository;

    //CRIANDO UM OBJETO DA NOSSA ATIVIDADE QUE CONTEM A LISTA
    private ListManutencaoProgGruaPonsseActivity listManutencaoProgGruaPonsseActivity;

    //CONSTRUTOR QUE VAI RECEBER A NOSSA ATIVIDADE COMO PARAMETRO E A LISTA DE PESSOAS QUE VAI RETORNAR
    //DA NOSSA BASE DE DADOS

    public LinhaConsultarAdapterManutencaoProgGruaPonsse(ListManutencaoProgGruaPonsseActivity listManutencaoProgGruaPonsseActivity, List<ManutencaoProgramadaGruaModel> manutencaoProgramadaGruaModels) {

        this.manutencaoProgramadaGruaModels       =  manutencaoProgramadaGruaModels;
        this.listManutencaoProgGruaPonsseActivity = listManutencaoProgGruaPonsseActivity;
        this.layoutInflater     = (LayoutInflater) this.listManutencaoProgGruaPonsseActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.manutencaoProgramadaGruaRepository = new ManutencaoProgramadaGruaRepository(listManutencaoProgGruaPonsseActivity);
    }
    public LinhaConsultarAdapterManutencaoProgGruaPonsse(ListManutencaoProgGruaPonsseActivity linhaConsultarAdapter) {
    }

    //RETORNA A QUANTIDADE DE REGISTROS DA LISTA
    @Override
    public int getCount(){

        return manutencaoProgramadaGruaModels.size();
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
        textViewCodigo.setText(String.valueOf(manutencaoProgramadaGruaModels.get(position).getCodigo()));

        //SETANDO O SEXO NO CAMPO DA NOSSA VIEW
        if(manutencaoProgramadaGruaModels.get(position).getRadioGroupQtdEixoManuProgGrua().equals("6x6"))
            textViewQtdEixos.setText("6x6");
        else
            textViewQtdEixos.setText("8x8");

        //SETANDO O ESTADO CIVIL
        textViewModelo.setText(this.GetModelo(manutencaoProgramadaGruaModels.get(position).getModelo()));

        //SETANDO O ESTADO CIVIL
        textViewCliente.setText((manutencaoProgramadaGruaModels.get(position).getCliente()));

        //SETANDO A DATA DE NASCIMENTO
        textViewNascimento.setText(manutencaoProgramadaGruaModels.get(position).getDataPreenchimennto());

        //CRIANDO EVENTO CLICK PARA O BOTÃO DE EXCLUIR REGISTRO
        buttonEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRedirecionar = new Intent(listManutencaoProgGruaPonsseActivity, DetailManutencaoProgramadaGruaPonsseActivity.class);

                intentRedirecionar.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                intentRedirecionar.putExtra("id_", manutencaoProgramadaGruaModels.get(position).getCodigo());

                listManutencaoProgGruaPonsseActivity.startActivity(intentRedirecionar);
            }
        });

        //CRIANDO EVENTO CLICK PARA O BOTÃO DE EXCLUIR REGISTRO
        buttonExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //EXCLUINDO UM REGISTRO
                manutencaoProgramadaGruaRepository.excluir(manutencaoProgramadaGruaModels.get(position).getCodigo());

                //MOSTRA A MENSAGEM APÓS EXCLUIR UM REGISTRO
                Toast.makeText(listManutencaoProgGruaPonsseActivity, "Registro excluido com sucesso!", Toast.LENGTH_LONG).show();

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
        this.manutencaoProgramadaGruaModels.clear();
        this.manutencaoProgramadaGruaModels = manutencaoProgramadaGruaRepository.SelecionarTodos();
        this.notifyDataSetChanged();
    }
}*/
