/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG.Boletin19_1;

import java.util.Random;

/**
 *
 * @author fsancheztemprano
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int[] array = new int[6];
        Random rand = new Random();
        for(int i = 0 ; i<array.length;i++){
            array[i]=rand.nextInt(50);
        }
        for(int i = array.length-1;i>=0;i--){
            System.out.println(i+" : "+array[i]);
        }
    }
}
