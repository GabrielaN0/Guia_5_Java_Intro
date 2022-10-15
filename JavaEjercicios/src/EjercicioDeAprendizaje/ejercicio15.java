/**Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio15 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int [] num = new int[100];
        
        for (int i = 0; i < 100; i++) {
           num[i] = i+1;
        }
        
        for (int i = 100; i >= 1; i--) {
            System.out.println(num[i-1]);
        }
        
    }
    
}
