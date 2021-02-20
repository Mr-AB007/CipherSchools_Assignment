package Assignment4;

class ImplementStackinkedList {
    private Node head=null;

    public int pop() {
        if (head == null) {
            return 0;
        }
        int value = head.data;
        head = head.next;
        return value;
    }


    public void push(int value) {
        Node oldHead = head;
        head = new Node(0);
        head.data = value;
        head.next = oldHead;
    }

    public static void main(String args[])
    {   ImplementStackinkedList lls = new ImplementStackinkedList();
        lls.push(20);
        lls.push(50);
        lls.push(80);
        lls.push(40);
        lls.push(60);
        lls.push(75);
        System.out.println("Element removed from LinkedList: "+lls.pop());
        System.out.println("Element removed from LinkedList: "+lls.pop());
        lls.push(10);
        System.out.println("Element removed from LinkedList: "+lls.pop());
        printList(lls.head);
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}
