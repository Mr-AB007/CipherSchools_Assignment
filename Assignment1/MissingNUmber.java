//Find the missing number from array

class MissingNumber
{
    static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++)
        {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = {  2, 3,4,5 ,6,7};
        System.out.println(getMissingNo(arr, arr.length));
    }
}
