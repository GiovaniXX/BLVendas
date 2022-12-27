package controller;

import DAO.DaoUsuario;
import java.util.ArrayList;
import java.util.List;
import model.ModelUsuario;

public class ControllerUsuario {

    private DaoUsuario daoUsuario = new DaoUsuario();

    /**
     * Grava Usuario
     *
     * @param pModelUsuario
     * @return int
     */
    public int salvarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
     * Recupera Usuario
     *
     * @param pIdUsuario
     * @return ModelUsuario
     */
    public ModelUsuario getUsuarioController(int pIdUsuario) {
        return this.daoUsuario.getUsuarioDAO(pIdUsuario);
    }

    /**
     *
     * @param pLogin
     * @return ModelUsuario
     */
    public ModelUsuario getUsuarioController(String pLogin) {
        return this.daoUsuario.getUsuarioDAO(pLogin);
    }

    /**
     * Recupera uma lista de usuarios
     *
     * @return ArrayList
     */
    public ArrayList<ModelUsuario> getListaUsuariosController() {
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
     * Atualiza usuario
     *
     * @param pModelUsuario
     * @return boolean
     */
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    public boolean excluirUsuarioController(int pIdUsuario) {
        return this.daoUsuario.excluirUsuarioDAO(pIdUsuario);
    }

    /**
     * Valida login e senha do usuario
     *
     * @param pModelUsuario
     * @return boolean
     */
    public boolean getValidarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.getValidarUsuarioDAO(pModelUsuario);
    }
}
