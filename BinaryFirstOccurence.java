package placement_questions;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryFirstOccurence {
      public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int low, high;
        int arr[]= new int[n];
        for(int i=0; i<n; i++ )
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to search");
        int key=sc.nextInt();
        Arrays.sort(arr);
        int found=0, count=0;
        low=0;
        high=n-1;
        while(low<high)
        {
          int mid=low+high/2;
           if(arr[mid]==key)
           {
                System.out.println("element to found in array"+key);
                found=1;
                break;
           }
           if(arr[mid]<key)
           {
            low=mid+1;
           }
           else{
            high=mid-1;
           }
        }

      }
}
