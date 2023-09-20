package practice;
import java.util.Scanner;

 public class WithoutMain  {
	 static int x;
	 WithoutMain (int x)
	 {
		 this.x=x;
		 System.out.println(WithoutMain.x);
	 }
	 void display()
	{
		System.out.println("hello world this me"+x);
	}
	static {
		int x,y,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		x=sc.nextInt();
		System.out.println("enter the Second number");
		y=sc.nextInt();
		result=x+y;
		System.out.println("result="+result);
		
		
		
	}
public static void main(String[] arg)
{
 
	System.out.println("this is main");
	WithoutMain wm=new WithoutMain (10);
	wm.display();
}
}