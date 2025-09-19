package placement_questions;

import java.util.Scanner;

public class Twenty20 {

	public static void main(String[] args) {
	
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n+1];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
	}       for(int i=0; i<n; i++)
	{
		for(int j=i; j<n; j++)
		{
			for(int k=i; k<=j; k++)
			{
				System.out.print(arr[k]);
			}
		}
		System.out.println();
	}
	}
}
