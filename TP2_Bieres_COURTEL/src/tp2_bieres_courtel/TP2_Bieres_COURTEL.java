/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_courtel;

/**
 *
 * @author jules
 */
public class TP2_Bieres_COURTEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        BouteilleBiere uneBiere = new BouteilleBiere(" Cuvee des trolls ",7.0," Dubuisson " ) ;
        uneBiere.lireEtiquette() ;
        uneBiere.Decapsuler() ;
        
        BouteilleBiere unedeuxiemeBiere = new BouteilleBiere(" Leffe ", 6.6, " Abbaye de Leffe " ) ;
        unedeuxiemeBiere.lireEtiquette() ;
        unedeuxiemeBiere.Decapsuler() ;
        
        BouteilleBiere une3Biere = new BouteilleBiere( "Heineken", 5.0, "Cuvee Heineken");
        une3Biere.lireEtiquette() ;
        une3Biere.Decapsuler() ;
        
        BouteilleBiere une4Biere = new BouteilleBiere("Chouffe", 8.0, "Chouffe");
        une4Biere.lireEtiquette() ;
        une4Biere.Decapsuler() ;
                
        BouteilleBiere une5Biere = new BouteilleBiere("Cap dona", 7.0, "Cap Dona");
        une5Biere.lireEtiquette() ;
        une5Biere.Decapsuler() ;
        
        system.out.println(uneBiere) ; 
        
        boolean test ;
        test = uneBiere.Décapsuleur():
        system.out.println(uneBiere)
    }
    
    
}
