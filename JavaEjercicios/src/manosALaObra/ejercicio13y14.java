
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio13y14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String [] equipo = new String[5];
        
        System.out.println("Ingresa el nombre de los 5 jugadores");
        
        for (int i = 0; i < 5; i++) {
           equipo [i] = leer.nextLine();
        }
        
        System.out.println("Los jugadores son: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("[ " + equipo[i] + " ]");
        }
        
    }
    
}
