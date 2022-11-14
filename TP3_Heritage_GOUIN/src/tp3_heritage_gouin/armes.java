package tp3_heritage_gouin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gouin
 */
public class armes {
    String nom; //on initialise nos variables pour la classe
    private int lvlAttaque;
    
    public armes (String unNom, int puissance) { //on créer un constructeur pour rentrer les attributs des objets plus facilement

    nom = unNom;
    lvlAttaque = puissance;
    }
    @Override
    public String toString() { //on créer une méthode pour nous afficher les références d'une bière quand on nous le demande
        String chaine_a_retourner;
        chaine_a_retourner = nom + "(niveau d'attaque : " + lvlAttaque +")"  ; 
     return chaine_a_retourner ;
    }
}
