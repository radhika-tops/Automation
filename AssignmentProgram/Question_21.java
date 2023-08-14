package AssignmentProgram;

import java.util.ArrayList;
import java.util.List;

public class Question_21 {
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
		// Removing the third element from the list.
		lst.remove(3);
		System.out.println("After removing third element from the list:\n"+lst);
	}
}
