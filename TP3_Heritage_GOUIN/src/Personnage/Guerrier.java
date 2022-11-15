/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Personnage.Personnage;

/**
 *
 * @author gouin
 */
public class Guerrier extends Personnage {
    boolean cheval;

    public boolean isCheval() { //on génère un getter
        return cheval;
    }
    
    public Guerrier(boolean cheval, int lvlVie, String Nom) {//on génère un constructeur
        super(lvlVie, Nom);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {//on génère un setter
        this.cheval = cheval;
    }
    
}
