package practice;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,num,product=0,mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number for check its spy or not");
		num=sc.nextInt();
		while(num>0)
		{
			n=num%10;
			product=product+n;
			mul=mul*n;
			num=num/10;
			
		}
		if(product==mul)
			System.out.println("sum="+product+"multiply="+mul+"Both are equal\n so it is spy number ");
		else
			System.out.println("sum="+product+"multiply="+mul+"Both are not equal\n so it is not spy number ");	

	}

}
