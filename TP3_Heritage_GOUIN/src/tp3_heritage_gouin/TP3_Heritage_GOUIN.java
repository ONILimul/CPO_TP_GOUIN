/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_gouin;

import Personnage.Guerrier;
import Personnage.Magicien;
import Personnage.Personnage;
import Armes.armes;
import Armes.Epée;
import Armes.Baton;
import java.util.ArrayList;

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
        System.out.println(arme2+"\n");
        
        Epée Excalibur = new Epée ("Excalibur", 7,5);//on créer 2 épées
        Epée Durandal = new Epée ("Durandal", 4 , 7);
        Baton Chêne = new Baton ("Chêne", 4, 5);//on créer 2 bâtons
        Baton Charme = new Baton ("Charme", 5, 6);
        
        ArrayList<armes> Reserve = new ArrayList<armes>(); // on créer un tableau dynamique
        Reserve.add(Excalibur);
        Reserve.add(Durandal);
        Reserve.add(Chêne);
        Reserve.add(Charme);
        int tailleReserve = Reserve.size();
        for (int i=0; i<tailleReserve; i++) { 
            System.out.println(Reserve.get(i));
        }
        
        Magicien Gandalf = new Magicien (true, 65,"Gandalf"); //on créer nos deux magiciens
        Magicien Garcimore = new Magicien (false, 44, "garcimore");
        
        Guerrier Conan = new Guerrier (false, 78,"Conan"); //on créer nos deux guerriers
        Guerrier Lannister = new Guerrier (true, 45, "Lannister");
        
        ArrayList<Personnage> tabPerso = new ArrayList<Personnage>(); // on créer un tableau dynamique
        tabPerso.add(Gandalf);
        tabPerso.add(Garcimore);
        tabPerso.add(Conan);
        tabPerso.add(Lannister);
        int taillePerso = tabPerso.size();
        for (int i=0; i<taillePerso; i++) { 
            System.out.println(tabPerso.get(i));
        }
        
       
        
       
    }   
}
