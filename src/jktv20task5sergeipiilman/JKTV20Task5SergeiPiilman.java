/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task5sergeipiilman;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV20Task5SergeiPiilman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int a = 50;
        int b = 100;
        int[][] arrayPro = new int[5][];
        arrayPro[0] = new int[3];
        arrayPro[1] = new int[5];
        arrayPro[2] = new int[7];
        arrayPro[3] = new int[8];
        arrayPro[4] = new int[9];
        for(int i = 0; i < arrayPro.length; i++){
            for(int j = 0; j < arrayPro[i].length; j++){
                arrayPro[i][j] = ((int)(Math.random() * 50)+50);
            }
        }
        //вывод несортированного зубчатого массива
        System.out.println("ArrayPro(unsorted) = ");
        for(int i = 0; i < arrayPro.length; i++){
            System.out.print(Arrays.toString(arrayPro[i]));
            System.out.println();
        }
        //вывод сортированного зубчатого массива
        boolean isSorted = false;
        int buf;
        while (!isSorted) {            
            isSorted = true;
            for (int i = 0; i < arrayPro.length-1; i++) {
                for(int j = 0; j < arrayPro[i].length-1; j++){
                    if(arrayPro[i][j] > arrayPro[i][j+1]){
                        isSorted = false;
                        buf = arrayPro[i][j];
                        arrayPro[i][j] = arrayPro[i][j+1];
                        arrayPro[i][j+1] = buf;
                    }  
                }
            }
        }
        System.out.println("ArrayPro(sorted) = ");
        for(int i = 0; i < arrayPro.length; i++){
                System.out.print("[");
            for(int j = 0; j < arrayPro[i].length; j++){
                System.out.print(arrayPro[i][j]);
                System.out.print(", ");
            }
            System.out.print("]");
            System.out.println();
        }
        
    }
}
