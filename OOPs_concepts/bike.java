package OOPs_concepts;

    public class bike
    {
        String bikeName = "GT650";
        float price;
        void getName()
        {
            System.out.println(this.bikeName);
        }
        void getbikePrice(double price)
        {
            System.out.println(price);
        }
        
    public static void main(String args[])
    {
        bike n1 = new bike();
        n1.getName();
        n1.getbikePrice(20000.00);
    }
    }
    

