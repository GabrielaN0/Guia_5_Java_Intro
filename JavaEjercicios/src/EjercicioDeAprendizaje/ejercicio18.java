/**Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/

package EjercicioDeAprendizaje;
/**
 *
 * @author Gaby
 */
public class ejercicio18 {

    public static void main(String[] args) {
        
        int limite = 3;
        
        int[][] matrizA = new int[limite][limite];
        int[][] matrizB = new int[limite][limite];
        

//cargo con valores aleatorios la matriz
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }

 //Genero la trspuesta  
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        System.out.println("");
        
//para mostra como queda la matriz
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
    }
       
}
