package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelFormaPagamentos;

public class DaoFormaPagamento extends ConexaoMySql {

    /**
     * FormaPagamento
     *
     * @param pModelFormaPagamento
     * @return pModelFormaPagamento
     */
    public int salvarFormaPagamentoDAO(ModelFormaPagamentos pModelFormaPagamento) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSET INTO tbl_forma_pagamento ("
                    + "pk_id_for_pag,"
                    + "descricao_for_pag,"
                    + "desconto_for_pag,"
                    + "parcelas_for_pag,"
                    + "situacao_for_pag"
                    + ") VALUES ("
                    + "'" + pModelFormaPagamento.getIdForPag() + "',"
                    + "'" + pModelFormaPagamento.getDescricaoForPag() + "',"
                    + "'" + pModelFormaPagamento.getDescontoForPag() + "',"
                    + "'" + pModelFormaPagamento.getParcelasForpag() + "',"
                    + "'" + pModelFormaPagamento.getSituacaoForPag() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Recupera FormaPagamento
     *
     * @param pIdForPag
     * @return ModelFormaPagamento
     */
    public ModelFormaPagamentos getFormaPagamentoDAO(int pIdForPag) {
        ModelFormaPagamentos modelFormaPagamento = new ModelFormaPagamentos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_for_pag,"
                    + "descricao_for_pag,"
                    + "desconto_for_pag,"
                    + "parcelas_for_pag,"
                    + "situacao_for_pag"
                    + " FROM"
                    + " tbl_id_for_pag = '" + pIdForPag + "'"
                    + ";"
            );
            while (this.getResultSet().next()) {
                modelFormaPagamento.setIdForPag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoForPag(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelasForpag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoForPag(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelFormaPagamento;
    }

    public ArrayList<ModelFormaPagamentos> getListaFormaPagamentoDAO() {
        ArrayList<ModelFormaPagamentos> listaModelFormaPagamento = new ArrayList<>();
        ModelFormaPagamentos modelFormaPagamento = new ModelFormaPagamentos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_for_pag,"
                    + "descricao_for_pag,"
                    + "desconto_for_pag,"
                    + "parcelas_for_pag,"
                    + "situacao_for_pag"
                    + " FROM"
                    + " tbl_forma_pagamento"
                    + ";"
            );
            while (this.getResultSet().next()) {
                modelFormaPagamento.setIdForPag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoForPag(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelasForpag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoForPag(this.getResultSet().getInt(5));
                listaModelFormaPagamento.add(modelFormaPagamento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelFormaPagamento;
    }

    public boolean atualizarFormaPagamentoDAO(ModelFormaPagamentos pModelFormaPagamento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_forma_pagamento SET "
                    + "pk_id_for_pag = = '" + pModelFormaPagamento.getIdForPag() + "',"
                    + "descricao_for_pag = '" + pModelFormaPagamento.getDescricaoForPag() + "',"
                    + "desconto_for_pag = '" + pModelFormaPagamento.getDescontoForPag() + "',"
                    + "parcelas_for_pag = '" + pModelFormaPagamento.getParcelasForpag() + "',"
                    + "situacao_for_pag = '" + pModelFormaPagamento.getSituacaoForPag() + "'"
                    + " WHERE "
                    + "pk_id_for_pag = '" + pModelFormaPagamento.getIdForPag() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
        }
    }
}
