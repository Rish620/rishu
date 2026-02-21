package placement_questions;

import java.util.*;

public class Four {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		   int min=0;
		   int n=sc.nextInt();
		   int []arr = new int[n];
		   min=arr[0];
		   for(int i=0; i<n; i++)
		   {
			   arr[i]= sc.nextInt();
			   
		   }
		   Arrays.sort(arr);
	                System.out.println("minimum of array "+arr[0]);	
     
	}

}
