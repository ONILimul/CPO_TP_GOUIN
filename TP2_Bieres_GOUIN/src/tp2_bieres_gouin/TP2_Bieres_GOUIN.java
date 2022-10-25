/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_gouin;

/**
 *
 * @author gouin
 */
public class TP2_Bieres_GOUIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 
7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere Leffe = new BouteilleBiere ("Leffe", 6.6, "Abbaye de Leffe" ) ;
        Leffe.lireEtiquette();
        
        BouteilleBiere Skoll = new BouteilleBiere ("Skoll", 6.0, "Kronenbourg" ) ;
        Skoll.lireEtiquette();
        
        BouteilleBiere Desperado = new BouteilleBiere ("Desperado", 5.9, "Brasserie Heineken" ) ;
        Desperado.lireEtiquette();
        
        BouteilleBiere Corona = new BouteilleBiere ("Corona", 4.5, "La Cerveza Mas Fina" ) ;
        Corona.lireEtiquette();
        
        System.out.println(uneBiere.Décapsuler());
        System.out.println(Leffe.Décapsuler());
        System.out.println(uneBiere) ;
        
        BouteilleBiere Affligem = new BouteilleBiere ("Affligem", 6.8, "Bière belge d'Abbaye reconnue" ) ;
        Affligem.lireEtiquette();
        System.out.println(Affligem.Décapsuler());
        System.out.println(Affligem);
        
        BouteilleBiere la86 = new BouteilleBiere ("la86", 7.9, "Brasserie Difré" ) ;
        la86.lireEtiquette();
        System.out.println(la86.Décapsuler());
        System.out.println(la86);

        
        
        
        
        
    }
    
}
