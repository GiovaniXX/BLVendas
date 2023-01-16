package controller;

import DAO.DaoClientes;
import java.util.ArrayList;
import model.ModelClientes;

public class ControllerClientes {

    private DaoClientes daoClientes = new DaoClientes();

    /**
     * Grava Cliente
     *
     * @param pModelCliente
     * @return int
     */
    public int salvarClienteController(ModelClientes pModelCliente) {
        return this.daoClientes.salvarClienteDAO(pModelCliente);
    }

    /**
     * Recupera Cliente
     *
     * @param pIdCliente
     * @return ModelCliente
     */
    public ModelClientes getClienteController(int pIdCliente) {
        return this.daoClientes.getClienteDAO(pIdCliente);
    }

    /**
     * Recupera Cliente
     *
     * @param pNomeCliente
     * @return ModelCliente
     */
    public ModelClientes getClienteController(String pNomeCliente) {
        return this.daoClientes.getClienteDAO(pNomeCliente);
    }

    /**
     * Recupera uma lista de clientes
     *
     * @return
     */
    public ArrayList<ModelClientes> getListaClientesController() {
        return this.daoClientes.getListaClienteDAO();
    }

    /**
     * Atualiza Cliente
     *
     * @param pModelCliente
     * @return boolean
     */
    public boolean atualizarClienteController(ModelClientes pModelCliente) {
        return this.daoClientes.atualizarClienteDAO(pModelCliente);
    }

    /**
     * Exclui Cliente
     *
     * @param pIdCliente
     * @return boolean
     */
    public boolean excluirClienteController(int pIdCliente) {
        return this.daoClientes.excluirClienteDAO(pIdCliente);
    }
}
