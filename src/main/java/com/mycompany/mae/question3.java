
package com.mycompany.mae;
import java.util.Arrays;

public class question3 {
     public static void main(String[] args) {
       
        int [] num ={2,5,5,9,4,7,0,9,6,11,12};
        int sum = 0;
        int len = num.length-1;
        for(int i = 0; i < len; i++){
            sum += num[i];
        }
        float mean = sum / len;
        System.out.println("the mean is equals to" + " " + mean);
    
         Arrays.sort(num);
        double median;
        if (num.length % 2== 0) {
        int mid1=num[num.length / 2- 1];
        int mid2=num[num.length / 2];
        median =(mid1+mid2)/ 2.0;
        } else {
        median =num[num.length / 2];
        }
        System.out.println("Sorted numbers: " + Arrays.toString(num));
        System.out.println("Median: " + median);
        
         double summ=0;
 for (int number : num) {
 sum+=number;
 }
 double meann =summ/num.length;
 double varianceSum = 0;
 for (int number : num) {
 varianceSum+=Math.pow(number- meann, 2);
 }
 double variance = varianceSum / num.length;
 double standardDeviation = Math.sqrt(variance);
 System.out.println("Numbers: " + java.util.Arrays.toString(num));
 System.out.println("Mean: " + mean);
 System.out.println("Standard Deviation: " + standardDeviation);

    }
}
}
