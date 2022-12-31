package model;

public class ModelVendasProdutos {

    private int idVendaProduto;
    private int produto;
    private int vendas;
    private double venProValor;
    private int venProQuantidade;
    private String nomeProduto;

    /**
     * Construtor
     */
    public ModelVendasProdutos() {

    }

    /**
     * @return the idVendaProduto
     */
    public int getIdVendaProduto() {
        return idVendaProduto;
    }

    /**
     * @param pIdVendaProduto the idVendaProduto to set
     */
    public void setIdVendaProduto(int pIdVendaProduto) {
        this.idVendaProduto = pIdVendaProduto;
    }

    /**
     * @return the produto
     */
    public int getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(int produto) {
        this.produto = produto;
    }

    /**
     * @return the vendas
     */
    public int getVendas() {
        return vendas;
    }

    /**
     * @param vendas the vendas to set
     */
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    /**
     * @return the venProValor
     */
    public double getVenProValor() {
        return venProValor;
    }

    /**
     * @param venProValor the venProValor to set
     */
    public void setVenProValor(double venProValor) {
        this.venProValor = venProValor;
    }

    /**
     * @return the venProQuantidade
     */
    public int getVenProQuantidade() {
        return venProQuantidade;
    }

    /**
     * @param venProQuantidade the venProQuantidade to set
     */
    public void setVenProQuantidade(int venProQuantidade) {
        this.venProQuantidade = venProQuantidade;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
