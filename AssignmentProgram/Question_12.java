package AssignmentProgram;
import java.util.Arrays;
import java.util.Scanner;
//Q.12 WAP to find the maximum and minimum value of an array.
public class Question_12 {
public static void main(String[] args) {
//	Scanner sc=new Scanner (System.in);
//	int arr[]=new int[5];
//	System.out.println("Enter elements in array: ");
//	int min=Integer.MAX_VALUE;
//	int max=Integer.MIN_VALUE;
//	for (int i=0;i<=4;i++) {
//		arr [i]=sc.nextInt();
//		if (arr [i]<min)
//		{
//			min=arr[i];
//		}
//		if (arr[i]>max) {
//			max=arr[i];
//		}
//	}
//	System.out.println("Maximum element is:  "+max);
//	System.out.println("Minimum element is:  "+min);
	
	
	int a[]= {8,55,61,98,10,100,25};
	Arrays.sort(a);
	
	System.out.println("min " + a[0]+"\nmax " + a[6]);
}
}
