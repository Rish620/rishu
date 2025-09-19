package placement_questions;

import java.util.Scanner;

public class Insertion_sort {
  public static void main(String[] args) {
	  System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n+1];
		int temp=0;
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 1; i < n; i++) {
	        int key = arr[i];
	        int j = i - 1;

	       
	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
		}
		for(int i=0; i<n; i++)
		{
			System.out.println("arrays is sorted by insertion sort:- "+arr[i]);
		}
}
}
