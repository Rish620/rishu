package placement_questions;

import java.util.Scanner;

public class Twelev12 {

	public static void main(String[] args) {

		 System.out.println("enter the num");
         Scanner sc = new Scanner(System.in);

         int n= sc.nextInt();
         
         int arr[]= new int[n];
         
         for(int i=0; i<n; i++)
         {
        	 arr[i]=sc.nextInt();
        	 if(arr[i]<0)
        	 {
        	    arr[i]=0; 
        	   
        	 }
         }
         for(int i=0; i<n; i++)
         System.out.println(arr[i]);
       
	}

}
