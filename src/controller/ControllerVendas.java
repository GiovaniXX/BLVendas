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

    public boolean excluirVendasController(int codigo) {
        return this.daoVendas.excluirVendasDAO(codigo);
    }

    public boolean atualizarVendasController(ModelVendas modelVendas) {
        return this.daoVendas.atualizarVendasDAO(modelVendas);
    }
}
