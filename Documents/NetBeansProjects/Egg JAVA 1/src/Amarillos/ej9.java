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
public class ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una palabra que inicie con la letra A");
      
        
        
        String palabra = leer.nextLine();
      
        
      if ("a" .equals(palabra.substring(0,1)))
      
      { System.out.println("CORRECTO");   
  
      
       }
      else 
    {
      
   System.out.println("INCORRECTO");
              
              }
    }

}
