/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg4;

import Armes.épée;
import Armes.bâton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author jules
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    épée épée1 = new épée(" Excalibur ",7,5) ;
    épée épée2 = new épée(" Durandal ",4,7) ;
        
    bâton bâton1 = new bâton(" Chene ",4,5) ;
    bâton bâton2 = new bâton(" Charme ",5,6 ) ;
           
    System.out.println(épée1);
    System.out.println(épée2);
    System.out.println(bâton1);
    System.out.println(bâton2);
    
    ArrayList <Arme> n_Arme = new ArrayList <Arme>();
    n_Arme.add (épée1);
    n_Arme.add (épée2);
    n_Arme.add (bâton1);
    n_Arme.add (bâton2);
    
    int taille = n_Arme.size();
    int longueur = taille - 1;
    for (int i=0; i<longueur; i++) {
        System.out.println(n_Arme.get(i)+", ");
    }
    
System.out.println(n_Arme.get(taille-1));
    
    
    
    }
    
}
