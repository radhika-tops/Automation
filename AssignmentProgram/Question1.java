package AssignmentProgram;

import java.util.Scanner;
//Q.1 W.A.J.P to Take three numbers from the user and print the greatest
//number.
public class Question1 {
	public static void main(String[] args) {
		System.out.println("Enter three numbers to search which is greatest one");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter First number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		System.out.println("Enter Third number: ");
		int c = sc.nextInt();
		if (a>b && a>c) {
			System.out.println("The greatest number is: "+a);
		}
		else if (b>a && b>c) {
			System.out.println("The greatest number is: "+b);
		}
		else if(c>a && c>b) {
			System.out.println("The greatest number is: "+c);
		}
	}

}
