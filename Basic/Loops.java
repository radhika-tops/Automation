package Basic;

import java.util.Scanner;

//to execute same code again and again
//4 loops
//1. for(initialization;condition;incre/decre){body}
//2.while(condition){body}
//3.do{body} while(condition);
//4 for each -> for(Type object: list){body}
public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Print Table: ");
		int Number = sc.nextInt();
		for (int a = 1; a <= 10; a++) {
			System.out.println(Number + "x" + a + "=" + (Number * a));
		}
		System.out.println("Enter number to print table");
		int c = sc.nextInt();
		int b = 1;
		while (b <= 10) {
			System.out.println(c + "x" + b + "=" + (c * b));
			b++;
		}
		System.out.println("Enter number to print table");
		int d = sc.nextInt();
		int f = 1;
		do {
			System.out.println(d + "x" + f + "=" + (d * f));
			f++;
		} while (f <= 10);
	}

}
