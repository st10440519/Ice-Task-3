/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask3q2;

import java.util.Scanner;

/**
 *
 * @author sahir
 */
public class OddSquaresSumGenerator {
    //function to generate and sum the squares of odd numbers up to a given limit
    public static int oddSquaresSum(int limit) {
        int sum = 0;
        int currentNumber = 1; //first odd number

        while (true) {
            //calculate the square of the current odd number
            int square = currentNumber * currentNumber;

            //add the square to the sum
            sum += square;

            //move to the next odd number
            currentNumber += 2;

            //the loop breaks if the current number exceeds the limit
            if (currentNumber > limit) {
                break;
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get user input
        System.out.println("Enter the limit:");
        int limit = scanner.nextInt();

        int sum = oddSquaresSum(limit);

        //display the result
        System.out.println("Sum of squares of odd numbers up to " + limit + ": " + sum);

        scanner.close();
    }
}

