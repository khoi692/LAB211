/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

import java.util.Random;

/**
 *
 * @author khois
 */
public class BubbleSort {
    public static int[] getArrayNumbers(int n) {
        Random rd = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rd.nextInt(n);
        }
        return array;
    }
    
    public static void display(int[] array, String msg) {
        
        System.out.print(msg);
        System.out.print("[");
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i != n-1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }
    }
    
    public static int[] doBubbleSort(int[] array) {
        
    }
}
