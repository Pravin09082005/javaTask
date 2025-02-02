package Switch_case;

import java.util.Scanner;

public class Grade_gpa {
    public static void main(String[] args) {
        System.out.print("Enter the grade from A-E as needed:");
        Scanner input=new Scanner(System.in);
        String grade=input.next();
        switch (grade) {
            case "A":
                System.out.println("Your grade is 4.0");
                break;
            case "B":
                System.out.println("Your grade is 3.0");
                break;
            case "C":
                System.out.println("Your grade is 2.0");
                break;   
            case "D":
                System.out.println("Your grade is 1.0");
                break;  
            case "E":
                System.out.println("Your grade is 0.0");
                break;
            default:
            System.out.println("Invalid input provided");
                break;
        }
    }
}
