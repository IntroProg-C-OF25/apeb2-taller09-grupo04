/***
 * Ejercicios 6:
Analice el siguiente código
Scanner entrada = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
String inicial;
boolean bandera = true;
while(bandera){
    System.out.println("Ingrese una letra");
    inicial = entrada.nextLine();
 }
 * Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese 
* por teclado una letra que coincida con la primera letra de los "nombres" 
* contenidos en del arreglo **estudiantes**. Debe usar un ciclo repetitivo para 
* recorrer el arreglo **estudiantes**, y no quemar de forma constante dichas iniciales, 
* imagine que **estudiantes** podría contener millón de nombres, por lo que fijar iniciales, es ineficiente.
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra: ");
            inicial = teclado.nextLine().toUpperCase();
            for (String estudiante : estudiantes){
                if (estudiante.substring(0, 1).toUpperCase().equals(inicial)){
                System.out.println("Coincidencia con el nombre: " + estudiante);
                bandera = false;
                break;
                }
            }
            if (bandera)
                System.out.println("No se encontró ninguna coincidencia con ninguna letra. Intente nuevamente.");
        }
    }
}
/***
 * Ingrese una letra: g
 * No se encontr� ninguna coincidencia con ninguna letra. Intente nuevamente.
 * Ingrese una letra: h
 * Coincidencia con el nombre: Hogan
 */
