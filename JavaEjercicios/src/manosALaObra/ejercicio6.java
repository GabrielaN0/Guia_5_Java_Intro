
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("ingresar un numero de 0 a 50");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese un segundo numero de 0 a 50");
        num2 = leer.nextInt();
        
        if(num1<25 && num1>0 && num2<25 && num2>0){
            System.out.println("Ambos numeros son menores que 25");
        }else if(num1<25 && num1>0 || num2<25 && num2>0){
            System.out.println("Solo uno de tus numeros es menor que 25");
        }else {
            System.out.println("Ambos numeros son mayores que 25");
        }
    }  
}
