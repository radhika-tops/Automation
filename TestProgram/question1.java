package TestProgram;
import java.util.Scanner;
//Q1. What will be the result of the following expression float a=7/4 * 9/2
public class question1 {
				public static void main(String[] args) {
				//	float a = 7/4.0f * 9/2.0f;
				//	System.out.println(a);
					
					
					
					
//Q2.Write a java program to encrypt a grade by adding 8 to it.Decrypt it to show the correct grade.
					char grade = 'B';
					//encrypt char by 8
					grade = (char)(grade+8);
					System.out.println(grade);
					
					//decrypting the grade
					grade = (char)(grade-8);
					System.out.println(grade);
					
					
//Q3. Use comparision operators to find out whether a given number is greater than the user entered number or not.
					Scanner sc = new Scanner (System.in);
					int a= sc.nextInt();
					System.out.println(a>8);
					
//Q4. Write the following expression in a java program v2 -u2/2ks
					int v = 1;
					int u = 1;
					int k = 5;
					int s = 3;
					int e = v*v - (u*u)/(2*k*s);
					System.out.println(e);
					
//Q5. Find the value of the following expression:int value = 7*49/7+35/7
					int value = sc.nextInt();
					System.out.println(7*49/7+35/7);
					
				}
}
