/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_courtel;

import java.util.Scanner;

/**
 *
 * @author jules
 */
public class TP2_convertisseurObjet_COURTEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc;
        sc = new Scanner(System.in);

        Convertisseur temp = new Convertisseur() ;
        
        System.out.println("Entrez l'unité de votre température en entrée:\n1 pour Ferenheit \n2 pour Celcius\n3 pour Kelvin ");
        int entrée = sc.nextInt ();
        
        System.out.println("Entrez l'unité que vous souhaitez :\n1 pour Ferenheit \n2 pour Celcius\n3 pour Kelvin ");
        int sortie = sc.nextInt ();
        
        System.out.println("Entrez la valeur de votre température");
        int c = sc.nextInt ();

        
        if (entrée==2 && sortie==3){
        double result1 = temp.CelciusVersKelvin(50);
        System.out.println(result1 + "K") ;
        }
        
        if (entrée==3 && sortie==2){
        double result2 = temp.KelvinVersCelcius(150);
        System.out.println(result2 + "°C") ;
        }
        
        if (entrée==3 && sortie==1){
        double result3 = temp.KelvinVersFarenheit(100);
        System.out.println(result3 + "°F") ;
        }
        
        if (entrée==1 && sortie==3){
        double result4 = temp.FarenheitVersKelvin(30);
        System.out.println(result4 + "K") ;
        }
        
        if (entrée==2 && sortie==1){
        double result5 = temp.CelciusVersFarenheit(84);
        System.out.println(result5 + "°F") ;
        }
        
        if (entrée==1 && sortie==2){
        double result6 = temp.FarenheitVersCelcius(45);
        System.out.println(result6 + "°C") ;
        }
    }
    
}
 