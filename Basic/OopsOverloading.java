package Basic;

class AAA {
	public void area (double r) {
		System.out.println("Area of Circle : "+(Math.PI*r*r));
	}
	public void area (double h, double b) {
		System.out.println("Area of triangle : "+((b*h)/2));
	}
	public void area (int l, int b) {
		System.out.println("Area of Rectangle : "+(l*b));
	}
}
public class OopsOverloading {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.area(3.3);
	}
}
