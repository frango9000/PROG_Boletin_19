package PROG.Boletin19_2;
//@author fsancheztemprano

//Carga un array  de tipo int, cas notas no módulo de programación ,dos 30 alumnos da clase de DAM .
public class App2 {
    public static void main(String[] args){
        
    Notas notas = new Notas(10);
    notas.mostrar();
    System.out.println("Aprobados: " +notas.aprobados());
    System.out.println("Reprobados: " +notas.reprobados());
    System.out.println("Nota media: " +notas.media());
    System.out.println("Nota mas alta: " +notas.notaMax());
            
    }

}
