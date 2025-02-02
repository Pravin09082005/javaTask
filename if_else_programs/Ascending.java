package if_else_programs;

import java.util.Scanner;

public class Ascending {
        public static void main(String[] args) {
            System.out.println("Enter the numbers needed:");
            Scanner input=new Scanner(System.in);
            System.out.println("Enter 1st number:");
            int num1 = input.nextInt();
            System.out.println("Enter 2nd number:");
            int num2 = input.nextInt();
            System.out.println("Enter 3rd number:");
            int num3 = input.nextInt();
    
            if (num1 <= num2) {
                if (num1 <= num3) {
                    System.out.print(num1 + ",");
                    if (num2 <= num3) {
                        System.out.print(num2 + ",");
                        System.out.println(num3);
                    } else {
                        System.out.print(num3 + ",");
                        System.out.println(num2);
                    }
                } else {
                    System.out.print(num3 + ",");
                    System.out.print(num1 + ",");
                    System.out.println(num2);
                }
            } else {
                if (num2 <= num3) {
                    System.out.print(num2 + ",");
                    if (num1 <= num3) {
                        System.out.print(num1 + ",");
                        System.out.println(num3);
                    } else {
                        System.out.print(num3 + ",");
                        System.out.println(num1);
                    }
                } else {
                    System.out.print(num3 + ",");
                    System.out.print(num2 + ",");
                    System.out.println(num1);
                }
            }
        }
    }

