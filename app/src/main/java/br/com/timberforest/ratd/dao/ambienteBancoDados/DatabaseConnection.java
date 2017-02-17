package br.com.timberforest.ratd.dao.ambienteBancoDados;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Cayo Sander on 17/04/2015.
 * email: cayo.muniz@fatec.sp.gov.br
 */
public class DatabaseConnection extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="RATD.db";
    private static final int DATABASE_VERSION=1;

    public DatabaseConnection(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        System.out.println("criando o database");
        db.execSQL("create table RelatorioAssistenciaTecnica(" +
                "id integer primary key autoincrement, " +
                "relator text," +
                "data date," +
                "numeroRelatorio text," +
                "chassi text," +
                "modelo text," +
                "horimetro text," +
                "distribuidorPostoAss text," +
                "cidadeDist text," +
                "estadoDist text," +
                "cliente text," +
                "cidadeCli text," +
                "estadoCli text," +
                "localObra text," +
                "materialTransp text," +
                "defeitoCost text," +
                "procedimentosAdot text," +
                "pendencias text," +
                "inicioDeslocamento text,"+
                "inicioTrabalho text,"+
                "inicioAlmoco text,"+
                "fimAlmoco text,"+
                "fimTrabalho text,"+
                "fimDeslocamento text,"+
                "kmRodado text," +
                "codigoPeca text," +
                "quantidade text," +
                "descricao text," +
                "codigoPeca1 text," +
                "quantidade1 text," +
                "descricao1 text" +
                ")");

        db.execSQL("create table CadastroMecanico("+
                "id integer primary key autoincrement,"+
                "nome text,"+
                "matricula text,"+
                "cargoFuncao text,"+
                "filial text,"+
                "cidade text,"+
                "estado text"+
                ")");
        db.execSQL("INSERT INTO CadastroMecanico VALUES(1,'Padrão','','','','','')");
//        db.execSQL("INSERT or replace INTO CadastroMecanico (id, nome, matricula, cargoFuncao,filial, cidade, estado ) VALUES('1, 'Padrão','','','','','')");


        db.execSQL("create table RelatorioAvaliacaoOperacional("+
                "id integer primary key autoincrement,"+
                "nomeEmpresaAval text,"+
                "nomeOperadorAval text,"+
                "identificacaoDeFrotaMaq text,"+
                "nomeMecanicoAval text,"+
                "data date,"+
                "capacete INTEGER,"+
                "oculosProt INTEGER,"+
                "luva INTEGER,"+
                "camisaManga INTEGER,"+
                "calca INTEGER,"+
                "sapatoUsoNormal INTEGER,"+
                "sapatoOperacao INTEGER,"+
                "distanciaEntreMaq INTEGER,"+
                "estacionamentoLocalAdequado INTEGER,"+
                "distanciaOpAbastecimento INTEGER,"+
                "procedimentoSubirDescer INTEGER,"+
                "utilizacaoSaidaEmergencia INTEGER,"+
                "movimentosSuavesSincron INTEGER,"+
                "manobrabilidadeEquip INTEGER,"+
                "tipoEquip INTEGER,"+
                "capacidadeReservat INTEGER,"+
                "tiposlubrificantes INTEGER,"+
                "pontosLubrificacao INTEGER,"+
                "interpretacaoManualEquip INTEGER,"+
                "checkListDiar INTEGER,"+
                "relatDiarioEquip INTEGER,"+
                "preenchimLivroOcorrencia INTEGER,"+
                "reapertoEquip INTEGER,"+
                "possuiKitContencao INTEGER,"+
                "sabeUsarSisAntChama INTEGER,"+
                "danosCanaletasEstradas INTEGER,"+
                "danosMataNativa INTEGER,"+
                "cooperacaoEquipe INTEGER,"+
                "comunicao INTEGER,"+
                "segueNormasTrab INTEGER,"+
                "assiduidade INTEGER,"+
                "posicionamentoEquip INTEGER,"+
                "sentidoExecTrabal INTEGER,"+
                "posicaoPilhasLinhas INTEGER,"+
                "leituraMapas INTEGER,"+
                "conheIndicadores INTEGER,"+
                "utilizacaoFuncJoyStick INTEGER,"+
                "regulagenCalibra INTEGER,"+
                "desempenhoGeralAvaliacaoQualida INTEGER,"+
                "desempenhodeGeralProducao INTEGER,"+
                "desempehoGeralSimulador INTEGER,"+

                "subirDescerPranchaMaq INTEGER,"+
                "fixarMaqPrancha INTEGER,"+

                "obsRelatorioOp text,"+

                "notaSeguranca INTEGER,"+
                "notaMeioAmbiente INTEGER,"+
                "notaPlanejamento INTEGER,"+
                "notaSimulador INTEGER,"+
                "notaRelatoriosVerificacoesReaperto INTEGER,"+
                "notaPainelAlavancaRegulag INTEGER,"+
                "notaTecnicasOp INTEGER,"+
                "notaDadosTecEq INTEGER,"+
                "notaTrabalhoEquipe INTEGER,"+
                "notaAvaliacaoQualidade INTEGER,"+
                "notaProducao INTEGER,"+
                "notaGeral INTEGER"+
                ")");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

/*        if (newVersion > oldVersion) {
            db.execSQL("ALTER TABLE RelatorioAssistenciaTecnica RENAME COLUMN horaTrabal TO inicioDeslocamento;");
            db.execSQL("ALTER TABLE RelatorioAssistenciaTecnica RENAME COLUMN horaExtraDesl TO inicioTrabalho;");
            db.execSQL("ALTER TABLE RelatorioAssistenciaTecnica RENAME COLUMN horaExtraTrab TO inicioAlmoco;");
            db.execSQL("ALTER TABLE RelatorioAssistenciaTecnica RENAME COLUMN horaDesloc TO fimAlmoco;");
            db.execSQL("ALTER TABLE RelatorioAssistenciaTecnica RENAME COLUMN cod_fun TO fimTrabalho;");*//*
            db.execSQL("ALTER TABLE RelatorioAssistenciaTecnica ADD COLUMN pendencias text;");



        }*/
    }
}