package tp2_bieres_gouin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gouin
 */
public class BouteilleBiere { //on initialise les varibles qui nous serons utiles
    String nom;
    double degreAlcool; 
    String brasserie;
    boolean ouverte; 
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { //on créer le constructeur
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
}
    public boolean Décapsuler () { //on créer la méthode pour décapsuler les bières 
        if (ouverte == false) {
            ouverte = true;  
            return true ;
        }
        else {
            System.out.println("erreur : bière déjà ouverte");//on retourne un message d'erreur si la bière est déjà décapsulée 
            return false ;
        }
    }

    public void lireEtiquette() { //on créer la méthode pour lire l'étiquette et ainsi obtenir les informations de la bouteille
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie ) ;
        
    }
    @Override
    public String toString() { //on créer une méthode pour nous afficher les références d'une bière quand on nous le demande
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? "; 
     if (ouverte == true ) chaine_a_retourner += "oui" ;
     else chaine_a_retourner += "non" ;
     return chaine_a_retourner ;
    }



    
}
