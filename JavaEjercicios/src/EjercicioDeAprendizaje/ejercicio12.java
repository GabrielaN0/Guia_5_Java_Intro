/**Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/

package EjercicioDeAprendizaje;

import java.util.Scanner;
/**
 *
 * @author Gaby
 */
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String cadenaIngresada;

        int contCorrectas = 0, contIncorrectas = 0;

        System.out.println("Ingresar cadena de 5 caracteres donde la primer letra es 'x' y la ultima es 'o': ");
        System.out.println("");
        System.out.println("Para finalizan ingrese '&&&&&' ");
        System.out.println("____________________________________________");
        
        do {
            System.out.println("Ingrese una cadena de hasta 5 caracteres");
            cadenaIngresada = leer.nextLine().toUpperCase();
            
            if (!cadenaIngresada.equals("&&&&&")) {
                if ((cadenaIngresada.substring(0, 1).equals("X")) && (cadenaIngresada.substring(4).equals("O")) && (cadenaIngresada.length()==5)) {
                        contCorrectas++;
                        System.out.println("Es igual a 5");
                        System.out.println("");
                } else {
                    contIncorrectas++;
                    System.out.println("Por favor revise la cantidad de caracteres ingresados");
                    System.out.println("");
                }
            }
        } while (!cadenaIngresada.equals("&&&&&"));

        System.out.println("Ingresos correctos: " + contCorrectas);

        System.out.println("Ingresos Incorrectos: " + contIncorrectas);
    }
}
