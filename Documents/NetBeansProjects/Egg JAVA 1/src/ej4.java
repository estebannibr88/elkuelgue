
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
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese una temperatura en Grados centígrados");
        
        int centigrados= leer.nextInt(); 
        
        int result = 32 + (9* centigrados /5);
        
        System.out.println(centigrados + "° en grados F es: " + result + "°");
        
        
        
    }
    
}
