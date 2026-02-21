package placement_questions;
class Node{
  int data;
  Node left;
  Node right;
  public Node(int data)
  {
    this.data=data;
  }
}
 class Binary{
    Node root;
  public void insert(int data)
  {
      root = new Node(data);
  }
 }


public class BInarytree1 {
   public static void main(String[] args) {
        Binary tree = new Binary();
          tree.insert(8);
   }
}
