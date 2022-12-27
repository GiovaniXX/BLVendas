package DAO;

import java.util.ArrayList;
import model.ModelUsuarios;
import conexoes.ConexaoMySql;

public class DaoUsuarios extends ConexaoMySql {

    /**
     * Grava Usuario
     *
     * @param pModelUsuarios
     * @return int
     */
    public int salvarUsuarioDAO(ModelUsuarios pModelUsuarios) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_usuario ("
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                    + ") VALUES ("
                    + "'" + pModelUsuarios.getUsuNome() + "',"
                    + "'" + pModelUsuarios.getUsuLogin() + "',"
                    + "'" + pModelUsuarios.getUsuSenha() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Recupera Usuario
     *
     * @param pIdUsuario
     * @return ModelUsuario
     */
    public ModelUsuarios getUsuarioDAO(int pIdUsuario) {
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_usuario, "
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_senha "
                    + " FROM "
                    + "tbl_usuario"
                    + " WHERE "
                    + "pk_id_usuario = '" + pIdUsuario + "'"
            );
            while (this.getResultSet().next()) {
                modelUsuarios = new ModelUsuarios();
                modelUsuarios.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuarios;
    }

    /**
     * Recupera Usuario
     *
     * @param pLogin
     * @return ModelUsuario
     */
    public ModelUsuarios getUsuarioDAO(String pLogin) {
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_usuario, "
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_senha "
                    + " FROM "
                    + "tbl_usuario "
                    + " WHERE "
                    + "usu_login = '" + pLogin + "'"
            );
            while (this.getResultSet().next()) {
                modelUsuarios = new ModelUsuarios();
                modelUsuarios.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));               
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuarios;
    }

    /**
     * Atualiza usuário.
     *
     * @param pModelUsuario
     * @return
     */
    public boolean atualizarUsuarioDAO(ModelUsuarios pModelUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_usuario SET "
                    + "pk_id_usuario = '" + pModelUsuario.getIdUsuario() + "',"
                    + "usu_nome = '" + pModelUsuario.getUsuNome() + "',"
                    + "usu_login = '" + pModelUsuario.getUsuLogin() + "',"
                    + "usu_senha = '" + pModelUsuario.getUsuSenha() + "'"
                    + "WHERE "
                    + "pk_id_usuario = '" + pModelUsuario.getIdUsuario() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ArrayList<ModelUsuarios> getListaUsuarioDAO() {
        ArrayList<ModelUsuarios> listaModelUsuarios = new ArrayList<>();
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_usuario, "
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_senha "
                    + " FROM "
                    + "tbl_usuario"
            );
            while (this.getResultSet().next()) {
                modelUsuarios.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));
                listaModelUsuarios.add(modelUsuarios);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelUsuarios;
    }

    /**
     * Exclui um usuário pelo código.
     *
     * @param pIdUsuario
     * @return boolean
     */
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_usuario "
                    + "WHERE "
                    + "pk_id_usuario = '" + pIdUsuario + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Valida usuário e senha no BD.
     *
     * @param pModelUsuario
     * @return
     */
    public boolean getValidarUsuarioDAO(ModelUsuarios pModelUsuario) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_usuario, "
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_senha "
                    + " FROM "
                    + "tbl_usuario"
                    + " WHERE "
                    + "usu_login = '" + pModelUsuario.getUsuLogin() + "' AND usu_senha = '" + pModelUsuario.getUsuSenha() + "'"
                    + ";"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
