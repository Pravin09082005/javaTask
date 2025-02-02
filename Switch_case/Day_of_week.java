package Switch_case;

import java.util.Scanner;

public class Day_of_week {
    public static void main(String[] args) {
        System.out.print("Enter the number to select the day between 1to7:");
        Scanner input=new Scanner(System.in);
        int day=input.nextInt();
        switch(day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid input");
            }
        
    }
}
