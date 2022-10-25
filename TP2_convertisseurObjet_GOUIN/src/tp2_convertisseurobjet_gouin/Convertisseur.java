/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_gouin;

/**
 *
 * @author gouin
 */
public class Convertisseur {
    int nbConversions = 0 ;
    
    
    public Convertisseur () {
        
    }
    
    public double CelciusVersKelvin (double CK) {
        double CversK =CK + 273 ;
        
        return CversK ;
    }
    
    public double KelvinVersCelcius (double KC) {
        double KversC = KC - 273;
        
        return KversC;
    } 
    
    public double FarenheitVersCelcius (double FC) {
        double FversC = FC/33.8;
        
        return FversC;
    }
    
    public double CelciusVersFarenheit (double CF) {
        double CversF = CF*33.8;
        
        return CversF;
    }
    
    public double FarenheitVersKelvin (double FK) {
        double FversK = (FK/33.8)+273 ;
        
        return FversK;
    }
    
    public double KelvinVersFarenheit (double KF) { 
        double KversF = (KF-273)*33.8;
        
        return KversF;
    }
    
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;

    }
    
    
}
