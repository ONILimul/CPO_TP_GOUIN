/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_gouin;

/**
 *
 * @author gouin
 */
public class Baton extends armes {
    int age ;
    
    public Baton (String n, int i, int a) {
        super(n , 1);
        if (a>0) {
            age = a;
        }
        else {
            age = 0;
        }
}

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }
    
}
