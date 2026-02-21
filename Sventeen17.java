package placement_questions;

import java.util.Scanner;

public class Sventeen17 {
	public static void movezeros1(int[] arr)
	{
		int k=0;
		int l=arr.length-1;
		while(k<l)
		{
			if(arr[k]==1 && arr[l]==0)
			{
				int t=arr[k];
				arr[k]=arr[l];
				k++;
				l--;
			}else if(arr[k]==0)
			{
				l++;
			}else {
				l--;
			}
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
	    movezeros1(arr);
         for(int i=0; i<n; i++)
         {
        	 System.out.println("Arrays after moving zeros: "+arr[i]);
         }
	}

}
