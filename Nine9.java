package placement_questions;

import java.util.Scanner;

public class Nine9 {

    public static void main(String[] args) {
   
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                smax = max;   
                max = arr[i]; 
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("second largest maximum in array :- " + smax);
    }
}
