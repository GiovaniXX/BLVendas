package model;

public class ModelFormaPagamentos {

    private int idForPag;
    private String descricaoForPag;
    private float descontoForPag;
    private int parcelasForpag;
    private int situacaoForPag;

    /**
     * Construtor
     */
    public ModelFormaPagamentos() {

    }

    /**
     * @return the idForPag
     */
    public int getIdForPag() {
        return idForPag;
    }

    /**
     * @param pIdForPag the idForPag to set
     */
    public void setIdForPag(int pIdForPag) {
        this.idForPag = pIdForPag;
    }

    /**
     * @return the descricaoForPag
     */
    public String getDescricaoForPag() {
        return descricaoForPag;
    }

    /**
     * @param pDescricaoForPag the descricaoForPag to set
     */
    public void setDescricaoForPag(String pDescricaoForPag) {
        this.descricaoForPag = pDescricaoForPag;
    }

    /**
     * @return the descontoForPag
     */
    public float getDescontoForPag() {
        return descontoForPag;
    }

    /**
     * @param pDescontoForPag the descontoForPag to set
     */
    public void setDescontoForPag(float pDescontoForPag) {
        this.descontoForPag = pDescontoForPag;
    }

    /**
     * @return the parcelasForpag
     */
    public int getParcelasForpag() {
        return parcelasForpag;
    }

    /**
     * @param pParcelasForpag the parcelasForpag to set
     */
    public void setParcelasForpag(int pParcelasForpag) {
        this.parcelasForpag = pParcelasForpag;
    }

    /**
     * @return the situacaoForPag
     */
    public int getSituacaoForPag() {
        return situacaoForPag;
    }

    /**
     * @param pSituacaoForPag the situacaoForPag to set
     */
    public void setSituacaoForPag(int pSituacaoForPag) {
        this.situacaoForPag = pSituacaoForPag;
    }
}
