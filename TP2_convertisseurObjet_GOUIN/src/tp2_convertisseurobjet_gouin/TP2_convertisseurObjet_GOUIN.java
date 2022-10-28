/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_gouin;

import java.util.Scanner;

/**
 *
 * @author gouin
 */
public class TP2_convertisseurObjet_GOUIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        
        Convertisseur premierTest = new Convertisseur ();
        System.out.println (premierTest.CelciusVersFarenheit(25));
        System.out.println (premierTest.FarenheitVersCelcius(77));
        
        Convertisseur secondTest = new Convertisseur ();
        System.out.println(secondTest.CelciusVersKelvin(30));
        
        System.out.println(premierTest.toString());
        System.out.println(secondTest.toString());
        
        System.out.println("\n Quelle conversion voulez vous faire ? \n CK (Celcius vers Kelvin) \n KC (Kelvin vers celcius) \n FC (Farenheit vers Celcius) \n CF (Celcius vers Farenheit) \n FK (Farenheit vers Kelvin) \n KF (Kelvin vers Farenheit)");
        String s = sc.nextLine();
        Convertisseur donneeUTILISATEUR = new Convertisseur();
        if ("CK".equals(s)) {
            System.out.println("Donnez la valeur à convertir : ");
            double a = sc.nextDouble();
            System.out.println(donneeUTILISATEUR.CelciusVersKelvin(a));
        }
        if ("FC".equals(s)) {
            System.out.println("Donnez la valeur à convertir : ");
            double a = sc.nextDouble();
            System.out.println(donneeUTILISATEUR.FarenheitVersCelcius(a));
        }
        if ("CF".equals(s)) {
            System.out.println("Donnez la valeur à convertir : ");
            double a = sc.nextDouble();
            System.out.println(donneeUTILISATEUR.CelciusVersFarenheit(a));
        }
        if ("KC".equals(s)) {
            System.out.println("Donnez la valeur à convertir : ");
            double a = sc.nextDouble();
            System.out.println(donneeUTILISATEUR.KelvinVersCelcius(a));
        }
        if ("FK".equals(s)) {
            System.out.println("Donnez la valeur à convertir : ");
            double a = sc.nextDouble();
            System.out.println(donneeUTILISATEUR.FarenheitVersKelvin(a));
        }
        if ("KF".equals(s)) {
            System.out.println("Donnez la valeur à convertir : ");
            double a = sc.nextDouble();
            System.out.println(donneeUTILISATEUR.KelvinVersFarenheit(a));
        }
    }
    
}
