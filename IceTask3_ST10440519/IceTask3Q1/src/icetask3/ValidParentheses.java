/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask3;

import java.util.Scanner;

/**
 *
 * @author sahir
 */
public class ValidParentheses {
    //function to check if the input string contains valid parentheses
    public static boolean isValid(String s) {
        //if the string is null or empty, it's automatically invalid
        if (s == null || s.isEmpty()) return false;
        
        //stringBuilder to mimic a stack
        StringBuilder stack = new StringBuilder();
        
        //iterate through each character in the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.append(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.length() == 0) {
                    return false;
                }
                
                char top = stack.charAt(stack.length() - 1);
                
                //check if the current closing parenthesis matches the corresponding opening parenthesis
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
                
                stack.deleteCharAt(stack.length() - 1);
            }
        }
        
        return stack.length() == 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //get user input
        System.out.println("Enter a string containing parentheses:");
        String input = scanner.nextLine();
        
        //check if the input string contains valid parentheses
        boolean isValid = isValid(input);
        
        //display result
        if (isValid) {
            System.out.println("The input string contains valid parentheses.");
        } else {
            System.out.println("The input string contains invalid parentheses.");
        }
        
        scanner.close();
    }
}



