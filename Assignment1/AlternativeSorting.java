// Alternative sorting Problem

import java.io.*;
import java.util.Arrays;

class AlternativeSorting
{

    static void sorting(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr);

        int i = 0, j = n-1;
        while (i < j) {
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }

        if ( n % 2 != 0)
            System.out.print(arr[i]);
    }

    /* Driver program to test above functions */
    public static void main (String[] args)
    {
        int arr[] = {1,7,6,3,2,4,9,12,};
        sorting(arr);
    }
}
