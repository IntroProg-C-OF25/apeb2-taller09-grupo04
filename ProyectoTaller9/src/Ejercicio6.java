/***
 * Ejercicio 4
 + Dado el arreglo; determinar cuantos elementos están arriba de la media 
 * aritmética y cuantos están por debajo de la medía aritmética.
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0, debajoMedia = 0, arribaMedia = 0;
        double media;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        media = suma / arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                arribaMedia++;
            } else if (arreglo[i] < media) {
                debajoMedia++;
            }
        }
        System.out.println("La media aritmetica es: " + media);
        System.out.println("Elementos que estan por encima de la media aritmetica es: " + arribaMedia);
        System.out.println("Elementos que estan por debajo de la media aritmetica es: " + debajoMedia);
    }
}
/***
 * La media aritmetica es: 9.0
 * Elementos que estan por encima de la media aritmetica es: 8
 * Elementos que estan por debajo de la media aritmetica es: 4
 */
