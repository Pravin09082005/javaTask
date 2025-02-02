package Looping_programs;

import java.util.Scanner;

public class fibonacci {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        
        int firstNum = 0;
        int secondNum = 1;
        
        System.out.println("Fibonacci series up to " + limit + " terms:");
        System.out.print(firstNum + ", " + secondNum);
        
        for (int i = 2; i < limit; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(", " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}