
// 121 means abu,au,la means 3 decoding
package Assignment2;

import java.util.Scanner;

public class Decoding {

    static int count = 0;

    public static int printAlllDecoing(String number, String output) {

        if(number.length() == 0) {
            count = count +1;
            return count;
        }

        String firstCharacter = number.substring(0,1);


        int firstNumber = Integer.parseInt(firstCharacter);

        if(firstNumber != 0) {
            char character = (char)('a' + firstNumber - 1);
            printAlllDecoing(number.substring(1), output + character);
        }

        if(number.length() <= 1) {
            return count;
        }

        String firstTwoCharacters = number.substring(0,2);


        int firstTwoNumber = Integer.parseInt(firstTwoCharacters);


        if(firstTwoNumber <= 26) {
            char character = (char)('a' + firstTwoNumber - 1);
            printAlllDecoing(number.substring(2), output + character);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to decode");
        String code = sc.next();

        System.out.println(count + printAlllDecoing(code, ""));
    }

}
