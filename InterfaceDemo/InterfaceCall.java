package InterfaceDemo;
//interface -> is same as class but not class.
//-> cannot create object of interface
//-> can create reference of interface
//->by default all properties are abstract in interface
//->it provides 100% abstraction
//->when work with class implements keyword uses
//->multiple class cannot inherited but 
//  we can implement more than one interface in single class
//->when interface is implemented than properties of interface
//  should be defined/implements in class 

class InterImple implements Inter1,Inter2{

	@Override
	public void interface3() {
		System.out.println("interface 3");
		
	}

	@Override
	public void interface2() {
		System.out.println("interface 2");
		
	}

	@Override
	public void interface1() {
		System.out.println("interface 1");
		
	}
	
}
public class InterfaceCall {
	public static void main(String[] args) {
		InterImple i = new InterImple();
		i.interface1();
		i.interface2();
		i.interface3();
		Inter1.interfacee1();
		Inter2.interfacee2();
		Inter3.interfacee3();
		
	}

}
