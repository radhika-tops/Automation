package AssignmentProgram;

import java.util.Scanner;
//Q.10 WAP to calculate the average value of array elements.
public class Question_10 {
	public static void main(String[] args) {
		int num[]=new int [] {1,2,3,4,5};
		//calculate sum of all array elements
		int sum=0;
		for (int j=0;j<num.length;j++) {
			sum= sum+num[j];
		}
		System.out.println("Sum of the elements of an array: " +sum);
		//calculate average value of array
		double average= sum/num.length;
		System.out.println("Average value of array is :" +average);	
						
				
	}
}


