package Practicepurpose;
//Operator in Java is a symbol that is used to perform operations
public class practicesample {
	public static void main(String[] args) {
		
		/*Java Unary Operator Example: ++ and --
		int x= 10;
		System.out.println(x++); //10 (11) 
		System.out.println(++x); //12 
		System.out.println(x--); //12 (11)
		System.out.println(--x); //10
		*/
		
		/*Java Unary Operator Example 2: ++ and --
		int a =10;
		int b = 10;
		System.out.println(a++ + ++a); //10+12=22
		System.out.println(b++ + b++); //10+11=21
		*/
		
		/*Java Unary Operator Example: ~ and !
		int a= 10;
		int b= -10;
		boolean c = true;
		boolean d = false;
		System.out.println(~a); //-11 (minus of total positive value which starts from 0)
		System.out.println(~b); //9 (positive of total minus, positive starts from 0)
		System.out.println(!c); //false (opposite of boolean value)  
		System.out.println(!d); //true
		*/
		
		/*Java Arithmetic Operator Example
		int a = 10;
		int b = 5;
		System.out.println(a+b); //15
		System.out.println(a-b); //5
		System.out.println(a*b); //50
		System.out.println(a/b); //2
		System.out.println(a%b); //0
		*/
		
		/*Java Arithmetic Operator Example: Expression
		 * Java arithmetic operators are used to perform addition, subtraction, multiplication, and division. 
		 * They act as basic mathematical operations.
		 
		System.out.println(10*10/5+3-1*4/2);
		
		//Calculation demo
		20+3-1*2
		20+3-2
		20+1
		*/
		
		/*Java Left Shift Operator Example
		//The Java left shift operator << is used to shift all of the bits in a value to the left side of a specified number of times.
		
		System.out.println(10<<2); //10*2^2=10*4=40
		System.out.println(10<<3); //10*2^3=10*8=80
		System.out.println(20<<2); //20*2^2=20*4=80
		System.out.println(15<<4); //15*2^4=15*16=240
		
		*/
		
	//	Java Right Shift Operator Example
		//The Java right shift operator >> is used to move the value of the left operand to right by the number of bits specified by the right operand.
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2
		
	}

}
