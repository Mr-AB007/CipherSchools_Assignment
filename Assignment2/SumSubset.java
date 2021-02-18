package Assignment2;


import java.util.ArrayList;

public class SumSubsetArray {
    
    public static void generateAllSubsets(int [] arr, int begining, ArrayList<Integer> ans) {

        int sum = 0;
        for(int i = 0; i < ans.size(); i++) {
            sum += ans.get(i);
        }
        if(sum != 0)
        System.out.println(sum+ " ");

        for(int i = begining; i < arr.length; i++) {
            ans.add(arr[i]);
            generateAllSubsets(arr, i + 1, ans);
            ans.remove(ans.size() - 1);
        }
    }


    public static void main(String[] args) {

        int arr[] = {4,2,3};
        generateAllSubsets(arr, 0, new ArrayList<>());
    }
}
