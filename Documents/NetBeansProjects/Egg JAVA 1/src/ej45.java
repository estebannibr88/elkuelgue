
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esteban
 */
public class ej45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner leer = new Scanner (System.in);
 
        System.out.println("Ingrese un número");
    int numero= leer.nextInt();
    
        System.out.println("el doble es " + (numero*2) + " el triple es " + (numero * 3) + " y la raiz es " + (Math.sqrt(numero)) );
    
    
            
    }
    
}
