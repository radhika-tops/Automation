package TestProgram;
//import java.util.Scanner;
public class pattern {
public static void main(String[] args) {
	//Scanner sc= new Scanner(System.in);
//Q.1
	int n= 5;
	for (int r=1; r<=n;r++) {
		for (int c=1; c<=r;c++) {
			System.out.print(c+ " ");
		}
		System.out.println();
	}
	
//Q.2
	for (int r=1;r<=4;r++) {
		for (int c=1;c<=r;c++) {
			System.out.print(r);
		}
		System.out.println();
	}
	
//Q.3
	
	for (int r=1;r<=3;r++) {
		for (int c=1;c<=r;c++) {
			if((r+c)%2==0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
		System.out.println();
	}
	for (int r=5;r<=5;r++) {
		for (int c=0;c<=4;c++) {
			if((r+c)%2==0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
		System.out.println();
	}
	for (int r=6;r<=6;r++) {
		for (int c=0;c<=5;c++) {
			if ((r+c)%2==0){
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
		System.out.println();
	}
	
//Q.4	
	int m,j, p=4;
	for (m=1; m<=p;m++){
		for (j=1;j<=p-m;j++) {
			System.out.print(" ");
		}
		for (j=1;j<=m;j++) {
			System.out.print(m + " ");
		}
		System.out.println();
	}
	
//Q.5
	
	int s,o,q=1;
	for (s=1; s<=3;s++){
		for (o=1;o<=q-s;o++) {
			System.out.print(" ");
		}
		for (o=1;o<=2*s-1;o++) {
			System.out.print("*");
		}
		System.out.println();
	}

	
	
}
}
