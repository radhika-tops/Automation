package AssignmentProgram;
//Q.14 WAP to concatenate a given string to the end of another string.
public class Question_14 {
	public static void main(String[] args) {
		String str1 = "Hello This is ";
		String str2 = "Java Program";
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		
		//Concatenate the two strings together
		String str3 = str1.concat(str2);
		
		//Display the new string
		System.out.println("The concatenated string: "+str3);
	}

}
