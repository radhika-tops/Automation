package Basic;

class parent {
	public void call(){
		System.out.println("Parent Calling");
	}
}
class child extends parent{
	public void call() {
		System.out.println("child calling");
		super.call();
	}
}
public class OopsOverriding {
public static void main(String[] args) {
	child c = new child();
	c.call();
}
}
