/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_courtel;

/**
 *
 * @author jules
 */
public class TP2_relation_1_COURTEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles:\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra +"\n") ;
        
        bob.listedevoitures[0] = uneClio ; /*ajout d'une relation*/
        bob.listedevoitures[1] = une2008;
        bob.nbVoitures = 2 ;
        uneClio.Propri = bob ;
        une2008.Propri = bob;
        System.out.println("\nLa premiere voiture de Bob est: " + 
        bob.listedevoitures[0] + "\n\net la deuxieme est: " + bob.listedevoitures[1]);
        
        reno.listedevoitures[0] = uneClio ;
        reno.listedevoitures[2] = uneMicra;
        reno.nbVoitures = 1 ;
        uneAutreClio.Propri = reno ;
        uneMicra.Propri = reno;
        System.out.println("\nLa premiere voiture de Reno est: " + 
        reno.listedevoitures[0] + "\n\net la deuxieme est: " + reno.listedevoitures[2]);
    }
}
