package placement_questions;

import java.util.Scanner;

public class Ninteen {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position you want to delete (1-based index):");
        int pos = sc.nextInt();

        if (pos < 1 || pos > n) {
            System.out.println("Invalid position!");
            return;
        }

        int arr1[] = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i == pos - 1)  
                continue;
            arr1[j++] = arr[i];
        }

        System.out.println("Array after deletion:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
