
package EjercicioDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio1 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese los dos numeros a sumar: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de ambos numeros es:  "+suma);
    }
    
}
