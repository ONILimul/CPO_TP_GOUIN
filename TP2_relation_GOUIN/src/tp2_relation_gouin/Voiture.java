/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_gouin;

/**
 *
 * @author gouin
 */
public class Voiture {
    String Modèle; //on initialise nos variables que l'on utilisera dans le code
    String Marque;
    int PuissanceCV;
    Personne Proprietaire ;
    
    public Voiture (String modele, String marque, int Puissance) {
        Modèle = modele;
        Marque = marque;
        PuissanceCV = Puissance;
        Proprietaire = null;
    }
    @Override
    public String toString () {
        return "Modèle : " + Modèle + "\nMarque : " + Marque + "\nPuissanceCV : " + PuissanceCV;

    }
    
}
