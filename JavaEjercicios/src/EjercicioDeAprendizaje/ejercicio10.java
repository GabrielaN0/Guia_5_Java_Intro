/**Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int limite, num, suma;
        
        System.out.println("Ingrese un numero limite");
        limite = leer.nextInt();
        
        System.out.println("El programa ahora le pedira numeros aleatoriamente hasta llegar al limite ingresado");
        suma=0;
        
        do {
            num = leer.nextInt();
            suma = num + suma;
            continue;
        } while (suma<limite);
        
        
    }
    
}
