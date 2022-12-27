package controller;

import DAO.DaoVendasClientes;
import java.util.ArrayList;
import model.ModelVendasClientes;

public class ControllerVendasClientes {

    private DaoVendasClientes daoVendasClientes = new DaoVendasClientes();

    public ArrayList<ModelVendasClientes> getListaVendasClientesController() {
        return this.daoVendasClientes.getListaVendasClienteDAO();
    }
}
