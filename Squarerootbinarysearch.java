package placement_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Squarerootbinarysearch {
          
         public static void main(String[] args) {
         System.out.println("Enter the number");
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int low, high, found=0;
         int arr[]= new int[n];
         for(int i=0; i<n; i++ )
        {
           arr[i]=sc.nextInt();
        }
        low=0;
        high=n-1;
        System.out.println("enter the num to find to Square");
        int key=sc.nextInt();
        int sqroot=key*key;
        while(low<=high)
        {
          int mid=(low+high)/2;
          if(arr[mid]==sqroot)
          {
            System.out.println("element found"+key);
            found =1;
            break;
          }
          else if(arr[mid]<key)
          {
            low=mid+1;
          }
          else{
            high=mid-1;
          }

        }
          
         }
       }

