package controller;

import DAO.DaoClientes;
import java.util.ArrayList;
import model.ModelClientes;

public class ControllerClientes {

    public static void gerarRelatorioClientes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private DaoClientes daoCliente = new DaoClientes();

    /**
     * Grava Cliente
     *
     * @param pModelCliente
     * @return int
     */
    public int salvarClienteController(ModelClientes pModelCliente) {
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
     * Recupera Cliente
     *
     * @param pIdCliente
     * @return ModelCliente
     */
    public ModelClientes getClienteController(int pIdCliente) {
        return this.daoCliente.getClienteDAO(pIdCliente);
    }

    /**
     * Recupera Cliente
     *
     * @param pNomeCliente
     * @return ModelCliente
     */
    public ModelClientes getClienteController(String pNomeCliente) {
        return this.daoCliente.getClienteDAO(pNomeCliente);
    }

    /**
     * Recupera uma lista de clientes
     *
     * @return
     */
    public ArrayList<ModelClientes> getListaClientesController() {
        return this.daoCliente.getListaClienteDAO();
    }

    /**
     * Atualiza Cliente
     *
     * @param pModelCliente
     * @return boolean
     */
    public boolean atualizarClienteController(ModelClientes pModelCliente) {
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
     * Exclui Cliente
     *
     * @param pIdCliente
     * @return boolean
     */
    public boolean excluirClienteController(int pIdCliente) {
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }

    /**
     *
     * @return
     */
    public boolean gerarRelatorioCliente() {
        return this.daoCliente.gerarRelatorioCliente();
    }
}
