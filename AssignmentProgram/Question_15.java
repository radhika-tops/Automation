package AssignmentProgram;
import java.util.Scanner;
//Q.15 WAP to demonstrate try catch block.
public class Question_15 {
	public static void main(String[] args) {
		try {
			int a = 50/0; 
		}catch (ArithmeticException e) {
			System.out.println("Denominator can not be Zero");
		}
		
		//through user input
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number in k= ");
		int k=sc.nextInt();
		System.out.println("Enter number in m= ");
		int m=sc.nextInt();
		int c=k/m;
		System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println("Denominator can not be Zero");
		}
		
	}
}
