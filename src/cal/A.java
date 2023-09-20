package cal;
import java.util.Scanner;

public class A {
	int add() {
		Scanner input=new Scanner(System.in);
		int a;
		a=input.nextInt();
		int b;
		b=input.nextInt();
		return (a+b);
		
	}
	public static void main(String[] args) {
		System.out.println("the vlue of two number is ");
		
		int x=new A().add();
		System.out.println(x);
		
	}

}
