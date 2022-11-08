/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author jules
 */
public class épée extends Arme {
    int indice;

        public épée(String n, int attaque, int f) {
            super(n, attaque);

            if ((attaque>100) || (attaque<0)) {
                attaque=0; 
                }        
                else { 
                attaque = attaque;
                }
              
            if ((f>100) || (f<0)) {
                f=0 ;
                }   
                else { 
                indice = f;
                }  
            }
        }
 

        
