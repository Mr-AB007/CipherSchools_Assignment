/* Finding two person will meet or not using RELATIVE formula */

import java.util.Scanner;

public class Meetingpoint {
    public  static void willMeet(int a, int b, int v1, int v2)
    {
        int R_dis = Math.abs(a-b);
        int R_v = Math.abs(v1-v2);
        if(a > b && v1 > v2)
            System.out.println("Never meet");
        else if (b > a && v2 > v1)
            System.out.println("Never Meet");
        else if (R_dis % R_v == 0)
            System.out.println("Meet");
        else
            System.out.println("Never Meet");
    }
    public static void main(String[] args) {
        int a,b,v1,v2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ethe starting point of First " );

        a = sc.nextInt();
        System.out.println("Entre the Velocity of first : ");
        v1 = sc.nextInt();

        System.out.println("Enter ethe starting point of First " );
        b = sc.nextInt();
        System.out.println("Entre the Velocity of frist : ");
        v2 = sc.nextInt();

        willMeet(a,b,v1,v2);//calling function


    }
}
