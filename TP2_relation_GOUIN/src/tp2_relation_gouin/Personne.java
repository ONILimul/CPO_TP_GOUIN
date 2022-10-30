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
    String Nom; //on initialise nos variables que l'on utilisera dans le code
    String Prenom;
    int nbVoitures;
    Voiture [] liste_voitures ;
    

    
    public Personne(String Unnom,String Unprenom) { //on défini notre constructeur
        Nom = Unnom;
        Prenom = Unprenom;
        nbVoitures = 0;
        liste_voitures = new Voiture [3] ;
        
    }
    
    public boolean ajoutervoiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter != null) { //on vérifie si la voiture possède déjà un propriétaire
            return false;
        }
        else {
            if (nbVoitures >  3) { // on pose la condition du nombre max de voiture
                return false;
            }
            else {
                liste_voitures [nbVoitures] = voiture_a_ajouter; //on ajoute la nouvelle voiture 
                nbVoitures += 1;
                voiture_a_ajouter.Proprietaire = this;//on défini le nouveau propriétaire de la voiture
                return true;
                
            }
            
        }
    }
    
    @Override
    public String toString () {
        return "Nom : " + Nom + " \nPrenom : " + Prenom;

    }
    
}
