//Min Jump to reach end DP
package Assignment6;

import java.util.Scanner;

public class MinJumptoEnd {

         static int minJumps(int[] arr, int n)
        {

            int jumps[] = new int[n];

            int i, j;


            if (n == 0 || arr[0] == 0)
                return Integer.MAX_VALUE;

            jumps[0] = 0;


            for (i = 1; i < n; i++) {
                jumps[i] = Integer.MAX_VALUE;
                for (j = 0; j < i; j++) {
                    if (i <= j + arr[j]
                            && jumps[j]
                            != Integer.MAX_VALUE) {
                        jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                        break;
                    }
                }
            }
            return jumps[n - 1];
        }


        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size of array");
            int n = sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter the Elements of array");
            for(int i = 0; i <n ;i++)
                arr[i]= sc.nextInt();
            System.out.println("Minimum number of jumps to reach end is : "
                    + minJumps(arr, arr.length));
        }
    }
