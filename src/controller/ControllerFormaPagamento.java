package controller;

import java.util.ArrayList;
import model.ModelFormaPagamentos;

public class ControllerFormaPagamento {

    private ArrayList<ModelFormaPagamentos> listaFormaPagamento;

    public ControllerFormaPagamento() {
        this.listaFormaPagamento = new ArrayList<>();
    }

    public ArrayList<ModelFormaPagamentos> getListaFormaPagamentoController() {
        return listaFormaPagamento;
    }

    public void setListaFormaPagamentoController(ArrayList<ModelFormaPagamentos> listaFormaPagamento) {
        this.listaFormaPagamento = listaFormaPagamento;
    }

    public boolean adicionarFormaPagamentoController(ModelFormaPagamentos formaPagamento) {
        return listaFormaPagamento.add(formaPagamento);
    }

    public boolean removerFormaPagamentoController(ModelFormaPagamentos formaPagamento) {
        return listaFormaPagamento.remove(formaPagamento);
    }
}
