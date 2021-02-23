//Climbing stairs

package Assignment6;

import java.util.Scanner;

public class ClimbingStair {
    static int climbStairs(int n) {

        if(n<=2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of steps ");
        int n = sc.nextInt();
        System.out.print("Number of ways to climb :"+climbStairs(n));
    }
}
