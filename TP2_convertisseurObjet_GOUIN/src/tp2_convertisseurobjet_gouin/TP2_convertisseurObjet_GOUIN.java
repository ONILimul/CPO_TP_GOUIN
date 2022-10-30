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
        Scanner sc = new Scanner(System.in);//on créer le Scanner pour recueillir les réponses des utilisateurs
        // TODO code application logic here
        
        Convertisseur premierTest = new Convertisseur (); //on teste pour voir si le code fonctionne bien 
        System.out.println (premierTest.CelciusVersFarenheit(25));
        System.out.println (premierTest.FarenheitVersCelcius(77));
        
        Convertisseur secondTest = new Convertisseur (); // on effectue un second test
        System.out.println(secondTest.FarenheitVersKelvin(30));
        
        System.out.println(premierTest.toString()); //on affiche les résultats des tests
        System.out.println(secondTest.toString());
        
        //on va ensuite créer un programme plus beau et utilisable par quelqu'un
        System.out.println("\n Quelle conversion voulez vous faire ? \n CK (Celcius vers Kelvin) \n KC (Kelvin vers celcius) \n FC (Farenheit vers Celcius) \n CF (Celcius vers Farenheit) \n FK (Farenheit vers Kelvin) \n KF (Kelvin vers Farenheit)");
        String s = sc.nextLine();//on demande à l'utilisateur de répondre et il peut écrire sa réponse
        Convertisseur donneeUTILISATEUR = new Convertisseur(); //on créer une variable pour la demande de l'utilisateur
        //En fonction de la demande de l'utilisateur l'une des converstion sera faites et lui donnera le résultat
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
