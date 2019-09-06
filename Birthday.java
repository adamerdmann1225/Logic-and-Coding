/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int y;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter the number of your birth month");  //prompt the user for a birth month
        y = keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (y == 1 || y== 3 || y == 7 || y == 8 || y == 10 || y == 12) {
            System.out.println("There are 31 days in your birth month");
        }
        else if (y == 2) {
            System.out.println("There are 29 days in your birth month");
        }
        else if (y == 3 || y== 5 || y== 6 || y == 9 || y == 11) {
            System.out.println("There are 30 days in your birth month");
        }
       
        
        //output the result to the user
        
    }
}