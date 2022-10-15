/**Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/

package EjercicioDeAprendizaje;
/**
 *
 * @author Gaby
 */
public class ejercicio19 {

    public static void main(String[] args) {

        int[][] mat = new int[3][3];
        relleno(mat);
        mostrar(mat);
        System.out.println("---------------------");
        int[][] matB = transv(mat);
        validar(mat, matB);
    }

    public static void relleno(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 5);
            }
        }
    }

    public static void mostrar(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] transv(int[][] a) {
        int[][] matB = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                matB[i][j] = a[j][i] * -1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + matB[i][j]);
            }
            System.out.println("");
        }
        return matB;
    }

    public static void validar(int[][] a, int[][] b) {
        boolean val;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == b[j][i]) {
                    val = true;
                } else {
                    val = false;
                }
            }
        }
        if (val = true) {
            System.out.println("Es una matriz anti simetrica");
        } else {
            System.out.println("No es una matriz anti simetrica");
        }

    }
}
