package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * Hint: use ternary operator (? :)
 */

public class Program_1_OddEvenTernaryOperator {
//  Scanner declaration for reading input from console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isOddEvenNumber(number);
//        closing scanner object
        scanner.close();

    }

// Checking the number is odd or even
public static  void isOddEvenNumber(int number){
//        ternary operator is used
    String evenOrOdd = (number%2==0)? "Even": "Odd";
    System.out.println("The " + number + " is " + evenOrOdd + " number.");
}

}
