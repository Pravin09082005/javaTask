package if_else_programs;

import java.util.Scanner;

public class Agesplit {
    public static void main(String[] args) {
        System.out.print("Enter the age:");
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        if (1<=age&&age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age <= 65) {
            System.out.println("You are an adult.");
        } else if (age>=65) {
            System.out.println("You are a senior citizen.");
        }else {
            System.out.println("Invalid age provided");
        }


        if (age >= 60) {
            System.out.println("You are eligible for a senior citizen discount.");
    }
}
}