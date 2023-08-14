package AssignmentProgram;

import java.util.ArrayList;
import java.util.List;

public class Question_19 {
 public static void main(String[] args) {
	List<String> lst = new ArrayList<String>();
	lst.add("Sunday");
	lst.add("Monday");
	lst.add("Tuesday");
	lst.add("Wednesday");
	lst.add("Thursday");
	lst.add("Friday");
	lst.add("Saturday");
	for(String element:lst) {
		System.out.println(element);
	}
	System.out.println(lst);
}
}
