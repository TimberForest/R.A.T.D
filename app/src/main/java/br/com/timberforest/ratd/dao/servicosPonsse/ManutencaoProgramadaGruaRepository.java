/*
package com.timberforest.andreives.relatorios.dao.servicosPonsse;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import DatabaseConnection;
import DatabaseFactory;
import com.timberforest.andreives.relatorios.formulariosActivity.servicosPonsse.FormManutencaoProgramadaGruaPonsseActivity;
import com.timberforest.andreives.relatorios.listActivity.servicosPonsse.ListManutencaoProgGruaPonsseActivity;
import ManutencaoProgramadaGruaModel;

import java.util.ArrayList;
import java.util.List;

*/
/**
 * Created by cicero.machado on 18/03/2016.
 *//*

public class ManutencaoProgramadaGruaRepository {

    */
/***
     * CONSTRUTOR
     * @param context
     *//*


    private DatabaseConnection dbHelper;
    private SQLiteDatabase database;

    public ManutencaoProgramadaGruaRepository(FormManutencaoProgramadaGruaPonsseActivity formManutencaoProgramadaGruaPonsseActivity){
        dbHelper = DatabaseFactory.getDatabaseConnection();
        database = dbHelper.getWritableDatabase();
    }

    public ManutencaoProgramadaGruaRepository(ListManutencaoProgGruaPonsseActivity listManutencaoProgGruaPonsseActivity) {
    }


    */
/*public ManutencaoProgramadaGruaRepository(Context context){

        databaseUtil =  new DatabaseUtil(context);

    }*//*

    */
/***
     * SALVA UM NOVO REGISTRO NA BASE DE DADOS
     * @param manutencaoProgramadaGruaModel
     *//*

    */
/*public void Salvar(ManutencaoProgramadaGruaModel manutencaoProgramadaGruaModel){

        ContentValues contentValues =  new ContentValues();
        *//*
*/
/*MONTANDO OS PARAMETROS PARA SEREM SALVOS*//*
*/
/*
        contentValues.put("ds_telefone                              ", manutencaoProgramadaGruaModel.getTelefone());
        contentValues.put("fl_modelo                                ", manutencaoProgramadaGruaModel.getModelo());
        contentValues.put("dt_nascimento                            ", manutencaoProgramadaGruaModel.getDataPreenchimennto());
        contentValues.put("fl_num_serie                             ", manutencaoProgramadaGruaModel.getNumDeSerie());
        contentValues.put("fl_ordem_servico                         ", manutencaoProgramadaGruaModel.getOrdemServico());
        contentValues.put("fl_cliente                               ", manutencaoProgramadaGruaModel.getCliente());
        contentValues.put("editText49ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText49ManuProgGrua());
        contentValues.put("editText50ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText50ManuProgGrua());
        contentValues.put("editText51ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText51ManuProgGrua());
        contentValues.put("editTextNotasForwarder                   ", manutencaoProgramadaGruaModel.getEditTextNotasGrua());
        contentValues.put("editText41ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText41ManuProgGrua());
        contentValues.put("editText42ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText42ManuProgGrua());
        contentValues.put("editText44ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText44ManuProgGrua());
        contentValues.put("editText43ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText43ManuProgGrua());
        contentValues.put("editText45ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText45ManuProgGrua());
        contentValues.put("editText46ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText46ManuProgGrua());
        contentValues.put("editText47ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText47ManuProgGrua());
        contentValues.put("editText48ManuProgGrua                   ", manutencaoProgramadaGruaModel.getEditText48ManuProgGrua());

        contentValues.put("radioGroup32BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup32BasicoManuProgGrua());
        contentValues.put("radioGroup33BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup33BasicoManuProgGrua());
        contentValues.put("radioGroup34BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup34BasicoManuProgGrua());
        contentValues.put("radioGroup35BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup35BasicoManuProgGrua());
        contentValues.put("radioGroup36BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup36BasicoManuProgGrua());
        contentValues.put("radioGroup15BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup15BasicoManuProgGrua());
        contentValues.put("radioGroup16BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup16BasicoManuProgGrua());
        contentValues.put("radioGroup17BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup17BasicoManuProgGrua());
        contentValues.put("radioGroup18BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup18BasicoManuProgGrua());
        contentValues.put("radioGroup19BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup19BasicoManuProgGrua());
        contentValues.put("radioGroup20BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup20BasicoManuProgGrua());
        contentValues.put("radioGroup21BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup21BasicoManuProgGrua());
        contentValues.put("radioGroup22BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup22BasicoManuProgGrua());
        contentValues.put("radioGroup23BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup23BasicoManuProgGrua());
        contentValues.put("radioGroup24BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup24BasicoManuProgGrua());
        contentValues.put("radioGroup25BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup25BasicoManuProgGrua());
        contentValues.put("radioGroup26BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup26BasicoManuProgGrua());
        contentValues.put("radioGroup27BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup27BasicoManuProgGrua());
        contentValues.put("radioGroup28BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup28BasicoManuProgGrua());
        contentValues.put("radioGroup29BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup29BasicoManuProgGrua());
        contentValues.put("radioGroup30BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup30BasicoManuProgGrua());
        contentValues.put("radioGroup31BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup31BasicoManuProgGrua());
        contentValues.put("radioGroupBasicCompManuProgGrua        ", manutencaoProgramadaGruaModel.getRadioGroupBasicCompManuProgGrua());
        contentValues.put("radioGroupQtdEixoManuProgGrua          ", manutencaoProgramadaGruaModel.getRadioGroupQtdEixoManuProgGrua());

        contentValues.put(" checkBoxVfslSelecionado               ", manutencaoProgramadaGruaModel.getCheckBoxVfslSelecionado());
        contentValues.put(" checkBoxVmvmgSelecionado              ", manutencaoProgramadaGruaModel.getCheckBoxVmvmgSelecionado());
        contentValues.put(" checkBoxTfsaappmiplSelecionado        ", manutencaoProgramadaGruaModel.getCheckBoxTfsaappmiplSelecionado());

        *//*
*/
/*EXECUTANDO INSERT DE UM NOVO REGISTRO*//*
*/
/*
        databaseUtil.GetConexaoDataBase().insert("tb_manutencao_programada_grua", null, contentValues);

    }*//*


    public void salvar(ManutencaoProgramadaGruaModel manutencaoProgramadaGruaModel){
        ContentValues values=new ContentValues();
        values.put("ds_telefone                                                     ",manutencaoProgramadaGruaModel.getTelefone());
        values.put("fl_modelo                                                       ",manutencaoProgramadaGruaModel.getModelo());
        values.put("dt_nascimento                                                   ",manutencaoProgramadaGruaModel.getDataPreenchimennto());
        values.put("fl_num_serie                                                    ",manutencaoProgramadaGruaModel.getNumDeSerie());
        values.put("fl_ordem_servico                                                ",manutencaoProgramadaGruaModel.getOrdemServico());
        values.put("fl_cliente                                                      ",manutencaoProgramadaGruaModel.getCliente());
        values.put("editText49ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText49ManuProgGrua());
        values.put("editText50ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText50ManuProgGrua());
        values.put("editText51ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText51ManuProgGrua());
        values.put("editTextNotasForwarder                                          ",manutencaoProgramadaGruaModel.getEditTextNotasGrua());
        values.put("editText41ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText41ManuProgGrua());
        values.put("editText42ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText42ManuProgGrua());
        values.put("editText44ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText44ManuProgGrua());
        values.put("editText43ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText43ManuProgGrua());
        values.put("editText45ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText45ManuProgGrua());
        values.put("editText46ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText46ManuProgGrua());
        values.put("editText47ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText47ManuProgGrua());
        values.put("editText48ManuProgGrua                                          ",manutencaoProgramadaGruaModel.getEditText48ManuProgGrua());

        values.put("radioGroup32BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup32BasicoManuProgGrua());
        values.put("radioGroup33BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup33BasicoManuProgGrua());
        values.put("radioGroup34BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup34BasicoManuProgGrua());
        values.put("radioGroup35BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup35BasicoManuProgGrua());
        values.put("radioGroup36BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup36BasicoManuProgGrua());
        values.put("radioGroup15BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup15BasicoManuProgGrua());
        values.put("radioGroup16BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup16BasicoManuProgGrua());
        values.put("radioGroup17BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup17BasicoManuProgGrua());
        values.put("radioGroup18BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup18BasicoManuProgGrua());
        values.put("radioGroup19BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup19BasicoManuProgGrua());
        values.put("radioGroup20BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup20BasicoManuProgGrua());
        values.put("radioGroup21BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup21BasicoManuProgGrua());
        values.put("radioGroup22BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup22BasicoManuProgGrua());
        values.put("radioGroup23BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup23BasicoManuProgGrua());
        values.put("radioGroup24BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup24BasicoManuProgGrua());
        values.put("radioGroup25BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup25BasicoManuProgGrua());
        values.put("radioGroup26BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup26BasicoManuProgGrua());
        values.put("radioGroup27BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup27BasicoManuProgGrua());
        values.put("radioGroup28BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup28BasicoManuProgGrua());
        values.put("radioGroup29BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup29BasicoManuProgGrua());
        values.put("radioGroup30BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup30BasicoManuProgGrua());
        values.put("radioGroup31BasicoManuProgGrua                                  ",manutencaoProgramadaGruaModel.getRadioGroup31BasicoManuProgGrua());
        values.put("radioGroupBasicCompManuProgGrua                                 ",manutencaoProgramadaGruaModel.getRadioGroupBasicCompManuProgGrua());
        values.put("radioGroupQtdEixoManuProgGrua                                   ",manutencaoProgramadaGruaModel.getRadioGroupQtdEixoManuProgGrua());

        values.put("checkBoxVfslSelecionado                                         ",manutencaoProgramadaGruaModel.getCheckBoxVfslSelecionado());
        values.put("checkBoxVmvmgSelecionado                                        ",manutencaoProgramadaGruaModel.getCheckBoxVmvmgSelecionado());
        values.put("checkBoxTfsaappmiplSelecionado                                  ",manutencaoProgramadaGruaModel.getCheckBoxTfsaappmiplSelecionado());

        if(manutencaoProgramadaGruaModel.getCodigo()== null){
            database.insert("tb_manutencaop_rogramada_grua",null,values);
        }else {
            database.update("tb_manutencaop_rogramada_grua",values,"id_="+manutencaoProgramadaGruaModel.getCodigo(),null);
        }
    }

    */
/***
     * ATUALIZA UM REGISTRO JÁ EXISTENTE NA BASE
     * @param manutencaoProgramadaGruaModel
     *//*

    public void Atualizar(ManutencaoProgramadaGruaModel manutencaoProgramadaGruaModel){

        ContentValues contentValues =  new ContentValues();
 
        */
/*MONTA OS PARAMENTROS PARA REALIZAR UPDATE NOS CAMPOS*//*

        contentValues.put("ds_telefone                                      ", manutencaoProgramadaGruaModel.getTelefone());
        contentValues.put("fl_modelo                                        ", manutencaoProgramadaGruaModel.getModelo());
        contentValues.put("dt_nascimento                                    ", manutencaoProgramadaGruaModel.getDataPreenchimennto());
        contentValues.put("fl_num_serie                                     ", manutencaoProgramadaGruaModel.getNumDeSerie());
        contentValues.put("fl_ordem_servico                                 ", manutencaoProgramadaGruaModel.getOrdemServico());
        contentValues.put("fl_cliente                                       ", manutencaoProgramadaGruaModel.getCliente());

        contentValues.put("editText49ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText49ManuProgGrua());
        contentValues.put("editText50ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText50ManuProgGrua());
        contentValues.put("editText51ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText51ManuProgGrua());
        contentValues.put("editTextNotasForwarder                            ", manutencaoProgramadaGruaModel.getEditTextNotasGrua());
        contentValues.put("editText41ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText41ManuProgGrua());
        contentValues.put("editText42ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText42ManuProgGrua());
        contentValues.put("editText44ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText44ManuProgGrua());
        contentValues.put("editText43ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText43ManuProgGrua());
        contentValues.put("editText45ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText45ManuProgGrua());
        contentValues.put("editText46ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText46ManuProgGrua());
        contentValues.put("editText47ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText47ManuProgGrua());
        contentValues.put("editText48ManuProgGrua                            ", manutencaoProgramadaGruaModel.getEditText48ManuProgGrua());

        contentValues.put("radioGroup32BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup32BasicoManuProgGrua());
        contentValues.put("radioGroup33BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup33BasicoManuProgGrua());
        contentValues.put("radioGroup34BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup34BasicoManuProgGrua());
        contentValues.put("radioGroup35BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup35BasicoManuProgGrua());
        contentValues.put("radioGroup36BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup36BasicoManuProgGrua());
        contentValues.put("radioGroup15BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup15BasicoManuProgGrua());
        contentValues.put("radioGroup16BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup16BasicoManuProgGrua());
        contentValues.put("radioGroup17BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup17BasicoManuProgGrua());
        contentValues.put("radioGroup18BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup18BasicoManuProgGrua());
        contentValues.put("radioGroup19BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup19BasicoManuProgGrua());
        contentValues.put("radioGroup20BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup20BasicoManuProgGrua());
        contentValues.put("radioGroup21BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup21BasicoManuProgGrua());
        contentValues.put("radioGroup22BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup22BasicoManuProgGrua());
        contentValues.put("radioGroup23BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup23BasicoManuProgGrua());
        contentValues.put("radioGroup24BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup24BasicoManuProgGrua());
        contentValues.put("radioGroup25BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup25BasicoManuProgGrua());
        contentValues.put("radioGroup26BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup26BasicoManuProgGrua());
        contentValues.put("radioGroup27BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup27BasicoManuProgGrua());
        contentValues.put("radioGroup28BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup28BasicoManuProgGrua());
        contentValues.put("radioGroup29BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup29BasicoManuProgGrua());
        contentValues.put("radioGroup30BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup30BasicoManuProgGrua());
        contentValues.put("radioGroup31BasicoManuProgGrua         ", manutencaoProgramadaGruaModel.getRadioGroup31BasicoManuProgGrua());
        contentValues.put("radioGroupQtdEixoManuProgGrua          ", manutencaoProgramadaGruaModel.getRadioGroupQtdEixoManuProgGrua());

        contentValues.put(" checkBoxVfslSelecionado               ", manutencaoProgramadaGruaModel.getCheckBoxVfslSelecionado());
        contentValues.put(" checkBoxVmvmgSelecionado              ", manutencaoProgramadaGruaModel.getCheckBoxVmvmgSelecionado());
        contentValues.put(" checkBoxTfsaappmiplSelecionado        ", manutencaoProgramadaGruaModel.getCheckBoxTfsaappmiplSelecionado());

        */
/*REALIZANDO UPDATE PELA CHAVE DA TABELA*//*

        database.update("tb_manutencao_programada_grua", contentValues, "id_ = ?", new String[]{Integer.toString(manutencaoProgramadaGruaModel.getCodigo())});
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
        return database.delete("tb_manutencao_programada_grua","id_ = ?", new String[]{Integer.toString(codigo)});
    }
    */
/***
     * CONSULTA UMA PESSOA CADASTRADA PELO CÓDIGO
     * @param codigo
     * @return
     *//*


    public ManutencaoProgramadaGruaModel GetManutencaoProgramadaGruaModel(int codigo){
        List<ManutencaoProgramadaGruaModel> manutencaoProgramadaGruaModels = new ArrayList<>();
        Cursor cursor= database.rawQuery(
                                            "select id_                                                                 ," +
                                                    "ds_telefone                                                     , " +
                                                    "fl_modelo                                                           , " +
                                                    "dt_nascimento                                                       , " +
                                                    "fl_num_serie                                                       , " +
                                                    "fl_ordem_servico                                                   , " +
                                                    "fl_cliente                                                         , " +
                                                    "editText49ManuProgGrua                                              , " +
                                                    "editText50ManuProgGrua                                              , " +
                                                    "editText51ManuProgGrua                                             , " +
                                                    "editTextNotasForwarder                                             , " +
                                                    "editText41ManuProgGrua                                             , " +
                                                    "editText42ManuProgGrua                                              , " +
                                                    "editText44ManuProgGrua                                              , " +
                                                    "editText43ManuProgGrua                                             , " +
                                                    "editText45ManuProgGrua                                             , " +
                                                    "editText46ManuProgGrua                                             , " +
                                                    "editText47ManuProgGrua                                              , " +
                                                    "editText48ManuProgGrua                                              , " +
                                                    "radioGroup32BasicoManuProgGrua                                     , " +
                                                    "radioGroup33BasicoManuProgGrua                                     , " +
                                                    "radioGroup34BasicoManuProgGrua                                     , " +
                                                    "radioGroup35BasicoManuProgGrua                                      , " +
                                                    "radioGroup36BasicoManuProgGrua                                      , " +
                                                    "radioGroup15BasicoManuProgGrua                                  , " +
                                                    "radioGroup16BasicoManuProgGrua                                  , " +
                                                    "radioGroup17BasicoManuProgGrua                                  , " +
                                                    "radioGroup18BasicoManuProgGrua                                      , " +
                                                    "radioGroup19BasicoManuProgGrua                                      , " +
                                                    "radioGroup20BasicoManuProgGrua                                  , " +
                                                    "radioGroup21BasicoManuProgGrua                                  , " +
                                                    "radioGroup22BasicoManuProgGrua                                  , " +
                                                    "radioGroup23BasicoManuProgGrua                                      , " +
                                                    "radioGroup24BasicoManuProgGrua                                      , " +
                                                    "radioGroup25BasicoManuProgGrua                                  , " +
                                                    "radioGroup26BasicoManuProgGrua                                  , " +
                                                    "radioGroup27BasicoManuProgGrua                                  , " +
                                                    "radioGroup28BasicoManuProgGrua                                      , " +
                                                    "radioGroup29BasicoManuProgGrua                                      , " +
                                                    "radioGroup30BasicoManuProgGrua                                  , " +
                                                    "radioGroup31BasicoManuProgGrua                                  , " +
                                                    "radioGroupQtdEixoManuProgGrua                                   , " +
                                                    " checkBoxVfslSelecionado                                            , " +
                                                    " checkBoxVmvmgSelecionado                                           , " +
                                                    " checkBoxTfsaappmiplSelecionado                                  " +
                                                    "from tb_manutencao_programada_grua where id="+codigo,null);


        cursor.moveToFirst();
        if (!cursor.isAfterLast()){
            ManutencaoProgramadaGruaModel manutencaoProgramadaGruaModel = new ManutencaoProgramadaGruaModel();
            manutencaoProgramadaGruaModel.setCodigo                                                 (cursor.getInt(0));
            manutencaoProgramadaGruaModel.setTelefone                                               (cursor.getString(1));
            manutencaoProgramadaGruaModel.setModelo                                                 (cursor.getString(2));
            manutencaoProgramadaGruaModel.setDataPreenchimennto                                     (cursor.getString(3));
            manutencaoProgramadaGruaModel.setNumDeSerie                                             (cursor.getString(4));
            manutencaoProgramadaGruaModel.setOrdemServico                                           (cursor.getString(5));
            manutencaoProgramadaGruaModel.setCliente                                                (cursor.getString(6));
            manutencaoProgramadaGruaModel.setEditText49ManuProgGrua                                 (cursor.getString(7));
            manutencaoProgramadaGruaModel.setEditText50ManuProgGrua                                 (cursor.getString(8));
            manutencaoProgramadaGruaModel.setEditText51ManuProgGrua                                 (cursor.getString(9));
            manutencaoProgramadaGruaModel.setEditTextNotasGrua                                      (cursor.getString(10));
            manutencaoProgramadaGruaModel.setEditText41ManuProgGrua                                 (cursor.getString(11));
            manutencaoProgramadaGruaModel.setEditText42ManuProgGrua                                 (cursor.getString(12));
            manutencaoProgramadaGruaModel.setEditText44ManuProgGrua                                 (cursor.getString(13));
            manutencaoProgramadaGruaModel.setEditText43ManuProgGrua                                 (cursor.getString(14));
            manutencaoProgramadaGruaModel.setEditText45ManuProgGrua                                 (cursor.getString(15));
            manutencaoProgramadaGruaModel.setEditText46ManuProgGrua                                 (cursor.getString(16));
            manutencaoProgramadaGruaModel.setEditText47ManuProgGrua                                 (cursor.getString(17));
            manutencaoProgramadaGruaModel.setEditText48ManuProgGrua                                 (cursor.getString(18));
            manutencaoProgramadaGruaModel.setRadioGroup32BasicoManuProgGrua                         (cursor.getString(19));
            manutencaoProgramadaGruaModel.setRadioGroup33BasicoManuProgGrua                         (cursor.getString(20));
            manutencaoProgramadaGruaModel.setRadioGroup34BasicoManuProgGrua                         (cursor.getString(21));
            manutencaoProgramadaGruaModel.setRadioGroup35BasicoManuProgGrua                         (cursor.getString(22));
            manutencaoProgramadaGruaModel.setRadioGroup36BasicoManuProgGrua                         (cursor.getString(23));
            manutencaoProgramadaGruaModel.setRadioGroup15BasicoManuProgGrua                         (cursor.getString(24));
            manutencaoProgramadaGruaModel.setRadioGroup16BasicoManuProgGrua                         (cursor.getString(25));
            manutencaoProgramadaGruaModel.setRadioGroup17BasicoManuProgGrua                         (cursor.getString(26));
            manutencaoProgramadaGruaModel.setRadioGroup18BasicoManuProgGrua                         (cursor.getString(27));
            manutencaoProgramadaGruaModel.setRadioGroup19BasicoManuProgGrua                         (cursor.getString(28));
            manutencaoProgramadaGruaModel.setRadioGroup20BasicoManuProgGrua                         (cursor.getString(29));
            manutencaoProgramadaGruaModel.setRadioGroup21BasicoManuProgGrua                         (cursor.getString(30));
            manutencaoProgramadaGruaModel.setRadioGroup22BasicoManuProgGrua                         (cursor.getString(31));
            manutencaoProgramadaGruaModel.setRadioGroup23BasicoManuProgGrua                         (cursor.getString(32));
            manutencaoProgramadaGruaModel.setRadioGroup24BasicoManuProgGrua                         (cursor.getString(33));
            manutencaoProgramadaGruaModel.setRadioGroup25BasicoManuProgGrua                         (cursor.getString(34));
            manutencaoProgramadaGruaModel.setRadioGroup26BasicoManuProgGrua                         (cursor.getString(35));
            manutencaoProgramadaGruaModel.setRadioGroup27BasicoManuProgGrua                         (cursor.getString(36));
            manutencaoProgramadaGruaModel.setRadioGroup28BasicoManuProgGrua                         (cursor.getString(37));
            manutencaoProgramadaGruaModel.setRadioGroup29BasicoManuProgGrua                         (cursor.getString(38));
            manutencaoProgramadaGruaModel.setRadioGroup30BasicoManuProgGrua                         (cursor.getString(39));
            manutencaoProgramadaGruaModel.setRadioGroup31BasicoManuProgGrua                         (cursor.getString(40));
            manutencaoProgramadaGruaModel.setRadioGroupBasicCompManuProgGrua                        (cursor.getString(41));
            manutencaoProgramadaGruaModel.setRadioGroupQtdEixoManuProgGrua                          (cursor.getString(42));

            manutencaoProgramadaGruaModel.setCheckBoxVfslSelecionado                                ((byte) (cursor.getShort(43)));
            manutencaoProgramadaGruaModel.setCheckBoxVmvmgSelecionado                               ((byte) (cursor.getShort(44)));
            manutencaoProgramadaGruaModel.setCheckBoxTfsaappmiplSelecionado                         ((byte) (cursor.getShort(45)));

            cursor.close();
            return  manutencaoProgramadaGruaModel;
        }else{
            cursor.close();
            return null;
        }
    }

    */
/*public ManutencaoProgramadaGruaModel GetManutencaoProgramadaGruaModel(int codigo){

        Cursor cursor =  database.rawQuery("SELECT * FROM tb_manutencao_programada_grua WHERE id_= "+ codigo,null);

        cursor.moveToFirst();

        ///CRIANDO UMA NOVA PESSOAS
        ManutencaoProgramadaGruaModel manutencaoProgramadaGruaModel=  new ManutencaoProgramadaGruaModel();

        //ADICIONANDO OS DADOS DA PESSOA
        manutencaoProgramadaGruaModel.setCodigo             (cursor.getInt   (cursor.getColumnIndex("id_                ")));
        manutencaoProgramadaGruaModel.setTelefone           (cursor.getString(cursor.getColumnIndex("ds_telefone        ")));
        manutencaoProgramadaGruaModel.setModelo             (cursor.getString(cursor.getColumnIndex("fl_modelo          ")));
        manutencaoProgramadaGruaModel.setDataPreenchimennto (cursor.getString(cursor.getColumnIndex("dt_nascimento      ")));
        manutencaoProgramadaGruaModel.setNumDeSerie         (cursor.getString(cursor.getColumnIndex("fl_num_serie       ")));
        manutencaoProgramadaGruaModel.setOrdemServico       (cursor.getString(cursor.getColumnIndex("fl_ordem_servico   ")));
        manutencaoProgramadaGruaModel.setCliente            (cursor.getString(cursor.getColumnIndex("fl_cliente         ")));


        manutencaoProgramadaGruaModel.setEditText49ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText49ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditText50ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText50ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditText51ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText51ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditTextNotasGrua              (cursor.getString(cursor.getColumnIndex("editTextNotasForwarder        ")));
        manutencaoProgramadaGruaModel.setEditText41ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText41ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditText42ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText42ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditText44ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText44ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditText43ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText43ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditText45ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText45ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditText46ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText46ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditText47ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText47ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setEditText48ManuProgGrua         (cursor.getString(cursor.getColumnIndex("editText48ManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup32BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup32BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup33BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup33BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup34BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup34BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup35BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup35BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup36BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup36BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup15BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup15BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup16BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup16BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup17BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup17BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup18BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup18BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup19BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup19BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup20BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup20BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup21BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup21BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup22BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup22BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup23BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup23BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup24BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup24BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup25BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup25BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup26BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup26BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup27BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup27BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup28BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup28BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup29BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup29BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup30BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup30BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroup31BasicoManuProgGrua     (cursor.getString(cursor.getColumnIndex("radioGroup31BasicoManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroupBasicCompManuProgGrua    (cursor.getString(cursor.getColumnIndex("radioGroupBasicCompManuProgGrua        ")));
        manutencaoProgramadaGruaModel.setRadioGroupQtdEixoManuProgGrua      (cursor.getString(cursor.getColumnIndex  ("radioGroupQtdEixoManuProgGrua          ")));

        manutencaoProgramadaGruaModel.setCheckBoxVfslSelecionado        ((byte) cursor.getShort(cursor.getColumnIndex("checkBoxVfslSelecionado       ")));
        manutencaoProgramadaGruaModel.setCheckBoxVmvmgSelecionado       ((byte) cursor.getShort(cursor.getColumnIndex("checkBoxVmvmgSelecionado      ")));
        manutencaoProgramadaGruaModel.setCheckBoxTfsaappmiplSelecionado ((byte) cursor.getShort(cursor.getColumnIndex("checkBoxTfsaappmiplSelecionado")));

        //RETORNANDO A PESSOA
        return manutencaoProgramadaGruaModel;
    }*//*


    */
/***
     * CONSULTA TODAS AS PESSOAS CADASTRADAS NA BASE
     *
     * @return
     *//*


    public List<ManutencaoProgramadaGruaModel> SelecionarTodos() {
        List<ManutencaoProgramadaGruaModel> manutencaoProgramadaGruaModels = new ArrayList<ManutencaoProgramadaGruaModel>();
        Cursor cursor = database.rawQuery("select id_," +
                                          "ds_telefone                                                     , " +
                                          "fl_modelo                                                           , " +
                                          "dt_nascimento                                                       , " +
                                          "fl_num_serie                                                    , " +
                                          "fl_ordem_servico                                                , " +
                                          "fl_cliente                                                      , " +
                                          "editText49ManuProgGrua                                              , " +
                                          "editText50ManuProgGrua                                              , " +
                                          "editText51ManuProgGrua                                          , " +
                                          "editTextNotasForwarder                                          , " +
                                          "editText41ManuProgGrua                                          , " +
                                          "editText42ManuProgGrua                                              , " +
                                          "editText44ManuProgGrua                                              , " +
                                          "editText43ManuProgGrua                                          , " +
                                          "editText45ManuProgGrua                                          , " +
                                          "editText46ManuProgGrua                                          , " +
                                          "editText47ManuProgGrua                                              , " +
                                          "editText48ManuProgGrua                                              , " +
                                          "radioGroup32BasicoManuProgGrua                                  , " +
                                          "radioGroup33BasicoManuProgGrua                                  , " +
                                          "radioGroup34BasicoManuProgGrua                                  , " +
                                          "radioGroup35BasicoManuProgGrua                                      , " +
                                          "radioGroup36BasicoManuProgGrua                                      , " +
                                          "radioGroup15BasicoManuProgGrua                                  , " +
                                          "radioGroup16BasicoManuProgGrua                                  , " +
                                          "radioGroup17BasicoManuProgGrua                                  , " +
                                          "radioGroup18BasicoManuProgGrua                                      , " +
                                          "radioGroup19BasicoManuProgGrua                                      , " +
                                          "radioGroup20BasicoManuProgGrua                                  , " +
                                          "radioGroup21BasicoManuProgGrua                                  , " +
                                          "radioGroup22BasicoManuProgGrua                                  , " +
                                          "radioGroup23BasicoManuProgGrua                                      , " +
                                          "radioGroup24BasicoManuProgGrua                                      , " +
                                          "radioGroup25BasicoManuProgGrua                                  , " +
                                          "radioGroup26BasicoManuProgGrua                                  , " +
                                          "radioGroup27BasicoManuProgGrua                                  , " +
                                          "radioGroup28BasicoManuProgGrua                                      , " +
                                          "radioGroup29BasicoManuProgGrua                                      , " +
                                          "radioGroup30BasicoManuProgGrua                                  , " +
                                          "radioGroup31BasicoManuProgGrua                                  , " +
                                          "radioGroupQtdEixoManuProgGrua                                   , " +
                                          " checkBoxVfslSelecionado                                            , " +
                                          " checkBoxVmvmgSelecionado                                           , " +
                                          " checkBoxTfsaappmiplSelecionado                                  " +

                                          "from tb_manutencao_programada_grua",null);



        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            ManutencaoProgramadaGruaModel manutencaoProgramadaGruaModel = new ManutencaoProgramadaGruaModel();
            manutencaoProgramadaGruaModel.setCodigo                                         (cursor.getInt(0));
            manutencaoProgramadaGruaModel.setTelefone                                       (cursor.getString(1));
            manutencaoProgramadaGruaModel.setModelo                                         (cursor.getString(2));
            manutencaoProgramadaGruaModel.setDataPreenchimennto                             (cursor.getString(3));
            manutencaoProgramadaGruaModel.setNumDeSerie                                     (cursor.getString(4));
            manutencaoProgramadaGruaModel.setOrdemServico                                   (cursor.getString(5));
            manutencaoProgramadaGruaModel.setCliente                                        (cursor.getString(6));
            manutencaoProgramadaGruaModel.setEditText49ManuProgGrua                        (cursor.getString(7));
            manutencaoProgramadaGruaModel.setEditText50ManuProgGrua                        (cursor.getString(8));
            manutencaoProgramadaGruaModel.setEditText51ManuProgGrua                        (cursor.getString(9));
            manutencaoProgramadaGruaModel.setEditTextNotasGrua                             (cursor.getString(10));
            manutencaoProgramadaGruaModel.setEditText41ManuProgGrua                        (cursor.getString(11));
            manutencaoProgramadaGruaModel.setEditText42ManuProgGrua                        (cursor.getString(12));
            manutencaoProgramadaGruaModel.setEditText44ManuProgGrua                        (cursor.getString(13));
            manutencaoProgramadaGruaModel.setEditText43ManuProgGrua                        (cursor.getString(14));
            manutencaoProgramadaGruaModel.setEditText45ManuProgGrua                        (cursor.getString(15));
            manutencaoProgramadaGruaModel.setEditText46ManuProgGrua                        (cursor.getString(16));
            manutencaoProgramadaGruaModel.setEditText47ManuProgGrua                        (cursor.getString(17));
            manutencaoProgramadaGruaModel.setEditText48ManuProgGrua                        (cursor.getString(18));
            manutencaoProgramadaGruaModel.setRadioGroup32BasicoManuProgGrua                (cursor.getString(19));
            manutencaoProgramadaGruaModel.setRadioGroup33BasicoManuProgGrua                (cursor.getString(20));
            manutencaoProgramadaGruaModel.setRadioGroup34BasicoManuProgGrua                (cursor.getString(21));
            manutencaoProgramadaGruaModel.setRadioGroup35BasicoManuProgGrua                (cursor.getString(22));
            manutencaoProgramadaGruaModel.setRadioGroup36BasicoManuProgGrua                (cursor.getString(23));
            manutencaoProgramadaGruaModel.setRadioGroup15BasicoManuProgGrua                (cursor.getString(24));
            manutencaoProgramadaGruaModel.setRadioGroup16BasicoManuProgGrua                (cursor.getString(25));
            manutencaoProgramadaGruaModel.setRadioGroup17BasicoManuProgGrua                (cursor.getString(26));
            manutencaoProgramadaGruaModel.setRadioGroup18BasicoManuProgGrua                (cursor.getString(27));
            manutencaoProgramadaGruaModel.setRadioGroup19BasicoManuProgGrua                (cursor.getString(28));
            manutencaoProgramadaGruaModel.setRadioGroup20BasicoManuProgGrua                (cursor.getString(29));
            manutencaoProgramadaGruaModel.setRadioGroup21BasicoManuProgGrua                (cursor.getString(30));
            manutencaoProgramadaGruaModel.setRadioGroup22BasicoManuProgGrua                (cursor.getString(31));
            manutencaoProgramadaGruaModel.setRadioGroup23BasicoManuProgGrua                (cursor.getString(32));
            manutencaoProgramadaGruaModel.setRadioGroup24BasicoManuProgGrua                (cursor.getString(33));
            manutencaoProgramadaGruaModel.setRadioGroup25BasicoManuProgGrua                (cursor.getString(34));
            manutencaoProgramadaGruaModel.setRadioGroup26BasicoManuProgGrua                (cursor.getString(35));
            manutencaoProgramadaGruaModel.setRadioGroup27BasicoManuProgGrua                (cursor.getString(36));
            manutencaoProgramadaGruaModel.setRadioGroup28BasicoManuProgGrua                (cursor.getString(37));
            manutencaoProgramadaGruaModel.setRadioGroup29BasicoManuProgGrua                (cursor.getString(38));
            manutencaoProgramadaGruaModel.setRadioGroup30BasicoManuProgGrua                (cursor.getString(39));
            manutencaoProgramadaGruaModel.setRadioGroup31BasicoManuProgGrua                (cursor.getString(40));
            manutencaoProgramadaGruaModel.setRadioGroupBasicCompManuProgGrua               (cursor.getString(41));
            manutencaoProgramadaGruaModel.setRadioGroupQtdEixoManuProgGrua                 (cursor.getString(42));

            manutencaoProgramadaGruaModel.setCheckBoxVfslSelecionado        ((byte) (cursor.getShort(43)));
            manutencaoProgramadaGruaModel.setCheckBoxVmvmgSelecionado       ((byte) (cursor.getShort(44)));
            manutencaoProgramadaGruaModel.setCheckBoxTfsaappmiplSelecionado ((byte) (cursor.getShort(45)));


            manutencaoProgramadaGruaModels.add(manutencaoProgramadaGruaModel);
            cursor.moveToNext();
        }
        cursor.close();
        return manutencaoProgramadaGruaModels;
    }


   */
/* public List<ManutencaoProgramadaGruaModel> SelecionarTodos(){

        List<ManutencaoProgramadaGruaModel> manutencaoProgramadaGruaModels = new ArrayList<ManutencaoProgramadaGruaModel>();

        //MONTA A QUERY A SER EXECUTADA
        StringBuilder stringBuilderQuery = new StringBuilder();
        stringBuilderQuery.append(" SELECT id_                              ,");
        stringBuilderQuery.append("        ds_telefone                      ,");
        stringBuilderQuery.append("        fl_modelo                        ,");
        stringBuilderQuery.append("        dt_nascimento                    ,");
        stringBuilderQuery.append("        fl_num_serie                     ,");
        stringBuilderQuery.append("        fl_ordem_servico                 ,");
        stringBuilderQuery.append("        fl_cliente                       ,");

        stringBuilderQuery.append("        editText49ManuProgGrua               ,");
        stringBuilderQuery.append("        editText50ManuProgGrua               ,");
        stringBuilderQuery.append("        editText51ManuProgGrua               ,");
        stringBuilderQuery.append("        editTextNotasForwarder               ,");
        stringBuilderQuery.append("        editText41ManuProgGrua               ,");
        stringBuilderQuery.append("        editText42ManuProgGrua               ,");
        stringBuilderQuery.append("        editText44ManuProgGrua               ,");
        stringBuilderQuery.append("        editText43ManuProgGrua               ,");
        stringBuilderQuery.append("        editText45ManuProgGrua               ,");
        stringBuilderQuery.append("        editText46ManuProgGrua               ,");
        stringBuilderQuery.append("        editText47ManuProgGrua               ,");
        stringBuilderQuery.append("        editText48ManuProgGrua               ,");

        stringBuilderQuery.append("        radioGroup32BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup33BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup34BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup35BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup36BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup15BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup16BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup17BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup18BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup19BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup20BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup21BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup22BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup23BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup24BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup25BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup26BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup27BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup28BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup29BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup30BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroup31BasicoManuProgGrua                 ,");
        stringBuilderQuery.append("        radioGroupBasicCompManuProgGrua                ,");
        stringBuilderQuery.append("        radioGroupQtdEixoManuProgGrua                  ,");

        stringBuilderQuery.append("        checkBoxVfslSelecionado                        ,");
        stringBuilderQuery.append("        checkBoxVmvmgSelecionado                       ,");
        stringBuilderQuery.append("        checkBoxTfsaappmiplSelecionado                  ");

        stringBuilderQuery.append("    FROM  tb_manutencao_programada_grua              ");

        stringBuilderQuery.append("        ORDER BY dt_nascimento                           ");

        //CONSULTANDO OS REGISTROS CADASTRADOS
        cursor = databaseUtil.GetConexaoDataBase().rawQuery(stringBuilderQuery.toString(), null);
 
        *//*
*/
/*POSICIONA O CURSOR NO PRIMEIRO REGISTRO*//*
*/
/*
        cursor.moveToFirst();

        ManutencaoProgramadaGruaModel manutencaoProgramadaGruaModel;

        //REALIZA A LEITURA DOS REGISTROS ENQUANTO NÃO FOR O FIM DO CURSOR
        while (!cursor.isAfterLast()) {
 
            *//*
*/
/* CRIANDO UMA NOVA PESSOAS *//*
*/
/*
            manutencaoProgramadaGruaModel =  new ManutencaoProgramadaGruaModel();

            //ADICIONANDO OS DADOS DA PESSOA
            //ADICIONANDO OS DADOS DA PESSOA
            manutencaoProgramadaGruaModel.setCodigo             (cursor.getInt   (cursor.getColumnIndex("   id_                    ")));
            manutencaoProgramadaGruaModel.setTelefone           (cursor.getString(cursor.getColumnIndex("   ds_telefone            ")));
            manutencaoProgramadaGruaModel.setModelo             (cursor.getString(cursor.getColumnIndex("   fl_modelo              ")));
            manutencaoProgramadaGruaModel.setDataPreenchimennto (cursor.getString(cursor.getColumnIndex("   dt_nascimento          ")));
            manutencaoProgramadaGruaModel.setNumDeSerie         (cursor.getString(cursor.getColumnIndex("   fl_num_serie           ")));
            manutencaoProgramadaGruaModel.setOrdemServico       (cursor.getString(cursor.getColumnIndex("   fl_ordem_servico       ")));
            manutencaoProgramadaGruaModel.setCliente            (cursor.getString(cursor.getColumnIndex("   fl_cliente             ")));


            manutencaoProgramadaGruaModel.setEditText49ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText49ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditText50ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText50ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditText51ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText51ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditTextNotasGrua     (cursor.getString(cursor.getColumnIndex("editTextNotasForwarder        ")));
            manutencaoProgramadaGruaModel.setEditText41ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText41ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditText42ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText42ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditText44ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText44ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditText43ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText43ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditText45ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText45ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditText46ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText46ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditText47ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText47ManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setEditText48ManuProgGrua(cursor.getString(cursor.getColumnIndex("editText48ManuProgGrua        ")));

            manutencaoProgramadaGruaModel.setRadioGroup32BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup32BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup33BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup33BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup34BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup34BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup35BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup35BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup36BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup36BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup15BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup15BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup16BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup16BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup17BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup17BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup18BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup18BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup19BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup19BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup20BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup20BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup21BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup21BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup22BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup22BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup23BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup23BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup24BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup24BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup25BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup25BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup26BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup26BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup27BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup27BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup28BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup28BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup29BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup29BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup30BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup30BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroup31BasicoManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroup31BasicoManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroupBasicCompManuProgGrua(cursor.getString(cursor.getColumnIndex("radioGroupBasicCompManuProgGrua        ")));
            manutencaoProgramadaGruaModel.setRadioGroupQtdEixoManuProgGrua(cursor.getString(cursor.getColumnIndex  ("radioGroupQtdEixoManuProgGrua          ")));

            manutencaoProgramadaGruaModel.setCheckBoxVfslSelecionado        ((byte) cursor.getShort(cursor.getColumnIndex("checkBoxVfslSelecionado       ")));
            manutencaoProgramadaGruaModel.setCheckBoxVmvmgSelecionado       ((byte) cursor.getShort(cursor.getColumnIndex("checkBoxVmvmgSelecionado      ")));
            manutencaoProgramadaGruaModel.setCheckBoxTfsaappmiplSelecionado ((byte) cursor.getShort(cursor.getColumnIndex("checkBoxTfsaappmiplSelecionado")));

            //ADICIONANDO UMA PESSOA NA LISTA
            manutencaoProgramadaGruaModels.add(manutencaoProgramadaGruaModel);

            //VAI PARA O PRÓXIMO REGISTRO
            cursor.moveToNext();
        }

        //RETORNANDO A LISTA DE PESSOAS
        return manutencaoProgramadaGruaModels;
    }*//*

}*/
