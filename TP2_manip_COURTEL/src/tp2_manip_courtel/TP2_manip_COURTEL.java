/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_courtel;

/**
 *
 * @author jules
 */
public class TP2_manip_COURTEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        
        Tartiflette assiette3 = assiette2 ;
        // On a 2 assiette1&2 de Tartiflette, et on crée une 3ème assiette3 = assiette2
        
        System.out.println("nombre de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nombreb de calories de Assiette 3: " + assiette3.nbCalories) ;
        
        assiette2 = assiette1 ;
        assiette1 = assiette3 ;
        // les deux sont fausses : on ne peut pas entrer un objet dans une classe qui n'est pas la sienne
        
        Moussaka [] tableau = new Moussaka[10] ;
        
        for (int i = 0; i<10; i++) {
            tableau[i] = new Moussaka();
        }
    }
}

    
    
