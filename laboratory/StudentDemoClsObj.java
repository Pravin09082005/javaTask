package laboratory;

class Student{
String name; int age;
String grade;
void displayDetails()
{
System.out.println("Student Details:"); 
System.out.println("Name: " + name); 
System.out.println("Age: " + age); 
System.out.println("Grade: " + grade);
}
void setDetails(String studentName, int studentAge, String studentGrade)
{
name = studentName; 
age = studentAge; 
grade = studentGrade;
}
}


public class StudentDemoClsObj extends Student
{
public static void main(String[] args)
{
StudentDemoClsObj student1 = new StudentDemoClsObj(); 
student1.setDetails("Subasree", 20, "A"); 
student1.displayDetails();
StudentDemoClsObj student2 = new StudentDemoClsObj(); 
student2.setDetails("Jayashree", 19, "B"); 
student2.displayDetails();
}
}
    

