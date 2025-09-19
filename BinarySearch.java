package placement_questions;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int arr[]= new int[n+1];
	for(int i=0; i<n; i++)
	{
		arr[i]=sc.nextInt();
	}
	int li=0;
	int h=n-1;
	System.out.println("enter the number for mid");
	int element=sc.nextInt();
	while(li<h)
	{
	   int mi=li+h/2;
	   if(arr[mi]==element) {
		   System.out.println("element found:- "+mi);
		   break; 
	   } 
	   if(element>arr[mi])
	   {
		   li=mi+1;
	   }
	   else {
		   h=mi-1;
	   }
	}
	
}
}
