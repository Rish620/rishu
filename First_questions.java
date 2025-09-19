package placement_questions;

import java.util.Scanner;

public class First_questions {

	public static void main(String[] args) {
	   System.out.println("Enter the number");
	   Scanner sc = new Scanner(System.in);
	   int sum=0;
	   int n=sc.nextInt();
	   int []arr = new int[n];
	   for(int i=0; i<n; i++)
	   {
		   arr[i]= sc.nextInt();
		   sum+=arr[i];
	   }
                System.out.println("sum of array:-"+sum);
	}

}
