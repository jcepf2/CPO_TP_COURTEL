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
        
        System.out.println(uneBiere) ; 
        
        BouteilleBiere unedeuxiemeBiere = new BouteilleBiere(" Leffe ", 6.6, " Abbaye de Leffe " ) ;
        unedeuxiemeBiere.lireEtiquette() ;
        
        System.out.println(unedeuxiemeBiere) ; 
        
        BouteilleBiere une3Biere = new BouteilleBiere( "Heineken", 5.0, "Cuvee Heineken");
        une3Biere.lireEtiquette() ;
        System.out.println(une3Biere) ; 
        
        BouteilleBiere une4Biere = new BouteilleBiere("Chouffe", 8.0, "Chouffe");
        une4Biere.lireEtiquette() ;
        
        System.out.println(une4Biere) ; 
                
        BouteilleBiere une5Biere = new BouteilleBiere("Dodo", 6.5, "Bourbon");
        une5Biere.lireEtiquette() ;
        
        System.out.println(une5Biere) ;         
        
        boolean variable ;
       
        variable = uneBiere.Decapsuler() ;
        
        System.out.println(variable) ;
        System.out.println(uneBiere) ;
          
    }
    
    
}
