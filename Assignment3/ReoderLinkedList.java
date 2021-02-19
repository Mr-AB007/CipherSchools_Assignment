package Assignment3;

public class ReoderList {
    static Node head = new Node(0);

    public static void reorderList(Node A) {
        if(A==null)
            return;
        if(A.next==null || A.next.next==null)
            return;

        Node fast = A, slow = A, slower = null;
        while (fast != null && fast.next != null) {
            slower = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null, curr = slow, next = null;
        if (slower != null)
            slower.next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr = A;
        fast = null;
        slow = null;
        while (curr != null && prev != null) {
            fast = curr.next;
            curr.next = prev;
            slow = prev.next;
            prev.next = fast;
            curr = fast;
            slower = prev;
            prev = slow;
        }
        if(prev!=null)
            slower.next = prev;
    }

    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next= new Node(5);
        System.out.println("Before reoder");
        printList(head);
        reorderList(head);
        System.out.println("\nAfter Reoder ");
        printList(head);
    }


}
