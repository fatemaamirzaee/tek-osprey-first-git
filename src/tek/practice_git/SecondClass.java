package tek.practice_git;

import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** you can add two numbers here *****");
        System.out.println("Enter the first number: ");
        int numOne = sc.nextInt();
        System.out.println("Enter the second number: ");
        int numTwo = sc.nextInt();
        System.out.println(" the result is: " + (numOne + numTwo));

    }
}
