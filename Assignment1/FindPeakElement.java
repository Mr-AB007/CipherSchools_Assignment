//Peak element in a array
import java.util.Scanner;

public class FindPeakElement {
    static int findPeak(int arr[]) {
        int n = arr.length;
        // First or last element is peak element
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;

        // Checking for every other element
        for (int i = 1; i < n - 1; i++) {

            // Checking if the neighbors are smaller
            if (arr[i] >= arr[i - 1] &&
                    arr[i] >= arr[i + 1])
                return i;
        }
        return 0;

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
        System.out.println("Peek Element "+ arr[findPeak(arr)]);

    }
}
