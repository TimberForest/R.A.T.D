package br.com.timberforest.ratd.dao.ambienteBancoDados;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Cayo Sander on 17/04/2015.
 * email: cayo.muniz@fatec.sp.gov.br
 */
public class DatabaseConnection extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="RATDTESTE.db";
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
                "kmRodado text," +
                "horaTrabal text," +
                "horaDesloc text," +
                "horaExtraTrab text," +
                "horaExtraDesl text," +
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

        db.execSQL("create table tb_manutencaop_rogramada_grua("+
                "id_      INTEGER PRIMARY KEY AUTOINCREMENT                 ,"+
                "ds_telefone            TEXT    NOT NULL                    ,"+
                "fl_modelo              TEXT    NOT NULL                    ,"+
                "dt_nascimento          TEXT    NOT NULL                    ,"+
                "fl_num_serie           TEXT    NOT NULL                    ,"+
                "fl_ordem_servico       TEXT    NOT NULL                    ,"+
                "fl_cliente             TEXT    NOT NULL                    ,"+
                "editText49ManuProgGrua            TEXT    NOT NULL          ,"+
                "editText50ManuProgGrua            TEXT    NOT NULL          ,"+
                "editText51ManuProgGrua            TEXT    NOT NULL          ,"+
                "editTextNotasForwarder            TEXT    NOT NULL          ,"+
                "editText41ManuProgGrua            TEXT    NOT NULL          ,"+
                "editText42ManuProgGrua            TEXT    NOT NULL          ,"+
                "editText44ManuProgGrua            TEXT    NOT NULL          ,"+
                "editText43ManuProgGrua            TEXT    NOT NULL          ,"+
                "editText45ManuProgGrua            TEXT    NOT NULL          ,"+
                "editText46ManuProgGrua            TEXT    NOT NULL          ,"+
                "editText47ManuProgGrua            TEXT    NOT NULL          ,"+
                "editText48ManuProgGrua            TEXT    NOT NULL          ,"+
                "radioGroup32BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup33BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup34BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup35BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup36BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup15BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup16BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup17BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup18BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup19BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup20BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup21BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup22BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup23BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup24BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup25BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup26BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup27BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup28BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup29BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup30BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroup31BasicoManuProgGrua    TEXT    NOT NULL          ,"+
                "radioGroupBasicCompManuProgGrua   TEXT    NOT NULL          ,"+
                "radioGroupQtdEixoManuProgGrua     TEXT    NOT NULL          ,"+
                "checkBoxVfslSelecionado           INT     NOT NULL          ,"+
                "checkBoxVmvmgSelecionado          INT     NOT NULL          ,"+
                "checkBoxTfsaappmiplSelecionado    INT     NOT NULL          "+

                ")");



            /*db.execSQL("create table GarantiaForwarder("+
                    "id integer primary key autoincrement,"+
                    "chk200hrsGaratiaManutencao INT NOT NULL," +
                    "telefone text"+
                    ")");*/
                   /* "checkBox1800HrsForwarder INTEGER,"+

                    "checkBoxVdvdoef200hrs INTEGER,"+
                    "checkBoxVdvdoef1800hrs INTEGER,"+

                    "checkBoxTdodm1800hrs INTEGER,"+
                    "checkBoxTdodmGrauQtd INTEGER,"+
                    "editTextTdodmGrauQtd INTEGER,"+

                    "checkBoxTdfdo1800Hrs INTEGER,"+

                    "checkBoxSdatdedf1800Hrs INTEGER,"+

                    "checkBoxTdfdc1800Hrs INTEGER,"+

                    "checkBoxVdfdassn1800Hrs INTEGER,"+

                    "checkBoxTdfdudbdd1800Hrs INTEGER,"+

                    "checkBoxVdldtdd1800Hrs INTEGER,"+

                    "checkBoxAdvdm1800Hrs INTEGER,"+

                    "checkBoxVdrccdlda200Hrs INTEGER,"+
                    "checkBoxVdrccdlda1800Hrs INTEGER,"+

                    "checkBoxTdoh1800Hrs INTEGER,"+
                    "checkBoxTdohGrauQtd INTEGER,"+
                    "editTextTdohGrauQtd INTEGER,"+

                    "checkBoxTdfdrdoh1pc200Hrs INTEGER,"+
                    "checkBoxTdfdrdoh1pc1800Hrs INTEGER,"+

                    "checkBoxTdfdpdcdtdd200Hrs INTEGER,"+
                    "checkBoxTdfdpdcdtdd1800Hrs INTEGER,"+

                    "checkBoxTdrdth1800Hrs INTEGER,"+

                    "checkBoxTdfdcdr200Hrs INTEGER,"+
                    "checkBoxTdfdcdr1800Hrs INTEGER,"+

                    "checkBoxTdfdpdcdvh200Hrs INTEGER,"+
                    "checkBoxTdfdpdcdvh1800Hrs INTEGER,"+

                    "checkBoxTdfps200Hrs INTEGER,"+
                    "checkBoxTdfps1800Hrs INTEGER,"+

                    "checkBoxTdfdad1800hrs INTEGER,"+

                    "checkBoxTdo200Hrs INTEGER,"+
                    "checkBoxTdo1800Hrs INTEGER,"+
                    "checkBoxTdoGrauQtd INTEGER,"+
                    "editTextTdoGrauQtd INTEGER,"+

                    "checkBoxPdfvea200Hrs INTEGER,"+
                    "checkBoxPdfvea1800Hrs INTEGER,"+
                    "checkBoxPdfveaNm INTEGER,"+
                    "editTextPdfveaNm INTEGER,"+


                    "checkBoxLdcdc200Hrs200Hrs INTEGER,"+
                    "checkBoxLdcdc1800Hrs INTEGER,"+

                    "checkBoxTdoded200Hrs INTEGER,"+
                    "checkBoxTdoded1800Hrs INTEGER,"+
                    "checkBoxTdodedGrauQtd INTEGER,"+
                    "editTextTdodedGrauQtd INTEGER,"+

                    "checkBoxTdodep200Hrs INTEGER,"+
                    "checkBoxTdodep1800Hrs INTEGER,"+
                    "checkBoxTdodepGrauQtd INTEGER,"+
                    "editTextTdodepGrauQtd INTEGER,"+

                    "checkBoxTdodcdt200Hrs INTEGER,"+
                    "checkBoxTdodcdt1800Hrs INTEGER,"+
                    "checkBoxTdodcdtGrauQdt INTEGER,"+
                    "editTextTdodcdtGrauQdt INTEGER,"+


                    "checkBoxPdpdpdavea200Hrs INTEGER,"+
                    "checkBoxPdpdpdavea1800Hrs INTEGER,"+
                    "checkBoxPdpdpdaveaNm INTEGER,"+
                    "editTextPdpdpdaveaNm INTEGER,"+


                    "checkBoxPdfvea200HrsEixoFrontal INTEGER,"+
                    "checkBoxPdfvea1800HrsEixoFrontal INTEGER,"+
                    "checkBoxPdfveaNmEixoFrontal INTEGER,"+
                    "editTextPdfveaNmEixoFrontal INTEGER,"+


                    "checkBoxLdp8w200hrs INTEGER,"+
                    "checkBoxLdp8w1800hrs INTEGER,"+


                    "checkBox1 INTEGER,"+
                    "checkBox2 INTEGER,"+
                    "checkBox3 INTEGER,"+
                    "checkBox4 INTEGER,"+
                    "checkBox5 INTEGER,"+
                    "checkBox6 INTEGER,"+
                    "checkBox7 INTEGER,"+
                    "checkBox8 INTEGER,"+
                    "checkBox9 INTEGER,"+
                    "checkBox10 INTEGER,"+
                    "checkBox11 INTEGER,"+
                    "checkBox12 INTEGER,"+
                    "checkBox13 INTEGER,"+
                    "checkBox14 INTEGER,"+
                    "checkBox15 INTEGER,"+
                    "checkBox16 INTEGER,"+
                    "checkBox17 INTEGER,"+
                    "checkBox18 INTEGER,"+
                    "checkBox19 INTEGER,"+
                    "checkBox20 INTEGER,"+


                    "checkBoxMvvea200Hrs INTEGER,"+
                    "checkBoxMvvea1800Hrs INTEGER,"+
                    "checkBoxMvveaNm INTEGER,"+
                    "editTextMvveaNm INTEGER,"+


                    "checkBoxMhveangwss200hrs INTEGER,"+
                    "checkBoxMhveangwss1800hrs INTEGER,"+
                    "checkBoxMhveangwssNm INTEGER,"+
                    "editTextMhveangwssNm INTEGER,"+

                    "checkBoxVdfssn1800Hrs INTEGER,"+

                    "checkBoxVdfde200Hrs INTEGER,"+
                    "checkBoxVdfde1800Hrs INTEGER,"+

                    "checkBoxVdbepaandiacpcc200hrs INTEGER,"+
                    "checkBoxVdbepaandiacpcc1800hrs INTEGER,"+

                    "checkBoxVapdaasn200hrs INTEGER,"+
                    "checkBoxVapdaasn1800hrs INTEGER,"+

                    "checkBoxVdpdp200Hrs INTEGER,"+
                    "checkBoxVdpdp1800Hrs INTEGER,"+

                    "checkBoxLdf200Hrs INTEGER,"+
                    "checkBoxLdf1800Hrs INTEGER,"+

                    "editTextDAvdpdshddValorP INTEGER,"+
                    "editTextDAvdpdshddValorA INTEGER,"+
                    "editTextDBvdpdshddValorP INTEGER,"+
                    "editTextDBvdpdshddValorA INTEGER,"+
                    "editTextPressaoAlimentVdpdshddValorP INTEGER,"+
                    "editTextPressaoAlimentVdpdshddValorA INTEGER,"+

                    "editTextPressaoReservadaVdpdbdcValorP INTEGER,"+
                    "editTextPressaoReservadaVdpdbdcValorA INTEGER,"+
                    "editTextPressaoMaximaVdpdbdcValorP INTEGER,"+
                    "editTextPressaoMaximaVdpdbdcValorA INTEGER,"+

                    "editTextVpdpcdbdvdcdgValorP INTEGER,"+
                    "editTextVpdpcdbdvdcdgValorA INTEGER,"+

                    "editTextAvdpdvhValorP INTEGER,"+
                    "editTextAvdpdvhValorA INTEGER,"+
                    "editTextBvdpdvhValorP INTEGER,"+
                    "editTextBvdpdvhValorA INTEGER,"+
                    "editTextPressaoAlimentVdpdvhValorP INTEGER,"+
                    "editTextPressaoAlimentVdpdvhValorA INTEGER,"+


                    "checkBoxVdfdeConcluida INTEGER,"+
                    "editTextVdfdeConcluida INTEGER,"+
                    "checkBoxVdfdsConcluida INTEGER,"+

                    "editTextVdfdsConcluida INTEGER,"+
                    "checkBoxVdsdfedttConcluida INTEGER,"+
                    "editTextVdsdfedttConcluida INTEGER,"+
                    "checkBoxVdbddConcluida INTEGER,"+
                    "editTextVdbddConcluida INTEGER,"+
                    "checkBoxVdtdodcConcluida INTEGER,"+
                    "editTextVdtdodcConcluida INTEGER,"+
                    "checkBoxVdbdadvdcConcluida INTEGER,"+
                    "editTextVdbdadvdcConcluida INTEGER,"+
                    "checkBoxVdcgdadgdgConcluida INTEGER,"+
                    "editTextVdcgdadgdgConcluida INTEGER,"+
                    "checkBox1VdsamafConcluida INTEGER,"+
                    "editTextVdsamafConcluida INTEGER,"+

                    "checkBoxIeada200hrs INTEGER,"+
                    "checkBoxIeada1800hrs INTEGER,"+

                    "checkBoxLdmi200hrs INTEGER,"+
                    "checkBoxLdmi1800Hrs INTEGER,"+

                    "editTextNotas1Forwarder INTEGER,"+


                    "checkBoxPdfdba200Hrs INTEGER,"+
                    "checkBoxPdfdba1800Hrs INTEGER,"+

                    "checkBoxPdfdcdga200Hrs INTEGER,"+
                    "checkBoxPdfdcdga1800Hrs INTEGER,"+

                    "checkBoxTdodb200Hrs INTEGER,"+
                    "checkBoxTdodb1800Hrs INTEGER,"+

                    "checkBoxMdbv200Hrs INTEGER,"+
                    "checkBoxMdbv1800Hrs INTEGER,"+

                    "checkBoxFdredga200Hrs INTEGER,"+
                    "checkBoxFdredga1800Hrs INTEGER,"+

                    "checkBoxFdpa200Hrs INTEGER,"+
                    "checkBoxFdpa1800Hrs INTEGER,"+

                    "checkBoxVdtdcaee200Hrs INTEGER,"+
                    "checkBoxVdtdcaee1800Hrs INTEGER,"+

                    "checkBoxAeevdcdmi200Hrs INTEGER,"+
                    "checkBoxAeevdcdmi1800Hrs INTEGER,"+

                    "checkBoxAdfdeevdcdc200Hrs INTEGER,"+
                    "checkBoxAdfdeevdcdc1800Hrs INTEGER,"+

                    "checkBoxFdthv200Hrs INTEGER,"+
                    "checkBoxFdthv1800Hrs INTEGER,"+

                    "checkBoxTdpdfdcv200Hrs INTEGER,"+
                    "checkBoxTdpdfdcv1800Hrs INTEGER,"+

                    "checkBoxVdvdo200hrs INTEGER,"+
                    "checkBoxVdvdo1800hrs INTEGER,"+

                    "checkBoxVdmedvdmdcSelecionar INTEGER,"+
                    "checkBoxVdmedvdmdcConcluida INTEGER,"+

                    "checkBoxFsdadlditSelecionar INTEGER,"+
                    "checkBoxFsdadlditConcluida INTEGER,"+

                    "checkBoxFdadpdiegtSelecionar INTEGER,"+
                    "checkBoxFdadpdiegtConcluido INTEGER,"+

                    "editTextNotas2GarantiaForwarder INTEGER"+*//*
*/


    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS GarantiaForwarder");
        onCreate(db);
    }
}
