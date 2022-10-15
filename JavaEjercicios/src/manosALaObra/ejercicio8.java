
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio8 {

    public static void main(String[] args) {
        
        Scanner  leer = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Ingresar una nota del 0 a 10");
        nota = leer.nextInt();
        
        while(nota<0 || nota>10){
            
            System.out.println("Ingresar una nota entre 0 y 10");
            nota = leer.nextInt();
            
        }
        
    }
    
}
