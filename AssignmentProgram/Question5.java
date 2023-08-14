package AssignmentProgram;

import java.util.Scanner;
//Q.5 W.A.J.P to check given number is Armstrong or not?

public class Question5 {
	public static void main(String[] args) {
		int n,z,count = 0, digit, i, prod,sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		z=n;
		while(z>0) {
			count = count+1;
			z = z/10;
		}
		
		z = n;
		while(z>0) {
			digit = z%10;prod = 1;
			for (i=1;i<=count;i++) 
				prod = prod*digit;
				sum = sum+prod;
				z = z/10;
			}
			if (sum==n) 
			System.out.println("Armstrong");
			else 
				System.out.println("Not Armstrong");
			
		
		
		
		
	}
}

