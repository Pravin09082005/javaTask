package if_else_programs;

public class ageClassifier {
    public static void main(String[] args) {
        int age=18;

        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        } else if (age <= 1) {
            System.out.println("The person is an infant.");
        } else if (age <= 12) {
            System.out.println("The person is a child.");
        } else if (age <= 19) {
            System.out.println("The person is a teenager.");
        } else if (age <= 64) {
            System.out.println("The person is an adult.");
        } else {
            System.out.println("The person is a senior.");
        }
       
    }
}
