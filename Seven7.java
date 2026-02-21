package placement_questions;

import java.util.Scanner;

public class Seven7 {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	      
	   int n=sc.nextInt();
	   int []arr = new int[n];
	   int countp =0;
			    int countn=0;

	   for(int i=0; i<n; i++)
	   {    arr[i]=sc.nextInt();
		     if(arr[i]<= 0)
		     {
		    	 countp++;
		     }
			   

			   if(arr[i]>=0)
		     {
		    	 countn++;
		    	 
		     }
			   System.out.println("positive number "+countp);
               System.out.println("Negative Number"+countn);
	   }
               

}
}
