/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_gouin;

/**
 *
 * @author gouin
 */
public class Personne {
    String Nom;
    String Prenom;
    int nbVoitures = 0 ;
    Voiture [] liste_voitures ;
    

    
    public Personne(String Unnom,String Unprenom) {
        Nom = Unnom;
        Prenom = Unprenom;
        liste_voitures = new Voiture [3] ;
        
    }
    
    @Override
    public String toString () {
        return "Nom : " + Nom + " \nPrenom : " + Prenom;

    }
    
}
