//Find the Kth smallest Numbers in unsorted Array

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class KthsmallestInArray {

    // driver program
    public static void main(String[] args)
    {
        System.out.println("Enter Size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array element");
        for(int i =0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Kth Smallest ");
        int k = sc.nextInt();
        Arrays.sort(arr);
        for(int i =0; i <=k ; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
