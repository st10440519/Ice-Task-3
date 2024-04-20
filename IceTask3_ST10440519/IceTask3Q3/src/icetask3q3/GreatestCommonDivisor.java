/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask3q3;

import java.util.Scanner;

/**
 *
 * @author sahir
 */
public class GreatestCommonDivisor {
    //function to calculate the greatest common divisor of two numbers
    public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // At this point, a contains the greatest common divisor
        return a;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get user input
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        //calculate greatest common divisor
        int gcd = greatestCommonDivisor(num1, num2);

        //display the result
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}


