/**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio20 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int sumaF = 0;
        int sumaC = 0;
        int sumaD = 0;
        System.out.println("Ingrese valores de matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Elemento[" + i + "][" + j + "] ");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] <= 0 || matriz[i][j] >= 10);
            }
        }
        System.out.println("Los valores de matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
                sumaF += matriz[0][j];
                sumaC += matriz[i][0];
                sumaD += matriz[i][i];
            }
            System.out.println(" ");
        }
        if (sumaF == sumaC && sumaC == sumaD) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La Matriz no es magica");
        }
    }
}
