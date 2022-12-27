package controller;

import DAO.DaoVendasProdutos;
import java.util.ArrayList;
import model.ModelVendasProdutos;

public class ControllerVendasProdutos {

    private DaoVendasProdutos daoVendasProdutos = new DaoVendasProdutos();

    public ArrayList<ModelVendasProdutos> getListaVendasClienteController() {
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos) {
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    public boolean excluirVendasProdutosController(int pIdVendaProduto) {
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProduto);
    }

    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pListaModelVendasProdutos);
    }
}
