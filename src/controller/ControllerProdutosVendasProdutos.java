package controller;

import DAO.DaoProdutosVendasProdutos;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;

public class ControllerProdutosVendasProdutos {

    private DaoProdutosVendasProdutos daoProdutosVendasProdutos = new DaoProdutosVendasProdutos();

    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController(int pCodigoVenda) {
        return this.daoProdutosVendasProdutos.getListaProdutosVendasProdutosDAO(pCodigoVenda);
    }
}
