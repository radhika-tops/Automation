package Basic;
 final class A1{
	//to use final keyword because it cannot change int value.
	final int i=1;
	final public void change() {
	//	i++;
		System.out.println(i);
	}
}
class B1 extends A1{
	public void change() {
		super.change();
	}
}
public class OopsFinalKeyword {
	public static void main(String[] args) {
		B1 b = new B1();
		b.change();
	}
}
