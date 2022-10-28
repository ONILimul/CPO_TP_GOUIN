/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_gouin;

/**
 *
 * @author gouin
 */
public class TP2_Manip_GOUIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; // on a pas créer de nouvelle classe : il y a donc 2 tartiflettes créées
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        assiette2.nbCalories += 1; //On vérifie simplement en ajoutant 1 au nombre de calories
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + 
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + 
        assiette3.nbCalories) ;
        Tartiflette assiette11 = new Tartiflette(500) ;
        Tartiflette assiette22 = new Tartiflette(600) ;
        assiette2 = assiette11;
        assiette1 = assiette22; // on intervertit les valeurs des assiettes 1 et 2  
       
        
        //L’une de ces lignes suivantes est-elle correcte ?
        
        //Moussaka assiette666 = assiette1 ; => Les deux types ne sont pas compatibles en eux donc cette ligne est fausse
        
        //Moussaka assiette667 = new Tartiflette()=> La ligne n'est pas correcte : on ne peut pas créer un objet dans deux classe différentes
        
        //Répondez alors à la question suivante : une référence objet qui annonce référencer un type d’objet peut-elle en référencer un autre qui n’a aucun rapport ?
        
        //Réponse : Non on ne peut pas !
        
        Moussaka TabMoussaka [] = new Moussaka[10];  //on créer un tableau de taille 10
        for (int i=0; i < TabMoussaka.length; i++) {
            TabMoussaka [i] = new Moussaka (i*100); //On créer 10 nouveaux objets avec une valeur de calorie différente 
            
        }

    }
    
}
