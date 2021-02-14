/* Find the First and Last Occurance of A element */

import java.util.Scanner;

public class FirstandLastOccur {
    static void findFirstandLast(int arr[], int n)
    {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");
    }
    public static void main(String[] args) {
        System.out.println("Enter Size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array element");
        for(int i =0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Size");
        n = sc.nextInt();
        findFirstandLast(arr,n);
    }
}
