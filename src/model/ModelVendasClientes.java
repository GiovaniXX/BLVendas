package model;

import java.util.ArrayList;

public class ModelVendasClientes {

    private ModelVendas modelVendas;
    private ModelClientes modelClientes;
    private ArrayList<ModelVendasClientes> listaModelVendasClientes;

    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelCliente
     */
    public ModelClientes getModelClientes() {
        return modelClientes;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelClientes(ModelClientes modelCliente) {
        this.modelClientes = modelCliente;
    }

    /**
     * @return the listaModelVendasCliente
     */
    public ArrayList<ModelVendasClientes> getListaModelVendasClientes() {
        return listaModelVendasClientes;
    }

    /**
     * @param ListaModelVendasCliente the listaModelVendasCliente to set
     */
    public void setListaModelVendasClientes(ArrayList<ModelVendasClientes> ListaModelVendasCliente) {
        this.listaModelVendasClientes = ListaModelVendasCliente;
    }
}
