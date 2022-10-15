/**Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double euros;
        int opcion;
        
        System.out.println("ingresar la cantidad de euros a convertir:");
        euros=leer.nextInt();
        
        do {  
            System.out.println("elija la moneda a convertir:");
            System.out.println("1: Libras");
            System.out.println("2: Dolares");
            System.out.println("3: Yenes");
            System.out.println("Para salir opcion 4");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    cambioDeMoneda(euros, "Libra");
                    break;
                case 2:
                    cambioDeMoneda(euros, "Dolar");
                    break;
                case 3:
                    cambioDeMoneda(euros, "Yenes");
                    break;
            }
            System.out.println("---------------------------------------");
            
        } while (opcion!=4);
        
        
    }
    
    public static void cambioDeMoneda(double euros, String convertir) {
        
        switch(convertir){
            case "Libra":
                System.out.println(euros + " de euros a: " + convertir + " son: " + (euros*0.87)+ " de Libras");
                break;
            case "Dolar":
                System.out.println(euros + " de euros a: " + convertir + " son: " + (euros*0.97)+ " de Dolares");
                break;
            case "Yenes":
                System.out.println(euros + " de euros a: " + convertir + " son: " + (euros*144.63)+ " de Yenes");
                break;
        }
        
        
        
    }
}
