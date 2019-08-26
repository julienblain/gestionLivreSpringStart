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
public class Livre {
   
    private String titre;
    private Integer id;
    private String auteur;
    private int[] categorie;
    private int langue;

    public int getLangue() {
        return langue;
    }

    public void setLangue(int langue) {
        this.langue = langue;
    }

    
    public int[] getCategorie() {
        return categorie;
    }

    public void setCategorie(int[] categorie) {
        this.categorie = categorie;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
