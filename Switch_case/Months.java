package Switch_case;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

		Scanner day = new Scanner (System.in);
		System.out.print("Enter the year: ");
		int year = day.nextInt();
		System.out.print("Enter the number of the month:");
		int num = day.nextInt();
		switch (num)
		{
		case 1:
		{
			System.out.println("The name of the month in " + year +" is JANUARY ");
			break;
		}
		case 2:
		{
			if(year % 4 == 0)
			{
				System.out.println("The name of the month in " + year + " is FEBRUARY with 29 days");
				break;
			}
			else
			{
				System.out.println("The name of the month in " + year + " is FEBRUARY with 28 days");
				break;
				
			}
		}
		case 3:
		{
			System.out.println("The name of the month in " + year + " is MARCH with 31 days");
			break;
		}
		case 4:
		{
			System.out.println("The name of the month in " + year + " is APRIL with 30 days");
			break;
		}
		case 5:
		{
			System.out.println("The name of the month in " + year + " is MAY with 31 days");
			break;
		}
		case 6:
		{
			System.out.println("The name of the month in " + year + " is JUNE with 30 days");
			break;
		}
		case 7:
		{
			System.out.println("The name of the month in " + year + " is JULY with 31 days");
			break;
		}
		case 8:
		{
			System.out.println("The name of the month in " + year + " is AUGUST with 31 days");
			break;
		}
		case 9:
		{
			System.out.println("The name of the month in " + year + " is SEPTEMBER with 30 days");
			break;
		}
		case 10:
		{
			System.out.println("The name of the month in " + year + " is OCTOBER with 31 days");
			break;
		}
		case 11:
		{
			System.out.println("The name of the month in " + year + " is NOVEMBER with 30 days");
			break;
		}
		case 12:
		{
			System.out.println("The name of the month in " + year + " is DECEMBER with 31 days");
			break;
		}
		default:
		{
			System.out.println("Invalid input");
		}
		}
	}
	

}