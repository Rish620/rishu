package placement_questions;

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
     int temp =n;
     int rev=0, rem;
     while(temp!=0)
     {
          rem = temp%10;
          rev=rev*10+rem;
          temp=temp/10;
     }
     if(n==rev)
     {
      System.out.println("Number is Palindrome");
     }
     else{
      System.out.println(" not palindrome");
     }
  }

}
