
package com.mycompany.mae;
import java.util.Scanner;
import java.util.Arrays;

public class question5 {
     public static void main(String[] args) {
        int[][] array = new int[10][10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("for index " + i + " and index " + j + " enter a number:");
                array[i][j] = input.nextInt();
            }
        }

        for (int[] g : array) {
            System.out.println(Arrays.toString(g));
        }
     }
}
