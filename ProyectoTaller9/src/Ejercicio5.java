
import java.util.Scanner;

public class Ejercicio5 {

    /* Declaración de nueva función
     ¿Por qué? Porque no hallé otra solución, usé diferentes métodos pero no dieron resultado
     Lo que se realiza es declarar una nueva función (letra) con 2 argumentos: nom (cadena) y k (entero)
     Tras ello se usa nom.charAt para obtener la posición del carácter en la cadena especificada.
     */
    public static char
            letra(String nom, int ind) {
        return nom.charAt(ind);
    }

    public static void main(String[] args) {
        int lim, marc = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de marcas que desea ingresar: ");
        lim = in.nextInt();
        String[] nom = new String[lim];
        for (int i = 0; i < lim; i++) {
            System.out.print("Ingrese el nombre de la marca " + (i + 1) + ": ");
            nom[i] = in.next();
            char ch = letra(nom[i], 0);
            if (ch == 'A') {
                System.out.println("Nombre de marca inválido");
                marc--;
            }
            if (ch == 'C') {
                System.out.println("Nombre de marca inválido");
                marc--;
            }
            if (ch == 'T') {
                System.out.println("Nombre de marca inválido");
                marc--;
            }
            marc++;
        }
        System.out.println("Cantidad de marcas contabilizadas: " + marc);
        }
    }
/*
run:
Ingrese la cantidad de marcas que desea ingresar: 
3
Ingrese el nombre de la marca 1: Ford
Ingrese el nombre de la marca 2: Tesla
Nombre de marca inv�lido
Ingrese el nombre de la marca 3: Volkswagen
Cantidad de marcas contabilizadas: 2
BUILD SUCCESSFUL (total time: 12 seconds)
*/