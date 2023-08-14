package AssignmentProgram;
import java.util.Scanner;
//Q.11 WAP to find the index of an array element.
public class Question_11 {
	public static void main(String[] args) {
		int arr[]= {35,78,40,29,99,100,55,77};
		int element= 100;
		int index =-1;
		int i=0;
		while(i<arr.length) {
			if(arr[i]== element) {
				index=i;
				break;
			}
			i++;
		}
		System.out.println("Index of "+element+ ":" +index);
		

	}

}
