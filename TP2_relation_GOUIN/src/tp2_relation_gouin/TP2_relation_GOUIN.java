/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_gouin;

/**
 *
 * @author gouin
 */
public class TP2_relation_GOUIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; //on initialise les voitures et les personnes 
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("\nliste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        //on teste le code et il fonctionne
        
        bob.liste_voitures[0] = uneClio ; //on ajoute une voiture à bob
        bob.nbVoitures = 1 ; // le nombre de voiture de bob augmente donc de 1
        uneClio.Proprietaire = bob ;//on déclare bob comme le propriétaire de la Clio
        System.out.println("\nla premiere voiture de Bob est " + bob.liste_voitures[0] ) ; //on teste le code pour voir si tout fonctionne
        
        bob.liste_voitures[1] = une2008; //on fait la même chose que précédement mais on utile une voiture différente 
        bob.nbVoitures = 2;
        une2008.Proprietaire = bob;
        System.out.println("\nla deuxième voiture de bob est " + bob.liste_voitures[1]) ;
        
        reno.liste_voitures[0] = uneMicra ;//on fait la même chose que précédement mais on utile une personne différente 
        reno.liste_voitures[1] = uneAutreClio ;
        reno.nbVoitures = 2;
        uneMicra.Proprietaire = reno;
        uneAutreClio.Proprietaire = reno;
        System.out.println("\nla premiere voiture de reno est " + reno.liste_voitures[0] + "\nla deuxième voiture de reno est " + reno.liste_voitures[1]) ;
        
        Voiture uneVoiture = new Voiture ("Auto", "Mobile", 100 ) ;//on ajoute une nouvelle voiture pour faire des tests
        System.out.println(reno.ajoutervoiture(uneClio)); //on nous retourne un "false" donc le code fonctionne pour cette partie
        System.out.println(bob.ajoutervoiture(uneVoiture));
        System.out.println(bob.nbVoitures);
        

    }
    
}
