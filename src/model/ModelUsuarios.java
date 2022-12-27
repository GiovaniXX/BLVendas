package model;

public class ModelUsuarios {

    private int idUsuario;
    private String usuNome;
    private String usuLogin;
    private String usuSenha;

    public ModelUsuarios() {
        
    }
    
    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param pIdUsuario the idUsuario to set
     */
    public void setIdUsuario(int pIdUsuario) {
        this.idUsuario = pIdUsuario;
    }

    /**
     * @return the usuNome
     */
    public String getUsuNome() {
        return usuNome;
    }

    /**
     * @param usuNome the usuNome to set
     */
    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    /**
     * @return the usuLogin
     */
    public String getUsuLogin() {
        return usuLogin;
    }

    /**
     * @param usuLogin the usuLogin to set
     */
    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    /**
     * @return the usuSenha
     */
    public String getUsuSenha() {
        return usuSenha;
    }

    /**
     * @param usuSenha the usuSenha to set
     */
    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    @Override
    public String toString() {
        return "ModelUsuario{" + "idUsuario=" + idUsuario + ", usuNome=" + usuNome + ", usuLogin=" + usuLogin + ", usuSenha=" + usuSenha + '}';
    }
}
