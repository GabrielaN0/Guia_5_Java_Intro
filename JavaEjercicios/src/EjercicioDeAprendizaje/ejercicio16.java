/**Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int vector [] = new int[10];
        
                
        for (int i = 0; i < 9; i++) {
            vector [i]= (int) (Math.random()*20+1);
        }
        
        System.out.println("ingrese un numero del 1 al 20 para saber si se encuentra en el vector: ");
        numero=leer.nextInt();
        
        for (int i = 0; i < 9; i++) {
            System.out.println(vector[i]);
            
            if(vector [i]== numero ){
                System.out.println("El numero se encuentra en el vector!");
            }else{
                System.out.println("El numero no se encuentra en el vector!");   
            }
            
        }
        
    }
    
}
