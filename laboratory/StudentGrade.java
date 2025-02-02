package laboratory;
import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter Student Name: ");
	        String name = s.nextLine();
	        System.out.print("Enter Marks: ");
	        int marks = s.nextInt();
	        // Create Student object
	        Student student = new Student(name, marks);

	        // Display student details and grade
	        student.displayDetails();
	        s.close();
	}
}
	class Student {
	    // Attributes
	     private String name;
	     private int marks;

	    // Constructor
	    public Student(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }

	    // Method to calculate grade
	    public char calculateGrade() {
	        if (marks >= 90) {
	            return 'A';
	        } else if (marks >= 80) {
	            return 'B';
	        } else if (marks >= 70) {
	            return 'C';
	        } else if (marks >= 60) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	    }

	    // Method to display student details and grade
	    public void displayDetails() {
	        System.out.println("\nStudent Name: " + name);
	        System.out.println("Marks: " + marks);
	        System.out.println("Grade: " + calculateGrade());
	    }
	}
    