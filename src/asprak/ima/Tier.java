package asprak.ima;

import java.util.Arrays;
import java.util.Scanner;

public class Tier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        int t1 = 0, t2 = 0, t3 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && i <= 4) {
                t1++;
                
                for (int j = 0; j < t1; j++) {
                    System.out.print("*");
                }
            } 

            if (arr[i] >= 5 && arr[i] <= 9) {
                t2++;
            
                for (int j = 0; j < t2; j++) {
                    System.out.print("*");
                }
            }
            

            if (arr[i] == 10) {
                t3++;
                
                for (int j = 0; j < t3; j++) {
                    System.out.print("*");
                }
            }
        }
    }
}
