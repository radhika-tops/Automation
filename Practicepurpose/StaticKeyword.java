package Practicepurpose;
//Static variable -> to allocate same memory for every object
//static method-> call by directly class name
//static block -> will execute before main

class student{
	int id;
	String name;
	long contact;
	public void call() {
		id = 12;
		System.out.println("Call method in student class");
	}
	public static void calling() { //static method
		System.out.println("Static method in student call");
	}
	static { //static block
		System.out.println("Static block in student class");
	}
}
public class StaticKeyword {
	static {
		System.out.println("Static block in student class");
	}
	public static void main(String[] args) {
		
		student s = new student();
		s.call();
		student.calling(); //static method call by directly class name
	}
	

}
