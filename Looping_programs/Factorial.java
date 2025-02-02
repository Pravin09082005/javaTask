package Looping_programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){  
        long i,fact=1;
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        
        for(i=1;i<=number;i++)
        {    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);
    }

}
