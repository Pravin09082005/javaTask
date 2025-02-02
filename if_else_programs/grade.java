package if_else_programs;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        System.out.println("Enter the mark of the student: ");
        Scanner input=new Scanner(System.in);
        int grade = input.nextInt();
        //System.out.println("value is " + num);
        if (90<=grade&&grade<=100) {
            System.out.println("Your grade is 'A'");
        } else if (80<=grade&&grade<=89) {
          System.out.println("Your grade is 'B'");
        } else if (70<=grade&&grade<=79) {
            System.out.println("Your grade is 'C'");
        }else if(60<=grade&&grade<=69){
            System.out.println("YOur grade is 'D'");
        } else {
            System.out.println("Your grade is 'F'");
        }
    }
}
