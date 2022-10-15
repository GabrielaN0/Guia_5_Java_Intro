
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio3 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int año;
        int edad;
        String nombre;
        int resta;
        
        System.out.println("ingresa el año actual");
        año = leer.nextInt();
        
        System.out.println("Ingresa tu edad");
        edad = leer.nextInt();
        
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        
        resta = (año-edad);
        System.out.println("Tu nombre es "+ nombre + " y naciste en " + resta);
    }
    
}
