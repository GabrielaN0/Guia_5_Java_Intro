
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int tipoMotor;
        
        System.out.println("Ingrese el tipo de motor: ");
        System.out.println("1: bomba agua;");
        System.out.println("2: bomba gasolina;");
        System.out.println("3: bomba ormigon;");
        System.out.println("4: bomba pasta alimenticia;");
        
        tipoMotor = leer.nextInt();
        
        switch(tipoMotor){
            case 1:
                System.out.println("Exelente!! usted a seleccionado: La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("Exelente!! usted a seleccionado: La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("Exelente!! usted a seleccionado: La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("Exelente!! usted a seleccionado: La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        
    }
    
}
