/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_courtel;

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
        
        Convertisseur temp = new Convertisseur() ;
        
        double result1 = temp.CelciusVersKelvin(50);
        System.out.println(result1 + "K") ;
        
        double result2 = temp.KelvinVersCelcius(150);
        System.out.println(result2 + "°C") ;
        
        double result3 = temp.KelvinVersFarenheit(100);
        System.out.println(result3 + "°F") ;
        
        double result4 = temp.FarenheitVersKelvin(30);
        System.out.println(result4 + "K") ;
        
        double result5 = temp.CelciusVersFarenheit(84);
        System.out.println(result5 + "°F") ;
        
        double result6 = temp.FarenheitVersCelcius(45);
        System.out.println(result6 + "°C") ;
    }
}
 