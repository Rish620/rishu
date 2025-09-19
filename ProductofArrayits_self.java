package placement_questions;

import java.util.Scanner;

public class ProductofArrayits_self {
  public static void main(String[] args) {
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0; i<n; i++)
    {
      int prod=1;
      for(int j=0; j<n; j++)
      {
         if(i!=j)
         {
          prod*=arr[i];
         }
      }
        arr[i]=prod;
    }
  
    for(int i=0; i<n; i++)
    {
      System.out.println("product of Arrays"+arr[i]);
    }
  }
}
