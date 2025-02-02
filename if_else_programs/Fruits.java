package if_else_programs;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        System.out.println("Enter the amount of fruits required");
         int apple=10;
         int orange=12;
         int dragon_fruit=15;
    System.out.print("Enter the amount of apple needed:");
    Scanner input=new Scanner(System.in);
    int Apple=input.nextInt();
    if (Apple<=apple) {
        System.out.println("Your order is conformed");
    }else {
        System.out.println("Sorry Apple not available");
        System.out.print("Enter the amount of orange needed:");
        Scanner input0=new Scanner(System.in);
        int Orange=input0.nextInt();
        if (Orange<=orange) {
            System.out.println("Your order is conformed");
        }else{
            System.out.println("Sorry orange not available");
            System.out.print("Enter the amount of dragon_fruit needed:");
            Scanner input1=new Scanner(System.in);
            int Dragon_fruit=input1.nextInt();
            if (Dragon_fruit<=dragon_fruit) {
                System.out.println("Your order is conformed");
            }else{
                System.out.println("Sorry dragon_fruit is not available");
            }
        }
    } 

    }
}

