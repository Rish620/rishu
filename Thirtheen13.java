package placement_questions;

import java.util.Scanner;

public class Thirtheen13 {

	public static void main(String[] args) {
	
		System.out.println("enter the num");
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        
        int arr[]= new int[n];
        
        for(int i=0; i<n; i++)
        {
       	 arr[i]=sc.nextInt();
        }
        
        int temp = arr[n-1];   
        for(int i=n-1; i>0; i--) {
        	arr[i] = arr[i-1]; 
        }
        arr[0] = temp;  
        
        for(int i=0; i<n; i++)
        {
        	 System.out.println(arr[i]);
        }
        
	}

}
