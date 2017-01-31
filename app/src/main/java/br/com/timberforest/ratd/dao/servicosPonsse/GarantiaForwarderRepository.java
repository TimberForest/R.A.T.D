package br.com.timberforest.ratd.dao.servicosPonsse;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import br.com.timberforest.ratd.UteisDBPonsse.DatabaseUtil;
import br.com.timberforest.ratd.model.servicosPonsse.GarantiaForwarderModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cicero.machado on 18/03/2016.
 */
public class GarantiaForwarderRepository {

    DatabaseUtil databaseUtil;

    private SQLiteDatabase database;
    /***
     * CONSTRUTOR
     * @param context
     */
    public GarantiaForwarderRepository(Context context){

        databaseUtil =  new DatabaseUtil(context);

    }
    /***
     * SALVA UM NOVO REGISTRO NA BASE DE DADOS
     * @param garantiaForwarderModel
     */
    public void     Salvar(GarantiaForwarderModel garantiaForwarderModel){

        ContentValues contentValues =  new ContentValues();
        /*MONTANDO OS PARAMETROS PARA SEREM SALVOS*/
        contentValues.put("ds_telefone", garantiaForwarderModel.getTelefone());
        contentValues.put("fl_modelo",       garantiaForwarderModel.getModelo());
        contentValues.put("dt_nascimento", garantiaForwarderModel.getDataPreenchimennto());
        contentValues.put("fl_qtd_eixo",garantiaForwarderModel.getQtdEixo());
        contentValues.put("fl_qtd_hrs_revisao",garantiaForwarderModel.getHrsRevisao());
        contentValues.put("fl_num_serie",       garantiaForwarderModel.getNumDeSerie());
        contentValues.put("fl_horas_motor", garantiaForwarderModel.getHrsMotor());
        contentValues.put("fl_ordem_servico",garantiaForwarderModel.getOrdemServico());
        contentValues.put("fl_cliente",garantiaForwarderModel.getCliente());

        contentValues.put("editText68 ", garantiaForwarderModel.getEditText68());
        contentValues.put("editText69 ", garantiaForwarderModel.getEditText69());
        contentValues.put("editText70 ", garantiaForwarderModel.getEditText70());
        contentValues.put("editText71 ", garantiaForwarderModel.getEditText71());
        contentValues.put("editText72 ", garantiaForwarderModel.getEditText72());
        contentValues.put("editText3  ", garantiaForwarderModel.getEditText3());
        contentValues.put("editText136", garantiaForwarderModel.getEditText136());
        contentValues.put("editText146", garantiaForwarderModel.getEditText146());
        contentValues.put("editText147", garantiaForwarderModel.getEditText147());
        contentValues.put("editText149", garantiaForwarderModel.getEditText149());
        contentValues.put("editText150", garantiaForwarderModel.getEditText150());
        contentValues.put("editText151", garantiaForwarderModel.getEditText151());
        contentValues.put("editText152", garantiaForwarderModel.getEditText152());
        contentValues.put("editText38 ", garantiaForwarderModel.getEditText38());
        contentValues.put("editText39 ", garantiaForwarderModel.getEditText39());
        contentValues.put("editText40 ", garantiaForwarderModel.getEditText40());
        contentValues.put("editText41 ", garantiaForwarderModel.getEditText41());
        contentValues.put("editText42 ", garantiaForwarderModel.getEditText42());
        contentValues.put("editText43 ", garantiaForwarderModel.getEditText43());
        contentValues.put("editText44 ", garantiaForwarderModel.getEditText44());
        contentValues.put("editText45 ", garantiaForwarderModel.getEditText45());
        contentValues.put("editText46 ", garantiaForwarderModel.getEditText46());
        contentValues.put("editText47 ", garantiaForwarderModel.getEditText47());
        contentValues.put("editText48 ", garantiaForwarderModel.getEditText48());
        contentValues.put("editText49 ", garantiaForwarderModel.getEditText49());
        contentValues.put("editText50 ", garantiaForwarderModel.getEditText50());
        contentValues.put("editText51 ", garantiaForwarderModel.getEditText51());
        contentValues.put("editText56 ", garantiaForwarderModel.getEditText56());
        contentValues.put("editText57 ", garantiaForwarderModel.getEditText57());
        contentValues.put("editText58 ", garantiaForwarderModel.getEditText58());
        contentValues.put("editText59 ", garantiaForwarderModel.getEditText59());
        contentValues.put("editText154", garantiaForwarderModel.getEditText154());
        contentValues.put("editText153", garantiaForwarderModel.getEditText153());
        contentValues.put("editText155", garantiaForwarderModel.getEditText155());
        contentValues.put("editText156", garantiaForwarderModel.getEditText156());
        contentValues.put("editText157", garantiaForwarderModel.getEditText157());
        contentValues.put("editText158", garantiaForwarderModel.getEditText158());
        contentValues.put("checkBox140", garantiaForwarderModel.getCheckBox140());
        contentValues.put("checkBox209", garantiaForwarderModel.getCheckBox209());
        contentValues.put("checkBox210", garantiaForwarderModel.getCheckBox210());
        contentValues.put("checkBox211", garantiaForwarderModel.getCheckBox211());
        contentValues.put("checkBox213", garantiaForwarderModel.getCheckBox213());
        contentValues.put("checkBox214", garantiaForwarderModel.getCheckBox214());
        contentValues.put("checkBox215", garantiaForwarderModel.getCheckBox215());
        contentValues.put("checkBox216", garantiaForwarderModel.getCheckBox216());
        contentValues.put("checkBox217", garantiaForwarderModel.getCheckBox217());
        contentValues.put("checkBox218", garantiaForwarderModel.getCheckBox218());
        contentValues.put("checkBox264", garantiaForwarderModel.getCheckBox264());
        contentValues.put("checkBox265", garantiaForwarderModel.getCheckBox265());
        contentValues.put("checkBox266", garantiaForwarderModel.getCheckBox266());
        contentValues.put("checkBox267", garantiaForwarderModel.getCheckBox267());
        contentValues.put("checkBox268", garantiaForwarderModel.getCheckBox268());
        contentValues.put("checkBox269", garantiaForwarderModel.getCheckBox269());
        contentValues.put("checkBox270", garantiaForwarderModel.getCheckBox270());
        contentValues.put("checkBox271", garantiaForwarderModel.getCheckBox271());
        contentValues.put("checkBox272", garantiaForwarderModel.getCheckBox272());
        contentValues.put("checkBox273", garantiaForwarderModel.getCheckBox273());
        contentValues.put("checkBox274", garantiaForwarderModel.getCheckBox274());
        contentValues.put("checkBox275", garantiaForwarderModel.getCheckBox275());
        contentValues.put("checkBox276", garantiaForwarderModel.getCheckBox276());
        contentValues.put("checkBox277", garantiaForwarderModel.getCheckBox277());
        contentValues.put("checkBox278", garantiaForwarderModel.getCheckBox278());
        contentValues.put("checkBox279", garantiaForwarderModel.getCheckBox279());
        contentValues.put("checkBox280", garantiaForwarderModel.getCheckBox280());
        contentValues.put("checkBox281", garantiaForwarderModel.getCheckBox281());
        contentValues.put("checkBox284", garantiaForwarderModel.getCheckBox284());
        contentValues.put("checkBox285", garantiaForwarderModel.getCheckBox285());
        contentValues.put("checkBox286", garantiaForwarderModel.getCheckBox286());
        contentValues.put("checkBox287", garantiaForwarderModel.getCheckBox287());
        contentValues.put("checkBox288", garantiaForwarderModel.getCheckBox288());
        contentValues.put("checkBox289", garantiaForwarderModel.getCheckBox289());
        contentValues.put("checkBox290", garantiaForwarderModel.getCheckBox290());
        contentValues.put("checkBox291", garantiaForwarderModel.getCheckBox291());
        contentValues.put("checkBox292", garantiaForwarderModel.getCheckBox292());
        contentValues.put("checkBox293", garantiaForwarderModel.getCheckBox293());
        contentValues.put("checkBox294", garantiaForwarderModel.getCheckBox294());
        contentValues.put("checkBox295", garantiaForwarderModel.getCheckBox295());
        contentValues.put("checkBox296", garantiaForwarderModel.getCheckBox296());
        contentValues.put("checkBox297", garantiaForwarderModel.getCheckBox297());
        contentValues.put("checkBox298", garantiaForwarderModel.getCheckBox298());
        contentValues.put("checkBox299", garantiaForwarderModel.getCheckBox299());
        contentValues.put("checkBox55", garantiaForwarderModel.getCheckBox55());
        contentValues.put("checkBox56", garantiaForwarderModel.getCheckBox56());
        contentValues.put("checkBox57", garantiaForwarderModel.getCheckBox57());
        contentValues.put("checkBox58", garantiaForwarderModel.getCheckBox58());
        contentValues.put("checkBox59", garantiaForwarderModel.getCheckBox59());
        contentValues.put("checkBox60", garantiaForwarderModel.getCheckBox60());
        contentValues.put("checkBox103", garantiaForwarderModel.getCheckBox103());
        contentValues.put("checkBox104", garantiaForwarderModel.getCheckBox104());
        contentValues.put("checkBox105", garantiaForwarderModel.getCheckBox105());
        contentValues.put("checkBox106", garantiaForwarderModel.getCheckBox106());
        contentValues.put("checkBox107", garantiaForwarderModel.getCheckBox107());
        contentValues.put("checkBox108", garantiaForwarderModel.getCheckBox108());
        contentValues.put("checkBox109", garantiaForwarderModel.getCheckBox109());
        contentValues.put("checkBox110", garantiaForwarderModel.getCheckBox110());
        contentValues.put("checkBox111", garantiaForwarderModel.getCheckBox111());
        contentValues.put("checkBox112", garantiaForwarderModel.getCheckBox112());
        contentValues.put("checkBox113", garantiaForwarderModel.getCheckBox113());
        contentValues.put("checkBox114", garantiaForwarderModel.getCheckBox114());
        contentValues.put("checkBox115", garantiaForwarderModel.getCheckBox115());
        contentValues.put("checkBox116", garantiaForwarderModel.getCheckBox116());
        contentValues.put("checkBox300", garantiaForwarderModel.getCheckBox300());
        contentValues.put("checkBox301", garantiaForwarderModel.getCheckBox301());
        contentValues.put("checkBox302", garantiaForwarderModel.getCheckBox302());
        contentValues.put("checkBox303", garantiaForwarderModel.getCheckBox303());
        contentValues.put("checkBox304", garantiaForwarderModel.getCheckBox304());
        contentValues.put("checkBox305", garantiaForwarderModel.getCheckBox305());
        contentValues.put("checkBox306", garantiaForwarderModel.getCheckBox306());
        contentValues.put("checkBox307", garantiaForwarderModel.getCheckBox307());
        contentValues.put("checkBox308", garantiaForwarderModel.getCheckBox308());
        contentValues.put("checkBox309", garantiaForwarderModel.getCheckBox309());
        contentValues.put("checkBox310", garantiaForwarderModel.getCheckBox310());
        contentValues.put("checkBox311", garantiaForwarderModel.getCheckBox311());
        contentValues.put("checkBox312", garantiaForwarderModel.getCheckBox312());
        contentValues.put("checkBox313", garantiaForwarderModel.getCheckBox313());
        contentValues.put("checkBox314", garantiaForwarderModel.getCheckBox314());
        contentValues.put("checkBox315", garantiaForwarderModel.getCheckBox315());
        contentValues.put("checkBox316", garantiaForwarderModel.getCheckBox316());
        contentValues.put("checkBox317", garantiaForwarderModel.getCheckBox317());
        contentValues.put("checkBox318", garantiaForwarderModel.getCheckBox318());
        contentValues.put("checkBox319", garantiaForwarderModel.getCheckBox319());
        contentValues.put("checkBox320", garantiaForwarderModel.getCheckBox320());
        contentValues.put("checkBox321", garantiaForwarderModel.getCheckBox321());
        contentValues.put("checkBox322", garantiaForwarderModel.getCheckBox322());
        contentValues.put("checkBox323", garantiaForwarderModel.getCheckBox323());
        contentValues.put("checkBox324", garantiaForwarderModel.getCheckBox324());
        contentValues.put("checkBox325", garantiaForwarderModel.getCheckBox325());
        contentValues.put("checkBox326", garantiaForwarderModel.getCheckBox326());
        contentValues.put("checkBox327", garantiaForwarderModel.getCheckBox327());
        contentValues.put("checkBox328", garantiaForwarderModel.getCheckBox328());
        contentValues.put("checkBox329", garantiaForwarderModel.getCheckBox329());
        contentValues.put("checkBox330", garantiaForwarderModel.getCheckBox330());
        contentValues.put("checkBox333", garantiaForwarderModel.getCheckBox333());
        contentValues.put("checkBox334", garantiaForwarderModel.getCheckBox334());
        contentValues.put("checkBox335", garantiaForwarderModel.getCheckBox335());
        contentValues.put("checkBox336", garantiaForwarderModel.getCheckBox336());
        contentValues.put("checkBox337", garantiaForwarderModel.getCheckBox337());
        contentValues.put("checkBox338", garantiaForwarderModel.getCheckBox338());
        contentValues.put("checkBox339", garantiaForwarderModel.getCheckBox339());
        contentValues.put("checkBox340", garantiaForwarderModel.getCheckBox340());
        contentValues.put("checkBox341", garantiaForwarderModel.getCheckBox341());
        contentValues.put("checkBox342", garantiaForwarderModel.getCheckBox342());
        contentValues.put("checkBox343", garantiaForwarderModel.getCheckBox343());
        contentValues.put("checkBox344", garantiaForwarderModel.getCheckBox344());
        contentValues.put("checkBox345", garantiaForwarderModel.getCheckBox345());
        contentValues.put("checkBox346", garantiaForwarderModel.getCheckBox346());
        contentValues.put("checkBox347", garantiaForwarderModel.getCheckBox347());
        contentValues.put("checkBox348", garantiaForwarderModel.getCheckBox348());
        contentValues.put("checkBox349", garantiaForwarderModel.getCheckBox349());
        contentValues.put("checkBox350", garantiaForwarderModel.getCheckBox350());
        contentValues.put("checkBox351", garantiaForwarderModel.getCheckBox351());
        contentValues.put("checkBox352", garantiaForwarderModel.getCheckBox352());
        contentValues.put("checkBox353", garantiaForwarderModel.getCheckBox353());
        contentValues.put("checkBox354", garantiaForwarderModel.getCheckBox354());
        contentValues.put("checkBox355", garantiaForwarderModel.getCheckBox355());
        contentValues.put("checkBox356", garantiaForwarderModel.getCheckBox356());
        contentValues.put("checkBox357", garantiaForwarderModel.getCheckBox357());
        contentValues.put("checkBox358", garantiaForwarderModel.getCheckBox358());

        /*EXECUTANDO INSERT DE UM NOVO REGISTRO*/
        databaseUtil.GetConexaoDataBase().insert("tb_garantia_forwarder", null, contentValues);

    }
    /***
     * ATUALIZA UM REGISTRO JÁ EXISTENTE NA BASE
     * @param garantiaForwarderModel
     */
    public void Atualizar(GarantiaForwarderModel garantiaForwarderModel){

        ContentValues contentValues =  new ContentValues();
 
        /*MONTA OS PARAMENTROS PARA REALIZAR UPDATE NOS CAMPOS*/
        contentValues.put("ds_telefone",       garantiaForwarderModel.getTelefone());
        contentValues.put("fl_modelo",       garantiaForwarderModel.getModelo());
        contentValues.put("dt_nascimento", garantiaForwarderModel.getDataPreenchimennto());
        contentValues.put("fl_qtd_eixo",garantiaForwarderModel.getQtdEixo());
        contentValues.put("fl_qtd_hrs_revisao",garantiaForwarderModel.getHrsRevisao());
        contentValues.put("fl_num_serie",       garantiaForwarderModel.getNumDeSerie());
        contentValues.put("fl_horas_motor", garantiaForwarderModel.getHrsMotor());
        contentValues.put("fl_ordem_servico",garantiaForwarderModel.getOrdemServico());
        contentValues.put("fl_cliente",garantiaForwarderModel.getCliente());
        contentValues.put("editText68 ", garantiaForwarderModel.getEditText68());
        contentValues.put("editText69 ", garantiaForwarderModel.getEditText69());
        contentValues.put("editText70 ", garantiaForwarderModel.getEditText70());
        contentValues.put("editText71 ", garantiaForwarderModel.getEditText71());
        contentValues.put("editText72 ", garantiaForwarderModel.getEditText72());
        contentValues.put("editText3  ", garantiaForwarderModel.getEditText3());
        contentValues.put("editText136", garantiaForwarderModel.getEditText136());
        contentValues.put("editText146", garantiaForwarderModel.getEditText146());
        contentValues.put("editText147", garantiaForwarderModel.getEditText147());
        contentValues.put("editText149", garantiaForwarderModel.getEditText149());
        contentValues.put("editText150", garantiaForwarderModel.getEditText150());
        contentValues.put("editText151", garantiaForwarderModel.getEditText151());
        contentValues.put("editText152", garantiaForwarderModel.getEditText152());
        contentValues.put("editText38 ", garantiaForwarderModel.getEditText38());
        contentValues.put("editText39 ", garantiaForwarderModel.getEditText39());
        contentValues.put("editText40 ", garantiaForwarderModel.getEditText40());
        contentValues.put("editText41 ", garantiaForwarderModel.getEditText41());
        contentValues.put("editText42 ", garantiaForwarderModel.getEditText42());
        contentValues.put("editText43 ", garantiaForwarderModel.getEditText43());
        contentValues.put("editText44 ", garantiaForwarderModel.getEditText44());
        contentValues.put("editText45 ", garantiaForwarderModel.getEditText45());
        contentValues.put("editText46 ", garantiaForwarderModel.getEditText46());
        contentValues.put("editText47 ", garantiaForwarderModel.getEditText47());
        contentValues.put("editText48 ", garantiaForwarderModel.getEditText48());
        contentValues.put("editText49 ", garantiaForwarderModel.getEditText49());
        contentValues.put("editText50 ", garantiaForwarderModel.getEditText50());
        contentValues.put("editText51 ", garantiaForwarderModel.getEditText51());
        contentValues.put("editText56 ", garantiaForwarderModel.getEditText56());
        contentValues.put("editText57 ", garantiaForwarderModel.getEditText57());
        contentValues.put("editText58 ", garantiaForwarderModel.getEditText58());
        contentValues.put("editText59 ", garantiaForwarderModel.getEditText59());
        contentValues.put("editText154", garantiaForwarderModel.getEditText154());
        contentValues.put("editText153", garantiaForwarderModel.getEditText153());
        contentValues.put("editText155", garantiaForwarderModel.getEditText155());
        contentValues.put("editText156", garantiaForwarderModel.getEditText156());
        contentValues.put("editText157", garantiaForwarderModel.getEditText157());
        contentValues.put("editText158", garantiaForwarderModel.getEditText158());
        contentValues.put("checkBox140", garantiaForwarderModel.getCheckBox140());
        contentValues.put("checkBox209", garantiaForwarderModel.getCheckBox209());
        contentValues.put("checkBox210", garantiaForwarderModel.getCheckBox210());
        contentValues.put("checkBox211", garantiaForwarderModel.getCheckBox211());
        contentValues.put("checkBox213", garantiaForwarderModel.getCheckBox213());
        contentValues.put("checkBox214", garantiaForwarderModel.getCheckBox214());
        contentValues.put("checkBox215", garantiaForwarderModel.getCheckBox215());
        contentValues.put("checkBox216", garantiaForwarderModel.getCheckBox216());
        contentValues.put("checkBox217", garantiaForwarderModel.getCheckBox217());
        contentValues.put("checkBox218", garantiaForwarderModel.getCheckBox218());
        contentValues.put("checkBox264", garantiaForwarderModel.getCheckBox264());
        contentValues.put("checkBox265", garantiaForwarderModel.getCheckBox265());
        contentValues.put("checkBox266", garantiaForwarderModel.getCheckBox266());
        contentValues.put("checkBox267", garantiaForwarderModel.getCheckBox267());
        contentValues.put("checkBox268", garantiaForwarderModel.getCheckBox268());
        contentValues.put("checkBox269", garantiaForwarderModel.getCheckBox269());
        contentValues.put("checkBox270", garantiaForwarderModel.getCheckBox270());
        contentValues.put("checkBox271", garantiaForwarderModel.getCheckBox271());
        contentValues.put("checkBox272", garantiaForwarderModel.getCheckBox272());
        contentValues.put("checkBox273", garantiaForwarderModel.getCheckBox273());
        contentValues.put("checkBox274", garantiaForwarderModel.getCheckBox274());
        contentValues.put("checkBox275", garantiaForwarderModel.getCheckBox275());
        contentValues.put("checkBox276", garantiaForwarderModel.getCheckBox276());
        contentValues.put("checkBox277", garantiaForwarderModel.getCheckBox277());
        contentValues.put("checkBox278", garantiaForwarderModel.getCheckBox278());
        contentValues.put("checkBox279", garantiaForwarderModel.getCheckBox279());
        contentValues.put("checkBox280", garantiaForwarderModel.getCheckBox280());
        contentValues.put("checkBox281", garantiaForwarderModel.getCheckBox281());
        contentValues.put("checkBox284", garantiaForwarderModel.getCheckBox284());
        contentValues.put("checkBox285", garantiaForwarderModel.getCheckBox285());
        contentValues.put("checkBox286", garantiaForwarderModel.getCheckBox286());
        contentValues.put("checkBox287", garantiaForwarderModel.getCheckBox287());
        contentValues.put("checkBox288", garantiaForwarderModel.getCheckBox288());
        contentValues.put("checkBox289", garantiaForwarderModel.getCheckBox289());
        contentValues.put("checkBox290", garantiaForwarderModel.getCheckBox290());
        contentValues.put("checkBox291", garantiaForwarderModel.getCheckBox291());
        contentValues.put("checkBox292", garantiaForwarderModel.getCheckBox292());
        contentValues.put("checkBox293", garantiaForwarderModel.getCheckBox293());
        contentValues.put("checkBox294", garantiaForwarderModel.getCheckBox294());
        contentValues.put("checkBox295", garantiaForwarderModel.getCheckBox295());
        contentValues.put("checkBox296", garantiaForwarderModel.getCheckBox296());
        contentValues.put("checkBox297", garantiaForwarderModel.getCheckBox297());
        contentValues.put("checkBox298", garantiaForwarderModel.getCheckBox298());
        contentValues.put("checkBox299", garantiaForwarderModel.getCheckBox299());
        contentValues.put("checkBox55", garantiaForwarderModel.getCheckBox55());
        contentValues.put("checkBox56", garantiaForwarderModel.getCheckBox56());
        contentValues.put("checkBox57", garantiaForwarderModel.getCheckBox57());
        contentValues.put("checkBox58", garantiaForwarderModel.getCheckBox58());
        contentValues.put("checkBox59", garantiaForwarderModel.getCheckBox59());
        contentValues.put("checkBox60", garantiaForwarderModel.getCheckBox60());
        contentValues.put("checkBox103", garantiaForwarderModel.getCheckBox103());
        contentValues.put("checkBox104", garantiaForwarderModel.getCheckBox104());
        contentValues.put("checkBox105", garantiaForwarderModel.getCheckBox105());
        contentValues.put("checkBox106", garantiaForwarderModel.getCheckBox106());
        contentValues.put("checkBox107", garantiaForwarderModel.getCheckBox107());
        contentValues.put("checkBox108", garantiaForwarderModel.getCheckBox108());
        contentValues.put("checkBox109", garantiaForwarderModel.getCheckBox109());
        contentValues.put("checkBox110", garantiaForwarderModel.getCheckBox110());
        contentValues.put("checkBox111", garantiaForwarderModel.getCheckBox111());
        contentValues.put("checkBox112", garantiaForwarderModel.getCheckBox112());
        contentValues.put("checkBox113", garantiaForwarderModel.getCheckBox113());
        contentValues.put("checkBox114", garantiaForwarderModel.getCheckBox114());
        contentValues.put("checkBox115", garantiaForwarderModel.getCheckBox115());
        contentValues.put("checkBox116", garantiaForwarderModel.getCheckBox116());
        contentValues.put("checkBox300", garantiaForwarderModel.getCheckBox300());
        contentValues.put("checkBox301", garantiaForwarderModel.getCheckBox301());
        contentValues.put("checkBox302", garantiaForwarderModel.getCheckBox302());
        contentValues.put("checkBox303", garantiaForwarderModel.getCheckBox303());
        contentValues.put("checkBox304", garantiaForwarderModel.getCheckBox304());
        contentValues.put("checkBox305", garantiaForwarderModel.getCheckBox305());
        contentValues.put("checkBox306", garantiaForwarderModel.getCheckBox306());
        contentValues.put("checkBox307", garantiaForwarderModel.getCheckBox307());
        contentValues.put("checkBox308", garantiaForwarderModel.getCheckBox308());
        contentValues.put("checkBox309", garantiaForwarderModel.getCheckBox309());
        contentValues.put("checkBox310", garantiaForwarderModel.getCheckBox310());
        contentValues.put("checkBox311", garantiaForwarderModel.getCheckBox311());
        contentValues.put("checkBox312", garantiaForwarderModel.getCheckBox312());
        contentValues.put("checkBox313", garantiaForwarderModel.getCheckBox313());
        contentValues.put("checkBox314", garantiaForwarderModel.getCheckBox314());
        contentValues.put("checkBox315", garantiaForwarderModel.getCheckBox315());
        contentValues.put("checkBox316", garantiaForwarderModel.getCheckBox316());
        contentValues.put("checkBox317", garantiaForwarderModel.getCheckBox317());
        contentValues.put("checkBox318", garantiaForwarderModel.getCheckBox318());
        contentValues.put("checkBox319", garantiaForwarderModel.getCheckBox319());
        contentValues.put("checkBox320", garantiaForwarderModel.getCheckBox320());
        contentValues.put("checkBox321", garantiaForwarderModel.getCheckBox321());
        contentValues.put("checkBox322", garantiaForwarderModel.getCheckBox322());
        contentValues.put("checkBox323", garantiaForwarderModel.getCheckBox323());
        contentValues.put("checkBox324", garantiaForwarderModel.getCheckBox324());
        contentValues.put("checkBox325", garantiaForwarderModel.getCheckBox325());
        contentValues.put("checkBox326", garantiaForwarderModel.getCheckBox326());
        contentValues.put("checkBox327", garantiaForwarderModel.getCheckBox327());
        contentValues.put("checkBox328", garantiaForwarderModel.getCheckBox328());
        contentValues.put("checkBox329", garantiaForwarderModel.getCheckBox329());
        contentValues.put("checkBox330", garantiaForwarderModel.getCheckBox330());
        contentValues.put("checkBox333", garantiaForwarderModel.getCheckBox333());
        contentValues.put("checkBox334", garantiaForwarderModel.getCheckBox334());
        contentValues.put("checkBox335", garantiaForwarderModel.getCheckBox335());
        contentValues.put("checkBox336", garantiaForwarderModel.getCheckBox336());
        contentValues.put("checkBox337", garantiaForwarderModel.getCheckBox337());
        contentValues.put("checkBox338", garantiaForwarderModel.getCheckBox338());
        contentValues.put("checkBox339", garantiaForwarderModel.getCheckBox339());
        contentValues.put("checkBox340", garantiaForwarderModel.getCheckBox340());
        contentValues.put("checkBox341", garantiaForwarderModel.getCheckBox341());
        contentValues.put("checkBox342", garantiaForwarderModel.getCheckBox342());
        contentValues.put("checkBox343", garantiaForwarderModel.getCheckBox343());
        contentValues.put("checkBox344", garantiaForwarderModel.getCheckBox344());
        contentValues.put("checkBox345", garantiaForwarderModel.getCheckBox345());
        contentValues.put("checkBox346", garantiaForwarderModel.getCheckBox346());
        contentValues.put("checkBox347", garantiaForwarderModel.getCheckBox347());
        contentValues.put("checkBox348", garantiaForwarderModel.getCheckBox348());
        contentValues.put("checkBox349", garantiaForwarderModel.getCheckBox349());
        contentValues.put("checkBox350", garantiaForwarderModel.getCheckBox350());
        contentValues.put("checkBox351", garantiaForwarderModel.getCheckBox351());
        contentValues.put("checkBox352", garantiaForwarderModel.getCheckBox352());
        contentValues.put("checkBox353", garantiaForwarderModel.getCheckBox353());
        contentValues.put("checkBox354", garantiaForwarderModel.getCheckBox354());
        contentValues.put("checkBox355", garantiaForwarderModel.getCheckBox355());
        contentValues.put("checkBox356", garantiaForwarderModel.getCheckBox356());
        contentValues.put("checkBox357", garantiaForwarderModel.getCheckBox357());
        contentValues.put("checkBox358", garantiaForwarderModel.getCheckBox358());

        /*REALIZANDO UPDATE PELA CHAVE DA TABELA*/
        databaseUtil.GetConexaoDataBase().update("tb_garantia_forwarder", contentValues, "id_ = ?", new String[]{Integer.toString(garantiaForwarderModel.getCodigo())});
    }
    /***
     * EXCLUI UM REGISTRO PELO CÓDIGO
     * @param
     * @param
     * @param codigo
     * @return
     */
    public Integer excluir(int codigo) {
        //EXCLUINDO  REGISTRO E RETORNANDO O NÚMERO DE LINHAS AFETADAS
        return databaseUtil.GetConexaoDataBase().delete("tb_garantia_forwarder","id_ = ?", new String[]{Integer.toString(codigo)});
    }
    /***
     * CONSULTA UMA PESSOA CADASTRADA PELO CÓDIGO
     * @param codigo
     * @return
     */
    public GarantiaForwarderModel GetGarantiaForwarder(Integer codigo){

        Cursor cursor =  databaseUtil.GetConexaoDataBase().rawQuery("SELECT * FROM tb_garantia_forwarder WHERE id_= "+ codigo,null);

        cursor.moveToFirst();

        ///CRIANDO UMA NOVA PESSOAS
        GarantiaForwarderModel garantiaForwarderModel =  new GarantiaForwarderModel();

        //ADICIONANDO OS DADOS DA PESSOA
        garantiaForwarderModel.setCodigo(cursor.getInt(cursor.getColumnIndex("id_")));
        garantiaForwarderModel.setTelefone(cursor.getString(cursor.getColumnIndex("ds_telefone")));
        garantiaForwarderModel.setModelo(cursor.getString(cursor.getColumnIndex("fl_modelo")));
        garantiaForwarderModel.setDataPreenchimennto(cursor.getString(cursor.getColumnIndex("dt_nascimento")));
        garantiaForwarderModel.setQtdEixo(cursor.getString(cursor.getColumnIndex("fl_qtd_eixo")));
        garantiaForwarderModel.setHrsRevisao(cursor.getString(cursor.getColumnIndex("fl_qtd_hrs_revisao")));
        garantiaForwarderModel.setNumDeSerie(cursor.getString(cursor.getColumnIndex("fl_num_serie")));
        garantiaForwarderModel.setHrsMotor(cursor.getString(cursor.getColumnIndex("fl_horas_motor")));
        garantiaForwarderModel.setOrdemServico(cursor.getString(cursor.getColumnIndex("fl_ordem_servico")));
        garantiaForwarderModel.setCliente(cursor.getString(cursor.getColumnIndex("fl_cliente")));
        garantiaForwarderModel.setEditText68(cursor.getString(cursor.getColumnIndex("editText68 ")));
        garantiaForwarderModel.setEditText69(cursor.getString(cursor.getColumnIndex("editText69 ")));
        garantiaForwarderModel.setEditText70(cursor.getString(cursor.getColumnIndex("editText70 ")));
        garantiaForwarderModel.setEditText71(cursor.getString(cursor.getColumnIndex("editText71 ")));
        garantiaForwarderModel.setEditText72(cursor.getString(cursor.getColumnIndex("editText72 ")));
        garantiaForwarderModel.setEditText3(cursor.getString(cursor.getColumnIndex("editText3  ")));
        garantiaForwarderModel.setEditText136(cursor.getString(cursor.getColumnIndex("editText136")));
        garantiaForwarderModel.setEditText146(cursor.getString(cursor.getColumnIndex("editText146")));
        garantiaForwarderModel.setEditText147(cursor.getString(cursor.getColumnIndex("editText147")));
        garantiaForwarderModel.setEditText149(cursor.getString(cursor.getColumnIndex("editText149")));
        garantiaForwarderModel.setEditText150(cursor.getString(cursor.getColumnIndex("editText150")));
        garantiaForwarderModel.setEditText151(cursor.getString(cursor.getColumnIndex("editText151")));
        garantiaForwarderModel.setEditText152(cursor.getString(cursor.getColumnIndex("editText152")));
        garantiaForwarderModel.setEditText38(cursor.getString(cursor.getColumnIndex("editText38 ")));
        garantiaForwarderModel.setEditText39(cursor.getString(cursor.getColumnIndex("editText39 ")));
        garantiaForwarderModel.setEditText40(cursor.getString(cursor.getColumnIndex("editText40 ")));
        garantiaForwarderModel.setEditText41(cursor.getString(cursor.getColumnIndex("editText41 ")));
        garantiaForwarderModel.setEditText42(cursor.getString(cursor.getColumnIndex("editText42 ")));
        garantiaForwarderModel.setEditText43(cursor.getString(cursor.getColumnIndex("editText43 ")));
        garantiaForwarderModel.setEditText44(cursor.getString(cursor.getColumnIndex("editText44 ")));
        garantiaForwarderModel.setEditText45(cursor.getString(cursor.getColumnIndex("editText45 ")));
        garantiaForwarderModel.setEditText46(cursor.getString(cursor.getColumnIndex("editText46 ")));
        garantiaForwarderModel.setEditText47(cursor.getString(cursor.getColumnIndex("editText47 ")));
        garantiaForwarderModel.setEditText48(cursor.getString(cursor.getColumnIndex("editText48 ")));
        garantiaForwarderModel.setEditText49(cursor.getString(cursor.getColumnIndex("editText49 ")));
        garantiaForwarderModel.setEditText50(cursor.getString(cursor.getColumnIndex("editText50 ")));
        garantiaForwarderModel.setEditText51(cursor.getString(cursor.getColumnIndex("editText51 ")));
        garantiaForwarderModel.setEditText56(cursor.getString(cursor.getColumnIndex("editText56 ")));
        garantiaForwarderModel.setEditText57(cursor.getString(cursor.getColumnIndex("editText57 ")));
        garantiaForwarderModel.setEditText58(cursor.getString(cursor.getColumnIndex("editText58 ")));
        garantiaForwarderModel.setEditText59(cursor.getString(cursor.getColumnIndex("editText59 ")));
        garantiaForwarderModel.setEditText154(cursor.getString(cursor.getColumnIndex("editText154")));
        garantiaForwarderModel.setEditText153(cursor.getString(cursor.getColumnIndex("editText153")));
        garantiaForwarderModel.setEditText155(cursor.getString(cursor.getColumnIndex("editText155")));
        garantiaForwarderModel.setEditText156(cursor.getString(cursor.getColumnIndex("editText156")));
        garantiaForwarderModel.setEditText157(cursor.getString(cursor.getColumnIndex("editText157")));
        garantiaForwarderModel.setEditText158(cursor.getString(cursor.getColumnIndex("editText158")));
        garantiaForwarderModel.setCheckBox140((byte) cursor.getShort(cursor.getColumnIndex("checkBox140")));
        garantiaForwarderModel.setCheckBox209((byte) cursor.getShort(cursor.getColumnIndex("checkBox209")));
        garantiaForwarderModel.setCheckBox210((byte) cursor.getShort(cursor.getColumnIndex("checkBox210")));
        garantiaForwarderModel.setCheckBox211((byte) cursor.getShort(cursor.getColumnIndex("checkBox211")));
        garantiaForwarderModel.setCheckBox213((byte) cursor.getShort(cursor.getColumnIndex("checkBox213")));
        garantiaForwarderModel.setCheckBox214((byte) cursor.getShort(cursor.getColumnIndex("checkBox214")));
        garantiaForwarderModel.setCheckBox215((byte) cursor.getShort(cursor.getColumnIndex("checkBox215")));
        garantiaForwarderModel.setCheckBox216((byte) cursor.getShort(cursor.getColumnIndex("checkBox216")));
        garantiaForwarderModel.setCheckBox217((byte) cursor.getShort(cursor.getColumnIndex("checkBox217")));
        garantiaForwarderModel.setCheckBox218((byte) cursor.getShort(cursor.getColumnIndex("checkBox218")));
        garantiaForwarderModel.setCheckBox264((byte) cursor.getShort(cursor.getColumnIndex("checkBox264")));
        garantiaForwarderModel.setCheckBox265((byte) cursor.getShort(cursor.getColumnIndex("checkBox265")));
        garantiaForwarderModel.setCheckBox266((byte) cursor.getShort(cursor.getColumnIndex("checkBox266")));
        garantiaForwarderModel.setCheckBox267((byte) cursor.getShort(cursor.getColumnIndex("checkBox267")));
        garantiaForwarderModel.setCheckBox268((byte) cursor.getShort(cursor.getColumnIndex("checkBox268")));
        garantiaForwarderModel.setCheckBox269((byte) cursor.getShort(cursor.getColumnIndex("checkBox269")));
        garantiaForwarderModel.setCheckBox270((byte) cursor.getShort(cursor.getColumnIndex("checkBox270")));
        garantiaForwarderModel.setCheckBox271((byte) cursor.getShort(cursor.getColumnIndex("checkBox271")));
        garantiaForwarderModel.setCheckBox272((byte) cursor.getShort(cursor.getColumnIndex("checkBox272")));
        garantiaForwarderModel.setCheckBox273((byte) cursor.getShort(cursor.getColumnIndex("checkBox273")));
        garantiaForwarderModel.setCheckBox274((byte) cursor.getShort(cursor.getColumnIndex("checkBox274")));
        garantiaForwarderModel.setCheckBox275((byte) cursor.getShort(cursor.getColumnIndex("checkBox275")));
        garantiaForwarderModel.setCheckBox276((byte) cursor.getShort(cursor.getColumnIndex("checkBox276")));
        garantiaForwarderModel.setCheckBox277((byte) cursor.getShort(cursor.getColumnIndex("checkBox277")));
        garantiaForwarderModel.setCheckBox278((byte) cursor.getShort(cursor.getColumnIndex("checkBox278")));
        garantiaForwarderModel.setCheckBox279((byte) cursor.getShort(cursor.getColumnIndex("checkBox279")));
        garantiaForwarderModel.setCheckBox280((byte) cursor.getShort(cursor.getColumnIndex("checkBox280")));
        garantiaForwarderModel.setCheckBox281((byte) cursor.getShort(cursor.getColumnIndex("checkBox281")));
        garantiaForwarderModel.setCheckBox284((byte) cursor.getShort(cursor.getColumnIndex("checkBox284")));
        garantiaForwarderModel.setCheckBox285((byte) cursor.getShort(cursor.getColumnIndex("checkBox285")));
        garantiaForwarderModel.setCheckBox286((byte) cursor.getShort(cursor.getColumnIndex("checkBox286")));
        garantiaForwarderModel.setCheckBox287((byte) cursor.getShort(cursor.getColumnIndex("checkBox287")));
        garantiaForwarderModel.setCheckBox288((byte) cursor.getShort(cursor.getColumnIndex("checkBox288")));
        garantiaForwarderModel.setCheckBox289((byte) cursor.getShort(cursor.getColumnIndex("checkBox289")));
        garantiaForwarderModel.setCheckBox290((byte) cursor.getShort(cursor.getColumnIndex("checkBox290")));
        garantiaForwarderModel.setCheckBox291((byte) cursor.getShort(cursor.getColumnIndex("checkBox291")));
        garantiaForwarderModel.setCheckBox292((byte) cursor.getShort(cursor.getColumnIndex("checkBox292")));
        garantiaForwarderModel.setCheckBox293((byte) cursor.getShort(cursor.getColumnIndex("checkBox293")));
        garantiaForwarderModel.setCheckBox294((byte) cursor.getShort(cursor.getColumnIndex("checkBox294")));
        garantiaForwarderModel.setCheckBox295((byte) cursor.getShort(cursor.getColumnIndex("checkBox295")));
        garantiaForwarderModel.setCheckBox296((byte) cursor.getShort(cursor.getColumnIndex("checkBox296")));
        garantiaForwarderModel.setCheckBox297((byte) cursor.getShort(cursor.getColumnIndex("checkBox297")));
        garantiaForwarderModel.setCheckBox298((byte) cursor.getShort(cursor.getColumnIndex("checkBox298")));
        garantiaForwarderModel.setCheckBox299((byte) cursor.getShort(cursor.getColumnIndex("checkBox299")));
        garantiaForwarderModel.setCheckBox300((byte) cursor.getShort(cursor.getColumnIndex("checkBox55")));
        garantiaForwarderModel.setCheckBox56((byte) cursor.getShort(cursor.getColumnIndex("checkBox56")));
        garantiaForwarderModel.setCheckBox57((byte) cursor.getShort(cursor.getColumnIndex("checkBox57")));
        garantiaForwarderModel.setCheckBox58((byte) cursor.getShort(cursor.getColumnIndex("checkBox58")));
        garantiaForwarderModel.setCheckBox59((byte) cursor.getShort(cursor.getColumnIndex("checkBox59")));
        garantiaForwarderModel.setCheckBox60((byte) cursor.getShort(cursor.getColumnIndex("checkBox60")));
        garantiaForwarderModel.setCheckBox103((byte) cursor.getShort(cursor.getColumnIndex("checkBox103")));
        garantiaForwarderModel.setCheckBox104((byte) cursor.getShort(cursor.getColumnIndex("checkBox104")));
        garantiaForwarderModel.setCheckBox105((byte) cursor.getShort(cursor.getColumnIndex("checkBox105")));
        garantiaForwarderModel.setCheckBox106((byte) cursor.getShort(cursor.getColumnIndex("checkBox106")));
        garantiaForwarderModel.setCheckBox107((byte) cursor.getShort(cursor.getColumnIndex("checkBox107")));
        garantiaForwarderModel.setCheckBox108((byte) cursor.getShort(cursor.getColumnIndex("checkBox108")));
        garantiaForwarderModel.setCheckBox109((byte) cursor.getShort(cursor.getColumnIndex("checkBox109")));
        garantiaForwarderModel.setCheckBox110((byte) cursor.getShort(cursor.getColumnIndex("checkBox110")));
        garantiaForwarderModel.setCheckBox111((byte) cursor.getShort(cursor.getColumnIndex("checkBox111")));
        garantiaForwarderModel.setCheckBox112((byte) cursor.getShort(cursor.getColumnIndex("checkBox112")));
        garantiaForwarderModel.setCheckBox113((byte) cursor.getShort(cursor.getColumnIndex("checkBox113")));
        garantiaForwarderModel.setCheckBox114((byte) cursor.getShort(cursor.getColumnIndex("checkBox114")));
        garantiaForwarderModel.setCheckBox115((byte) cursor.getShort(cursor.getColumnIndex("checkBox115")));
        garantiaForwarderModel.setCheckBox116((byte) cursor.getShort(cursor.getColumnIndex("checkBox116")));
        garantiaForwarderModel.setCheckBox300((byte) cursor.getShort(cursor.getColumnIndex("checkBox300")));
        garantiaForwarderModel.setCheckBox301((byte) cursor.getShort(cursor.getColumnIndex("checkBox301")));
        garantiaForwarderModel.setCheckBox302((byte) cursor.getShort(cursor.getColumnIndex("checkBox302")));
        garantiaForwarderModel.setCheckBox303((byte) cursor.getShort(cursor.getColumnIndex("checkBox303")));
        garantiaForwarderModel.setCheckBox304((byte) cursor.getShort(cursor.getColumnIndex("checkBox304")));
        garantiaForwarderModel.setCheckBox305((byte) cursor.getShort(cursor.getColumnIndex("checkBox305")));
        garantiaForwarderModel.setCheckBox306((byte) cursor.getShort(cursor.getColumnIndex("checkBox306")));
        garantiaForwarderModel.setCheckBox307((byte) cursor.getShort(cursor.getColumnIndex("checkBox307")));
        garantiaForwarderModel.setCheckBox308((byte) cursor.getShort(cursor.getColumnIndex("checkBox308")));
        garantiaForwarderModel.setCheckBox309((byte) cursor.getShort(cursor.getColumnIndex("checkBox309")));
        garantiaForwarderModel.setCheckBox310((byte) cursor.getShort(cursor.getColumnIndex("checkBox310")));
        garantiaForwarderModel.setCheckBox311((byte) cursor.getShort(cursor.getColumnIndex("checkBox311")));
        garantiaForwarderModel.setCheckBox312((byte) cursor.getShort(cursor.getColumnIndex("checkBox312")));
        garantiaForwarderModel.setCheckBox313((byte) cursor.getShort(cursor.getColumnIndex("checkBox313")));
        garantiaForwarderModel.setCheckBox314((byte) cursor.getShort(cursor.getColumnIndex("checkBox314")));
        garantiaForwarderModel.setCheckBox315((byte) cursor.getShort(cursor.getColumnIndex("checkBox315")));
        garantiaForwarderModel.setCheckBox316((byte) cursor.getShort(cursor.getColumnIndex("checkBox316")));
        garantiaForwarderModel.setCheckBox317((byte) cursor.getShort(cursor.getColumnIndex("checkBox317")));
        garantiaForwarderModel.setCheckBox318((byte) cursor.getShort(cursor.getColumnIndex("checkBox318")));
        garantiaForwarderModel.setCheckBox319((byte) cursor.getShort(cursor.getColumnIndex("checkBox319")));
        garantiaForwarderModel.setCheckBox320((byte) cursor.getShort(cursor.getColumnIndex("checkBox320")));
        garantiaForwarderModel.setCheckBox321((byte) cursor.getShort(cursor.getColumnIndex("checkBox321")));
        garantiaForwarderModel.setCheckBox322((byte) cursor.getShort(cursor.getColumnIndex("checkBox322")));
        garantiaForwarderModel.setCheckBox323((byte) cursor.getShort(cursor.getColumnIndex("checkBox323")));
        garantiaForwarderModel.setCheckBox324((byte) cursor.getShort(cursor.getColumnIndex("checkBox324")));
        garantiaForwarderModel.setCheckBox325((byte) cursor.getShort(cursor.getColumnIndex("checkBox325")));
        garantiaForwarderModel.setCheckBox326((byte) cursor.getShort(cursor.getColumnIndex("checkBox326")));
        garantiaForwarderModel.setCheckBox327((byte) cursor.getShort(cursor.getColumnIndex("checkBox327")));
        garantiaForwarderModel.setCheckBox328((byte) cursor.getShort(cursor.getColumnIndex("checkBox328")));
        garantiaForwarderModel.setCheckBox329((byte) cursor.getShort(cursor.getColumnIndex("checkBox329")));
        garantiaForwarderModel.setCheckBox330((byte) cursor.getShort(cursor.getColumnIndex("checkBox330")));
        garantiaForwarderModel.setCheckBox333((byte) cursor.getShort(cursor.getColumnIndex("checkBox333")));
        garantiaForwarderModel.setCheckBox334((byte) cursor.getShort(cursor.getColumnIndex("checkBox334")));
        garantiaForwarderModel.setCheckBox335((byte) cursor.getShort(cursor.getColumnIndex("checkBox335")));
        garantiaForwarderModel.setCheckBox336((byte) cursor.getShort(cursor.getColumnIndex("checkBox336")));
        garantiaForwarderModel.setCheckBox337((byte) cursor.getShort(cursor.getColumnIndex("checkBox337")));
        garantiaForwarderModel.setCheckBox338((byte) cursor.getShort(cursor.getColumnIndex("checkBox338")));
        garantiaForwarderModel.setCheckBox339((byte) cursor.getShort(cursor.getColumnIndex("checkBox339")));
        garantiaForwarderModel.setCheckBox340((byte) cursor.getShort(cursor.getColumnIndex("checkBox340")));
        garantiaForwarderModel.setCheckBox341((byte) cursor.getShort(cursor.getColumnIndex("checkBox341")));
        garantiaForwarderModel.setCheckBox342((byte) cursor.getShort(cursor.getColumnIndex("checkBox342")));
        garantiaForwarderModel.setCheckBox343((byte) cursor.getShort(cursor.getColumnIndex("checkBox343")));
        garantiaForwarderModel.setCheckBox344((byte) cursor.getShort(cursor.getColumnIndex("checkBox344")));
        garantiaForwarderModel.setCheckBox345((byte) cursor.getShort(cursor.getColumnIndex("checkBox345")));
        garantiaForwarderModel.setCheckBox346((byte) cursor.getShort(cursor.getColumnIndex("checkBox346")));
        garantiaForwarderModel.setCheckBox347((byte) cursor.getShort(cursor.getColumnIndex("checkBox347")));
        garantiaForwarderModel.setCheckBox348((byte) cursor.getShort(cursor.getColumnIndex("checkBox348")));
        garantiaForwarderModel.setCheckBox349((byte) cursor.getShort(cursor.getColumnIndex("checkBox349")));
        garantiaForwarderModel.setCheckBox350((byte) cursor.getShort(cursor.getColumnIndex("checkBox350")));
        garantiaForwarderModel.setCheckBox351((byte) cursor.getShort(cursor.getColumnIndex("checkBox351")));
        garantiaForwarderModel.setCheckBox352((byte) cursor.getShort(cursor.getColumnIndex("checkBox352")));
        garantiaForwarderModel.setCheckBox353((byte) cursor.getShort(cursor.getColumnIndex("checkBox353")));
        garantiaForwarderModel.setCheckBox354((byte) cursor.getShort(cursor.getColumnIndex("checkBox354")));
        garantiaForwarderModel.setCheckBox355((byte) cursor.getShort(cursor.getColumnIndex("checkBox355")));
        garantiaForwarderModel.setCheckBox356((byte) cursor.getShort(cursor.getColumnIndex("checkBox356")));
        garantiaForwarderModel.setCheckBox357((byte) cursor.getShort(cursor.getColumnIndex("checkBox357")));
        garantiaForwarderModel.setCheckBox358((byte) cursor.getShort(cursor.getColumnIndex("checkBox358")));



        //RETORNANDO A PESSOA
        return garantiaForwarderModel;
    }

    /***
     * CONSULTA TODAS AS PESSOAS CADASTRADAS NA BASE
     * @return
     */
    public List<GarantiaForwarderModel> SelecionarTodos(){

        List<GarantiaForwarderModel> garantiaForwarderModels = new ArrayList<GarantiaForwarderModel>();

        //MONTA A QUERY A SER EXECUTADA
        StringBuilder stringBuilderQuery = new StringBuilder();
        stringBuilderQuery.append(" SELECT id_,            ");
        stringBuilderQuery.append("        ds_telefone,    ");
        stringBuilderQuery.append("        fl_modelo,      ");
        stringBuilderQuery.append("        dt_nascimento,  ");
        stringBuilderQuery.append("        fl_qtd_eixo,     ");
        stringBuilderQuery.append("        fl_qtd_hrs_revisao,");
        stringBuilderQuery.append("        fl_num_serie,     ");
        stringBuilderQuery.append("        fl_horas_motor,   ");
        stringBuilderQuery.append("        fl_ordem_servico, ");
        stringBuilderQuery.append("        fl_cliente,     ");
        stringBuilderQuery.append("        editText68 ,  ");
        stringBuilderQuery.append("        editText69 , ");
        stringBuilderQuery.append("        editText70 ,  ");
        stringBuilderQuery.append("        editText71 , ");
        stringBuilderQuery.append("        editText72 ,");
        stringBuilderQuery.append("        editText3  ,  ");
        stringBuilderQuery.append("        editText136,  ");
        stringBuilderQuery.append("        editText146,  ");
        stringBuilderQuery.append("        editText147,  ");
        stringBuilderQuery.append("        editText149,  ");
        stringBuilderQuery.append("        editText150,  ");
        stringBuilderQuery.append("        editText151,  ");
        stringBuilderQuery.append("        editText152,  ");
        stringBuilderQuery.append("        editText38 ,  ");
        stringBuilderQuery.append("        editText39 ,  ");
        stringBuilderQuery.append("        editText40 ,  ");
        stringBuilderQuery.append("        editText41 ,  ");
        stringBuilderQuery.append("        editText42 ,  ");
        stringBuilderQuery.append("        editText43 ,  ");
        stringBuilderQuery.append("        editText44 ,  ");
        stringBuilderQuery.append("        editText45 ,  ");
        stringBuilderQuery.append("        editText46 , ");
        stringBuilderQuery.append("        editText47 ,  ");
        stringBuilderQuery.append("        editText48 ,  ");
        stringBuilderQuery.append("        editText49 ,  ");
        stringBuilderQuery.append("        editText50 ,  ");
        stringBuilderQuery.append("        editText51 ,  ");
        stringBuilderQuery.append("        editText56 ,  ");
        stringBuilderQuery.append("        editText57 ,  ");
        stringBuilderQuery.append("        editText58 ,  ");
        stringBuilderQuery.append("        editText59 ,  ");
        stringBuilderQuery.append("        editText154,  ");
        stringBuilderQuery.append("        editText153,  ");
        stringBuilderQuery.append("        editText155,  ");
        stringBuilderQuery.append("        editText156, ");
        stringBuilderQuery.append("        editText157,  ");
        stringBuilderQuery.append("        editText158,  ");
        stringBuilderQuery.append("       checkBox140,  ");
        stringBuilderQuery.append("       checkBox209, ");
        stringBuilderQuery.append("       checkBox210,  ");
        stringBuilderQuery.append("       checkBox211, ");
        stringBuilderQuery.append("       checkBox213,");
        stringBuilderQuery.append("       checkBox214,  ");
        stringBuilderQuery.append("       checkBox215,  ");
        stringBuilderQuery.append("       checkBox216,  ");
        stringBuilderQuery.append("       checkBox217,  ");
        stringBuilderQuery.append("       checkBox218,  ");
        stringBuilderQuery.append("       checkBox264,  ");
        stringBuilderQuery.append("       checkBox265,  ");
        stringBuilderQuery.append("       checkBox266,  ");
        stringBuilderQuery.append("       checkBox267,  ");
        stringBuilderQuery.append("       checkBox268,  ");
        stringBuilderQuery.append("       checkBox269,  ");
        stringBuilderQuery.append("       checkBox270,  ");
        stringBuilderQuery.append("       checkBox271,  ");
        stringBuilderQuery.append("       checkBox272,  ");
        stringBuilderQuery.append("       checkBox273,  ");
        stringBuilderQuery.append("       checkBox274,  ");
        stringBuilderQuery.append("       checkBox275, ");
        stringBuilderQuery.append("       checkBox276,  ");
        stringBuilderQuery.append("       checkBox277,  ");
        stringBuilderQuery.append("       checkBox278,  ");
        stringBuilderQuery.append("       checkBox279,  ");
        stringBuilderQuery.append("       checkBox280,  ");
        stringBuilderQuery.append("       checkBox281,  ");
        stringBuilderQuery.append("       checkBox284,  ");
        stringBuilderQuery.append("       checkBox285,  ");
        stringBuilderQuery.append("       checkBox286,  ");
        stringBuilderQuery.append("       checkBox287,  ");
        stringBuilderQuery.append("       checkBox288,  ");
        stringBuilderQuery.append("       checkBox289,  ");
        stringBuilderQuery.append("       checkBox290, ");
        stringBuilderQuery.append("       checkBox291,  ");
        stringBuilderQuery.append("       checkBox292,  ");
        stringBuilderQuery.append("       checkBox293,  ");
        stringBuilderQuery.append("       checkBox294,  ");
        stringBuilderQuery.append("       checkBox295,  ");
        stringBuilderQuery.append("       checkBox296,  ");
        stringBuilderQuery.append("       checkBox297,  ");
        stringBuilderQuery.append("       checkBox298,  ");
        stringBuilderQuery.append("       checkBox299,  ");
        stringBuilderQuery.append("       checkBox55 ,  ");
        stringBuilderQuery.append("       checkBox56 ,  ");
        stringBuilderQuery.append("       checkBox57 ,  ");
        stringBuilderQuery.append("       checkBox58 ,  ");
        stringBuilderQuery.append("       checkBox59 ,  ");
        stringBuilderQuery.append("       checkBox60 ,  ");
        stringBuilderQuery.append("       checkBox103,  ");
        stringBuilderQuery.append("       checkBox104,  ");
        stringBuilderQuery.append("       checkBox105,  ");
        stringBuilderQuery.append("       checkBox106,  ");
        stringBuilderQuery.append("       checkBox107,  ");
        stringBuilderQuery.append("       checkBox108,  ");
        stringBuilderQuery.append("       checkBox109,  ");
        stringBuilderQuery.append("       checkBox110,  ");
        stringBuilderQuery.append("       checkBox111,  ");
        stringBuilderQuery.append("       checkBox112,  ");
        stringBuilderQuery.append("       checkBox113,  ");
        stringBuilderQuery.append("       checkBox114,  ");
        stringBuilderQuery.append("       checkBox115,  ");
        stringBuilderQuery.append("       checkBox116,  ");
        stringBuilderQuery.append("       checkBox300,  ");
        stringBuilderQuery.append("       checkBox301, ");
        stringBuilderQuery.append("       checkBox302,  ");
        stringBuilderQuery.append("       checkBox303,  ");
        stringBuilderQuery.append("       checkBox304,  ");
        stringBuilderQuery.append("       checkBox305,  ");
        stringBuilderQuery.append("       checkBox306,  ");
        stringBuilderQuery.append("       checkBox307,  ");
        stringBuilderQuery.append("       checkBox308,  ");
        stringBuilderQuery.append("       checkBox309,  ");
        stringBuilderQuery.append("       checkBox310,  ");
        stringBuilderQuery.append("       checkBox311,  ");
        stringBuilderQuery.append("       checkBox312,  ");
        stringBuilderQuery.append("       checkBox313,  ");
        stringBuilderQuery.append("       checkBox314,  ");
        stringBuilderQuery.append("       checkBox315,  ");
        stringBuilderQuery.append("       checkBox316, ");
        stringBuilderQuery.append("       checkBox317,  ");
        stringBuilderQuery.append("       checkBox318,  ");
        stringBuilderQuery.append("       checkBox319,  ");
        stringBuilderQuery.append("       checkBox320,  ");
        stringBuilderQuery.append("       checkBox321,  ");
        stringBuilderQuery.append("       checkBox322,  ");
        stringBuilderQuery.append("       checkBox323,  ");
        stringBuilderQuery.append("       checkBox324,  ");
        stringBuilderQuery.append("       checkBox325,  ");
        stringBuilderQuery.append("       checkBox326,  ");
        stringBuilderQuery.append("       checkBox327,  ");
        stringBuilderQuery.append("       checkBox328,  ");
        stringBuilderQuery.append("       checkBox329,  ");
        stringBuilderQuery.append("       checkBox330,  ");
        stringBuilderQuery.append("       checkBox333,  ");
        stringBuilderQuery.append("       checkBox334,  ");
        stringBuilderQuery.append("       checkBox335,  ");
        stringBuilderQuery.append("       checkBox336,  ");
        stringBuilderQuery.append("       checkBox337,  ");
        stringBuilderQuery.append("       checkBox338,  ");
        stringBuilderQuery.append("       checkBox339,  ");
        stringBuilderQuery.append("       checkBox340,  ");
        stringBuilderQuery.append("       checkBox341,  ");
        stringBuilderQuery.append("       checkBox342,  ");
        stringBuilderQuery.append("       checkBox343,  ");
        stringBuilderQuery.append("       checkBox344,  ");
        stringBuilderQuery.append("       checkBox345,  ");
        stringBuilderQuery.append("       checkBox346,  ");
        stringBuilderQuery.append("       checkBox347,  ");
        stringBuilderQuery.append("       checkBox348,  ");
        stringBuilderQuery.append("       checkBox349,  ");
        stringBuilderQuery.append("       checkBox350,  ");
        stringBuilderQuery.append("       checkBox351,  ");
        stringBuilderQuery.append("       checkBox352,  ");
        stringBuilderQuery.append("       checkBox353,  ");
        stringBuilderQuery.append("       checkBox354,  ");
        stringBuilderQuery.append("       checkBox355,  ");
        stringBuilderQuery.append("       checkBox356,  ");
        stringBuilderQuery.append("       checkBox357,  ");
        stringBuilderQuery.append("       checkBox358  ");

        stringBuilderQuery.append("  FROM  tb_garantia_forwarder       ");
        //stringBuilderQuery.append(" ORDER BY ds_telefone       ");

        //CONSULTANDO OS REGISTROS CADASTRADOS
        Cursor cursor = databaseUtil.GetConexaoDataBase().rawQuery(stringBuilderQuery.toString(), null);
 
        /*POSICIONA O CURSOR NO PRIMEIRO REGISTRO*/
        cursor.moveToFirst();

        GarantiaForwarderModel garantiaForwarderModel;

        //REALIZA A LEITURA DOS REGISTROS ENQUANTO NÃO FOR O FIM DO CURSOR
        while (!cursor.isAfterLast()) {
 
            /* CRIANDO UMA NOVA PESSOAS */
            garantiaForwarderModel =  new GarantiaForwarderModel();

            //ADICIONANDO OS DADOS DA PESSOA
            garantiaForwarderModel.setCodigo(cursor.getInt(cursor.getColumnIndex("id_")));
            garantiaForwarderModel.setTelefone(cursor.getString(cursor.getColumnIndex("ds_telefone")));
            garantiaForwarderModel.setModelo(cursor.getString(cursor.getColumnIndex("fl_modelo")));
            garantiaForwarderModel.setDataPreenchimennto(cursor.getString(cursor.getColumnIndex("dt_nascimento")));
            garantiaForwarderModel.setQtdEixo(cursor.getString(cursor.getColumnIndex("fl_qtd_eixo")));
            garantiaForwarderModel.setHrsRevisao(cursor.getString(cursor.getColumnIndex("fl_qtd_hrs_revisao")));
            garantiaForwarderModel.setNumDeSerie(cursor.getString(cursor.getColumnIndex("fl_num_serie")));
            garantiaForwarderModel.setHrsMotor(cursor.getString(cursor.getColumnIndex("fl_horas_motor")));
            garantiaForwarderModel.setOrdemServico(cursor.getString(cursor.getColumnIndex("fl_ordem_servico")));
            garantiaForwarderModel.setCliente(cursor.getString(cursor.getColumnIndex("fl_cliente")));
            garantiaForwarderModel.setEditText68(cursor.getString(cursor.getColumnIndex("editText68 ")));
            garantiaForwarderModel.setEditText69(cursor.getString(cursor.getColumnIndex("editText69 ")));
            garantiaForwarderModel.setEditText70(cursor.getString(cursor.getColumnIndex("editText70 ")));
            garantiaForwarderModel.setEditText71(cursor.getString(cursor.getColumnIndex("editText71 ")));
            garantiaForwarderModel.setEditText72(cursor.getString(cursor.getColumnIndex("editText72 ")));
            garantiaForwarderModel.setEditText3(cursor.getString(cursor.getColumnIndex("editText3  ")));
            garantiaForwarderModel.setEditText136(cursor.getString(cursor.getColumnIndex("editText136")));
            garantiaForwarderModel.setEditText146(cursor.getString(cursor.getColumnIndex("editText146")));
            garantiaForwarderModel.setEditText147(cursor.getString(cursor.getColumnIndex("editText147")));
            garantiaForwarderModel.setEditText149(cursor.getString(cursor.getColumnIndex("editText149")));
            garantiaForwarderModel.setEditText150(cursor.getString(cursor.getColumnIndex("editText150")));
            garantiaForwarderModel.setEditText151(cursor.getString(cursor.getColumnIndex("editText151")));
            garantiaForwarderModel.setEditText152(cursor.getString(cursor.getColumnIndex("editText152")));
            garantiaForwarderModel.setEditText38(cursor.getString(cursor.getColumnIndex("editText38 ")));
            garantiaForwarderModel.setEditText39(cursor.getString(cursor.getColumnIndex("editText39 ")));
            garantiaForwarderModel.setEditText40(cursor.getString(cursor.getColumnIndex("editText40 ")));
            garantiaForwarderModel.setEditText41(cursor.getString(cursor.getColumnIndex("editText41 ")));
            garantiaForwarderModel.setEditText42(cursor.getString(cursor.getColumnIndex("editText42 ")));
            garantiaForwarderModel.setEditText43(cursor.getString(cursor.getColumnIndex("editText43 ")));
            garantiaForwarderModel.setEditText44(cursor.getString(cursor.getColumnIndex("editText44 ")));
            garantiaForwarderModel.setEditText45(cursor.getString(cursor.getColumnIndex("editText45 ")));
            garantiaForwarderModel.setEditText46(cursor.getString(cursor.getColumnIndex("editText46 ")));
            garantiaForwarderModel.setEditText47(cursor.getString(cursor.getColumnIndex("editText47 ")));
            garantiaForwarderModel.setEditText48(cursor.getString(cursor.getColumnIndex("editText48 ")));
            garantiaForwarderModel.setEditText49(cursor.getString(cursor.getColumnIndex("editText49 ")));
            garantiaForwarderModel.setEditText50(cursor.getString(cursor.getColumnIndex("editText50 ")));
            garantiaForwarderModel.setEditText51(cursor.getString(cursor.getColumnIndex("editText51 ")));
            garantiaForwarderModel.setEditText56(cursor.getString(cursor.getColumnIndex("editText56 ")));
            garantiaForwarderModel.setEditText57(cursor.getString(cursor.getColumnIndex("editText57 ")));
            garantiaForwarderModel.setEditText58(cursor.getString(cursor.getColumnIndex("editText58 ")));
            garantiaForwarderModel.setEditText59(cursor.getString(cursor.getColumnIndex("editText59 ")));
            garantiaForwarderModel.setEditText154(cursor.getString(cursor.getColumnIndex("editText154")));
            garantiaForwarderModel.setEditText153(cursor.getString(cursor.getColumnIndex("editText153")));
            garantiaForwarderModel.setEditText155(cursor.getString(cursor.getColumnIndex("editText155")));
            garantiaForwarderModel.setEditText156(cursor.getString(cursor.getColumnIndex("editText156")));
            garantiaForwarderModel.setEditText157(cursor.getString(cursor.getColumnIndex("editText157")));
            garantiaForwarderModel.setEditText158(cursor.getString(cursor.getColumnIndex("editText158")));
            garantiaForwarderModel.setCheckBox140((byte) cursor.getShort(cursor.getColumnIndex("checkBox140")));
            garantiaForwarderModel.setCheckBox209((byte) cursor.getShort(cursor.getColumnIndex("checkBox209")));
            garantiaForwarderModel.setCheckBox210((byte) cursor.getShort(cursor.getColumnIndex("checkBox210")));
            garantiaForwarderModel.setCheckBox211((byte) cursor.getShort(cursor.getColumnIndex("checkBox211")));
            garantiaForwarderModel.setCheckBox213((byte) cursor.getShort(cursor.getColumnIndex("checkBox213")));
            garantiaForwarderModel.setCheckBox214((byte) cursor.getShort(cursor.getColumnIndex("checkBox214")));
            garantiaForwarderModel.setCheckBox215((byte) cursor.getShort(cursor.getColumnIndex("checkBox215")));
            garantiaForwarderModel.setCheckBox216((byte) cursor.getShort(cursor.getColumnIndex("checkBox216")));
            garantiaForwarderModel.setCheckBox217((byte) cursor.getShort(cursor.getColumnIndex("checkBox217")));
            garantiaForwarderModel.setCheckBox218((byte) cursor.getShort(cursor.getColumnIndex("checkBox218")));
            garantiaForwarderModel.setCheckBox264((byte) cursor.getShort(cursor.getColumnIndex("checkBox264")));
            garantiaForwarderModel.setCheckBox265((byte) cursor.getShort(cursor.getColumnIndex("checkBox265")));
            garantiaForwarderModel.setCheckBox266((byte) cursor.getShort(cursor.getColumnIndex("checkBox266")));
            garantiaForwarderModel.setCheckBox267((byte) cursor.getShort(cursor.getColumnIndex("checkBox267")));
            garantiaForwarderModel.setCheckBox268((byte) cursor.getShort(cursor.getColumnIndex("checkBox268")));
            garantiaForwarderModel.setCheckBox269((byte) cursor.getShort(cursor.getColumnIndex("checkBox269")));
            garantiaForwarderModel.setCheckBox270((byte) cursor.getShort(cursor.getColumnIndex("checkBox270")));
            garantiaForwarderModel.setCheckBox271((byte) cursor.getShort(cursor.getColumnIndex("checkBox271")));
            garantiaForwarderModel.setCheckBox272((byte) cursor.getShort(cursor.getColumnIndex("checkBox272")));
            garantiaForwarderModel.setCheckBox273((byte) cursor.getShort(cursor.getColumnIndex("checkBox273")));
            garantiaForwarderModel.setCheckBox274((byte) cursor.getShort(cursor.getColumnIndex("checkBox274")));
            garantiaForwarderModel.setCheckBox275((byte) cursor.getShort(cursor.getColumnIndex("checkBox275")));
            garantiaForwarderModel.setCheckBox276((byte) cursor.getShort(cursor.getColumnIndex("checkBox276")));
            garantiaForwarderModel.setCheckBox277((byte) cursor.getShort(cursor.getColumnIndex("checkBox277")));
            garantiaForwarderModel.setCheckBox278((byte) cursor.getShort(cursor.getColumnIndex("checkBox278")));
            garantiaForwarderModel.setCheckBox279((byte) cursor.getShort(cursor.getColumnIndex("checkBox279")));
            garantiaForwarderModel.setCheckBox280((byte) cursor.getShort(cursor.getColumnIndex("checkBox280")));
            garantiaForwarderModel.setCheckBox281((byte) cursor.getShort(cursor.getColumnIndex("checkBox281")));
            garantiaForwarderModel.setCheckBox284((byte) cursor.getShort(cursor.getColumnIndex("checkBox284")));
            garantiaForwarderModel.setCheckBox285((byte) cursor.getShort(cursor.getColumnIndex("checkBox285")));
            garantiaForwarderModel.setCheckBox286((byte) cursor.getShort(cursor.getColumnIndex("checkBox286")));
            garantiaForwarderModel.setCheckBox287((byte) cursor.getShort(cursor.getColumnIndex("checkBox287")));
            garantiaForwarderModel.setCheckBox288((byte) cursor.getShort(cursor.getColumnIndex("checkBox288")));
            garantiaForwarderModel.setCheckBox289((byte) cursor.getShort(cursor.getColumnIndex("checkBox289")));
            garantiaForwarderModel.setCheckBox290((byte) cursor.getShort(cursor.getColumnIndex("checkBox290")));
            garantiaForwarderModel.setCheckBox291((byte) cursor.getShort(cursor.getColumnIndex("checkBox291")));
            garantiaForwarderModel.setCheckBox292((byte) cursor.getShort(cursor.getColumnIndex("checkBox292")));
            garantiaForwarderModel.setCheckBox293((byte) cursor.getShort(cursor.getColumnIndex("checkBox293")));
            garantiaForwarderModel.setCheckBox294((byte) cursor.getShort(cursor.getColumnIndex("checkBox294")));
            garantiaForwarderModel.setCheckBox295((byte) cursor.getShort(cursor.getColumnIndex("checkBox295")));
            garantiaForwarderModel.setCheckBox296((byte) cursor.getShort(cursor.getColumnIndex("checkBox296")));
            garantiaForwarderModel.setCheckBox297((byte) cursor.getShort(cursor.getColumnIndex("checkBox297")));
            garantiaForwarderModel.setCheckBox298((byte) cursor.getShort(cursor.getColumnIndex("checkBox298")));
            garantiaForwarderModel.setCheckBox299((byte) cursor.getShort(cursor.getColumnIndex("checkBox299")));
            garantiaForwarderModel.setCheckBox300((byte) cursor.getShort(cursor.getColumnIndex("checkBox55")));
            garantiaForwarderModel.setCheckBox56 ((byte) cursor.getShort(cursor.getColumnIndex("checkBox56")));
            garantiaForwarderModel.setCheckBox57 ((byte) cursor.getShort(cursor.getColumnIndex("checkBox57")));
            garantiaForwarderModel.setCheckBox58 ((byte) cursor.getShort(cursor.getColumnIndex("checkBox58")));
            garantiaForwarderModel.setCheckBox59 ((byte) cursor.getShort(cursor.getColumnIndex("checkBox59")));
            garantiaForwarderModel.setCheckBox60 ((byte) cursor.getShort(cursor.getColumnIndex("checkBox60")));
            garantiaForwarderModel.setCheckBox103((byte) cursor.getShort(cursor.getColumnIndex("checkBox103")));
            garantiaForwarderModel.setCheckBox104((byte) cursor.getShort(cursor.getColumnIndex("checkBox104")));
            garantiaForwarderModel.setCheckBox105((byte) cursor.getShort(cursor.getColumnIndex("checkBox105")));
            garantiaForwarderModel.setCheckBox106((byte) cursor.getShort(cursor.getColumnIndex("checkBox106")));
            garantiaForwarderModel.setCheckBox107((byte) cursor.getShort(cursor.getColumnIndex("checkBox107")));
            garantiaForwarderModel.setCheckBox108((byte) cursor.getShort(cursor.getColumnIndex("checkBox108")));
            garantiaForwarderModel.setCheckBox109((byte) cursor.getShort(cursor.getColumnIndex("checkBox109")));
            garantiaForwarderModel.setCheckBox110((byte) cursor.getShort(cursor.getColumnIndex("checkBox110")));
            garantiaForwarderModel.setCheckBox111((byte) cursor.getShort(cursor.getColumnIndex("checkBox111")));
            garantiaForwarderModel.setCheckBox112((byte) cursor.getShort(cursor.getColumnIndex("checkBox112")));
            garantiaForwarderModel.setCheckBox113((byte) cursor.getShort(cursor.getColumnIndex("checkBox113")));
            garantiaForwarderModel.setCheckBox114((byte) cursor.getShort(cursor.getColumnIndex("checkBox114")));
            garantiaForwarderModel.setCheckBox115((byte) cursor.getShort(cursor.getColumnIndex("checkBox115")));
            garantiaForwarderModel.setCheckBox116((byte) cursor.getShort(cursor.getColumnIndex("checkBox116")));
            garantiaForwarderModel.setCheckBox300((byte) cursor.getShort(cursor.getColumnIndex("checkBox300")));
            garantiaForwarderModel.setCheckBox301((byte) cursor.getShort(cursor.getColumnIndex("checkBox301")));
            garantiaForwarderModel.setCheckBox302((byte) cursor.getShort(cursor.getColumnIndex("checkBox302")));
            garantiaForwarderModel.setCheckBox303((byte) cursor.getShort(cursor.getColumnIndex("checkBox303")));
            garantiaForwarderModel.setCheckBox304((byte) cursor.getShort(cursor.getColumnIndex("checkBox304")));
            garantiaForwarderModel.setCheckBox305((byte) cursor.getShort(cursor.getColumnIndex("checkBox305")));
            garantiaForwarderModel.setCheckBox306((byte) cursor.getShort(cursor.getColumnIndex("checkBox306")));
            garantiaForwarderModel.setCheckBox307((byte) cursor.getShort(cursor.getColumnIndex("checkBox307")));
            garantiaForwarderModel.setCheckBox308((byte) cursor.getShort(cursor.getColumnIndex("checkBox308")));
            garantiaForwarderModel.setCheckBox309((byte) cursor.getShort(cursor.getColumnIndex("checkBox309")));
            garantiaForwarderModel.setCheckBox310((byte) cursor.getShort(cursor.getColumnIndex("checkBox310")));
            garantiaForwarderModel.setCheckBox311((byte) cursor.getShort(cursor.getColumnIndex("checkBox311")));
            garantiaForwarderModel.setCheckBox312((byte) cursor.getShort(cursor.getColumnIndex("checkBox312")));
            garantiaForwarderModel.setCheckBox313((byte) cursor.getShort(cursor.getColumnIndex("checkBox313")));
            garantiaForwarderModel.setCheckBox314((byte) cursor.getShort(cursor.getColumnIndex("checkBox314")));
            garantiaForwarderModel.setCheckBox315((byte) cursor.getShort(cursor.getColumnIndex("checkBox315")));
            garantiaForwarderModel.setCheckBox316((byte) cursor.getShort(cursor.getColumnIndex("checkBox316")));
            garantiaForwarderModel.setCheckBox317((byte) cursor.getShort(cursor.getColumnIndex("checkBox317")));
            garantiaForwarderModel.setCheckBox318((byte) cursor.getShort(cursor.getColumnIndex("checkBox318")));
            garantiaForwarderModel.setCheckBox319((byte) cursor.getShort(cursor.getColumnIndex("checkBox319")));
            garantiaForwarderModel.setCheckBox320((byte) cursor.getShort(cursor.getColumnIndex("checkBox320")));
            garantiaForwarderModel.setCheckBox321((byte) cursor.getShort(cursor.getColumnIndex("checkBox321")));
            garantiaForwarderModel.setCheckBox322((byte) cursor.getShort(cursor.getColumnIndex("checkBox322")));
            garantiaForwarderModel.setCheckBox323((byte) cursor.getShort(cursor.getColumnIndex("checkBox323")));
            garantiaForwarderModel.setCheckBox324((byte) cursor.getShort(cursor.getColumnIndex("checkBox324")));
            garantiaForwarderModel.setCheckBox325((byte) cursor.getShort(cursor.getColumnIndex("checkBox325")));
            garantiaForwarderModel.setCheckBox326((byte) cursor.getShort(cursor.getColumnIndex("checkBox326")));
            garantiaForwarderModel.setCheckBox327((byte) cursor.getShort(cursor.getColumnIndex("checkBox327")));
            garantiaForwarderModel.setCheckBox328((byte) cursor.getShort(cursor.getColumnIndex("checkBox328")));
            garantiaForwarderModel.setCheckBox329((byte) cursor.getShort(cursor.getColumnIndex("checkBox329")));
            garantiaForwarderModel.setCheckBox330((byte) cursor.getShort(cursor.getColumnIndex("checkBox330")));
            garantiaForwarderModel.setCheckBox333((byte) cursor.getShort(cursor.getColumnIndex("checkBox333")));
            garantiaForwarderModel.setCheckBox334((byte) cursor.getShort(cursor.getColumnIndex("checkBox334")));
            garantiaForwarderModel.setCheckBox335((byte) cursor.getShort(cursor.getColumnIndex("checkBox335")));
            garantiaForwarderModel.setCheckBox336((byte) cursor.getShort(cursor.getColumnIndex("checkBox336")));
            garantiaForwarderModel.setCheckBox337((byte) cursor.getShort(cursor.getColumnIndex("checkBox337")));
            garantiaForwarderModel.setCheckBox338((byte) cursor.getShort(cursor.getColumnIndex("checkBox338")));
            garantiaForwarderModel.setCheckBox339((byte) cursor.getShort(cursor.getColumnIndex("checkBox339")));
            garantiaForwarderModel.setCheckBox340((byte) cursor.getShort(cursor.getColumnIndex("checkBox340")));
            garantiaForwarderModel.setCheckBox341((byte) cursor.getShort(cursor.getColumnIndex("checkBox341")));
            garantiaForwarderModel.setCheckBox342((byte) cursor.getShort(cursor.getColumnIndex("checkBox342")));
            garantiaForwarderModel.setCheckBox343((byte) cursor.getShort(cursor.getColumnIndex("checkBox343")));
            garantiaForwarderModel.setCheckBox344((byte) cursor.getShort(cursor.getColumnIndex("checkBox344")));
            garantiaForwarderModel.setCheckBox345((byte) cursor.getShort(cursor.getColumnIndex("checkBox345")));
            garantiaForwarderModel.setCheckBox346((byte) cursor.getShort(cursor.getColumnIndex("checkBox346")));
            garantiaForwarderModel.setCheckBox347((byte) cursor.getShort(cursor.getColumnIndex("checkBox347")));
            garantiaForwarderModel.setCheckBox348((byte) cursor.getShort(cursor.getColumnIndex("checkBox348")));
            garantiaForwarderModel.setCheckBox349((byte) cursor.getShort(cursor.getColumnIndex("checkBox349")));
            garantiaForwarderModel.setCheckBox350((byte) cursor.getShort(cursor.getColumnIndex("checkBox350")));
            garantiaForwarderModel.setCheckBox351((byte) cursor.getShort(cursor.getColumnIndex("checkBox351")));
            garantiaForwarderModel.setCheckBox352((byte) cursor.getShort(cursor.getColumnIndex("checkBox352")));
            garantiaForwarderModel.setCheckBox353((byte) cursor.getShort(cursor.getColumnIndex("checkBox353")));
            garantiaForwarderModel.setCheckBox354((byte) cursor.getShort(cursor.getColumnIndex("checkBox354")));
            garantiaForwarderModel.setCheckBox355((byte) cursor.getShort(cursor.getColumnIndex("checkBox355")));
            garantiaForwarderModel.setCheckBox356((byte) cursor.getShort(cursor.getColumnIndex("checkBox356")));
            garantiaForwarderModel.setCheckBox357((byte) cursor.getShort(cursor.getColumnIndex("checkBox357")));
            garantiaForwarderModel.setCheckBox358((byte) cursor.getShort(cursor.getColumnIndex("checkBox358")));



            //ADICIONANDO UMA PESSOA NA LISTA
            garantiaForwarderModels.add(garantiaForwarderModel);

            //VAI PARA O PRÓXIMO REGISTRO
            cursor.moveToNext();
        }

        //RETORNANDO A LISTA DE PESSOAS
        return garantiaForwarderModels;
    }
}