package AssignmentProgram;

abstract class parent{
	public abstract void message();
}
class FirstSubClass extends parent{
	public void message() {
		System.out.println("This is first SubClass");
	}
}
class SecondSubClass extends parent{
	@Override
	public void message() {
		System.out.println("This is Second SubClass");
		
	}
}
public class Question_25 {
	public static void main(String[] args) {
		parent obj1 = new FirstSubClass();
		parent obj2 = new SecondSubClass();
		obj1.message();
		obj2.message();
	}
  
}
