//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);

            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }

            Node head = new Node(arr.get(0));
            Node tail = head;

            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }

            Solution ob = new Solution();
            Node[] result = ob.alternatingSplitList(head);
            printList(result[0]);
            printList(result[1]);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/
class Solution {
    // Function to split the linked list into two alternating lists
    Node[] alternatingSplitList(Node head) {
        
        if (head == null) return new Node[]{null, null};
        
        Node list1 = head;
        Node list2 = head.next;
        Node p1 = list1;
        Node p2 = list2;

        while (p1 != null && p2 != null) {
            if (p2.next != null) p1.next = p2.next;
            else p1.next = null;
            p1 = p1.next;

            if (p1 != null) p2.next = p1.next;
            else p2.next = null;
            p2 = p2.next;
        }
        
        return new Node[]{list1, list2};
    }
}
