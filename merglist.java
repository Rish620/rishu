package placement_questions;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class merglist {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) current.next = l1;
        else current.next = l2;

        return dummy.next;
    }

  
    public static ListNode createList(Scanner sc, int n) {
        if (n == 0) return null;

        System.out.print("Enter value 1: ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter value " + i + ": ");
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        return head;
    }

   
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in first list: ");
        int n1 = sc.nextInt();
        System.out.println("Enter sorted elements for first list:");
        ListNode l1 = createList(sc, n1);

        System.out.print("Enter number of elements in second list: ");
        int n2 = sc.nextInt();
        System.out.println("Enter sorted elements for second list:");
        ListNode l2 = createList(sc, n2);

      
        System.out.println("Merged Linked List:");
        ListNode merged = mergeTwoLists(l1, l2);
        printList(merged);

        sc.close();
    }
}

