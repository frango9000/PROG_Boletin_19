package PROG.Boletin19_3;
//@author fsancheztemprano

import java.util.Random;

public final class Notas {

    int[] notas;
    String[] alumnos;

    public Notas(int numeroDeNotas) {
        notas = new int[numeroDeNotas];
        alumnos = new String[numeroDeNotas];
        randNotas();
        nombreAlumnos();
    }

    public void randNotas() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextInt(10);
        }
    }

    public void nombreAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = "Alumno" + i;
        }
    }

    public static void mostrar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " : " + array[i]);
        }
    }

    public static void mostrar(int[] arrayA, String[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(i + " : " + arrayA[i] + " : " + arrayB[i]);
        }
    }

    public void mostrar() {
        mostrar(notas, alumnos);
    }

    public void mostrarFiltoIndices(int[] indices) {
        for (int i = 0; i < indices.length; i++) {
            System.out.println(indices[i] + " : " + notas[indices[i]] + " : " + alumnos[indices[i]]);

        }
    }

    public int indiceDeAlumno(String alumno) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumno.equalsIgnoreCase(alumnos[i])) {
                return i;
            }
        }
        return -1;
    }

    public int notaDeAlumno(String alumno) {
        return notas[indiceDeAlumno(alumno)];
    }

    public static int countAprobados(int[] array) {
        int aprobados = 0;
        for (int ele : array) {
            if (ele > 4) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public int countAprobados() {
        return countAprobados(notas);
    }

    public static int countReprobados(int[] array) {
        int reprobados = 0;
        for (int nota : array) {
            if (nota < 5) {
                reprobados++;
            }
        }
        return reprobados;
    }

    public int countReprobados() {
        return countReprobados(notas);
    }

    public static int[] indexAprobados(int[] array) {
        int[] indexAprobados = new int[countAprobados(array)];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] > 4) {
                indexAprobados[j] = i;
                j++;
            }
        }
        return indexAprobados;
    }

    public int[] indexAprobados() {
        return indexAprobados(notas);
    }

    public static int[] indexReprobados(int[] array) {
        int[] indexReprobados = new int[countReprobados(array)];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] < 5) {
                indexReprobados[j] = i;
                j++;
            }
        }
        return indexReprobados;
    }

    public int[] indexReprobados() {
        return indexReprobados(notas);
    }

    public static float media(int[] array) {
        int total = 0, notas = 0;
        for (int nota : array) {
            total += nota;
            notas++;
        }
        return total / notas;
    }

    public float media() {
        return media(notas);
    }

    public static int indiceNotaMax(int[] array) {
        int notaMax = 0, indexMax = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > notaMax) {
                notaMax = array[i];
                indexMax = i;
            }

        }
        return indexMax;
    }

    public int indiceNotaMax() {
        return indiceNotaMax(notas);
    }

    public static int notaMax(int[] array) {
        return array[indiceNotaMax(array)];
    }

    public int notaMax() {
        return notaMax(notas);
    }

}
