package AssignmentProgram;
import java.util.Scanner;
public class Question_22 {
	public static void main(String[] args) {
		
		/*int[] arr = {5, 4, 3, 2, 1};
	    int[] copyArr = new int[arr.length];
	    
	    //For loop to copy the content of array 'arr' to array 'copyArr'
	    for(int i = 0; i<arr.length; i++)
	       copyArr[i] = arr[i];
	    
	    System.out.println("The original array is: ");
	    for (int i = 0; i < arr.length; i++)
	        System.out.print(arr[i] + " ");
	  
	    System.out.println("\n\nContents of the copied array is");
	    for (int i = 0; i < copyArr.length; i++)
	        System.out.print(copyArr[i] + " ");
	        */
		
		int i[]= {1,2,3,4,5,6,7,8,9,10};
		int copyarray[]= new int[i.length];
		
		
		for(int index=0;index<i.length;index++)
			copyarray[index]=i[index];
		//original array
		System.out.println("Original array");
		for(int index=0;index<i.length;index++) 
			System.out.print(i[index]+" ");
			System.out.println("\n\nContents of the copied array is");
		    for (int index = 0; index < copyarray.length; index++)
		        System.out.print(copyarray[index] + " ");
		    
		
	}
}

