package AssignmentProgram;

import java.util.Scanner;
//Q.6 W.A.J.P for create Fibonacci Series.
public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maximum Value: ");
		int n = sc.nextInt();
		int x=0,y=1,z=0; //here z means sum, sum starts from 0.
		while (z<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
		}
	}
	

}
