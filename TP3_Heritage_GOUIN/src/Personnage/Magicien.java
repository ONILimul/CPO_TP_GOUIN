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
public class Magicien extends Personnage {
    boolean confirme;

    public boolean isConfirme() {//on génère un getter
        return confirme;
    }
    

    public Magicien(boolean confirme, int lvlVie, String Nom) {//on génère un constructeur
        super(lvlVie, Nom);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {//on génère un setter
        this.confirme = confirme;
    }
    
    
}
