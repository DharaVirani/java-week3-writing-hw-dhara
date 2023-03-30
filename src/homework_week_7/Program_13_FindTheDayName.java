package homework_week_7;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Program_13_FindTheDayName {
    public static void main(String[] args) {
//        Scanner declaration
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input a number between 1 and 7: ");
        int day = scanner.nextInt();
//        Calling static method
        findTheDaysName(day);
//        Closing scanner object
        scanner.close();

    }
//    Finding the name of the day
    public static void findTheDaysName(int day){
     switch (day){
         case 1:
             System.out.println("It's Monday");
             break;
         case 2:
             System.out.println("It's Tuesday");
             break;
         case 3:
             System.out.println("It's Wednesday");
             break;
         case 4:
             System.out.println("It's Thursday");
             break;
         case 5:
             System.out.println("It's Friday");
             break;
         case 6:
             System.out.println("It's Saturday");
             break;
         case 7:
             System.out.println("It's Sunday");
             break;
         default:
             System.out.println("Week contains 1 to 7 days");
     }
    }
}
