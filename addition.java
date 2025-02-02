
import java.util.Scanner;
public class  addition{
	public static void main(String[]arg)
	{ 
	int num1,num2,a;
	
	Scanner scan = new Scanner(System.in);
    
	System.out.print("Enter num1: ");
	num1=scan.nextInt();
	System.out.print("Enter num2: ");
	num2=scan.nextInt();
	a=num1+num2;
	System.out.print("Sum of two numbers,10 and 20 is "+ a);
	}
}
