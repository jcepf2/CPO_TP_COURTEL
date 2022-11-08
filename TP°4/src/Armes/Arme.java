package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jules
 */
public class Arme {
String Nom ;
int Niveau_Attaque ;
   
    public Arme(String n, int attaque) {
        Nom = n ;
        Niveau_Attaque = attaque;
    }

@Override
public String toString() {
String arme_a_retourner;

arme_a_retourner = Nom + "avec une competence d'attaque " + Niveau_Attaque; 
return arme_a_retourner ;
}
}