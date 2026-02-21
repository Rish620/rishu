package placement_questions;

import java.util.LinkedList;
import java.util.Queue;

import collection.*;

public class Queue1 {
   public static void main(String[] args) {
         Queue<Integer> queue = new LinkedList<>();
          queue.add(1);
          queue.add(2);
          queue.add(3);
          queue.add(4);
           System.out.println(queue);
           queue.remove(3);
           System.out.println(queue);
   }
}
