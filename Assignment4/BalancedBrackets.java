//Are Brackets are balanced

package Assignment4;

import java.util.*;

 class BalancedBrackets {

    // function to check if brackets are balanced
    static boolean areBlanced(String brac)
    {

        Deque<Character> stack
                = new ArrayDeque<Character>();


        for (int i = 0; i < brac.length(); i++)
        {
            char x = brac.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }

    // Driver code
    public static void main(String[] args)
    {
        String expr = "([{}])())";

        // Function call
        if (areBlanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
