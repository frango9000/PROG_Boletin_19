package PROG.Boletin19_3;
//@author fsancheztemprano

import PROG.Boletin19_2.*;
//@author fsancheztemprano

//Carga un array  de tipo int, cas notas no módulo de programación ,dos 30 alumnos da clase de DAM .
public class App3 {
    public static void main(String[] args){
        
    Notas notas = new Notas(10);
    notas.mostrar();
    System.out.println(notas.nota("Alumno 3"));
    notas.mostrarFiltoIndices(notas.indexAprobados());
            
    }

}
