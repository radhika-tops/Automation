package AssignmentProgram;

import java.util.ArrayList;
import java.util.List;

public class Question_20 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("Sunday");
		lst.add("Monday");
		lst.add("Tuesday");
		lst.add("Wednesday");
		lst.add("Thursday");
		lst.add("Friday");
		lst.add("Saturday");
		System.out.println(lst);
		//to update array element
		lst.set(1, "Sunday");
		lst.set(5, "Monday");
		System.out.println(lst); // to print updated data
		
	}
	
}
