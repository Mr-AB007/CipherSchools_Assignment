package Assignment4;

import java.util.Stack;

class ReverseStack {

    static Stack<Character> stack = new Stack<>();

    static void insert_at_bottom(char x)
    {

        if(stack.isEmpty())
            stack.push(x);

        else
        {
            char a = stack.peek();
            stack.pop();
            insert_at_bottom(x);
            stack.push(a);
        }
    }

    static void reverse()
    {
        if(stack.size() > 0)
        {

            char x = stack.peek();
            stack.pop();
            reverse();
            insert_at_bottom(x);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');

        System.out.println("Original Stack");

        System.out.println(stack);
        reverse();

        System.out.println("Reversed Stack");

        System.out.println(stack);
    }
}
