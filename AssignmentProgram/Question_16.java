package AssignmentProgram;
import java.util.InputMismatchException;
//Q.16 WAP to demonstrate multiple catch blocks
import java.util.Scanner;
public class Question_16 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter value of a = ");
			int a=sc.nextInt();
			System.out.println("Enter value of b = ");
			int b=sc.nextInt();
			int c= a/b;
			System.out.println(c);
					
		}catch(ArithmeticException e) {
			System.out.println("Denominator can not be zero");
		}catch(InputMismatchException e) {
			System.out.println("Denominator should be numeric value");	
		}catch (Exception e) {
			System.out.println("error");
		}
	}
}
