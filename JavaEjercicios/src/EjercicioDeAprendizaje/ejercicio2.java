
package EjercicioDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre completo: ");
        String nombre;
        nombre = leer.nextLine();
        
        System.out.println("");
        
        System.out.println("Tu nombre completo es: ");
        nombre = nombre.toUpperCase();
        System.out.println(nombre);
    }
    
}
