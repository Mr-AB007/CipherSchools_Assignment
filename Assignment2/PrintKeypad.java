//print all possible Decodings of a given Digit Sequence according to old keypad system


package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintKeypad {


    public static String getValue(char c) {

        if (c == '1') {
            return "abc";
        }
        if (c == '2') {
            return "def";
        }
        if(c == '3') {
            return "ghi";

        }
        if(c == '4') {
            return "jkl";
        }
        if(c == '5') {
            return "mno";
        }
        if(c == '6') {
            return "pqrs";
        }
        if(c == '7') {
            return "tuv";
        }
        if(c == '8') {
            return "wxyz";
        }

        return "";
    }


    public static ArrayList<String> getAllCombinations(String input) { //2

        if(input.length() == 0) {

            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }

        String firstCharacterValue = getValue(input.charAt(0)); //def

        ArrayList<String> smallerproblemCombinations = getAllCombinations(input.substring(1)); // empty

        ArrayList<String> ans = new ArrayList<>();

        //n
        for(int i = 0; i < firstCharacterValue.length(); i++) {
            for(int j = 0; j < smallerproblemCombinations.size(); j++) {
                String output = firstCharacterValue.charAt(i) + smallerproblemCombinations.get(j);
                ans.add(output);
            }
        }
        return  ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the keypad ");
        String code = sc.next();
        ArrayList<String> decoded = getAllCombinations(code);


        for(String s : decoded) {
            System.out.println(s);
        }
    }
}
