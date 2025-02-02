package if_else_programs;

public class triangle {
    public static void main(String[] args) {
        int side1=6;
        int side2=5;
        int side3=5;
        {
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is equilateral.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }
        }
    }    
}