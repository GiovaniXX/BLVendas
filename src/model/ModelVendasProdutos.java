package model;

public class ModelVendasProdutos {

    private int idVendaProduto;
    private int produto;
    private int vendas;
    private double venProValor;
    private int venProQuantidade;

    public int getIdVendaProduto() {
        return idVendaProduto;
    }

    public void setIdVendaProduto(int idVendaProduto) {
        this.idVendaProduto = idVendaProduto;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public double getVenProValor() {
        return venProValor;
    }

    public void setVenProValor(double venProValor) {
        this.venProValor = venProValor;
    }

    public int getVenProQuantidade() {
        return venProQuantidade;
    }

    public void setVenProQuantidade(int venProQuantidade) {
        this.venProQuantidade = venProQuantidade;
    }
}
