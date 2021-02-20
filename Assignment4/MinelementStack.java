//Get min elements from the stack in constant time. 

package Assignment4;

import java.util.*;

class MinelementStack
{
    Stack<Integer> stack;
    Integer min;

    // Constructor
    MinelementStack() { stack = new Stack<Integer>(); }

    // Prints minimum element of MyStack
    void getMin()
    {
        // Get the minimum number in the entire stack
        if (stack.isEmpty())
            System.out.println("Stack is empty");

            // variable minEle stores the minimum element
            // in the stack.
        else
            System.out.println("Minimum Element in the " +
                    " stack is: " + min);
    }

    // prints top element of MyStack
    void peek()
    {
        if (stack.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }

        Integer t = stack.peek(); // Top element.

        System.out.print("Top Most Element is: ");

        // If t < minEle means minEle stores
        // value of t.
        if (t < min)
            System.out.println(min);
        else
            System.out.println(t);
    }

    // Removes the top element from MyStack
    void pop()
    {
        if (stack.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = stack.pop();

        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < min)
        {
            System.out.println(min);
            min = 2*min - t;
        }

        else
            System.out.println(t);
    }

    // Insert new number into MyStack
    void push(Integer x)
    {
        if (stack.isEmpty())
        {
            min = x;
            stack.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        // If new number is less than original minEle
        if (x < min)
        {
            stack.push(2*x - min);
            min = x;
        }

        else
            stack.push(x);

        System.out.println("Number Inserted: " + x);
    }

    public static void main(String[] args)
    {
        MinelementStack stack = new MinelementStack();
        stack.push(3);
        stack.push(5);
        stack.getMin();
        stack.push(2);
        stack.push(1);
        stack.getMin();
        stack.pop();
        stack.getMin();
        stack.pop();
        stack.peek();
    }
} ;
