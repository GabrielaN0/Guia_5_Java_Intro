/**Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        
        System.out.println("");
        
        frase = frase.toUpperCase();
        System.out.println("La frase ingresada en mayuscula es: ");
        System.out.println(frase);
        
        System.out.println("");
        
        frase = frase.toLowerCase();
        System.out.println("La frase ingresada en minuscula es: ");
        System.out.println(frase);
        
    }
    
}
