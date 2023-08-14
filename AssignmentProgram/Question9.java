package AssignmentProgram;
//Q.9 WAP to sum values of an array.
public class Question9 {
	public static void main(String[] args) {
		//intialize array
		int arr[]= new int [] {1,2,3,4,5};
		int sum=0;
		 //Loop through the array to calculate sum of elements 
		for (int i=0;i<arr.length;i++) {
			sum= sum+arr[i];
		}
		System.out.println("Sum of the elements of an array: " +sum);

	
	}

}
