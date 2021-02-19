package Assignment3;

import java.util.Stack;

public class ReverseKgroupList {

        static Node Reverse(Node head, int k)
        {
            // Create a stack of Node*
            Stack<Node> mystack = new Stack<Node> ();
            Node current = head;
            Node prev = null;

            while (current != null)
            {

                int count = 0;
                while (current != null && count < k)
                {
                    mystack.push(current);
                    current = current.next;
                    count++;
                }

                
                while (mystack.size() > 0)
                {

                    if (prev == null)
                    {
                        prev = mystack.peek();
                        head = prev;
                        mystack.pop();
                    }
                    else
                    {
                        prev.next = mystack.peek();
                        prev = prev.next;
                        mystack.pop();
                    }
                }
            }

            // Next of last element will point to NULL.
            prev.next = null;

            return head;
        }

        /* UTILITY FUNCTIONS */
        /* Function to push a node */
        static void push( int new_data)
        {
            Node new_node = new Node(0);

            new_node.data = new_data;
            new_node.next = head;

       
            head = new_node;
        }

        /* Function to print linked list */
        static void printList(Node node)
        {
            while (node != null)
            {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        /* Driver code*/
        public static void main(String[] args)
        {
            push( 9);
            push( 8);
            push( 7);
            push( 6);
            push( 5);
            push(4);
            push(3);
            push(2);
            push( 1);

            System.out.println("Given linked list ");
            printList(head);
            head = Reverse(head, 3);
            System.out.println();

            System.out.println("Reversed Linked list ");
            printList(head);
        }
    }
