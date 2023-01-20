package model;

import java.util.Date;

public class ModelVendas {

    private int idVenda;
    private int cliente;
    private Date venDataVenda;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;
    private String venFormaPagamento;

    /**
     * Construtor
     */
    public ModelVendas() {
    }

    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return this.idVenda;
    }

    /**
     * @param pIdVenda
     */
    public void setIdVenda(int pIdVenda) {
        this.idVenda = pIdVenda;
    }

    /**
     * @return the cliente
     */
    public int getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the venDataVenda
     */
    public Date getVenDataVenda() {
        return venDataVenda;
    }

    /**
     * @param venDataVenda the venDataVenda to set
     */
    public void setVenDataVenda(Date venDataVenda) {
        this.venDataVenda = venDataVenda;
    }

    /**
     * @return the venValorLiquido
     */
    public double getVenValorLiquido() {
        return venValorLiquido;
    }

    /**
     * @param venValorLiquido the venValorLiquido to set
     */
    public void setVenValorLiquido(double venValorLiquido) {
        this.venValorLiquido = venValorLiquido;
    }

    /**
     * @return the venValorBruto
     */
    public double getVenValorBruto() {
        return venValorBruto;
    }

    /**
     * @param venValorBruto the venValorBruto to set
     */
    public void setVenValorBruto(double venValorBruto) {
        this.venValorBruto = venValorBruto;
    }

    /**
     * @return the venDesconto
     */
    public double getVenDesconto() {
        return venDesconto;
    }

    /**
     * @param venDesconto the venDesconto to set
     */
    public void setVenDesconto(double venDesconto) {
        this.venDesconto = venDesconto;
    }

    /**
     * 
     * @return the venFormaPagamento
     */
    public String getVenFormaPagamento() {
        return venFormaPagamento;
    }

    /**
     * 
     * @param venFormaPagamento the venFormaPagamento to set
     */
    public void setVenFormaPagamento(String venFormaPagamento) {
        this.venFormaPagamento = venFormaPagamento;
    }

    @Override
    public String toString() {
        return "ModelVendas{" + "idVenda=" + idVenda + ", cliente=" + cliente + ", venDataVenda=" + venDataVenda + ", venValorLiquido=" + venValorLiquido + ", venValorBruto=" + venValorBruto + ", venDesconto=" + venDesconto + ", venFormaPagamento=" + venFormaPagamento + '}';
    }

//    public String getFormapagamentos() {
//        throw new UnsupportedOperationException();
//    }
}
