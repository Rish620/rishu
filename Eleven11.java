package placement_questions;

import java.util.Scanner;

public class Eleven11 {
         static boolean searchingfound(int arr[])
         { 
             Scanner sc = new Scanner(System.in);

        	 int n=arr.length;
        	
             System.out.println("enter the searching value");
             int k=sc.nextInt();
        	 for(int i=0; i<n; i++)
        	 {
        		 if(arr[i]==k)
        		 return true;
        	 }
        	 return false;
         }
	public static void main(String[] args) {
		 System.out.println("enter the num");
         Scanner sc = new Scanner(System.in);

         int n= sc.nextInt();
         
         int arr[]= new int[n];
         for(int i=0; i<n; i++)
         {
        	 arr[i]=sc.nextInt();
             
         }
         
         if(searchingfound(arr))
        	 System.out.println("found");
         else
        	 System.out.println("not found");
         
	}

}
