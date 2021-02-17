import java.util.Scanner;

public class ParenthesisGenerate {

    public static void generate(int left, int right, String s) {


        if(left > right) {
            return;
        }

        if (left == 0 && right == 0) {
            //print the string
            System.out.println(s);
            return;
        }

        if (left > 0) {
            //do recursive call
            generate(left - 1, right, s + "(");
        }

        if (right > 0) {
            //do recursive
            generate(left, right - 1, s + ")");

        }
    }

    public static void main(String[] args) {

        Sacnner sc = new Scanner(System.in);
        int n = next.Int();
        generate(n,n, "");

    }
}
