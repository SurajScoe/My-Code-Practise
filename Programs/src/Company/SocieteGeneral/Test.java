package Company.SocieteGeneral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		Student studentArray[] = new Student[3];
		
		List<Student> slist = new ArrayList<>(PopulatedList.populatedlist());
		
		List<Student> list2 = new ArrayList<>();
		
		try(Scanner scanner = new Scanner(System.in)) {
	        
	        	
	        	while(true) {
	        		
	        	System.out.println("Enter your choice : ");
	        	int choice = scanner.nextInt();
	        	scanner.nextLine();
	        		switch(choice) {
	        		case 1 :		
	        			for (int i = 0; i < studentArray.length; i++) {
	        	            System.out.println("Enter details for Student " + (i + 1));

	        	            // Taking input for name
	        	            System.out.print("Name: ");
	        	            String name = scanner.nextLine();

	        	            // Taking input for roll number
	        	            System.out.print("Roll Number: ");
	        	            int rollNumber = scanner.nextInt();
	        	            scanner.nextLine(); // Consume the newline character

	        	            // Taking input for marks
	        	            System.out.print("Marks: ");
	        	            int marks = scanner.nextInt();
	        	            scanner.nextLine(); // Consume the newline character

	        	            // Creating and adding the student to the array
	        	            studentArray[i] = new Student(name, rollNumber, marks);
	        	        }
	        			break;
	        		case 2 :
	        			System.out.println("All students Details : ");
	        			for(Student s : slist) {
	        				System.out.println(s);
	        			}
	        			break;
	        		case 3 :
	        			return;
	        		case 4 :
	        			System.out.println("The Max marks got by students : ");
	        			Student Maxs = studentArray[0];
	        			for(Student s1 : studentArray) {
	        				if(Maxs.getMarks()<s1.getMarks()) {
	        					Maxs = s1;
	        				}
	        			}
	        			System.out.println(Maxs.toString());
	        		}
	        	}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}
}
