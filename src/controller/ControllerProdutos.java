package controller;

import model.ModelProdutos;
import DAO.DaoProdutos;
import java.util.ArrayList;

public class ControllerProdutos {

    private DaoProdutos daoProdutos = new DaoProdutos();

    /**
     * Salvar produtos controller
     *
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutoDAO(pModelProdutos);
    }

    /**
     * Excluir um Produto pelo codigo
     *
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirProdutoController(int pCodigo) {
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }

    /**
     * Alterar um produto
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }

    /**
     * Retornar produto pelo codigo
     *
     * @param pCodigo
     * @return modelProduto
     */
    public ModelProdutos getProdutoController(int pCodigo) {
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }

    /**
     * Retornar produto pelo codigo
     *
     * @param pNomeProduto
     * @return modelProduto
     */
    public ModelProdutos getProdutoController(String pNomeProduto) {
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }

    /**
     * Retornar lista de Produtos
     *
     * @return listaModelPeodutos
     */
    public ArrayList<ModelProdutos> getListaProdutosController() {
        return this.daoProdutos.getListaProdutoDAO();
    }

    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(pListaModelProdutos);
    }
}
