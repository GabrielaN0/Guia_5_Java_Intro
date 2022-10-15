/**Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/

package EjercicioDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int doble;
        int triple;
        double raiz;
        
        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();
        
        doble = numero * 2;
        triple = numero * 3;
        raiz = Math.sqrt(numero);
        
        System.out.println("");
        
        System.out.println("El doble del numero es: " + doble);
        System.out.println("");
        System.out.println("El triple del numero es: " + triple);
        System.out.println("");
        System.out.println("La raiz del numero es: " + raiz);
        
    }
    
}
