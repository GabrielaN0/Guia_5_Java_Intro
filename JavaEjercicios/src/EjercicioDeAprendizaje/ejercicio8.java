/**Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/

package EjercicioDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese una frase de 8 caracteres");
        frase = leer.nextLine();

        while (frase.length()>8) {
            System.out.println("iNCORRECTO");
            System.out.println("");
            System.out.println("Ingrese una frase de 8 caracteres");
            frase = leer.nextLine();
            continue;
        }
        
        System.out.println("CORRECTO");

    }

}
