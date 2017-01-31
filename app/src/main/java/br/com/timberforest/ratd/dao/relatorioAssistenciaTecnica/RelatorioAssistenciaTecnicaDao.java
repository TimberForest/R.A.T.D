package br.com.timberforest.ratd.dao.relatorioAssistenciaTecnica;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseConnection;
import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseFactory;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.RelatorioAssistenciaTecnica;


import java.util.ArrayList;
import java.util.List;

public class RelatorioAssistenciaTecnicaDao {
    private DatabaseConnection dbHelper;
    private SQLiteDatabase database;

    public RelatorioAssistenciaTecnicaDao(){
        dbHelper = DatabaseFactory.getDatabaseConnection();
        database = dbHelper.getWritableDatabase();
    }
    public void salvar(RelatorioAssistenciaTecnica relatorioAssistenciaTecnica){
        ContentValues values = new ContentValues();

        values.put("relator", relatorioAssistenciaTecnica.getRelator());
        values.put("data", relatorioAssistenciaTecnica.getData());
        values.put("numeroRelatorio", relatorioAssistenciaTecnica.getIdFormulario());
        values.put("chassi", relatorioAssistenciaTecnica.getNumeroChassi());
        values.put("modelo", relatorioAssistenciaTecnica.getModelo());
        values.put("horimetro", relatorioAssistenciaTecnica.getHorimetro());
        values.put("distribuidorPostoAss", relatorioAssistenciaTecnica.getDistribuidorAssisTec());
        values.put("cidadeDist", relatorioAssistenciaTecnica.getCidadeDistr());
        values.put("estadoDist", relatorioAssistenciaTecnica.getEstadoDistr());
        values.put("cliente", relatorioAssistenciaTecnica.getCliente());
        values.put("cidadeCli", relatorioAssistenciaTecnica.getCidadeCli());
        values.put("estadoCli", relatorioAssistenciaTecnica.getEstadoCli());
        values.put("localObra", relatorioAssistenciaTecnica.getLocalObra());
        values.put("materialTransp", relatorioAssistenciaTecnica.getMaterialTransp());
        values.put("defeitoCost", relatorioAssistenciaTecnica.getDefeitoCostatado());
        values.put("procedimentosAdot", relatorioAssistenciaTecnica.getProcedAdot());
        values.put("kmRodado", relatorioAssistenciaTecnica.getKmRodad());
        values.put("horaTrabal", relatorioAssistenciaTecnica.getHrsTrablh());
        values.put("horaDesloc", relatorioAssistenciaTecnica.getHrsDesloc());
        values.put("horaExtraTrab", relatorioAssistenciaTecnica.getHrsExtrTrab());
        values.put("horaExtraDesl", relatorioAssistenciaTecnica.getHrsExtrDesloc());
        values.put("codigoPeca", relatorioAssistenciaTecnica.getGetCodPec());
        values.put("quantidade", relatorioAssistenciaTecnica.getPecaQtd());
        values.put("descricao", relatorioAssistenciaTecnica.getGetDescPec());
        values.put("codigoPeca1", relatorioAssistenciaTecnica.getGetCodPec1());
        values.put("quantidade1", relatorioAssistenciaTecnica.getGetPecaQtd1());
        values.put("descricao1", relatorioAssistenciaTecnica.getGetDescPec1());

        if(relatorioAssistenciaTecnica.getIdFormulario()==null){
            database.insert("RelatorioAssistenciaTecnica", null, values);
        }else {
            database.update("RelatorioAssistenciaTecnica",values, "id="+ relatorioAssistenciaTecnica.getIdFormulario(),null);
        }
    }
    public void excluir(RelatorioAssistenciaTecnica relatorioAssistenciaTecnica){
        if(relatorioAssistenciaTecnica !=null && relatorioAssistenciaTecnica.getIdFormulario()!=null){
            database.delete("RelatorioAssistenciaTecnica","id="+ relatorioAssistenciaTecnica.getIdFormulario(),null);
        }
    }
    public List<RelatorioAssistenciaTecnica> busca(){
        List<RelatorioAssistenciaTecnica> relatorioAssistenciaTecnicas = new ArrayList<>();
        Cursor cursor= database.rawQuery("select id, relator, data, numeroRelatorio, chassi, modelo,horimetro, distribuidorPostoAss," +
                "cidadeDist, estadoDist, cliente , cidadeCli, estadoCli, localObra, materialTransp, defeitoCost,  " +
                "procedimentosAdot, kmRodado, horaTrabal, horaDesloc," +
                "horaExtraTrab, horaExtraDesl, codigoPeca, quantidade, descricao, codigoPeca1, quantidade1, descricao1 from RelatorioAssistenciaTecnica", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            RelatorioAssistenciaTecnica form = new RelatorioAssistenciaTecnica();
            form.setIdFormulario(cursor.getLong(0));
            form.setRelator(cursor.getString(1));
            form.setData(cursor.getString(2));
            form.setNumeroRelatorio(cursor.getString(3));
            form.setNumeroChassi(cursor.getString(4));
            form.setModelo(cursor.getString(5));
            form.setHorimetro(cursor.getString(6));
            form.setDistribuidorAssisTec(cursor.getString(7));
            form.setCidadeDistr(cursor.getString(8));
            form.setEstadoDistr(cursor.getString(9));
            form.setCliente(cursor.getString(10));
            form.setCidadeCli(cursor.getString(11));
            form.setEstadoCli(cursor.getString(12));
            form.setLocalObra(cursor.getString(13));
            form.setMaterialTransp(cursor.getString(14));
            form.setDefeitoCostatado(cursor.getString(15));
            form.setProcedAdot(cursor.getString(16));
            form.setKmRodad(cursor.getString(17));
            form.setHrsTrablh(cursor.getString(18));
            form.setHrsDesloc(cursor.getString(19));
            form.setHrsExtrTrab(cursor.getString(20));
            form.setHrsExtrDesloc(cursor.getString(21));
            form.setGetCodPec(cursor.getString(22));
            form.setPecaQtd(cursor.getString(23));
            form.setGetDescPec(cursor.getString(24));
            form.setGetCodPec1(cursor.getString(25));
            form.setGetPecaQtd1(cursor.getString(26));
            form.setGetDescPec1(cursor.getString(27));
            relatorioAssistenciaTecnicas.add(form);
            cursor.moveToNext();
        }
        cursor.close();
        return relatorioAssistenciaTecnicas;
    }
    public RelatorioAssistenciaTecnica buscaPorId(Long idFormulario){
        Cursor cursor= database.rawQuery("select id, relator, data,numeroRelatorio, chassi, modelo, horimetro, distribuidorPostoAss, " +
                "cidadeDist, estadoDist, cliente, cidadeCli, estadoCli, localObra, materialTransp, defeitoCost,  " +
                "procedimentosAdot, kmRodado, horaTrabal, horaDesloc," +
                "horaExtraTrab, horaExtraDesl, codigoPeca, quantidade, " +
                "descricao, codigoPeca1, quantidade1, descricao1 from RelatorioAssistenciaTecnica where id="+idFormulario,null);
        cursor.moveToFirst();
        if(!cursor.isAfterLast()){
            RelatorioAssistenciaTecnica form = new RelatorioAssistenciaTecnica();
            form.setIdFormulario(cursor.getLong(0));
            form.setRelator(cursor.getString(1));
            form.setData(cursor.getString(2));
            form.setNumeroRelatorio(cursor.getString(3));
            form.setNumeroChassi(cursor.getString(4));
            form.setModelo(cursor.getString(5));
            form.setHorimetro(cursor.getString(6));
            form.setDistribuidorAssisTec(cursor.getString(7));
            form.setCidadeDistr(cursor.getString(8));
            form.setEstadoDistr(cursor.getString(9));
            form.setCliente(cursor.getString(10));
            form.setCidadeCli(cursor.getString(11));
            form.setEstadoCli(cursor.getString(12));
            form.setLocalObra(cursor.getString(13));
            form.setMaterialTransp(cursor.getString(14));
            form.setDefeitoCostatado(cursor.getString(15));
            form.setProcedAdot(cursor.getString(16));
            form.setKmRodad(cursor.getString(17));
            form.setHrsTrablh(cursor.getString(18));
            form.setHrsDesloc(cursor.getString(19));
            form.setHrsExtrTrab(cursor.getString(20));
            form.setHrsExtrDesloc(cursor.getString(21));
            form.setGetCodPec(cursor.getString(22));
            form.setPecaQtd(cursor.getString(23));
            form.setGetDescPec(cursor.getString(24));
            form.setGetCodPec1(cursor.getString(25));
            form.setGetPecaQtd1(cursor.getString(26));
            form.setGetDescPec1(cursor.getString(27));

            cursor.close();
            return form;
        }else {
            cursor.close();
            return null;
        }
    }
}
