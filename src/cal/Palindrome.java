package cal;
import java.util.Scanner;
public class Palindrome 
{
	
	static void NumberPelindromeChecker() 
	{
		Scanner sc=new Scanner(System.in);
		int num,n,rem,pelin=0;
		System.out.println("please enter the number for  you want to find pelindrome");
 		num=sc.nextInt();
 		n=num;
 		
 		while(num>0) 
 		{
 			rem=num%10;
 			pelin=pelin*10+rem;
 			num=num/10;
 		}
 		if(pelin==n)
 		{
 			System.out.println(n+"="+pelin);
 			System.out.println("The Number is Pelindrome");
 			}
 		else
 		{
 			System.out.println(n+"!="+pelin);
 			System.out.println("not pelindrome number");
 			}
	}
	static void WorldPelindromeChecker()
	{
		Scanner input=new Scanner(System.in);
		String original,reverse="";
		System.out.println("Enter the english world for check pelindrome ");
		original=input.nextLine();
		int num=original.length();
		for(int i=num-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println(original+"="+reverse+"\nString is a pelindrome");
		else
			System.out.println(original+"!="+reverse+"\n string is not a pelindrome");
	}


	public static void main(String[] args) {
		
		 int n ,choice;
		 Scanner in=new Scanner(System.in);
		 do
		 {
		 System.out.println("*---------------------------------------------------------------------------------------------------------------------------*\n");
		 System.out.println("it is Pelindrome Checker Program\"select which one operation you want to perform\" \n ");
		 System.out.println("  numberPelindome-->1\n  wordPelindrome-->2  ");
		 choice=in.nextInt();
		 switch(choice)
		 {
		 case 1:
			 System.out.println("*---------------------------------------------------------------------------------------------------------------------------*\n");
			 System.out.println("You choose ****NUMBER PELINDROME CHECKER****");
			 NumberPelindromeChecker();
			 break;
		 case 2:
			 System.out.println("*---------------------------------------------------------------------------------------------------------------------------\n*");
			 System.out.println("You choose ****WORD PELINDROME CHECKER****");
			  WorldPelindromeChecker();
			 break;
		 default:
			 System.out.println("invalid selection");
		 }
		 System.out.println("*---------------------------------------------------------------------------------------------------------------------------*");
		 System.out.println("press continue-->(1)\t close-->(0)\n ");
		 n=in.nextInt();
		 }
		 while(n>0);
 
	}
}