
package manosALaObra;

import java.util.Scanner;

/**
 *
 * @author Gaby
 */
public class ejercicio11 {

    public static String codificacion(String laFrase) {
        
        String fraseModificda = "";
 
        for (int i = 0; i < laFrase.length(); i++) {
            
            switch(laFrase.substring(i,i+1)) {                  //substring:Devuelve una cadena que es una subcadena de esta 
                case "a":                                       //cadena. La subcadena comienza en el índice inicial especificado 
                    fraseModificda = fraseModificda + "@";      //y se extiende hasta el carácter en el índice final del índice - 1.                                          
                    break;                                      //Por lo tanto, la longitud de la subcadena es endIndex-beginIndex.        
                case "e":
                    fraseModificda = fraseModificda + "#";      
                    break;    
                case "i":
                    fraseModificda = fraseModificda + "$";
                    break;
                case "o":
                    fraseModificda = fraseModificda + "%";
                    break;
                case "u":
                    fraseModificda = fraseModificda + "*";
                    break;
                default:
                    fraseModificda = fraseModificda + laFrase.substring(i,i+1);
            }
        }
        return fraseModificda;
    }

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase que finalice con un punto");
        
        
        String fraseIngresada = leer.nextLine().toLowerCase();
        System.out.println("");
        
        System.out.println("la frase ingresada es: ");
        System.out.println(fraseIngresada);
        System.out.println("");
        
        System.out.println("la frase modificada es: ");
        System.out.println( codificacion(fraseIngresada));
        
    }
    
}
