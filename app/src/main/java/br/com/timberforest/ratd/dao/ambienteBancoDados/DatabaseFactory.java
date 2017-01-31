package br.com.timberforest.ratd.dao.ambienteBancoDados;

import android.content.Context;

/**
 * Created by Cayo Sander on 17/04/2015.
 * email: cayo.muniz@fatec.sp.gov.br
 */
public class DatabaseFactory {
    private static DatabaseConnection databaseConnection;

    public static void initDatabaseConnection(Context context) {
        databaseConnection = new DatabaseConnection(context);
        databaseConnection.getWritableDatabase();
    }

    public static DatabaseConnection getDatabaseConnection() {
        return databaseConnection;
    }
}
