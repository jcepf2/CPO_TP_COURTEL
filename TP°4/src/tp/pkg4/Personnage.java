/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4;

/**
 *
 * @author jules
 */
public class Personnage {
String Nom ;
int Niveau_Vie ;   

    public Personnage(String n, int pv) {
        Nom = n ;
        Niveau_Vie = pv;
    }

@Override
public String toString() {
String perso_a_retourner;

perso_a_retourner = " Ta classe est un " + Nom + "avec un nombre de point de vie égavalent à  " + Niveau_Vie; 
return perso_a_retourner;
}
}
