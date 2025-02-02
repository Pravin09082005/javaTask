package Looping_programs;

public class Duplicate {
    public static void main (String args [])
	{
		int arr[] = {25, 77, 88 , 25, 16, 88, 56};
		for (int i = 0; i <= 6; i++)
		{
			for (int j=i + 1; j<= 6; j++)
			{
				if (arr[i] == arr[j])
				{
					System.out.println("Duplicate elements  " + arr[i]+ "," + arr[j] + " and their positions are " + i + ","+ j );
				}
			}
		}
	}

}


