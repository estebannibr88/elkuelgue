/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amarillos;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner (System.in);
        
       
        System.out.println("Ingrese una palabra de 8 letras");
        
        
       String palabra = leer.nextLine();
   
             
               
       if (palabra.length()== 8 ) 
           
           
       { 
           
           System.out.println("Perfecto, gracias");

       }
       
       else { 
           System.out.println("esta palabra no tiene 8 letras ");
       }
        
        
        
        
    }
    
}
