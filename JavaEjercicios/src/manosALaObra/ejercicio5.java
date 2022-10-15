
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio5 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        boolean boo = false;
        double dou;
        char chart;
        int num;
        
        System.out.println("Si ingresa el numer 1 sera verdadero, miestras que 0 sera falso");
        num = leer.nextInt();
        
        System.out.println("Ingrea un numero entero");
        dou = leer.nextDouble();
        
        System.out.println("Ingresar maximo un caracter en minuscula");
        chart = leer.next().charAt(0);
        
        System.out.println("__________________________________________________");
        
        switch (num) {
            case 1:
                boolean verdadero;
                break;
            case 0:
                boolean falso;
                break;
            default:
                System.out.println("el numero ingresado es incorrecto!!");
                break;
        }
            
        System.out.println("El buleano ingresado es: " +boo);
        System.out.println("El numero double ingresados es: " +dou);
        System.out.println("El chart ingresados es: " +chart);
    }
    
}
