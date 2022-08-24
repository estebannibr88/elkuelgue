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
public class ej6 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        
        int numero = leer.nextInt();
        
     
        
        if (numero % 2 == 0)
        {
          
            System.out.println("Este numero es par"); } 
        
        else { System.out.println("Este numero es impar");
            ;
        }
         ;     
                
    }
    
}
