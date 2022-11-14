/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_gouin;

/**
 *
 * @author gouin
 */
public class TP3_Heritage_GOUIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        armes arme1 = new armes ("arme de base", 5); //on créer deux armes pour tester la classe "armes"
        armes arme2 = new armes ("arme standard", 6);
        System.out.println(arme1); //on regarde si le constructeur et la méthode toString sont bien défini
        System.out.println(arme2);
        
        Epée Excalibur = new Epée ("Excalibur", 7,5);//on créer 2 épées
        Epée Durandal = new Epée ("Durandal", 4 , 7);
        Baton Chêne = new Baton ("Chêne", 4, 5);//on créer 2 bâtons
        Baton Charme = new Baton ("Charme", 5, 6);
        
        
        
        
    }
    
}
