// Maximum-sum-such-that-no-two-elements-are-adjacent

package Assignment6;

import java.util.Scanner;

public class MaxSumNoAdjecentElement {
   static int maxSum(int arr[], int n)
    {
        int include = arr[0];
        int exclude = 0;
        int exclude_new;
        int i;

        for (i = 1; i < n; i++)
        {

            exclude_new = (include > exclude) ? include : exclude;


            include = exclude + arr[i];
            exclude = exclude_new;
        }


        return ((include > exclude) ? include : exclude);
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
        System.out.print("Max Sum is:"+maxSum(arr, arr.length));
    }
}
