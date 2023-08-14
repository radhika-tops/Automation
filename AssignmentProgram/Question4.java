package AssignmentProgram;

import java.util.Scanner;
//Q.4 W.A.J.P to check given number is Prime or not?
public class Question4 {
	public static void main(String[] args) {
		int n,count=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check whether its prime or not : ");
	    n = sc.nextInt();
		i=1;
		while (i<=n) 
		{
			if (n%i==0) 
				count= count+i;
				i=i+1;
		}
			if (count==2) 
				System.out.println("Above mentioned number is a Prime number");
			
			else 
				System.out.println("Above mentioned number is Not a Prime number");
	}

}
