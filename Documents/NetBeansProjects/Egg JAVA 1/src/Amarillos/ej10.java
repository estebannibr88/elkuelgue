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
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        
       
       System.out.println(" Ingrese un numero limite");
       
        int limite = leer.nextInt();
        int i=0;
     
        while (i < limite ) 
        { System.out.println(" ingrese un numero a la suma ");
        
            int numeros= leer.nextInt();
        
            i= i + numeros;
             
    }        System.out.println("Listo");
    } 

}
