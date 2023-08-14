package Practicepurpose;

import java.util.Scanner;

public class practicesample1 {
	public static void main(String[] args) {
		
		/*1) Operators
		 * int i = 10, j = 3, sum;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
		System.out.println("% = "+(i%j));
		sum= i+j;
		System.out.println("sum ="+sum);
		double a,r=4;
		a=Math.PI*r*r;
		System.out.println("Area of circle = "+a);
		*/
		
		/* Unary operators
		int i=1,j;
		i=i+1;
		i++;
		System.out.println(i);
		j= i--;
		System.out.println(j);
		System.out.println(i);
		
		
		int a = -10;
		System.out.println(a);
		int b = 20;
		b=+ a; //b = b+a
		System.out.println(b);
		*/
		
		/* TypeCasting
		//to convert data from one dataType to another dataType
		//two types
		//1.Implicit : smaller to bigger
		//2.Explicit : bigger to smaller
		int a = 10, b = 3;
		double c;
		c = (double)a/(double)b;
		System.out.println("c = "+c);
		
		double d = 3;
		System.out.println(d);
		int i = (int)1.323;
		System.out.println(i);
		String s = "1";
		System.out.println(s);
		byte b1 = 1;
		System.out.println(b1);
			
		*/
		
		/*Datatypes: data types specify the different sizes and values that can be stored in the variable.
		//1.Primitive - byte,short,int,long,float,double,char,boolean
		//2.Non-primitive - String ,Array ,Class
		
		System.out.println("Hello datatypes");
		byte b = 126;
		short s = 23;
		int i = 123;
		long l = 34444;
		System.out.println("Value of b = "+b);
		float f = 3.15789567f;
		System.out.println(f);
		double d = 3.14678;
		System.out.println(d);
		char c = 'q';
		System.out.println(c);
		boolean b1 = true;
		System.out.println(b1);
		String s1 = "Java";
		System.out.println(s1);
		
		*/
		
		//ConditionalStatements
		//1. simple if
		//2.if else
		//3.nested if
		//4.else if ladder
		//5.switch case
		
		/*1. Simple if
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a value = ");
		int a =sc.nextInt();
		System.out.println("Enter b value = ");		
		int b = sc.nextInt();
		if (a>b) {
			System.out.println("a is greater that b");
		}
		*/
		
		/* else if
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a value = ");
		int a =sc.nextInt();
		System.out.println("Enter b value = ");		
		int b = sc.nextInt();
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		*/
		
		//nested if
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if(age>18) {
			if(age<60) {
				System.out.println("You are eligible");
			}else {
				System.out.println("age is greater than 18 but less than 60");
			}
		}else {
			System.out.println("age is less than 18");
		}
		
		
		
		
		
		
	}

}
