package placement_questions;

import java.util.Arrays;
import java.util.Scanner;

public class MergSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of arrays: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        int arr1[] = new int[n];

        System.out.println("Enter first array (sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter second array (sorted): ");
        for (int j = 0; j < n; j++) {
            arr1[j] = sc.nextInt();
        }

        int merg[] = new int[arr.length + arr1.length];
        int i = 0, j = 0, k = 0;

        // merge logic
        while (i < arr.length && j < arr1.length) {
            if (arr[i] <= arr1[j]) {
                merg[k++] = arr[i++];
            } else {
                merg[k++] = arr1[j++];
            }
        }

        // copy remaining elements
        while (i < arr.length) {
            merg[k++] = arr[i++];
        }
        while (j < arr1.length) {
            merg[k++] = arr1[j++];
        }

        System.out.println("Merged Array: " + Arrays.toString(merg));
    }
}
