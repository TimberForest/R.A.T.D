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
    private static final int DATABASE_VERSION=2;

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
                "deslocamento text,"+
                "trabalho text,"+
                "refeicao text,"+
                "extraServ text,"+
                "extraDesl text,"+
                "kmRodado text," +
                "codigoPeca text," +
                "quantidade text," +
                "descricao text" +
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
        db.execSQL("INSERT INTO CadastroMecanico VALUES(1,'','','','','','')");


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

        if (newVersion>oldVersion){
            db.execSQL("create table aux(" +
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
                    "deslocamento text,"+
                    "trabalho text,"+
                    "refeicao text,"+
                    "extraServ text,"+
                    "extraDesl text,"+
                    "kmRodado text," +
                    "codigoPeca text," +
                    "quantidade text," +
                    "descricao text" +
                    ")");
            db.execSQL("INSERT INTO aux (id, relator, data, numeroRelatorio, chassi, modelo, horimetro, distribuidorPostoAss, cidadeDist, estadoDist, cliente," +
                    "cidadeCli, estadoCli, localObra, materialTransp, " +
                    "defeitoCost, procedimentosAdot, pendencias, deslocamento, trabalho, refeicao, extraServ, extraDesl, kmRodado, codigoPeca, quantidade, descricao)" +
                    "SELECT  id, relator, data, numeroRelatorio, chassi, modelo, horimetro, distribuidorPostoAss, cidadeDist, estadoDist, cliente," +
                    "cidadeCli, estadoCli, localObra, materialTransp, " +
                    "defeitoCost, procedimentosAdot, pendencias, inicioDeslocamento, inicioTrabalho, inicioAlmoco, fimAlmoco, fimTrabalho, kmRodado, codigoPeca, quantidade, descricao FROM RelatorioAssistenciaTecnica");
            db.execSQL("DROP TABLE RelatorioAssistenciaTecnica");

            db.execSQL("ALTER TABLE aux RENAME TO RelatorioAssistenciaTecnica");

        }

    }
}
