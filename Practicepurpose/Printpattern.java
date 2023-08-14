package Practicepurpose;
import java.util.Scanner;
public class Printpattern {
public static void main(String[] args) {
	/* Print star in 5 rows
	  int n,x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows");
	n=sc.nextInt();
	for (x=1;x<=n;x++) {
		for(y=1;y<=x;y++) {
			System.out.print("*");
		}
		System.out.println();
	}
	*/
	
	
/*	1
	22
	333
	4444
	55555
	
	int n,x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows");
	n=sc.nextInt();
	for (x=1;x<=n;x++) {
		for(y=1;y<=x;y++) {
			System.out.print(x);
		}
		System.out.println();
	}
	*/
	
/*1
12
123
1234
12345
*/
	int x,y;
	//Scanner sc = new Scanner(System.in);
	//System.out.println("Enter number of rows");
	//n=sc.nextInt();
	for (x=1;x<=5;x++) {
		for(y=1;y<=x;y++) {
			System.out.print(y);
		}
		System.out.println();
	}
	
	
	
	
	
/*	1
	01
	101
	01010
	101010
	*/
	System.out.println("\n");
	int x1,y1;
		for (x1=1;x1<=3;x1++) {
		for(y1=1;y1<=x1;y1++) {
			if((x1+y1)%2==0) {
			System.out.print(1);
			}
			else {
				System.out.print(0);
			}
		}
		System.out.println();
	}
		int a,b;
		for (a=4;a<=4;a++) {
		for(b=3;b<=2*a-1;b++) {
			if((a+b)%2==0) {
			System.out.print(1);
			}
			else {
				System.out.print(0);
			}
		}
		System.out.println();
	}	
		int k,l;
		for (k=5;k<=5;k++) {
		for(l=3;l<=2*k-2;l++) {
			if((k+l)%2==0) {
			System.out.print(1);
			}
			else {
				System.out.print(0);
			}
		}
		System.out.println();
	}		
		
		
	
	System.out.println("\n");
	int n=4,i,j,s;
	//Scanner sc = new Scanner (System.in);
	//System.out.println("Enter Number of rows: ");
	//n=sc.nextInt();
	for (i=1;i<=n;i++)
	{
		for(s=1;s<=n-i;s++)
			System.out.print(" ");
		for (j=1;j<=i;j++)
			System.out.print(i+" ");
		System.out.println();
	}

	
	
	System.out.println("\n");
	int row = 3, i1, j1, space = 1;  
	//System.out.print("Enter the number of rows you want to print: ");  
	//Scanner sc = new Scanner(System.in);  
	//row = sc.nextInt();  
	space = row - 1;  
	for (j1 = 1; j1<= row; j1++)  
	{  
	for (i1 = 1; i1<= space; i1++)  
	{  
	System.out.print(" ");  
	}  
	space--;  
	for (i1 = 1; i1 <= 2 * j1 - 1; i1++)  
	{  
	System.out.print("*");  
	}  
	System.out.println("");  
	}  
		
	space = 1;  
	for (j1 = 1; j1<= row - 1; j1++)  
	{  
	for (i1 = 1; i1<= space; i1++)  
	{  
	System.out.print(" ");  
	}  
	space++;  
	for (i1 = 1; i1<= 2 * (row - j1) - 1; i1++)  
	{  
	System.out.print("*");  
	}  
	System.out.println("");
	}
	
} 
}
