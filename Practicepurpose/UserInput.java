package Practicepurpose;

import java.util.Scanner;

//UserInput
		//three stream->in(input stream),out(print stream),err(err stream)

class A{
	public void call() {  //method
		System.out.println("Hello call function");
	}
}
public class UserInput {
	public static void main(String[] args) {
		A obj = new A();
		obj.call();
		//Here ln is for new line
		System.out.println("Hello again");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = ");
		int a = sc.nextInt();
		System.out.println("Enter b = ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("c= "+c);
		System.out.println("Enter double value = ");
		double d = sc.nextDouble();
		System.out.println(d);
		
	}

}
