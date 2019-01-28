package PROG.Boletin19_3;

import java.util.Arrays;
import java.util.Scanner;
//@author fsancheztemprano

public class App3 {

    public static void main(String[] args) {

        System.out.println("Mostrar Notas: ");
        Notas notas = new Notas(10);
        notas.mostrar();
        
        System.out.println("\nAlumno 3 nota: " + notas.notaDeAlumno("Alumno3"));
        
        System.out.println("\nAprobados: ");
        notas.mostrarFiltoIndices(notas.indexAprobados());
        
        System.out.println("\nNotas Ordenadas:");
        System.out.println(Arrays.toString(notas.notasOrdenadas()));
        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe el nombre del alumno : ");
        String nombre = scan.nextLine();        
        
        System.out.println("Nota del alumno : " + nombre + " : " + notas.notaDeAlumno(nombre));
        
        System.out.println("Mostrar Notas: ");
        notas.mostrar();
    }
}
