package controller;

import DAO.DaoUsuarios;
import java.util.ArrayList;
import model.ModelUsuarios;

public class ControllerUsuarios {

    private DaoUsuarios daoUsuarios = new DaoUsuarios();

    /**
     * Grava Usuario
     *
     * @param pModelUsuario
     * @return int
     */
    public int salvarUsuarioController(ModelUsuarios pModelUsuario) {
        return this.daoUsuarios.salvarUsuarioDAO(pModelUsuario);
    }

    /**
     * Recupera Usuario
     *
     * @param pIdUsuario
     * @return ModelUsuario
     */
    public ModelUsuarios getUsuarioController(int pIdUsuario) {
        return this.daoUsuarios.getUsuarioDAO(pIdUsuario);
    }

    /**
     *
     * @param pLogin
     * @return ModelUsuario
     */
    public ModelUsuarios getUsuarioController(String pLogin) {
        return this.daoUsuarios.getUsuarioDAO(pLogin);
    }

    /**
     * Recupera uma lista de usuarios
     *
     * @return ArrayList
     */
    public ArrayList<ModelUsuarios> getListaUsuariosController() {
        return this.daoUsuarios.getListaUsuarioDAO();
    }

    /**
     * Atualiza usuario
     *
     * @param pModelUsuario
     * @return boolean
     */
    public boolean atualizarUsuarioController(ModelUsuarios pModelUsuario) {
        return this.daoUsuarios.atualizarUsuarioDAO(pModelUsuario);
    }

    public boolean excluirUsuarioController(int pIdUsuario) {
        return this.daoUsuarios.excluirUsuarioDAO(pIdUsuario);
    }

    /**
     * Valida login e senha do usuario
     *
     * @param pModelUsuario
     * @return boolean
     */
    public boolean getValidarUsuarioController(ModelUsuarios pModelUsuario) {
        return this.daoUsuarios.getValidarUsuarioDAO(pModelUsuario);
    }
}
