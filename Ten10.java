package placement_questions;

import java.util.Scanner;

public class Ten10 {
            
	static boolean isorted(int arr[])
	{
	    int n= arr.length;
	    for(int i=1; i<n; i++)
	    {
	    	if(arr[i-1] > arr[i])
	    	{
	    		return false;
	    	}
	    }
	    return true;
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
             if(isorted(arr))
             {
            	System.out.println("true");
             }
             else {
            	System.out.println("false");
             }
	}

}
