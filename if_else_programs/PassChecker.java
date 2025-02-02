package if_else_programs;

import java.util.Scanner;

public class PassChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks obtained in Mathematics: ");
        int mathsMarks = scanner.nextInt();
        System.out.print("Enter marks obtained in Science: ");
        int scienceMarks = scanner.nextInt();

        if (mathsMarks >= 40 && scienceMarks >= 40) {
            System.out.println("Congratulations! You have passed the exam.");
        } else {
            System.out.println("Sorry, you have failed the exam. Please try again.");
        }
    }
}
