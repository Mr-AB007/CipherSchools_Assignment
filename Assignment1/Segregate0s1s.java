/* Program for Segregate 0s and 1s in an array */

import java.util.Scanner;


public class Segretgate0s1s {

    public static  void sorting(int arr[])
    {
        int i=0,j= arr.length - 1;

        while( j > i)
        {
            if(arr[i] == 1)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j --;
            }
            else
            i++;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int [] arr = new int[n];
        for (int i= 0; i < n;i++)
            arr[i] = sc.nextInt();
        sorting(arr);

        for (int i:arr ){
            System.out.print(i+ " ");
        }
    }
}
