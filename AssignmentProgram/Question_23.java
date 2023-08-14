package AssignmentProgram;



public class Question_23 {
	public static void main(String[] args) {
		int i[]= {1,2,3,4,5,6,7,8,9,10};
		//original array
		System.out.println("Original array");
		for(int index=0;index<i.length;index++) {
			System.out.print(i[index]+" ");
		}
		System.out.println();
		System.out.println("\nIn Reverse Order");
		//reverse loop
		for(int index=i.length-1;index>=0;index--) {
			System.out.print(i[index]+" ");
		}
				}
}
