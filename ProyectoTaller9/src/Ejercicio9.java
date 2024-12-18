/***
 * Ejercicios 7
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar 
 * el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes 
 * estadísticas en función a los promedios obtenidos del ciclo por estudiantes 
 * (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar). 
notas
- Promedio del ciclo, del paralelo C. 
- Listado de estudiantes con su nota por encima del promedio. 
- Listado de estudiantes con su nota por debajo del promedio. 
- Estudiante con la mejor calificación. 
- Estudiante con la calificación mas baja. 
 * @author hp
 */
import java.util.Random;
public class Ejercicio9 {
    public static void main(String[] args) {
        int estudiantes = 28;
        double[] notas = new double[estudiantes];
        double suma = 0, pro, mejor = notas[0], peor = 11;
        int mejorEstudiante = 0, peorEstudiante = 0;
        Random random = new Random();
        for (int i = 0; i < estudiantes; i++) {
            notas[i] = (random.nextDouble() * 9) + 1;
        }
        for (int i = 0; i < estudiantes; i++) {
            suma += notas[i];
        }
        pro = suma / estudiantes;
        System.out.printf("Promedio del ciclo: %.2f\n", pro);
        System.out.println("\nListado de estudiantes con su nota por encima del promedio:");
        for (int i = 0; i < estudiantes; i++) {
            if (notas[i] > pro)
                System.out.printf("El estudiante %d: con nota de: %.2f\n", (i + 1), notas[i]);
        }
        System.out.println("\nListado de estudiantes con su nota por encima del promedio:");
        for (int i = 0; i < estudiantes; i++) {
            if (notas[i] < pro)
                System.out.printf("El estudiante %d: con nota de: %.2f\n", (i + 1), notas[i]);
        }
        for (int i = 1; i < estudiantes; i++) {
            if (notas[i] > mejor){
                mejor = notas[i];
                mejorEstudiante = i;
            }
        }
        for (int i = 1; i < estudiantes; i++) {
            if (notas[i] < peor){
                peor = notas[i];
                peorEstudiante = i;
            }
        }
        System.out.println("\nEstudiante con la mejor calificación:");
        System.out.printf("Estudiante %d: %.2f\n", (mejorEstudiante + 1), mejor);

        System.out.println("\nEstudiante con la calificación más baja:");
        System.out.printf("Estudiante %d: %.2f\n", (peorEstudiante + 1), peor);      
    }
}
/***
 *Promedio del ciclo: 5,85

 * Listado de estudiantes con su nota por encima del promedio:
 * El estudiante 1: con nota de: 6,43
 * El estudiante 2: con nota de: 8,31
 * El estudiante 3: con nota de: 9,81
 * El estudiante 4: con nota de: 6,39
 * El estudiante 5: con nota de: 8,23
 * El estudiante 6: con nota de: 6,78
 * El estudiante 7: con nota de: 8,74
 * El estudiante 8: con nota de: 7,77
 * El estudiante 10: con nota de: 6,08
 * El estudiante 17: con nota de: 7,86
 * El estudiante 20: con nota de: 9,11
 * El estudiante 21: con nota de: 6,15
 * El estudiante 24: con nota de: 7,06
 * El estudiante 25: con nota de: 8,11
 * El estudiante 27: con nota de: 8,27
 * El estudiante 28: con nota de: 6,86

 * Listado de estudiantes con su nota por encima del promedio:
 * El estudiante 9: con nota de: 1,91
 * El estudiante 11: con nota de: 1,27
 * El estudiante 12: con nota de: 4,27
 * El estudiante 13: con nota de: 5,66
 * El estudiante 14: con nota de: 3,71
 * El estudiante 15: con nota de: 3,27
 * El estudiante 16: con nota de: 2,46
 * El estudiante 18: con nota de: 5,49
 * El estudiante 19: con nota de: 4,97
 * El estudiante 22: con nota de: 3,67
 * El estudiante 23: con nota de: 3,01
 * El estudiante 26: con nota de: 2,10

 * Estudiante con la mejor calificaci�n:
 * Estudiante 3: 9,81

 * Estudiante con la calificaci�n m�s baja:
 * Estudiante 11: 1,27
 */
