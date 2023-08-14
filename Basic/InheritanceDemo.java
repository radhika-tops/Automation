package Basic;
//OOPS -> object oriented programming system/structure
//1.Class -> structure in which 
//	we can have member function and member variables are there.
//2.OBJect-> instance of class
//3.Inheritance -> to access property one class to another class
//Types -> 1.single 2.multilevel 3.multiple(ambiguity) 4.hierarchical 5.hybrid 
//4.Polymorphism-> same function name but having different functionality
//Types -> 1.Compile time (overloading)
//		-> 2.Runtime (overriding)
//5.Abstraction -> hiding internal details and showing only 
//			essential information to user
//6.Encapsulation-> wrapping up data into single unit
class AA { //Parent / base class
	AA(){  //constructor
		System.out.println("A class constructor");
	}
	public void classAA() {
		System.out.println("Class A Function");
	}
}
class B extends AA{ // child / derived class
	public void classB() {
		System.out.println("Class B Function");
	}
}
class C extends B{
	public void classC() {
		System.out.println("Class C Function");
	}
}
class D extends AA{
	public void classD() {
		System.out.println("Class D Function");
	}
}
public class InheritanceDemo {
public static void main(String[] args) {
	B b = new B();
	b.classAA();
	b.classB();
	C c = new C();
	c.classAA();
	c.classB();
	c.classC();
}
}
