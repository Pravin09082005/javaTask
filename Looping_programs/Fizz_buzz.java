package Looping_programs;

import java.util.Scanner;

public class Fizz_buzz {
    public static void main (String args[])
	{
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the range for numbers: ");
		int number = num.nextInt();
		for (int i=1 ; i<=number ; i++)
		{
			if(i%3==0)
			{
				System.out.print(" FIZZ ");
			}
			else if(i%5==0)
			{
				System.out.print(" BUZZ ");
				
			}
			else if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.print(" FIZZBUZZ ");
			}
			else
			{
				System.out.print(i);
			}
			
			
		}
	}

}


