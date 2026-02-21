package placement_questions;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
           System.out.println("enter the number");
           Scanner sc = new Scanner(System.in);
    	   int sum=0, avg=0;
    	   int n=sc.nextInt();
    	   int []arr = new int[n];
    	   for(int i=0; i<n; i++)
    	   {
    		   arr[i]= sc.nextInt();
    		   sum+=arr[i];
    		   avg=sum/n;
    	   }
                    System.out.println("avg of array:-"+avg);
	}

}
