package Switch_case;

import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        System.out.println("Simple calculator ");
        System.out.print("Enter the first number 'a':");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.print("Enter the first number 'b':");
        Scanner input1=new Scanner(System.in);
        int b=input1.nextInt();
        System.out.print("Place the arithmatic operator needed:");
        Scanner input2=new Scanner(System.in);
        String c=input2.next();

        System.out.println("Given expression:"+a+c+b);
        System.out.print("The required output is:");
        switch (c) {
            case ("+"):
                System.out.println(a+b);
                break;
            case ("-"):
                System.out.println(a-b);
                break;
            case ("*"):
                System.out.println(a*b);
                break;
            case ("/"):
                  if (a==0 || b==0) {
                    System.out.println("This operation cannot be performed");
                  }
                  else{
                      System.out.println(a/b);
                  }
                break;
           
            default:
            System.out.println("Invalid");
                break;
        }

    }
}
