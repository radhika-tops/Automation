package AssignmentProgram;

import java.util.Scanner;

public class Question_26 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter number");
	 int m=sc.nextInt();	
	if (m>90 && m<=100) {
		System.out.println("AA Grade");
	}else if (m>80 && m<=90) {
		System.out.println("AB Grade");
	}else if (m>70 && m<=80) {
		System.out.println("BB Grade");
	}else if (m>60 && m<=70) {
		System.out.println("BC Grade");
	}else if (m>50 && m<=60) {
		System.out.println("CD Grade");
	}else if (m>40 && m<=50) {
		System.out.println("DD Grade");
	}else if (m<=40) {
		System.out.println("Fail");
	}
	
}
}
