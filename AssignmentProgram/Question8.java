package AssignmentProgram;

import java.util.Scanner;
//Q.8 WAP to compute the sum of the first 100 prime numbers.
public class Question8 {
	public static void main(String[] args) {
		int n=100,  sum=0;
		for (int i =1;i<=n;i++) {
			int count = 0;
			for (int j=1;j<=n;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("The sum of the first 100 prime numbers is: " +sum);
				
		}
			
		}
	
	
	 
		


