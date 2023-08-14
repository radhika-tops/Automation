package Practicepurpose;

import java.util.Arrays;
import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		/* System.out.print("The sum of this number is:  ");
		int num1 = 6;
		int num2 = 12;
		int num3 = 15;
		int sum = num1+num2+num3;
	    System.out.println(sum);
		
		*/
		
		/* byte age =36;
		int age2 = 56;
		char ch = 'A';
		float f1 = 5.600f;
		double d1 = 4.66d;
		short age3 = 87;
		long agedemo = 5666666l;
		System.out.println(age);
		System.out.println(age2);
		System.out.println(ch);
		System.out.println(f1);
		System.out.println(d1);
		String str = "Radhika";
		System.out.println(str);
		
		*/
		
		/* System.out.println("Taking Input from the user");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		int sum= a+b;
		System.out.println("The sum of two number is = "+sum);
		
		*/
		
		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter English subjet marks: ");
		float f1 = sc.nextFloat();
		System.out.println("Enter Hindi subjet marks: ");
		float f2 = sc.nextFloat();
		System.out.println("Enter Sanskrit subjet marks: ");
		float f3 = sc.nextFloat();
		System.out.println("Enter History subjet marks: ");
		float f4 = sc.nextFloat();
		System.out.println("Enter Maths subjet marks: ");
		float f5 = sc.nextFloat();
		float sum = f1+f2+f3+f4+f5;
		System.out.println("Your total marks is: "+sum);
		System.out.println("Your total Percentage is: " +((sum*100)/500)+"%");

		*/
		
		/* String name = "Ben";
		int marks = 95;
		System.out.println(name+ " Scored "+  marks +"%");
		*/
		
		/* Cgpa using marks of three subject(out of float)
		float sub1 = 45;
		float sub2 = 50;
		float sub3 = 48;
		float cgpa = (sub1+sub2+sub3/30);
		System.out.println(cgpa);
		*/
		
		/* System.out.println("What is your name");
		Scanner sc= new Scanner (System.in);
		String name = sc.next();
		System.out.println("Hello "+ name +" have a good day!");
		*/
		
		/* To delete number entered by the user is int or not
		System.out.println("Enter your name ");
		Scanner sc= new Scanner (System.in);
		System.out.println(sc.hasNextInt());
		*/
		
		/* Arithematic operators
		int a = 4;
		int b = 6 + a;
		int b1 = 6 * a;
		int b2 = 6 - a;
		int b3 = 6 / a;
		int b4 = 6 % a;
		
		System.out.println(b+ " "+b1+ " "+b2+ " "+b3+ " "+b4);
		*/
		
		/* Addition assignment
		int a = 4;
		int b = a;
		b*= 3;
		System.out.println(b);
		
		*/
		
		/* Comparision operator
		int a = 4;
		int b = 9;
		b*=3;
		System.out.println(b);
		System.out.println(6==6);
		System.out.println(64>6);
		*/
		
		/* Logical operators
		int a = 4;
		int b = 9;
		b*=3;
		a*=b;
		System.out.println(b);
		System.out.println(a);
		System.out.println(64>6 && 64<6);
		System.out.println(64>6 && 64>7);
		*/
		
		/* Bitwise operators
		int a = 4;
		int b = 9;
		b*=3;
		System.out.println(b);
		System.out.println(3&6); //binary operation
		*/
		
		/* precedence
		int a= 6*5-34/2;
		System.out.println(a);
		*/
		/* associativity
		int b = 60/5-34*2; 
		System.out.println(b);
		
		*/
		
		
		/* W.A.J.P to Take three numbers from the user and print the greatest
number.
		 * System.out.println("Enter three numbers to search which is greatest one");
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
		*/
		
		/* W.A.J.P in Java to display the first 10 natural numbers using while loop.
		System.out.println("The 10 natural numbers are: ");
		int a = 1, b;
		while (a<=10) {
			System.out.println(a);
			a++;
			*/
		
		/*W.A.J.P to find factorial for Given Number.
		System.out.println("Enter factorial number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,fac=1;
		for (a=1;a<=n;a++) {
				fac= fac*a;
				System.out.println(fac);
		}
				System.out.println("The factorial of "+n+" is "+fac);
		*/		
		
		/*W.A.J.P to check given number is Prime or not?
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
				System.out.println("Prime number");
			
			else 
				System.out.println("Not Prime number");
			*/
		
		
		/*W.A.J.P for create Fibonacci Series.
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
		*/
		
		
		int aa[]= {8,5,6,7,8,9,10,77};
		Arrays.sort(aa);
		System.out.println("Min Value of an array is: "+aa[0]+ "\nMax Value of an array is:"+aa[7]);
		}
		

		}
	
 
