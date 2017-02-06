package br.com.timberforest.ratd.dao.relatorioAvaliacaoOperacional;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseConnection;
import br.com.timberforest.ratd.dao.ambienteBancoDados.DatabaseFactory;
import br.com.timberforest.ratd.formulariosActivity.relatorioAvaliacaoOperacional.RelatorioOperacionalFormActivity;
import br.com.timberforest.ratd.model.relatorioAvaliacaoOperacional.RelatorioAvaliacaoOperacional;

import java.util.ArrayList;
import java.util.List;

public class RelatorioAvaliacaoOperacionalDao {
    private DatabaseConnection dbHelper;
    private SQLiteDatabase database;
    private RelatorioOperacionalFormActivity relatorioOperacionalFormActivity;


    public RelatorioAvaliacaoOperacionalDao(){
        dbHelper = DatabaseFactory.getDatabaseConnection();
        database = dbHelper.getWritableDatabase();
    }

    public void salvar(RelatorioAvaliacaoOperacional relatorioAvaliacaoOperacional){
        ContentValues values=new ContentValues();
        values.put("nomeEmpresaAval", relatorioAvaliacaoOperacional.getNomeEmpresAval());
        values.put("nomeOperadorAval", relatorioAvaliacaoOperacional.getNomeOpAval());
        values.put("identificacaoDeFrotaMaq", relatorioAvaliacaoOperacional.getIdDeFrotaMaq());
        values.put("nomeMecanicoAval", relatorioAvaliacaoOperacional.getNomeMecanicoAval());
        values.put("data", relatorioAvaliacaoOperacional.getData());

        values.put("capacete", relatorioAvaliacaoOperacional.getCapacete());
        values.put("oculosProt", relatorioAvaliacaoOperacional.getOculosDeProtecao());
        values.put("luva", relatorioAvaliacaoOperacional.getLuva());
        values.put("camisaManga", relatorioAvaliacaoOperacional.getCamisaMangaLonga());
        values.put("calca ", relatorioAvaliacaoOperacional.getCalcaFaixaRefle());
        values.put("sapatoUsoNormal", relatorioAvaliacaoOperacional.getSapatoNormal());
        values.put("sapatoOperacao", relatorioAvaliacaoOperacional.getSapatoOperador());
        values.put("distanciaEntreMaq", relatorioAvaliacaoOperacional.getDistanciaEntreMaq());
        values.put("estacionamentoLocalAdequado", relatorioAvaliacaoOperacional.getEstacionaLocalAdequado());
        values.put("distanciaOpAbastecimento", relatorioAvaliacaoOperacional.getDistanciaOperadorAbastecimento());
        values.put("procedimentoSubirDescer", relatorioAvaliacaoOperacional.getProcedimentoSubirDescer());
        values.put("utilizacaoSaidaEmergencia", relatorioAvaliacaoOperacional.getUtilizacaoCorretaSaidaEmenrgencia());

        values.put("movimentosSuavesSincron", relatorioAvaliacaoOperacional.getMovimentosSuavesSincro());
        values.put("manobrabilidadeEquip ", relatorioAvaliacaoOperacional.getManobrabilidadeEquip());

        values.put("tipoEquip", relatorioAvaliacaoOperacional.getTiposEquip());
        values.put("capacidadeReservat", relatorioAvaliacaoOperacional.getCapacidadeReservatorio());
        values.put("tiposlubrificantes", relatorioAvaliacaoOperacional.getTiposLubrificante());
        values.put("pontosLubrificacao", relatorioAvaliacaoOperacional.getPontosLubrificao());
        values.put("interpretacaoManualEquip", relatorioAvaliacaoOperacional.getInterpretacaoManualEquip());

        values.put("checkListDiar", relatorioAvaliacaoOperacional.getCheckListDiario());
        values.put("relatDiarioEquip", relatorioAvaliacaoOperacional.getRelatorioDarioEquip());
        values.put("preenchimLivroOcorrencia", relatorioAvaliacaoOperacional.getPreenchimentlivroOcorrencia());
        values.put("reapertoEquip", relatorioAvaliacaoOperacional.getReapertoEquip());

        values.put("possuiKitContencao", relatorioAvaliacaoOperacional.getPossuiKitContencao());
        values.put("sabeUsarSisAntChama", relatorioAvaliacaoOperacional.getSabeUsarSistAntChama());
        values.put("danosCanaletasEstradas", relatorioAvaliacaoOperacional.getDanosCanaletasEstarada());
        values.put("danosMataNativa", relatorioAvaliacaoOperacional.getDanosMataNativa());

        values.put("cooperacaoEquipe", relatorioAvaliacaoOperacional.getCooperacaoEquip());
        values.put("comunicao", relatorioAvaliacaoOperacional.getComunicacao());
        values.put("segueNormasTrab", relatorioAvaliacaoOperacional.getSegueNormasTrab());
        values.put("assiduidade", relatorioAvaliacaoOperacional.getAssiduidade());

        values.put("posicionamentoEquip", relatorioAvaliacaoOperacional.getPosicionaEquip());
        values.put("sentidoExecTrabal", relatorioAvaliacaoOperacional.getSentidoExecucaoTrab());
        values.put("posicaoPilhasLinhas", relatorioAvaliacaoOperacional.getPosicaoPilhasLinhas());
        values.put("leituraMapas", relatorioAvaliacaoOperacional.getLeituraMapas());

        values.put("conheIndicadores", relatorioAvaliacaoOperacional.getConhecimentoIndicadoresPainel());
        values.put("utilizacaoFuncJoyStick", relatorioAvaliacaoOperacional.getUtilizacaoCorretaFuncoesJoyStick());
        values.put("regulagenCalibra", relatorioAvaliacaoOperacional.getRegulagensCalibracoe());

        values.put("desempenhoGeralAvaliacaoQualida", relatorioAvaliacaoOperacional.getDesempenhoGeralQualidade());
        values.put("desempenhodeGeralProducao", relatorioAvaliacaoOperacional.getDesempenhoGeralProd());
        values.put("desempehoGeralSimulador", relatorioAvaliacaoOperacional.getDesempenhoGeralSimulador());

        values.put("subirDescerPranchaMaq ", relatorioAvaliacaoOperacional.getSubirDescerPranMaq());
        values.put("fixarMaqPrancha", relatorioAvaliacaoOperacional.getFixarMaqPrancha());
        values.put("obsRelatorioOp", relatorioAvaliacaoOperacional.getObsRelatorioOp());

        values.put("notaSeguranca", relatorioAvaliacaoOperacional.getNotaSeguranca());
        values.put("notaMeioAmbiente", relatorioAvaliacaoOperacional.getNotaMeioAmbiente());
        values.put("notaPlanejamento", relatorioAvaliacaoOperacional.getNotaPlanejamento());
        values.put("notaSimulador", relatorioAvaliacaoOperacional.getNotaSimulador());
        values.put("notaRelatoriosVerificacoesReaperto", relatorioAvaliacaoOperacional.getNotaRelatoriosVerificacoesReaperto());
        values.put("notaPainelAlavancaRegulag", relatorioAvaliacaoOperacional.getNotaPainelAlavancaRegulag());
        values.put("notaTecnicasOp", relatorioAvaliacaoOperacional.getNotaTecnicasOp());
        values.put("notaDadosTecEq", relatorioAvaliacaoOperacional.getNotaDadosTecEq());
        values.put("notaTrabalhoEquipe", relatorioAvaliacaoOperacional.getNotaTrabalhoEquipe());
        values.put("notaAvaliacaoQualidade", relatorioAvaliacaoOperacional.getNotaAvaliacaoQualidade());
        values.put("notaProducao", relatorioAvaliacaoOperacional.getNotaProducao());
        values.put("notaGeral", relatorioAvaliacaoOperacional.getNotaGeral());

        if(relatorioAvaliacaoOperacional.getIdRelatorioOperacional()== null){
            database.insert("RelatorioAvaliacaoOperacional",null,values);
        }else {
            database.update("RelatorioAvaliacaoOperacional",values,"id="+ relatorioAvaliacaoOperacional.getIdRelatorioOperacional(),null);
        }
    }
    public void excluir(RelatorioAvaliacaoOperacional relatorioAvaliacaoOperacional){
        if(relatorioAvaliacaoOperacional !=null && relatorioAvaliacaoOperacional.getIdRelatorioOperacional()!= null){
            database.delete("RelatorioAvaliacaoOperacional","id="+ relatorioAvaliacaoOperacional.getIdRelatorioOperacional(),null);
        }
    }
    public List<RelatorioAvaliacaoOperacional> busca() {
        List<RelatorioAvaliacaoOperacional> relatoriosOperacionais = new ArrayList<>();
        Cursor cursor = database.rawQuery("select id, nomeEmpresaAval, nomeOperadorAval, identificacaoDeFrotaMaq, nomeMecanicoAval, data, capacete, oculosProt, luva, camisaManga, calca, sapatoUsoNormal, sapatoOperacao, distanciaEntreMaq," +
                "estacionamentoLocalAdequado, distanciaOpAbastecimento, procedimentoSubirDescer, utilizacaoSaidaEmergencia, movimentosSuavesSincron, manobrabilidadeEquip, tipoEquip, capacidadeReservat, tiposlubrificantes, pontosLubrificacao, interpretacaoManualEquip," +
                "checkListDiar, relatDiarioEquip, preenchimLivroOcorrencia, reapertoEquip, possuiKitContencao, sabeUsarSisAntChama, danosCanaletasEstradas, danosMataNativa,    " +
                "cooperacaoEquipe, comunicao, segueNormasTrab, assiduidade,   posicionamentoEquip, sentidoExecTrabal," +
                "posicaoPilhasLinhas, leituraMapas, conheIndicadores, utilizacaoFuncJoyStick, regulagenCalibra, desempenhoGeralAvaliacaoQualida, desempenhodeGeralProducao, desempehoGeralSimulador, notaSeguranca," +
                "notaMeioAmbiente, notaPlanejamento, notaSimulador, notaRelatoriosVerificacoesReaperto, notaPainelAlavancaRegulag, notaTecnicasOp, notaDadosTecEq, notaTrabalhoEquipe," +
                "notaAvaliacaoQualidade, notaProducao, notaGeral, subirDescerPranchaMaq, fixarMaqPrancha, obsRelatorioOp from RelatorioAvaliacaoOperacional", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            RelatorioAvaliacaoOperacional relatorioOp = new RelatorioAvaliacaoOperacional();
            relatorioOp.setIdRelatorioOperacional(cursor.getLong(0));
            relatorioOp.setNomeEmpresAval(cursor.getString(1));
            relatorioOp.setNomeOpAval(cursor.getString(2));
            relatorioOp.setIdDeFrotaMaq(cursor.getString(3));
            relatorioOp.setNomeMecanicoAval(cursor.getString(4));
            relatorioOp.setData(cursor.getString(5));
            relatorioOp.setCapacete(cursor.getString(6));
            relatorioOp.setOculosDeProtecao(cursor.getString(7));
            relatorioOp.setLuva(cursor.getString(8));
            relatorioOp.setCamisaMangaLonga(cursor.getString(9));
            relatorioOp.setCalcaFaixaRefle(cursor.getString(10));
            relatorioOp.setSapatoNormal(cursor.getString(11));
            relatorioOp.setSapatoOperador(cursor.getString(12));
            relatorioOp.setDistanciaEntreMaq(cursor.getString(13));
            relatorioOp.setEstacionaLocalAdequado(cursor.getString(14));
            relatorioOp.setDistanciaOperadorAbastecimento(cursor.getString(15));
            relatorioOp.setProcedimentoSubirDescer(cursor.getString(16));
            relatorioOp.setUtilizacaoCorretaSaidaEmenrgencia(cursor.getString(17));
            relatorioOp.setMovimentosSuavesSincro(cursor.getString(18));
            relatorioOp.setManobrabilidadeEquip(cursor.getString(19));
            relatorioOp.setTiposEquip(cursor.getString(20));
            relatorioOp.setCapacidadeReservatorio(cursor.getString(21));
            relatorioOp.setTiposLubrificante(cursor.getString(22));
            relatorioOp.setPontosLubrificao(cursor.getString(23));
            relatorioOp.setInterpretacaoManualEquip(cursor.getString(24));
            relatorioOp.setCheckListDiario(cursor.getString(25));
            relatorioOp.setRelatorioDarioEquip(cursor.getString(26));
            relatorioOp.setPreenchimentlivroOcorrencia(cursor.getString(27));
            relatorioOp.setReapertoEquip(cursor.getString(28));
            relatorioOp.setPossuiKitContencao(cursor.getString(29));
            relatorioOp.setSabeUsarSistAntChama(cursor.getString(30));
            relatorioOp.setDanosCanaletasEstarada(cursor.getString(31));
            relatorioOp.setDanosMataNativa(cursor.getString(32));
            relatorioOp.setCooperacaoEquip(cursor.getString(33));
            relatorioOp.setComunicacao(cursor.getString(34));
            relatorioOp.setSegueNormasTrab(cursor.getString(35));
            relatorioOp.setAssiduidade(cursor.getString(36));
            relatorioOp.setPosicionaEquip(cursor.getString(37));
            relatorioOp.setSentidoExecucaoTrab(cursor.getString(38));
            relatorioOp.setPosicaoPilhasLinhas(cursor.getString(39));
            relatorioOp.setLeituraMapas(cursor.getString(40));
            relatorioOp.setConhecimentoIndicadoresPinel(cursor.getString(41));
            relatorioOp.setUtilizacaoCorretaFuncoesJoyStick(cursor.getString(42));
            relatorioOp.setRegulagensCalibracoe(cursor.getString(43));
            relatorioOp.setDesempenhoGeralQualidade(cursor.getString(44));
            relatorioOp.setDesempenhoGeralProd(cursor.getString(45));
            relatorioOp.setDesempenhoGeralSimulador(cursor.getString(46));

            relatorioOp.setNotaSeguranca(cursor.getString(47));
            relatorioOp.setNotaMeioAmbiente(cursor.getString(48));
            relatorioOp.setNotaPlanejamento(cursor.getString(49));
            relatorioOp.setNotaSimulador(cursor.getString(50));
            relatorioOp.setNotaRelatoriosVerificacoesReaperto(cursor.getString(51));
            relatorioOp.setNotaPainelAlavancaRegulag(cursor.getString(52));
            relatorioOp.setNotaTecnicasOp(cursor.getString(53));
            relatorioOp.setNotaDadosTecEq(cursor.getString(54));
            relatorioOp.setNotaTrabalhoEquipe(cursor.getString(55));
            relatorioOp.setNotaAvaliacaoQualidade(cursor.getString(56));
            relatorioOp.setNotaProducao(cursor.getString(57));
            relatorioOp.setNotaGeral(cursor.getString(58));

            relatorioOp.setSubirDescerPranMaq(cursor.getString(59));
            relatorioOp.setFixarMaqPrancha(cursor.getString(60));

            relatorioOp.setObsRelatorioOp(cursor.getString(61));

            relatoriosOperacionais.add(relatorioOp);
            cursor.moveToNext();
        }
        cursor.close();
        return relatoriosOperacionais;
    }
    public RelatorioAvaliacaoOperacional buscaPorId(Long idRelatorioOperacional){
        List<RelatorioAvaliacaoOperacional> relatorioAvaliacaoOperacionals = new ArrayList<>();
        Cursor cursor= database.rawQuery("select id, nomeEmpresaAval, nomeOperadorAval, identificacaoDeFrotaMaq, nomeMecanicoAval, data, capacete, oculosProt, luva, camisaManga, calca, sapatoUsoNormal, sapatoOperacao, distanciaEntreMaq,"+
                "estacionamentoLocalAdequado, distanciaOpAbastecimento, procedimentoSubirDescer, utilizacaoSaidaEmergencia, movimentosSuavesSincron, manobrabilidadeEquip, tipoEquip, capacidadeReservat, tiposlubrificantes, pontosLubrificacao, interpretacaoManualEquip,"+
                "checkListDiar, relatDiarioEquip, preenchimLivroOcorrencia, reapertoEquip, possuiKitContencao, sabeUsarSisAntChama, danosCanaletasEstradas, danosMataNativa,"+
                "cooperacaoEquipe, comunicao, segueNormasTrab, assiduidade,   posicionamentoEquip, sentidoExecTrabal," +
                "posicaoPilhasLinhas, leituraMapas, conheIndicadores, utilizacaoFuncJoyStick, regulagenCalibra, desempenhoGeralAvaliacaoQualida, desempenhodeGeralProducao, desempehoGeralSimulador, notaSeguranca," +
                "notaMeioAmbiente, notaPlanejamento, notaSimulador, notaRelatoriosVerificacoesReaperto, notaPainelAlavancaRegulag, notaTecnicasOp, notaDadosTecEq, notaTrabalhoEquipe," +
                "notaAvaliacaoQualidade, notaProducao, notaGeral, subirDescerPranchaMaq, fixarMaqPrancha, obsRelatorioOp from RelatorioAvaliacaoOperacional where id="+idRelatorioOperacional,null);
        cursor.moveToFirst();
        if (!cursor.isAfterLast()){
            RelatorioAvaliacaoOperacional relatorioOp = new RelatorioAvaliacaoOperacional();
            relatorioOp.setIdRelatorioOperacional(cursor.getLong(0));
            relatorioOp.setNomeEmpresAval(cursor.getString(1));
            relatorioOp.setNomeOpAval(cursor.getString(2));
            relatorioOp.setIdDeFrotaMaq(cursor.getString(3));
            relatorioOp.setNomeMecanicoAval(cursor.getString(4));
            relatorioOp.setData(cursor.getString(5));
            relatorioOp.setCapacete(cursor.getString(6));
            relatorioOp.setOculosDeProtecao(cursor.getString(7));
            relatorioOp.setLuva(cursor.getString(8));
            relatorioOp.setCamisaMangaLonga(cursor.getString(9));
            relatorioOp.setCalcaFaixaRefle(cursor.getString(10));
            relatorioOp.setSapatoNormal(cursor.getString(11));
            relatorioOp.setSapatoOperador(cursor.getString(12));
            relatorioOp.setDistanciaEntreMaq(cursor.getString(13));
            relatorioOp.setEstacionaLocalAdequado(cursor.getString(14));
            relatorioOp.setDistanciaOperadorAbastecimento(cursor.getString(15));
            relatorioOp.setProcedimentoSubirDescer(cursor.getString(16));
            relatorioOp.setUtilizacaoCorretaSaidaEmenrgencia(cursor.getString(17));
            relatorioOp.setMovimentosSuavesSincro(cursor.getString(18));
            relatorioOp.setManobrabilidadeEquip(cursor.getString(19));
            relatorioOp.setTiposEquip(cursor.getString(20));
            relatorioOp.setCapacidadeReservatorio(cursor.getString(21));
            relatorioOp.setTiposLubrificante(cursor.getString(22));
            relatorioOp.setPontosLubrificao(cursor.getString(23));
            relatorioOp.setInterpretacaoManualEquip(cursor.getString(24));
            relatorioOp.setCheckListDiario(cursor.getString(25));
            relatorioOp.setRelatorioDarioEquip(cursor.getString(26));
            relatorioOp.setPreenchimentlivroOcorrencia(cursor.getString(27));
            relatorioOp.setReapertoEquip(cursor.getString(28));
            relatorioOp.setPossuiKitContencao(cursor.getString(29));
            relatorioOp.setSabeUsarSistAntChama(cursor.getString(30));
            relatorioOp.setDanosCanaletasEstarada(cursor.getString(31));
            relatorioOp.setDanosMataNativa(cursor.getString(32));
            relatorioOp.setCooperacaoEquip(cursor.getString(33));
            relatorioOp.setComunicacao(cursor.getString(34));
            relatorioOp.setSegueNormasTrab(cursor.getString(35));
            relatorioOp.setAssiduidade(cursor.getString(36));
            relatorioOp.setPosicionaEquip(cursor.getString(37));
            relatorioOp.setSentidoExecucaoTrab(cursor.getString(38));
            relatorioOp.setPosicaoPilhasLinhas(cursor.getString(39));
            relatorioOp.setLeituraMapas(cursor.getString(40));
            relatorioOp.setConhecimentoIndicadoresPinel(cursor.getString(41));
            relatorioOp.setUtilizacaoCorretaFuncoesJoyStick(cursor.getString(42));
            relatorioOp.setRegulagensCalibracoe(cursor.getString(43));
            relatorioOp.setDesempenhoGeralQualidade(cursor.getString(44));
            relatorioOp.setDesempenhoGeralProd(cursor.getString(45));
            relatorioOp.setDesempenhoGeralSimulador(cursor.getString(46));

            relatorioOp.setNotaSeguranca(cursor.getString(47));
            relatorioOp.setNotaMeioAmbiente(cursor.getString(48));
            relatorioOp.setNotaPlanejamento(cursor.getString(49));
            relatorioOp.setNotaSimulador(cursor.getString(50));
            relatorioOp.setNotaRelatoriosVerificacoesReaperto(cursor.getString(51));
            relatorioOp.setNotaPainelAlavancaRegulag(cursor.getString(52));
            relatorioOp.setNotaTecnicasOp(cursor.getString(53));
            relatorioOp.setNotaDadosTecEq(cursor.getString(54));
            relatorioOp.setNotaTrabalhoEquipe(cursor.getString(55));
            relatorioOp.setNotaAvaliacaoQualidade(cursor.getString(56));
            relatorioOp.setNotaProducao(cursor.getString(57));
            relatorioOp.setNotaGeral(cursor.getString(58));

            relatorioOp.setSubirDescerPranMaq(cursor.getString(59));
            relatorioOp.setFixarMaqPrancha(cursor.getString(60));

            relatorioOp.setObsRelatorioOp(cursor.getString(61));

            cursor.close();
            return  relatorioOp;
        }else{
            cursor.close();
            return null;
        }
    }
}
