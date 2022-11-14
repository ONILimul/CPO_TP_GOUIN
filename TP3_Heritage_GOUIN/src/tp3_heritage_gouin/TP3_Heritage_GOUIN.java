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
        armes arme1 = new armes ("arme de base", 5); //on créer deux armes (une épée et un bâton)
        armes arme2 = new armes ("arme standard", 6);
        System.out.println(arme1);
        System.out.println(arme2);
    }
    
}
