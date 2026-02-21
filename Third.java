package placement_questions;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		      int max=0;
		      
		   int n=sc.nextInt();
		   int []arr = new int[n];
		   max=arr[0];
	
		   for(int i=0; i<n; i++)
		   {    arr[i]=sc.nextInt();
			   if(arr[i]>max)
			   {
				   max=arr[i];
			   }
		   }
	                System.out.println("maximum elemets in array:-" +max);

	}

}
