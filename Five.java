package placement_questions;

import java.util.*;

public class Five {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	   int n= sc.nextInt();
	   Integer arr[]= new Integer[n];
	   for(int i=0; i<n; i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   List<Integer> li = new ArrayList<>(Arrays.asList(arr));
	   Collections.reverse(li);
	   System.out.println("Reverse the number"+li);
      
}
}
