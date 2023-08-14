package TestProgram;
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter Size of Array: ");
				//Take input for size of array
				int size=sc.nextInt();
				//To assign size to array
				int arr[]=new int[size];
				//take user input in array
				for(int index=0;index<arr.length;index++) {
					System.out.println("Enter element at arr"+index+"]: ");
					arr[index]=sc.nextInt();
				}
					//addition of elements
					int sum=0;
					for(int index=0;index<arr.length;index++) {
						sum=sum+arr[index];
						
					}
					//binary search operation
					System.out.println("sum= "+sum);
					System.out.println("Enter Number to search in array: ");
					int num = sc.nextInt();
					int counter=0;
					for (int index=0; index<arr.length;index++) {
						if(num == arr[index]) {
							counter++;
						}
					}
					if(counter>0) {
						System.out.println("yes "+num+" is exist " +counter+ " times");
					}
					else {
						System.out.println("no");
					}
				}
	}


