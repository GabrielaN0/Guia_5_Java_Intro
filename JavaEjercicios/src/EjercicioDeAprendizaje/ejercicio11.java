/**Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double num1, num2, resultado;
        int opcion;
        String resp = "";

        System.out.println("Por favor ingrese dos numeros enteros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {
            System.out.println("");
            System.out.println("    MENU:   ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion:");
            opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("La Suma es: " + resultado);
                    System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                    continue;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("La resta es: " + resultado);
                    System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                    continue;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("La multiplicacion es: " + resultado);
                    System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                    continue;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("La divicion es: " + resultado);
                    System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                    continue;
                case 5:
                    System.out.println("esta seguro que decea salir del programa?? s/n");
                    resp = leer.next();
                    break;
                default:
                    System.out.println("El numero ingresado no es valido; volver a elejir:");
                    System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                    continue;
            }

        } while (resp.equals("n"));

    }

}
