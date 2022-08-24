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
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la palabra clave");
        
String palabra = leer.nextLine();
String clave = "eureka";

if (palabra.equals(clave)) {
    
    System.out.println("eureka!, hasta la proxima");
   }  else  {  System.out.println("Palabra incorrecta");   
        
    } 
    }
}
 
