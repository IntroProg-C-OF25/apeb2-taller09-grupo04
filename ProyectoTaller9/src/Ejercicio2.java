import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lim, a = 1, b = 1, aux, prim = 2;
        System.out.print("Hasta dónde se imprimirá la serie Fibonacci? ");
        lim = in.nextInt();
        for (int i = 0; i < lim; i++) {
            System.out.print(a + "/" + prim);
            aux = a + b;
            a = b;
            b = aux;
            prim++;
            while (true) {
                boolean primV = true;
                for (int j = 2; j <= Math.sqrt(prim); j++) {
                    if (prim % j == 0) {
                        primV = false;
                        break;
                    }
                }
                if (primV) break;
                prim++;
            }
            if (i < lim - 1) {
                System.out.print(", ");
            }
        }
    }
}
