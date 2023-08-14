package Basic;
import java.util.Scanner;
//1. simple if
//2.if else
//3.nested if
//4.else if ladder
//5.switch case
public class ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Simple if proogram");
		System.out.println("Enter age = ");
		int age = sc.nextInt();		
		if (age>=18) {
			System.out.println("Yes you can drive");
		}
		
		// else if
		if (age>=18) {
			System.out.println("Yes you can drive");
		}
		else {
			System.out.println("No you can not drive");
		}
		
		// nested if
		if (age>18) {
			if (age>75) {
				System.out.println("You can drive but need to drive slowly");
			}
			else {
			System.out.println("Yes you can drive");
			}
		}
		else {
			System.out.println("You can not drive");
		}
		
		// else if ladder
		
		System.out.println("Enter Your Marks");
		int marks = sc.nextInt();
		if (marks<35) {
			System.out.println("you are fail");
		}
		else if (marks>=35 && marks<=50) {
			System.out.println("Pass Class");
		}
		else if (marks>=51 && marks<=70) {
			System.out.println("C Grade");
		}
		else if (marks>=71 && marks<=80) {
			System.out.println("B Grade");
		}
		else if (marks>=81 && marks<=90) {
			System.out.println("A Grade");
		}
		else if (marks>=91 && marks<=100) {
			System.out.println("A+ Grade");
		}
		else {
			System.err.println("Invalid input");
		}
		
		//Switch Case
		
		System.out.println("Select 1 for English Languagge\nselect 2 for Hindi languagge\nselect 3 for Gujarati Languagge");
		//System.out.println("1. for English\n2. for Hindi\n3. for Gujarati");
		int lang = sc.nextInt();
		switch(lang) {
		case 1:
			System.out.println("You have selected English Languagge");
			break;
		case 2 :
			System.out.println("You have selected Hindi Languagge");
			break;
		case 3 :
			System.out.println("You have selected Gujarati Languagge");
			break;
		default :
			//System.out.println("Invalid Input");
		}

	}
	}

	

