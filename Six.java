package placement_questions;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		int arr1[]= new int [n];
		for(int i=0; i<n; i++)
		{
			arr[i]= sc.nextInt();
			arr1[i]=arr[i];
		}
		for(int i=0; i<n; i++)
		{
			System.out.println("copied element :-"+arr1[i]);
		}

	}

}
