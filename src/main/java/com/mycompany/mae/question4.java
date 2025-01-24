
package com.mycompany.mae;
import java.util.Scanner;
//Ekwere Daniel Richard
//23CD010182
//2300031
public class question4 {
    public static void main(String[] args) {
         int[] array = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("for index " + i + " enter a number:");
            array[i] = input.nextInt();
        }

        for (int x : array) {
            System.out.println(x);
        }
    }
}
