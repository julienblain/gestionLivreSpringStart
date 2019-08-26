/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class LivreController {
     private LivreService livreService;
     
     /*
     public void setLivreService(LivreService livreService) {
        this.livreService = livreService; //pas de new car la config livre-servelet l'instancie 
    }
     */
    //ce type d'objet permet d'avoir une structure composite (vue et l'objet
    @RequestMapping(value = "/formLivre", method = RequestMethod.GET) //envoie du formulaitre
    public ModelAndView livre() {
        //si on veut seter des value dans le forme
        Livre l = new Livre();
        l.setTitre("essai");
        
        ModelAndView mv = new ModelAndView("livre", "command", l);
        List listeCategorie = new ArrayList<Categorie>();
        List listeLangue = new ArrayList<Langue>();
        Langue langue = new Langue();
        langue.setLangueId(1);
        langue.setLangueNom("francais");
        Categorie categorie = new Categorie();
        categorie.setCategorieId(1);
        categorie.setCategorieNom("SF");
        listeLangue.add(langue);
        listeCategorie.add(categorie);
        mv.getModelMap().addAttribute("categorieList", listeCategorie);
        mv.getModelMap().addAttribute("langueList", listeLangue);
       

        //ModelAndView mv = new ModelAndView("livre", "command", new Livre()); //livre = vue ; command = modelAndViewTitre, new Livre = model
        return mv;
    }
    
    @RequestMapping(value = "/ajoutLivre", method = RequestMethod.POST) //formulaire validé
    public String ajoutLivre(@ModelAttribute("SpringWeb") Livre livre, ModelMap model) {
       model.addAttribute("titre", livre.getTitre());
       model.addAttribute("auteur", livre.getAuteur());
       model.addAttribute("categorie", livre.getCategorie());
       model.addAttribute("langue", livre.getLangue());
     
        return "livreAjoute";
    }

     
     
}
