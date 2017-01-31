/*
package com.timberforest.andreives.relatorios.dao.servicosPonsse;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import DatabaseUtil;
import GarantiaForwarderModel;
import ManutencaoProgForwarderModel;

import java.util.ArrayList;
import java.util.List;

*/
/**
 * Created by cicero.machado on 18/03/2016.
 *//*

public class ManutencaoProgForwarderRepository {

    DatabaseUtil databaseUtil;
    */
/***
     * CONSTRUTOR
     * @param context
     *//*

    public ManutencaoProgForwarderRepository(Context context){

        databaseUtil =  new DatabaseUtil(context);

    }

    public ManutencaoProgForwarderRepository() {

    }

    */
/***
     * SALVA UM NOVO REGISTRO NA BASE DE DADOS
     * @param manutencaoProgForwarderModel
     *//*

    public void Salvar(ManutencaoProgForwarderModel manutencaoProgForwarderModel){

        ContentValues contentValues =  new ContentValues();
        */
/*MONTANDO OS PARAMETROS PARA SEREM SALVOS*//*

        contentValues.put("ds_telefone                                  ", manutencaoProgForwarderModel.getEditTextTelefoneClienteManuForwarder           ());
        contentValues.put("fl_modelo                                    ", manutencaoProgForwarderModel.getModelo                                       ());
        contentValues.put("dt_nascimento                                ", manutencaoProgForwarderModel.getEditTextDataManuProgForwarder                ());
        contentValues.put("fl_qtd_eixo                                  ", manutencaoProgForwarderModel.getRadioGroupQtdeixoManuForwarder            ());
        contentValues.put("fl_num_serie                                 ", manutencaoProgForwarderModel.getEditTextNumSerieManuForwarder             ());
        contentValues.put("fl_ordem_servico                             ", manutencaoProgForwarderModel.getEditTextordemServicoManuForwarder         ());
        contentValues.put("fl_cliente                                   ", manutencaoProgForwarderModel.getEditTextClienteManuForwarder              ());

        contentValues.put("editText3NmManuForwarder                     ", manutencaoProgForwarderModel.getEditText3NmManuForwarder                  ());
        contentValues.put("editText38NmManuForwarder                    ", manutencaoProgForwarderModel.getEditText38NmManuForwarder                 ());
        contentValues.put("editText39NmManuForwarder                    ", manutencaoProgForwarderModel.getEditText39NmManuForwarder                 ());
        contentValues.put("editText40NmManuForwarder                    ", manutencaoProgForwarderModel.getEditText40NmManuForwarder                 ());
        contentValues.put("editTextNotasForwarder                       ", manutencaoProgForwarderModel.getEditTextNotasForwarder                   ());

        contentValues.put("radioGroup6ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup6ManuForwarder                 ());
        contentValues.put("radioGroup7ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup7ManuForwarder                 ());
        contentValues.put("radioGroup8ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup8ManuForwarder                 ());
        contentValues.put("radioGroup9ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup9ManuForwarder                 ());
        contentValues.put("radioGroup14ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup14ManuForwarder                ());
        contentValues.put("radioGroup2ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup2ManuForwarder                 ());
        contentValues.put("radioGroup3ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup3ManuForwarder                 ());
        contentValues.put("radioGroup4ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup4ManuForwarder                 ());
        contentValues.put("radioGroup30ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup30ManuForwarder                ());
        contentValues.put("radioGroup5ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup5ManuForwarder                 ());
        contentValues.put("radioGroupBasicoCompManuForwarder            ", manutencaoProgForwarderModel.getRadioGroupBasicoCompManuForwarder        ());
        contentValues.put("radioGroup13ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup13ManuForwarder                ());
        contentValues.put("radioGroup31ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup31ManuForwarder                ());
        contentValues.put("radioGroup10ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup10ManuForwarder                ());
        contentValues.put("radioGroup20ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup20ManuForwarder                ());
        contentValues.put("radioGroup11ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup11ManuForwarder                ());
        contentValues.put("radioGroupQtdeixoManuForwarder               ", manutencaoProgForwarderModel.getRadioGroupQtdeixoManuForwarder           ());

        contentValues.put("checkBox505TarefasAdicioanisManuForwarder    ", manutencaoProgForwarderModel.getCheckBox505TarefasAdicioanisManuForwarder());
        contentValues.put("checkBox237                                  ", manutencaoProgForwarderModel.getCheckBox237                              ());
        contentValues.put("checkBox238                                  ", manutencaoProgForwarderModel.getCheckBox238                              ());
        contentValues.put("checkBox239                                  ", manutencaoProgForwarderModel.getCheckBox239                              ());



        */
/*EXECUTANDO INSERT DE UM NOVO REGISTRO*//*

        databaseUtil.GetConexaoDataBase().insert("tb_manu_prog_forw", null, contentValues);

    }
    */
/***
     * ATUALIZA UM REGISTRO JÁ EXISTENTE NA BASE
     * @param manutencaoProgForwarderModel
     *//*

    public void Atualizar(ManutencaoProgForwarderModel manutencaoProgForwarderModel){

        ContentValues contentValues =  new ContentValues();
 
        */
/*MONTA OS PARAMENTROS PARA REALIZAR UPDATE NOS CAMPOS*//*

        contentValues.put("ds_telefone                                  ", manutencaoProgForwarderModel.getEditTextTelefoneClienteManuForwarder           ());
        contentValues.put("fl_modelo                                    ", manutencaoProgForwarderModel.getModelo                                       ());
        contentValues.put("dt_nascimento                                ", manutencaoProgForwarderModel.getEditTextDataManuProgForwarder                ());
        contentValues.put("fl_qtd_eixo                                  ", manutencaoProgForwarderModel.getRadioGroupQtdeixoManuForwarder            ());
        contentValues.put("fl_num_serie                                 ", manutencaoProgForwarderModel.getEditTextNumSerieManuForwarder             ());
        contentValues.put("fl_ordem_servico                             ", manutencaoProgForwarderModel.getEditTextordemServicoManuForwarder         ());
        contentValues.put("fl_cliente                                   ", manutencaoProgForwarderModel.getEditTextClienteManuForwarder              ());

        contentValues.put("editText3NmManuForwarder                     ", manutencaoProgForwarderModel.getEditText3NmManuForwarder                  ());
        contentValues.put("editText38NmManuForwarder                    ", manutencaoProgForwarderModel.getEditText38NmManuForwarder                 ());
        contentValues.put("editText39NmManuForwarder                    ", manutencaoProgForwarderModel.getEditText39NmManuForwarder                 ());
        contentValues.put("editText40NmManuForwarder                    ", manutencaoProgForwarderModel.getEditText40NmManuForwarder                 ());
        contentValues.put("editTextNotasForwarder                       ", manutencaoProgForwarderModel.getEditTextNotasForwarder                   ());

        contentValues.put("radioGroup6ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup6ManuForwarder                 ());
        contentValues.put("radioGroup7ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup7ManuForwarder                 ());
        contentValues.put("radioGroup8ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup8ManuForwarder                 ());
        contentValues.put("radioGroup9ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup9ManuForwarder                 ());
        contentValues.put("radioGroup14ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup14ManuForwarder                ());
        contentValues.put("radioGroup2ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup2ManuForwarder                 ());
        contentValues.put("radioGroup3ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup3ManuForwarder                 ());
        contentValues.put("radioGroup4ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup4ManuForwarder                 ());
        contentValues.put("radioGroup30ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup30ManuForwarder                ());
        contentValues.put("radioGroup5ManuForwarder                     ", manutencaoProgForwarderModel.getRadioGroup5ManuForwarder                 ());
        contentValues.put("radioGroupBasicoCompManuForwarder            ", manutencaoProgForwarderModel.getRadioGroupBasicoCompManuForwarder        ());
        contentValues.put("radioGroup13ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup13ManuForwarder                ());
        contentValues.put("radioGroup31ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup31ManuForwarder                ());
        contentValues.put("radioGroup10ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup10ManuForwarder                ());
        contentValues.put("radioGroup20ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup20ManuForwarder                ());
        contentValues.put("radioGroup11ManuForwarder                    ", manutencaoProgForwarderModel.getRadioGroup11ManuForwarder                ());
        contentValues.put("radioGroupQtdeixoManuForwarder               ", manutencaoProgForwarderModel.getRadioGroupQtdeixoManuForwarder           ());

        contentValues.put("checkBox505TarefasAdicioanisManuForwarder    ", manutencaoProgForwarderModel.getCheckBox505TarefasAdicioanisManuForwarder());
        contentValues.put("checkBox237                                  ", manutencaoProgForwarderModel.getCheckBox237                              ());
        contentValues.put("checkBox238                                  ", manutencaoProgForwarderModel.getCheckBox238                              ());
        contentValues.put("checkBox239                                  ", manutencaoProgForwarderModel.getCheckBox239                              ());

        */
/*REALIZANDO UPDATE PELA CHAVE DA TABELA*//*

        databaseUtil.GetConexaoDataBase().update("tb_manu_prog_forw", contentValues, "id_ = ?", new String[]{Integer.toString(manutencaoProgForwarderModel.getCodigo())});
    }
    */
/***
     * EXCLUI UM REGISTRO PELO CÓDIGO
     * @param
     * @param
     * @param codigo
     * @return
     *//*

    public Integer excluir(int codigo) {
        //EXCLUINDO  REGISTRO E RETORNANDO O NÚMERO DE LINHAS AFETADAS
        return databaseUtil.GetConexaoDataBase().delete("tb_manu_prog_forw","id_ = ?", new String[]{Integer.toString(codigo)});
    }
    */
/***
     * CONSULTA UMA PESSOA CADASTRADA PELO CÓDIGO
     * @param codigo
     * @return
     *//*

    public ManutencaoProgForwarderModel GetManutencaoProgForwarderModel(Integer codigo){

        Cursor cursor =  databaseUtil.GetConexaoDataBase().rawQuery("SELECT * FROM tb_manu_prog_forw WHERE id_= "+ codigo,null);

        cursor.moveToFirst();

        ///CRIANDO UMA NOVA PESSOAS
        ManutencaoProgForwarderModel manutencaoProgForwarderModel =  new ManutencaoProgForwarderModel();

        //ADICIONANDO OS DADOS DA PESSOA
        manutencaoProgForwarderModel.setCodigo                                          (cursor.getInt   (cursor.getColumnIndex("id_                                            ")));
        manutencaoProgForwarderModel.setEditTextTelefoneClienteManuForwarder            (cursor.getString(cursor.getColumnIndex("ds_telefone                                    ")));
        manutencaoProgForwarderModel.setModelo                                          (cursor.getString(cursor.getColumnIndex("fl_modelo                                      ")));
        manutencaoProgForwarderModel.setEditTextDataManuProgForwarder                   (cursor.getString(cursor.getColumnIndex("dt_nascimento                                  ")));
        manutencaoProgForwarderModel.setRadioGroupQtdeixoManuForwarder                  (cursor.getString(cursor.getColumnIndex("fl_qtd_eixo                                    ")));
        manutencaoProgForwarderModel.setEditTextNumSerieManuForwarder                   (cursor.getString(cursor.getColumnIndex("fl_num_serie                                   ")));
        manutencaoProgForwarderModel.setEditTextordemServicoManuForwarder               (cursor.getString(cursor.getColumnIndex("fl_ordem_servico                               ")));
        manutencaoProgForwarderModel.setEditTextClienteManuForwarder                    (cursor.getString(cursor.getColumnIndex("fl_cliente                                     ")));

        manutencaoProgForwarderModel.setEditText3NmManuForwarder                        (cursor.getString(cursor.getColumnIndex("editText3NmManuForwarder                         ")));
        manutencaoProgForwarderModel.setEditText38NmManuForwarder                       (cursor.getString(cursor.getColumnIndex("editText38NmManuForwarder                        ")));
        manutencaoProgForwarderModel.setEditText39NmManuForwarder                       (cursor.getString(cursor.getColumnIndex("editText39NmManuForwarder                        ")));
        manutencaoProgForwarderModel.setEditText40NmManuForwarder                       (cursor.getString(cursor.getColumnIndex("editText40NmManuForwarder                        ")));
        manutencaoProgForwarderModel.setEditTextNotasForwarder                          (cursor.getString(cursor.getColumnIndex("editTextNotasForwarder                           ")));

        manutencaoProgForwarderModel.setRadioGroup6ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup6ManuForwarder                     ")));
        manutencaoProgForwarderModel.setRadioGroup7ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup7ManuForwarder                     ")));
        manutencaoProgForwarderModel.setRadioGroup8ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup8ManuForwarder                     ")));
        manutencaoProgForwarderModel.setRadioGroup9ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup9ManuForwarder                     ")));
        manutencaoProgForwarderModel.setRadioGroup14ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup14ManuForwarder                    ")));
        manutencaoProgForwarderModel.setRadioGroup2ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup2ManuForwarder                     ")));
        manutencaoProgForwarderModel.setRadioGroup3ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup3ManuForwarder                     ")));
        manutencaoProgForwarderModel.setRadioGroup4ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup4ManuForwarder                     ")));
        manutencaoProgForwarderModel.setRadioGroup30ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup30ManuForwarder                    ")));
        manutencaoProgForwarderModel.setRadioGroup5ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup5ManuForwarder                     ")));
        manutencaoProgForwarderModel.setRadioGroupBasicoCompManuForwarder               (cursor.getString(cursor.getColumnIndex("radioGroupBasicoCompManuForwarder            ")));
        manutencaoProgForwarderModel.setRadioGroup13ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup13ManuForwarder                    ")));
        manutencaoProgForwarderModel.setRadioGroup31ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup31ManuForwarder                    ")));
        manutencaoProgForwarderModel.setRadioGroup10ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup10ManuForwarder                    ")));
        manutencaoProgForwarderModel.setRadioGroup20ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup20ManuForwarder                    ")));
        manutencaoProgForwarderModel.setRadioGroup11ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup11ManuForwarder                    ")));
        manutencaoProgForwarderModel.setRadioGroupQtdeixoManuForwarder                  (cursor.getString(cursor.getColumnIndex("radioGroupQtdeixoManuForwarder               ")));

        manutencaoProgForwarderModel.setCheckBox505TarefasAdicioanisManuForwarder ((byte) cursor.getShort(cursor.getColumnIndex("checkBox505TarefasAdicioanisManuForwarder")));
        manutencaoProgForwarderModel.setCheckBox237                               ((byte) cursor.getShort(cursor.getColumnIndex("checkBox237                              ")));
        manutencaoProgForwarderModel.setCheckBox238                               ((byte) cursor.getShort(cursor.getColumnIndex("checkBox238                              ")));
        manutencaoProgForwarderModel.setCheckBox239                               ((byte) cursor.getShort(cursor.getColumnIndex("checkBox239                              ")));

        //RETORNANDO A PESSOA
        return manutencaoProgForwarderModel;
    }

    */
/***
     * CONSULTA TODAS AS PESSOAS CADASTRADAS NA BASE
     * @return
     *//*

    public List<ManutencaoProgForwarderModel> SelecionarTodos(){

        List<ManutencaoProgForwarderModel> manutencaoProgForwarderModels = new ArrayList<ManutencaoProgForwarderModel>();

        //MONTA A QUERY A SER EXECUTADA
        StringBuilder stringBuilderQuery = new StringBuilder();
        stringBuilderQuery.append(" SELECT id_                                                   ,");
        stringBuilderQuery.append("       ds_telefone                                          ,");
        stringBuilderQuery.append("       fl_modelo                                            ,");
        stringBuilderQuery.append("       dt_nascimento                                        ,");
        stringBuilderQuery.append("       fl_qtd_eixo                                          ,");
        stringBuilderQuery.append("       fl_num_serie                                         ,");
        stringBuilderQuery.append("       fl_ordem_servico                                     ,");
        stringBuilderQuery.append("       fl_cliente                                           ,");

        stringBuilderQuery.append("       editText3NmManuForwarder                             ,");
        stringBuilderQuery.append("       editText38NmManuForwarder                            ,");
        stringBuilderQuery.append("       editText39NmManuForwarder                            ,");
        stringBuilderQuery.append("       editText40NmManuForwarder                            ,");
        stringBuilderQuery.append("       editTextNotasForwarder                               ,");
        stringBuilderQuery.append("       radioGroup6ManuForwarder                             ,");
        stringBuilderQuery.append("       radioGroup7ManuForwarder                             ,");
        stringBuilderQuery.append("       radioGroup8ManuForwarder                             ,");
        stringBuilderQuery.append("       radioGroup9ManuForwarder                             ,");
        stringBuilderQuery.append("       radioGroup14ManuForwarder                            ,");
        stringBuilderQuery.append("       radioGroup2ManuForwarder                             ,");
        stringBuilderQuery.append("       radioGroup3ManuForwarder                          ,");
        stringBuilderQuery.append("       radioGroup4ManuForwarder                          ,");
        stringBuilderQuery.append("       radioGroup30ManuForwarder                         ,");
        stringBuilderQuery.append("       radioGroup5ManuForwarder                          ,");
        stringBuilderQuery.append("       radioGroupBasicoCompManuForwarder                 ,");
        stringBuilderQuery.append("       radioGroup13ManuForwarder                         ,");
        stringBuilderQuery.append("       radioGroup31ManuForwarder                         ,");
        stringBuilderQuery.append("       radioGroup10ManuForwarder                         ,");
        stringBuilderQuery.append("       radioGroup20ManuForwarder                         ,");
        stringBuilderQuery.append("       radioGroup11ManuForwarder                         ,");
        stringBuilderQuery.append("       radioGroupQtdeixoManuForwarder                            ,");

        stringBuilderQuery.append("       checkBox505TarefasAdicioanisManuForwarder                 ,");
        stringBuilderQuery.append("       checkBox237                                               ,");
        stringBuilderQuery.append("       checkBox238                                               ,");
        stringBuilderQuery.append("       checkBox239                                                ");

        stringBuilderQuery.append("  FROM  tb_manu_prog_forw       ");
        //stringBuilderQuery.append(" ORDER BY ds_telefone       ");

        //CONSULTANDO OS REGISTROS CADASTRADOS
        Cursor cursor = databaseUtil.GetConexaoDataBase().rawQuery(stringBuilderQuery.toString(), null);
 
        */
/*POSICIONA O CURSOR NO PRIMEIRO REGISTRO*//*

        cursor.moveToFirst();

        ManutencaoProgForwarderModel manutencaoProgForwarderModel;

        //REALIZA A LEITURA DOS REGISTROS ENQUANTO NÃO FOR O FIM DO CURSOR
        while (!cursor.isAfterLast()) {
 
            */
/* CRIANDO UMA NOVA PESSOAS *//*

            manutencaoProgForwarderModel =  new ManutencaoProgForwarderModel();

            //ADICIONANDO OS DADOS DA PESSOA
            manutencaoProgForwarderModel.setCodigo                                          (cursor.getInt   (cursor.getColumnIndex("id_                                        ")));
            manutencaoProgForwarderModel.setEditTextTelefoneClienteManuForwarder            (cursor.getString(cursor.getColumnIndex("ds_telefone                                ")));
            manutencaoProgForwarderModel.setModelo                                          (cursor.getString(cursor.getColumnIndex("fl_modelo                                  ")));
            manutencaoProgForwarderModel.setEditTextDataManuProgForwarder                   (cursor.getString(cursor.getColumnIndex("dt_nascimento                              ")));
            manutencaoProgForwarderModel.setRadioGroupQtdeixoManuForwarder                  (cursor.getString(cursor.getColumnIndex("fl_qtd_eixo                                ")));
            manutencaoProgForwarderModel.setEditTextNumSerieManuForwarder                   (cursor.getString(cursor.getColumnIndex("fl_num_serie                               ")));
            manutencaoProgForwarderModel.setEditTextordemServicoManuForwarder               (cursor.getString(cursor.getColumnIndex("fl_ordem_servico                           ")));
            manutencaoProgForwarderModel.setEditTextClienteManuForwarder                    (cursor.getString(cursor.getColumnIndex("fl_cliente                                 ")));

            manutencaoProgForwarderModel.setEditText3NmManuForwarder                        (cursor.getString(cursor.getColumnIndex("editText3NmManuForwarder                     ")));
            manutencaoProgForwarderModel.setEditText38NmManuForwarder                       (cursor.getString(cursor.getColumnIndex("editText38NmManuForwarder                    ")));
            manutencaoProgForwarderModel.setEditText39NmManuForwarder                       (cursor.getString(cursor.getColumnIndex("editText39NmManuForwarder                    ")));
            manutencaoProgForwarderModel.setEditText40NmManuForwarder                       (cursor.getString(cursor.getColumnIndex("editText40NmManuForwarder                    ")));
            manutencaoProgForwarderModel.setEditTextNotasForwarder                          (cursor.getString(cursor.getColumnIndex("editTextNotasForwarder                       ")));


            manutencaoProgForwarderModel.setRadioGroup6ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup6ManuForwarder                     ")));
            manutencaoProgForwarderModel.setRadioGroup7ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup7ManuForwarder                     ")));
            manutencaoProgForwarderModel.setRadioGroup8ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup8ManuForwarder                     ")));
            manutencaoProgForwarderModel.setRadioGroup9ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup9ManuForwarder                     ")));
            manutencaoProgForwarderModel.setRadioGroup14ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup14ManuForwarder                    ")));
            manutencaoProgForwarderModel.setRadioGroup2ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup2ManuForwarder                     ")));
            manutencaoProgForwarderModel.setRadioGroup3ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup3ManuForwarder                     ")));
            manutencaoProgForwarderModel.setRadioGroup4ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup4ManuForwarder                     ")));
            manutencaoProgForwarderModel.setRadioGroup30ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup30ManuForwarder                    ")));
            manutencaoProgForwarderModel.setRadioGroup5ManuForwarder                        (cursor.getString(cursor.getColumnIndex("radioGroup5ManuForwarder                     ")));
            manutencaoProgForwarderModel.setRadioGroupBasicoCompManuForwarder               (cursor.getString(cursor.getColumnIndex("radioGroupBasicoCompManuForwarder            ")));
            manutencaoProgForwarderModel.setRadioGroup13ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup13ManuForwarder                    ")));
            manutencaoProgForwarderModel.setRadioGroup31ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup31ManuForwarder                    ")));
            manutencaoProgForwarderModel.setRadioGroup10ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup10ManuForwarder                    ")));
            manutencaoProgForwarderModel.setRadioGroup20ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup20ManuForwarder                    ")));
            manutencaoProgForwarderModel.setRadioGroup11ManuForwarder                       (cursor.getString(cursor.getColumnIndex("radioGroup11ManuForwarder                    ")));
            manutencaoProgForwarderModel.setRadioGroupQtdeixoManuForwarder                  (cursor.getString(cursor.getColumnIndex("radioGroupQtdeixoManuForwarder               ")));

            manutencaoProgForwarderModel.setCheckBox505TarefasAdicioanisManuForwarder((byte)  cursor.getShort(cursor.getColumnIndex("checkBox505TarefasAdicioanisManuForwarder      ")));
            manutencaoProgForwarderModel.setCheckBox237                              ((byte)  cursor.getShort(cursor.getColumnIndex("checkBox237                                    ")));
            manutencaoProgForwarderModel.setCheckBox238                              ((byte)  cursor.getShort(cursor.getColumnIndex("checkBox238                                    ")));
            manutencaoProgForwarderModel.setCheckBox239                              ((byte)  cursor.getShort(cursor.getColumnIndex("checkBox239                                    ")));

            //ADICIONANDO UMA PESSOA NA LISTA
            manutencaoProgForwarderModels.add(manutencaoProgForwarderModel);

            //VAI PARA O PRÓXIMO REGISTRO
            cursor.moveToNext();
        }

        //RETORNANDO A LISTA DE PESSOAS
        return manutencaoProgForwarderModels;
    }
}*/
