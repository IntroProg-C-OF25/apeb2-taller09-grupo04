/***
 * Figura 1:
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim;
        System.out.print("Dame el nivel de arbol: ");
        lim = teclado.nextInt();
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("* ");
            }   
            System.out.println("");
        }
    }
}
/***
 * Dame el nivel de arbol: 4
  * 
  * * 
  * * * 
  * * * * 
 */