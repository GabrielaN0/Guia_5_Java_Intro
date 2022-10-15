
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio9 {

    public static void main(String[] args) {
        
        Scanner  leer = new Scanner(System.in);
        
        double num;
        double suma = 0;
        
        do {
            System.out.println("Ingrese un nro enteo, positivo o negativo: ");
            num = leer.nextDouble();
            
            if (num<0){
                
            } else {
            suma = num + suma;
            }
            
        }while(num!=0);
        
        System.out.println("se capturo el numero cero");
        
        System.out.println("la suma de los numeros positivos es: " + suma );
    }
    
}
