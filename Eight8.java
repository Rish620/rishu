package placement_questions;

import java.util.Scanner;

public class Eight8 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		      
		   int n=sc.nextInt();
		   int []arr = new int[n];
		   
	        int count=0;
		   for(int i=0; i<n; i++)
		   {    arr[i]=sc.nextInt();
			    if(arr[i]%2==0)
			    {
			    	count++;
			    }
			    else {
			    	System.out.println("odd number in arrays"+count);
			    }
		   }
                  System.out.println("Total even no in array"+count);
	}

}
