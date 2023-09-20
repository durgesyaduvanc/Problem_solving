package cal;
import java.util.Scanner;

public class Prime {
	private  static void primeChecker() {
		//create Scanner class object for take input through user:
		Scanner sc=new Scanner(System.in);
		// take two variable 
		int num,flag=0;
		System.out.println("\n************************************************************************************************************************\n");
		System.out.println("please enter the number for check prime");
		//take input to the user
		num=sc.nextInt();
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				flag++;
			
		}
		if(flag!=0)
			System.out.println(num+" is not a prime number");
		else
			System.out.println(num+" is prime number");
	}
	private static void totalPrime() {
		Scanner sc=new Scanner(System.in);
		// take two variable 
		int number,i,j;
		int flag=0;
		System.out.println("\n************************************************************************************************************************\n");
		System.out.println("enter the number for how many times you want to print prime number");
		number=sc.nextInt();
		for( i=1;i<=number;i++) {
			for( j=2;j<=i;j++) {
				if(i%j==0)
					break;
				
			}
			if(i==j)
				System.out.println(i);
		    	}

	}

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	int n;
	
	
	
	int choice ;
	do {
		System.out.println("\n************************************************************************************************************************\n");
		System.out.println("please enter the choice for which one you want to perform");
		System.out.println("prees 1 for \"primeChecker()\" \n press 2 for \"totalPrime()\"");
		choice=input.nextInt();
		switch(choice) {
		case 1:
			Prime.primeChecker();
			break;
		case 2:
			Prime.totalPrime();
			break;
		default:
			System.out.println("invalid choice?");
		
	
	}
	System.out.println("\n************************************************************************************************************************\n");
	System.out.println("please press 1 for *continue* \n press 0 or  any key for close ");
	n=input.nextInt();
	}
	while(n==1);

	}

}
