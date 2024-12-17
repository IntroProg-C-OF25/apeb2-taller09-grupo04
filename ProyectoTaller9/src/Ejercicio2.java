/***
 * Figura 2:
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame el limite del arbol navideño: ");
        n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/***
 * Dame el limite del arbol navide�o: 4
   *
  ***
 *****
*******
 */