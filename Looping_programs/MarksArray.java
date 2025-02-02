package Looping_programs;

public class MarksArray {
    public static void main(String[] args) {
        
		
            double num[] = {45,3,56,34,75,73,65,2,76,90};
            double max = num[0];
            double min = num[0];
            
            
            for (int i=0; i<=6; i++)
            {
                if(num[i] > max )
                {
                    max= num[i];
                }
                if (num[i] < min)
                {
                    min = num[i];
                }
            }
            System.out.print("The largest number in the array: " + max );
            System.out.print("\nThe smallest number in the array: " + min );
         }
    

    }

