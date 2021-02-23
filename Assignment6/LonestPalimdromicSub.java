package Assignment6;

import java.util.Scanner;

public class LonestPalimdromicSub {

    static int max (int x, int y) { return (x > y)? x : y; }


    static int largestPalimdromic(String seq)
    {
        int n = seq.length();
        int i, j, cl;

        int Result[][] = new int[n][n];

        for (i = 0; i < n; i++)
            Result[i][i] = 1;

        for (cl=2; cl<=n; cl++)
        {
            for (i=0; i<n-cl+1; i++)
            {
                j = i+cl-1;
                if (seq.charAt(i) == seq.charAt(j) && cl == 2)
                    Result[i][j] = 2;
                else if (seq.charAt(i) == seq.charAt(j))
                    Result[i][j] = Result[i+1][j-1] + 2;
                else
                    Result[i][j] = max(Result[i][j-1], Result[i+1][j]);
            }
        }

        return Result[0][n-1];
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String str = sc.next();
        int n = str.length();
        System.out.println("The length of the lps is "+ largestPalimdromic(str));
    }
}


