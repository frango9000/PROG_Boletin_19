package PROG.Boletin19_2;
//@author fsancheztemprano

import java.util.Random;

public final class Notas {
    
    int[] notas;

    public Notas(int numeroDeNotas) {
        notas=new int[numeroDeNotas];
        randNotas();
    }
    
    
    public void randNotas(){
        Random rand = new Random();
        for(int i=0;i<notas.length ; i++){
            notas[i]=rand.nextInt(10);
        }
    }
    public static void mostrar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+" : "+array[i]);
        }
    }
    public void mostrar(){
        mostrar(notas);
    }
    
    public static int aprobados(int[] array){
        int aprobados=0;
        for(int ele :array){
            if (ele > 4)aprobados++;
        }
        return aprobados;    
    }
    public int aprobados(){
        return aprobados(notas);
    }
    public static int reprobados(int[] array){
        int reprobados=0;
        for(int nota :array){
            if (nota < 5)reprobados++;
        }
        return reprobados;    
    }
    public int reprobados(){
        return reprobados(notas);
    }
    public static float media(int[] array){
        int total=0, notas = 0;
        for(int nota : array){
            total+=nota;
            notas++;
        }
        return total/notas;
    }
    public float media(){
        return media(notas);
    }
    public static int indiceNotaMax(int[] array){
        int notaMax=0, indexMax=-1;
        for(int i = 0; i<array.length;i++){
            if(array[i]>notaMax){
                notaMax=array[i];
                indexMax=i;
            }
            
        }
        return indexMax;
    }
    public int indiceNotaMax(){
        return indiceNotaMax(notas);
    }
    public static int notaMax(int[] array){
        return array[indiceNotaMax(array)];
    }
    public int notaMax(){
        return notaMax(notas);
    }
    
}
