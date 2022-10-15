package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.print("Introduzca valor de N: ");
        num = leer.nextInt(); //supondremos que el número introducido tiene 5 cifras                                  
       
        int contador = 0;
        
        for (int i = 1; i < num+1; i++) {
            contador = contador + i;
            System.out.println(contador);
            contador = contador * 10;
        }
        
    }
        
        
}
