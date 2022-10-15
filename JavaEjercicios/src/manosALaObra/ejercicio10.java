
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        String asterisco = "*";
        
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese 4 diferentes numeros entre 1 y 20");
            num = leer.nextInt();
            
            if (num>1 && num<20){
                for (int l = 0; l < num; l++){
                    System.out.printf("*");
                }
            }else{
                System.out.println("El numero no esta dentro de los parametros sujeridos");
                break;
            }
            System.out.println("");
        }
        
        
        
    }
    
}
