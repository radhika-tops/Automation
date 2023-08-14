package Basic;

abstract class RBI{ //Parent class, which having same data in all their class so used abstract keyword in parent class.
	abstract public void interest();
	abstract public void Homeloan();
	public static void reporate() {
		System.out.println("reporate : +-4%");
	}
}
class SBI extends RBI{

	public void interest() {
		System.out.println("SBI interest : 7%");	
	}

	public void Homeloan() {
		System.out.println("SBI Homeloan : 8%");
		
	}
	
}
class Java extends RBI{

	public void interest() {
		System.out.println("Java interest : 9%");
	}

	public void Homeloan() {
		System.out.println("Java Homeloan : 10%");
	}
}
public class AbstractionDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.Homeloan();
		Java j = new Java();
		j.interest();
		j.Homeloan();
		SBI.reporate();
		Java.reporate();
	}
}
