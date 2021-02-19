package Assignment3;

public class IntersectionPoint {
    public static Node getIntersectionNode(Node headA, Node headB) {
        if(headA==null || headB==null) return null;
        Node a = headA;
        Node b = headB;
        int x = 0;
        while(x<3){
            while(a!=null && b!=null){
                if(a.data ==b.data) return a;
                b = b.next;
                a = a.next;
            }
            if(a  == null )  a = headB;
            else b = headA;
            x++;
        }
        return null;
    }

    public static void main(String[] args)
    {

        // creating first linked list
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);

        // creating second linked list
        Node head2 = new Node(10);
        head2.next = new Node(15);
        head2.next.next = new Node(30);
        Node a = getIntersectionNode(head1,head2);
        System.out.println("The node of intersection is " + a.data);
    }
}
