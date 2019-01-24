package PROG.Boletin19_3;
//@author fsancheztemprano

import PROG.Boletin19_2.*;
import java.util.Arrays;
import java.util.Scanner;
//@author fsancheztemprano

public class App3 {

    public static void main(String[] args) {

        Notas notas = new Notas(10);
        notas.mostrar();
        
        System.out.println(notas.notaDeAlumno("Alumno3"));
        
        notas.mostrarFiltoIndices(notas.indexAprobados());
        
        System.out.println(Arrays.toString(ArraysLib.arrayOrdenado(notas.notas)));
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe el nombre del alumno : ");
        String nombre = scan.next();        
        System.out.println(notas.notaDeAlumno(nombre));

    }

}
