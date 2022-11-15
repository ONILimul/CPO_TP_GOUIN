/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author gouin
 */
public class Epée extends armes {
    int finesse;
    
    public Epée(String n, int i, int a) {
        super(n,1);
        if (a>0) {
            finesse = a;
        }
        else {
            finesse = 0;
        }
    }
    
}
