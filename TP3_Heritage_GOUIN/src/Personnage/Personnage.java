/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.armes;
import java.util.ArrayList;

/**
 *
 * @author gouin
 */
public class Personnage {
    int lvlVie;
    String Nom;
    armes ArmeEnMain;

    public Personnage(int lvlVie, String Nom) { //on génère un constructeur 
        this.lvlVie = lvlVie;
        this.Nom = Nom;
    }
    public void ajouterArmes(armes ArmeAjouter) { //on créer la méthode pour ajouter une arme à un personnage
     ArrayList<armes> Inventaire = new ArrayList<armes>(); // on créer un tableau dynamique pour stocker le nb d'armes
     int nbArmes = Inventaire.size();
     if (nbArmes < 5) {
         Inventaire.add(ArmeAjouter);
    }   
    }
    public void Equipement(armes tenirArme) {//on créer une propriété pour choisir une armes que le personnage va utiliser
        //on cherche à savoir ce que le personnage a dans la main
        tenirArme = null;
        if (tenirArme == null) {
            System.out.println("Pas d'armes équipée");  
        }       
}

    public armes getArmeEnMain() {
        return ArmeEnMain;
    }
    
    public void PrendreArme (String NomArme) {
        
    }

    @Override
    public String toString() {
        return "Personnage{" + "Nom=" + Nom + ", Niveau de Vie=" + lvlVie + '}';
    }
    
    
    
}
