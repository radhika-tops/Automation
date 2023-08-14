package Basic;
import java.util.Scanner;
//three stream->in(input stream)
//,out(print stream),err(err stream)
class A{
	public void call () {
		System.out.println("hello call function");
	}
}
public class Userinput {
	public static void main(String[] args) {
		A obj = new A();
		obj.call();
		System.out.println("Hello");
		System.out.println("Hello again");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a = ");
		int a = sc.nextInt();
		System.out.println("Enter b = ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("c= " +c);
		System.out.println("Enter double value = ");
		double d = sc.nextDouble();
		System.out.println(d);
		
	}

}
