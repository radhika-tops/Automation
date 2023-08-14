package AssignmentProgram;
import java.util.Scanner;
//Q.3 W.A.J.P to find factorial for Given Number.
public class Question3 {
	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		int n, fac = 1;
		System.out.println("Enter Number to find factorial ");
		n=sc.nextInt();
		while(n>=1) {
			fac = fac*n;
			n= n-1;
		}
		System.out.println("Factorial = "+fac);
		*/
		
		System.out.println("Enter factorial number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,fac=1;
		for (a=1;a<=n;a++) {
				fac= fac*a;
				System.out.println(fac);
		}
				System.out.println("The factorial of "+n+" is "+fac);
	}

}
