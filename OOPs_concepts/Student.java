package OOPs_concepts;

public class Student {
		int m1 = 87,m2 = 90, m3 = 99, m4=88;
		int total;
		double avg;
		char grade;
		
		
		public void findTotal() {
			total = m1 + m2 + m3 + m4 ;
		}
		
		
		
		public void findAvg() {
			avg = total /  4;		
		}
		
		
		
		public void findGrade() {
			if(avg>=90) {
				System.out.println("S grade");
			}else if(avg<90 && avg>=80) {
				System.out.println("A grade");
			}else if(avg<80 && avg>=60) {
				System.out.println("B grade");
			}else if(avg<60 && avg>=40) {
				System.out.println("C grade");
			}else {
				System.out.println("F grade");
			}
		}
		
		
		
		public void displayingDetails() {
			System.out.println("Total " + total);
			System.out.println("Average " + avg);
			
		}
		
		
		
		
		
		public static void main(String args[]) {
			
			
			System.out.println("student details");
			
			Student zx = new Student(); 			
			
			zx.findTotal();
			zx.findAvg();
			zx.findGrade();
			zx.displayingDetails();
			
			
		}
		
	}