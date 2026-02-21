package placement_questions;

import java.util.Scanner;

public class Count_occurence_binary {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int arr[]= new int[n+1];
	boolean visited [] = new boolean[n]; 
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
	for(int i=0; i<n; i++)
	{
		if(visited[i]==true)
			continue;
		int count =1;
		for(int j=i+1; j<n; j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				visited[j]=true;
			}
		}
		System.out.println("Element:- "+arr[i]+"occurs:- "+count);

	}
	
}
}
