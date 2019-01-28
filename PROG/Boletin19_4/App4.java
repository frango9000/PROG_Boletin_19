package PROG.Boletin19_4;
//@author fsancheztemprano

import java.util.Scanner;

public class App4 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce numero de DNI: ");
        
        int numDNI = scan.nextInt();
        
        int checksum = numDNI % 23;
        
        char[] charDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letra = charDNI[checksum];
        
        System.out.printf("DNI es %d%c\n", numDNI, letra);
    }
}