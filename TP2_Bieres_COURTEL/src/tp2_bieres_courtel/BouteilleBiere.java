/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_courtel;

/**
 *
 * @author jules
 */
public class BouteilleBiere {
    
    String nom ;
    double degreAlcool ;
    String brasserie ;
    boolean ouverture ;
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie ) ;
 
    }
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom ;
        degreAlcool = unDegre ;
        brasserie = uneBrasserie ;
        
    }

    public boolean Decapsuler() {
        if (ouverture == false) {
            ouverture = true ; 
            System.out.println("Bière ouverte") ;
        }
        
        else {
            System.out.println("Absurde !!! La bière est déja ouverte") ;
                    ouverture = false ;
        }
        return false ;
    }
 
}
