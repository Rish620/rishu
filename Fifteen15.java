package placement_questions;
import java.util.Arrays;
import java.util.Scanner;

public class Fifteen15 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
        	arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int temp[]= new int[n];
        int j=0;
        for(int i=0; i<n-1; i++)
        {
        	if(arr[i]!=arr[i+1])
        	{
        		temp[j]= arr[i];
        		j++;
        	}
        }
        temp[j]=arr[n-1];
        
        for(int i=0; i<n; i++)
        {
        	System.out.println(temp[i]);
        }
	}

}
