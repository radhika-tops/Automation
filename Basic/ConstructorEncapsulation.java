package Basic;
//Encapsulation: Wrapping up of data into a single unit.
import java.util.Scanner;

class user{
	private int id;
	private String name;
	private long contact;
	user(){
		
	}
	user (int id, String name, long contact){
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "id: "+id+ "  name: "+ name+ "  contact: "+contact;
	
	}
}


public class ConstructorEncapsulation {
	public static void main(String[] args) {
		user u2 = new user(1, "Java", 9865432100l);
		System.out.println(u2);
		user u3 = new user(2, "Selenium", 9865432199l);
		System.out.println(u3);
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		int id = sc.nextInt();
		System.out.println("enter name : ");
		String name = sc.next();
		User u1 = new User();
		u1.setId(id);
//		u1.id=13;
		u1.setName(name);
		System.out.println(u1.getId());
		System.out.println(u1.getName());*/
		
	}

}
