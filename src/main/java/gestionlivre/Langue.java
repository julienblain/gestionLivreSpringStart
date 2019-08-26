/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre;

/**
 *
 * @author Administrateur
 */
public class Langue {
    
    private int langueId;
    
    private String langueNom;

    /**
     * Get the value of langueNom
     *
     * @return the value of langueNom
     */
    public String getLangueNom() {
        return langueNom;
    }

    /**
     * Set the value of langueNom
     *
     * @param langueNom new value of langueNom
     */
    public void setLangueNom(String langueNom) {
        this.langueNom = langueNom;
    }


    /**
     * Get the value of langueId
     *
     * @return the value of langueId
     */
    public int getLangueId() {
        return langueId;
    }

    /**
     * Set the value of langueId
     *
     * @param langueId new value of langueId
     */
    public void setLangueId(int langueId) {
        this.langueId = langueId;
    }

}
