/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg4;

import Personnages.Personnage;
import Personnages.Guerrier;
import Personnages.Magicien;
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
    int longueur1 = taille - 1;
    for (int i=0; i<longueur1; i++) {
        System.out.println(n_Arme.get(i)+", ");
    }
    
System.out.println(n_Arme.get(taille-1));
    
    Magicien magicien1 = new Magicien(" Gandalf ",65, true) ;
    Magicien magicien2 = new Magicien(" Garcimore ",44,false) ;
        
    Guerrier guerrier1 = new Guerrier(" Conan ",78,true) ;
    Guerrier guerrier2 = new Guerrier(" Lannister ",45, false ) ;
           
    System.out.println(magicien1);
    System.out.println(magicien2);
    System.out.println(guerrier1);
    System.out.println(guerrier2);
    
    ArrayList <Personnage> n_Personnage = new ArrayList <Personnage>();
    n_Personnage.add (magicien1);
    n_Personnage.add (magicien2);
    n_Personnage.add (guerrier1);
    n_Personnage.add (guerrier2);
    
    int distance = n_Personnage.size();
    int longueur2 = distance - 1;
    for (int i=0; i<longueur2; i++) {
        System.out.println(n_Personnage.get(i)+", ");
    }
   
    Guerrier Guerrier3 = new Guerrier ("Henry", 85, false);
    Magicien Magicien3 = new Magicien ("Tom",69, false);
    
    bâton bâton3 = new bâton ("brindille",4, 3);
    bâton bâton4 = new bâton ("branche", 2, 4);
    bâton bâton5 = new bâton ("fleur", 1, 2);
    
    épée épée3= new épée ("Oli", 4, 3);
    épée épée4= new épée ("Dura", 1, 5);
    épée épée5= new épée ("poi", 8, 2);

    Guerrier3.Ajouter_Arme(bâton3) ;
    Guerrier3.Ajouter_Arme(épée3) ;
    Guerrier3.Ajouter_Arme(épée4) ;

    Magicien3.Ajouter_Arme(bâton4) ;
    Magicien3.Ajouter_Arme(épée5) ;
    Magicien3.Ajouter_Arme(épée5) ;
       
System.out.println(Arme.get(taille-1));
System.out.println(Personnage.get(taille-1));

      
}
}