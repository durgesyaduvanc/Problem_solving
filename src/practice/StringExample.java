package practice;

public class StringExample {
	public static void main(String[] args)
	{
	String name="durgesh yadav";
	String str="";
	char ch;

	for(int i=0;i<name.length();i++)
	{
		ch=name.charAt(i);
		int b=ch;
		if(ch==' ')
		{
			continue;
		}
		System.out.printf("%c",b+32);
	
}
	}
}
