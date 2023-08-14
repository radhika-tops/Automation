package AssignmentProgram;

import java.util.Arrays;

public class Question_24 {
	public static void main(String[] args) {
		//first program
		/*int i[]= {1,2,3,4,5,6,7,8,9,10};
		int Largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int current : i) {
			if(current>Largest) {
				secondLargest = Largest;
				Largest = current;
			}else if (current>secondLargest) {
				secondLargest = current;
			}
				
		}
		System.out.println("Second largest number is : "+secondLargest);
		*/
		
		
		//Second program//this is good
		{
			int i[]= {20,87,90,76,55,26,101,209};
			Arrays.sort(i);
			System.out.println("Second Largest Number is : "+i[i.length-2]);
		}
	}
}
