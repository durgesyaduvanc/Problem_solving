package cal;

public class innerClass {
	void add() {
		System.out.println("inner class object:");
	int	a=10;
	int	b=20;
	int c=a+b;
	System.out.println("addition of two number is:"+c);
	
	}
	public class inner{
		void inner1(){
	System.out.println("it is second inner class");
System.out.println("it is second class");}

		}
		
	}
class abd{
	public static void main(String[] args)
	{
		innerClass in=new innerClass();
		innerClass.inner in1=in.new inner();
		in.add();
		in1.inner1();
	}
	
}
	



