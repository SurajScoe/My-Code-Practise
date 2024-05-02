package Company.SocieteGeneral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PopulatedList {
	public static List<Student> populatedlist(){
		List<Student> l = new ArrayList<>(Arrays.asList(
				new Student("ramesh",1,99),
				new Student("sham",2,98),
				new Student("lokesh",3,97),
				new Student("tilu",4,91)));
		return l;
	}
}
