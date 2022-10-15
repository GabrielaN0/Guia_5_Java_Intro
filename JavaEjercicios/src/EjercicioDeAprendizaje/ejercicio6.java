/**Crear un programa que dado un numero determine si es par o impar.*/

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero para saber si es par o impar");
        num = leer.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero es par!");
        }else{
            System.out.println("El numero es impar!");
        }
        
    }
    
}
