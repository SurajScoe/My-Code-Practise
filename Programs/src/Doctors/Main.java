package Doctors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		DLL l = new DLL();		
		l.insertAtFirstPos(new Doctors(101, "Namresh", "MBBS"));
		l.insertAtFirstPos(new Doctors(102, "Sham", "MBBS"));
		l.insertAtFirstPos(new Doctors(103, "Ganesh", "BHMS"));
		l.insertAtFirstPos(new Doctors(101, "Tarun", "BHMS"));
		
		while(true) {
			
			System.out.println("choice 1 : insertAtFirstPos\n"
					+ "choice 2 : InsertAtLastpos\n"
					+ "choice 3 : deleteFromBegining\n"
					+ "choice 4 : deleteFromEnd\n"
					+ "choice 5 : Display");
			
			System.out.println("Enter your choice : ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the Doctors Details : "
						+ "id , name , Qualifications :");
				l.insertAtFirstPos(new Doctors(sc.nextInt(),sc.next(), sc.next()));
				break;
			case 2:
				System.out.println("Enter the Doctors Details : ");
				l.InsertAtLastpos(new Doctors(sc.nextInt(),sc.next(), sc.next()));
				break;
			case 3:
				l.deleteFromBegining();
				System.out.println("Data deleted from beginning !!");
				break;
			case 4:
				l.deleteFromEnd();
				System.out.println("Data deleted from the end !!");
				break;
			case 5:
				l.display();
				break;
			case 6:
				List<Doctors> list = new ArrayList<>();
//				Collections.sort(list,(d1,d2)->d2.getName().compareTo(d1.getName()));
//				for(Doctors d : list) {
//					System.out.println(d);
//				}
				
				 Collections.sort(list,Collections.reverseOrder());
				 
				 list.forEach(System.out::println);
				break;
			default:
				System.out.println("Enter the valid opetions !!");
				break;
			}
		}
	}

}
