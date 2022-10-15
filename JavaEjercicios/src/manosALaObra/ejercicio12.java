
package manosALaObra;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Double num1;
        Double num2;
        
        System.out.println("ingrese dos numeros para saber si son multiplos");
        num1 = leer.nextDouble();
        num2 = leer.nextDouble();
        
        if (esMultiplo(num1, num2)) {
            System.out.println("Los numeros son multiplos");
        }else{
            System.out.println("Los numeros no son multiplos");
        }
        
    }
    
    public static Boolean esMultiplo(Double num1, Double num2) {
        
        boolean validar;
               
        if( num1 % num2 == 0 ){
            validar = Boolean.TRUE;
        } else {
            validar = Boolean.FALSE;
        }
        
        return validar;
    }
}
