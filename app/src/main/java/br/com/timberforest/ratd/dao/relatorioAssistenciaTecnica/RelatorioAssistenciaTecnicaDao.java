package br.com.timberforest.ratd.dao.relatorioAssistenciaTecnica;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseConnection;
import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseFactory;
import br.com.timberforest.ratd.formulariosActivity.relatorioAssistenciaTecnica.FormRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.listActivity.relatorioAssistenciaTecnica.ListRelatorioAssistenciaTecnicaActivity;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.RelatorioAssistenciaTecnica;
import br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento;


import java.util.ArrayList;
import java.util.List;

import static br.com.timberforest.ratd.sharedPreferences.SharedPreferencesDeslocamento.PREFS_NAME;

public class RelatorioAssistenciaTecnicaDao extends AppCompatActivity {
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
        values.put("numeroRelatorio", relatorioAssistenciaTecnica.getNumeroRelatorio());
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
        values.put("pendencias", relatorioAssistenciaTecnica.getPendencias());

        values.put("deslocamento", relatorioAssistenciaTecnica.getDeslocamento());
        values.put("trabalho", relatorioAssistenciaTecnica.getTrabalho());
        values.put("refeicao", relatorioAssistenciaTecnica.getRefeicao());
        values.put("extraServ", relatorioAssistenciaTecnica.getExtraServ());
        values.put("extraDesl", relatorioAssistenciaTecnica.getExtraDesl());
        values.put("kmRodado", relatorioAssistenciaTecnica.getKmRodad());

        values.put("codigoPeca", relatorioAssistenciaTecnica.getGetCodPec());
        values.put("quantidade", relatorioAssistenciaTecnica.getPecaQtd());
        values.put("descricao", relatorioAssistenciaTecnica.getGetDescPec());

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

    public List<RelatorioAssistenciaTecnica> ultimoRatd(){
        List<RelatorioAssistenciaTecnica> relatorioAssistenciaTecnicas = new ArrayList<>();
        Cursor cursor= database.rawQuery("SELECT IFNULL(MAX(id), 0) + 1 FROM RelatorioAssistenciaTecnica", null);
        cursor.moveToLast();
        while (!cursor.isAfterLast()){
            RelatorioAssistenciaTecnica form = new RelatorioAssistenciaTecnica();
            form.setIdFormulario(cursor.getLong(0));
            relatorioAssistenciaTecnicas.add(form);
            cursor.moveToNext();
        }
        cursor.close();
        return relatorioAssistenciaTecnicas;
    }
    //SELECT IFNULL(MAX(_id), 0) + 1 FROM table_name


    public List<RelatorioAssistenciaTecnica> busca(){
        List<RelatorioAssistenciaTecnica> relatorioAssistenciaTecnicas = new ArrayList<>();
        Cursor cursor= database.rawQuery("select id, relator, data, numeroRelatorio, chassi, modelo,horimetro, distribuidorPostoAss," +
                "cidadeDist, estadoDist, cliente , cidadeCli, estadoCli, localObra, materialTransp, defeitoCost,  " +
                "procedimentosAdot, pendencias, kmRodado, deslocamento, trabalho, refeicao, extraServ, extraDesl, " +
                "codigoPeca, quantidade, descricao from RelatorioAssistenciaTecnica", null);
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
            form.setPendencias(cursor.getString(17));
            form.setKmRodad(cursor.getString(18));
            form.setDeslocamento(cursor.getString(19));
            form.setTrabalho(cursor.getString(20));
            form.setRefeicao(cursor.getString(21));
            form.setExtraServ(cursor.getString(22));
            form.setExtraDesl(cursor.getString(23));
            form.setGetCodPec(cursor.getString(24));
            form.setPecaQtd(cursor.getString(25));
            form.setGetDescPec(cursor.getString(26));
            relatorioAssistenciaTecnicas.add(form);
            cursor.moveToNext();
        }
        cursor.close();
        return relatorioAssistenciaTecnicas;
    }
    public RelatorioAssistenciaTecnica buscaPorId(Long idFormulario){
        Cursor cursor= database.rawQuery("select id, relator, data,numeroRelatorio, chassi, modelo, horimetro, distribuidorPostoAss, " +
                "cidadeDist, estadoDist, cliente, cidadeCli, estadoCli, localObra, materialTransp, defeitoCost,  " +
                "procedimentosAdot, pendencias, kmRodado, deslocamento, trabalho, refeicao, extraServ, extraDesl, codigoPeca, quantidade, " +
                "descricao from RelatorioAssistenciaTecnica where id="+idFormulario,null);
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
            form.setPendencias(cursor.getString(17));
            form.setKmRodad(cursor.getString(18));
            form.setDeslocamento(cursor.getString(19));
            form.setTrabalho(cursor.getString(20));
            form.setRefeicao(cursor.getString(21));
            form.setExtraServ(cursor.getString(22));
            form.setExtraDesl(cursor.getString(23));
            form.setGetCodPec(cursor.getString(24));
            form.setPecaQtd(cursor.getString(25));
            form.setGetDescPec(cursor.getString(26));

            cursor.close();
            return form;
        }else {
            cursor.close();
            return null;
        }
    }
}
