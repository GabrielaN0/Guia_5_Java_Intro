/**Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

package EjercicioDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int centigrado;
        int fahre;
        
        System.out.println("Ingrese una cantidad de terminada de grados: ");
        centigrado = leer.nextInt();
        
        fahre = 32 + (9 * centigrado / 5);
        
        System.out.println("");
        System.out.println("Tus grados centigrados ingresados corresponden a: " + fahre + " en grados Fahrenheit");
       
    }
    
}
