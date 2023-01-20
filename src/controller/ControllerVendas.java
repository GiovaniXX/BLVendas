package controller;

import DAO.DaoVendas;
import model.ModelVendas;

public class ControllerVendas {

    private DaoVendas daoVendas = new DaoVendas();

    public DaoVendas getDaoVendas() {
        return daoVendas;
    }

    public void setDaoVendas(DaoVendas daoVendas) {
        this.daoVendas = daoVendas;
    }

    public int salvarVendasController(ModelVendas modelVendas) {
        return this.daoVendas.salvarVendasDAO(modelVendas);
    }

    /**
     * Atualizar vendas
     *
     * @param pModelVendas
     * @return
     */
    public boolean atualizarVendasController(ModelVendas pModelVendas) {
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
     * Excluir Vendas
     *
     * @param pIdVenda
     * @return
     */
    public boolean excluirVendasController(int pIdVenda) {
        return this.daoVendas.excluirVendasDAO(pIdVenda);
    }

    /**
     * Gerar relatorio da venda
     *
     * @param codigoVenda
     * @return
     */
    public boolean gerarRelatoriosVendas(int codigoVenda) {
        return this.daoVendas.relatorioVendaDAO(codigoVenda);
    }  
}
