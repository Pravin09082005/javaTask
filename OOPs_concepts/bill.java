package OOPs_concepts;

public class bill {
    

	public void displayDetails(String name , String time)
	{
		System.out.println("\t XYZ Shopping Corner \n Unknown Street, Unknown Place\n Unknown City, Phone number:1234567890");
		System.out.println("\t\n\t Retail Invoice \t");
		System.out.println("\t\nName: " + name + "\n\nDate :" + time + "\t Bill Number: 665789");
	}
	public static void displayLine()
	{
		System.out.println("---------------------------------------------");
		System.out.println("S.no\tName\tQuantity\tPrice");
		System.out.println("---------------------------------------------");
	}
	public void calculateBottle(String name, int price, int quantity)
	{
		System.out.println("1" +"\t"+ name+ "\t   "+ quantity + "\t          " +price);
	}
	public void calculateBag(String name, int price, int quantity)
	{
		System.out.println("\n2" +"\t"+ name+ "\t   "+ quantity + "\t          " +price);
	}
	public void calculateEraser(String name, int price, int quantity)
	{
		System.out.println("\n3" +"\t"+ name+ "\t   "+ quantity + "\t          " +price);
	}
	public void calculateBook(String name, int price, int quantity)
	{
		System.out.println("\n4" +"\t"+ name+ "\t   "+ quantity + "\t          " +price);
	}
	public static void displayOnlyLine()
	{
		System.out.println("---------------------------------------------");
	}
	public void printTotal(int price1,int price2, int price3, int price4)
	{
		int total_Amount = price1 + price2 + price3 + price4;
		System.out.println("\t\t   Total Amount: " +  total_Amount);
	}
	
	
	
	public static void main(String args[])
	{
		bill c1 = new bill();
		c1.displayDetails("Tony Richardson" ,"26-04-24 19:52:15");
		displayLine();
		c1.calculateBottle("Bottle", 20, 7);
	    c1.calculateBag("Bag", 500, 1);
	    c1.calculateEraser("Eraser", 5, 5);
	    c1.calculateBook("Book", 5, 20);
	    displayOnlyLine();
	    c1.printTotal(140,500,25,340);
	    displayOnlyLine();
	    System.out.println("\tTHANK YOU VISIT AGAIN!!!");
	}

}

