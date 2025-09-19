package placement_questions;

import java.util.Scanner;

public class Eight18 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n+1];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the positions");
		int pos=sc.nextInt();
        System.out.println("Enter the Data");
        int data=sc.nextInt();
        for(int i=n; i>pos; i--)
        {
        	arr[i]=arr[i-1];
        }
        arr[pos]=data;
        n++;
        for(int i =0; i<n; i++)
        {
        	System.out.println(arr[i]+" ");
        }
	}

}
