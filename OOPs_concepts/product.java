package OOPs_concepts;

public class product {
    String name="Pineapple";
    double price=16.12;
    int quantity=5;
    double total;


    public void findTotal(){
         total=price*quantity;
    }


    public void displayingDetails(){
        System.out.println("The total bill is "+total);
    }
public static void main(String[] args) {
    product zz=new product();
    zz.displayingDetails();
}
}
