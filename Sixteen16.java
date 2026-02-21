package placement_questions;

import java.util.Scanner;

public class Sixteen16 {
	public static void movezeros(int[] arr)
	{
		int start=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[start]=arr[i];
				start++;
			}
		}
		while(start < arr.length)
		{
			arr[start++]=0;
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
	    movezeros(arr);
         for(int i=0; i<n; i++)
         {
        	 System.out.println("Arrays after moving zeros: "+arr[i]);
         }
	}

}
