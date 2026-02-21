package placement_questions;

import java.util.Scanner;

public class Stringplaindrome {
  public static void main(String[] args) {
    System.out.println("enter the string ");
    Scanner sc = new Scanner(System.in);  
    String n = sc.nextLine();
    String low=n.toLowerCase();
     String reversed = new StringBuilder(low).reverse().toString();
     if(n.equals(reversed))
     {
      System.out.println("is palindrome");
     }
     else{
      System.out.println("not palindrome");
     }
  }
}
