/**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * * */

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el tamaño del cuadrado");
        float elemento;
        elemento = leer.nextFloat();
        
        
        for (int i = 1; i <= elemento; i++) {
            for (int j = 1; j <= elemento; j++) {
                
                if (i>1 && i<elemento && j>1 && j<elemento) {
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }System.out.println("   ");  
        }
        
    }
    
}
