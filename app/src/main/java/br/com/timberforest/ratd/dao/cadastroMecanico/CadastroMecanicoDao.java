package br.com.timberforest.ratd.dao.cadastroMecanico;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseConnection;
import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseFactory;
import br.com.timberforest.ratd.model.CadastroMecanico.CadastroMecanico;

/**
 * Created by andreives on 17/04/2015.
 */
public class CadastroMecanicoDao {
    private DatabaseConnection dbHelper;
    private SQLiteDatabase database;

    public CadastroMecanicoDao(){
        dbHelper = DatabaseFactory.getDatabaseConnection();
        database = dbHelper.getWritableDatabase();
    }

    public void salvar(CadastroMecanico mecanico){
        ContentValues values=new ContentValues();
        values.put("nome",mecanico.getNome());
        values.put("matricula",mecanico.getMatricula());
        values.put("cargoFuncao",mecanico.getCargoFuncao());
        values.put("filial",mecanico.getFilial());
        values.put("cidade",mecanico.getCidade());
        values.put("estado",mecanico.getEstado());

        if(mecanico.getIdMecanico()== null){
            database.insert("CadastroMecanico",null,values);
        }else {
            database.update("CadastroMecanico",values,"id="+mecanico.getIdMecanico(),null);
        }
    }
    /*public void excluir(CadastroMecanico mecanico){
        if(mecanico!=null && mecanico.getIdMecanico()!= null){
            database.delete("CadastroMecanico","id="+mecanico.getIdMecanico(),null);
        }
    }*/

    public List<CadastroMecanico> busca() {
        List<CadastroMecanico> mecanicos = new ArrayList<>();
        Cursor cursor = database.rawQuery("select id, nome, matricula, cargoFuncao, filial, cidade, estado  from CadastroMecanico", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            CadastroMecanico mec = new CadastroMecanico();
            mec.setIdMecanico(cursor.getLong(0));
            mec.setNome(cursor.getString(1));
            mec.setMatricula(cursor.getString(2));
            mec.setCargoFuncao(cursor.getString(3));
            mec.setFilial(cursor.getString(4));
            mec.setCidade(cursor.getString(5));
            mec.setEstado(cursor.getString(6));
            mecanicos.add(mec);
            cursor.moveToNext();
        }
        cursor.close();
        return mecanicos;
    }

    public CadastroMecanico buscaPorId(Long idMecanico){
        List<CadastroMecanico> mecanicos = new ArrayList<>();
        Cursor cursor= database.rawQuery("select id, nome, matricula, cargoFuncao, filial, cidade, estado from CadastroMecanico where id="+idMecanico,null);
        cursor.moveToFirst();
        if (!cursor.isAfterLast()){
            CadastroMecanico mec = new CadastroMecanico();
            mec.setIdMecanico(cursor.getLong(0));
            mec.setNome(cursor.getString(1));
            mec.setMatricula(cursor.getString(2));
            mec.setCargoFuncao(cursor.getString(3));
            mec.setFilial(cursor.getString(4));
            mec.setCidade(cursor.getString(5));
            mec.setEstado(cursor.getString(6));

            cursor.close();
            return  mec;
        }else{
            cursor.close();
            return null;
        }
    }
}
