package AssignmentProgram;
import java.util.Scanner;
class InsufficientException extends Exception{
	double balance;
	double withdrawbal;
	public InsufficientException(String msg) {
		super(msg);
	}
	void withdraw() {
		double balance = 2000.00;
		System.out.println("Current Balance: "+balance);
		try {
		System.out.print("Enter withdraw amount: ");
		Scanner in = new Scanner(System.in);
		double withdrawlamt = in.nextDouble();
		if(withdrawlamt>balance) {
			double lessamt = withdrawlamt-balance;
			throw new InsufficientException("Sorry, insufficient balance, you need more "+ lessamt+" Rs. to perform this transaction");
		}
		else {
			System.out.println("Transaction successfully completed");
		}
		double remainingbal = balance-withdrawlamt;
		System.out.println("Your withdrawal Amount is : "+withdrawlamt);
		System.out.println("After transaction your current balance is : "+remainingbal);
		
		//double lessamt =withdrawlamt-balance;
		//System.out.println("you need more amount "+lessamt);
	}
	catch(InsufficientException e){
		 System.out.println(e.getMessage());
	 }
	}
	}
public class Question_27CustomException {
		private static String lessamt;

		public static void main(String args[])  {
			InsufficientException ie=new InsufficientException("Sorry, insufficient balance, you need more"+ lessamt+" Rs. to perform this transaction");
			 ie.withdraw();
}
}


