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
    int NbPerso;
    int NbGuerrier;
    int NbMage;

    public Personnage(int lvlVie, String Nom) { //on génère un constructeur 
        this.lvlVie = lvlVie;
        this.Nom = Nom;
    }
    
    
    
    ArrayList<armes> Inventaire = new ArrayList<>(); // on créer un tableau dynamique pour stocker le nb d'armes
    
    
    public void ajouterArmes(armes ArmeAjouter) { //on créer la méthode pour ajouter une arme à un personnage
     
     int nbArmes = Inventaire.size();
     if (nbArmes < 5) {
         Inventaire.add(ArmeAjouter);
    }   
    }
    


    public armes getArmeEnMain() {//on créer le getter pour avoir une référence a cette arme
        armes ArmeEnMain = null;
        return ArmeEnMain;
    }
    
    public void PrendreArme (armes NomArme) {//on créer une méthode pour equiper une arme de l'inventaire
        int nbArmes = Inventaire.size();
        int a = 0;
        for (int i=0; i < nbArmes; i ++) {
            if (Inventaire.get(i)== NomArme) {//Si on possède l'arme dans l'inventaire on l'équipe
                ArmeEnMain = NomArme;
                System.out.println("L'arme a bien été trouvé et équipé");
            }
            else {
                a += 1;
                
            }
        }
        if (a == nbArmes) {
            System.out.println("L'arme n'a pas été trouvée et ne peut donc pas être équipée");
           
        }
        
        NbPerso = NbMage + NbGuerrier;
    }

    @Override
    public String toString() {
        if (ArmeEnMain == null) {
            return "Personnage{" + "Nom=" + Nom + ", Niveau de Vie=" + lvlVie + '}';
            
        }
        else {
            return "Personnage{" + "Nom=" + Nom + ", Niveau de Vie=" + lvlVie + "\nArme équipée=" + ArmeEnMain + '}';
        }
        
    }
    
    
    
}
 // Challenge : Arme a = tab.get(0);     if(a instanceof Baton) { System.out.println("a est un bâton"); }