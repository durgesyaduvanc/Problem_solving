package cal;
import java.util.Scanner;
public class Febbonic {

	public static void main(String[] args) {
	int num;
	int firstNum=0,secondNum=1,febbo=0;
	Scanner src=new Scanner(System.in);
	System.out.println("please enter how many times you want to print fibbonic series:\n");
	num=src.nextInt();
	if(num<0)
		System.out.println("invalid selection ! sorry");
	  else if(num==1)
	     System.out.println(" febbo=0");
	    else if(num==2)
		      System.out.println("febbo="+firstNum+"\nfebbo="+secondNum);
	  else {
		  System.out.println("febbo="+firstNum+"\nfebbo="+secondNum);
		  for(int i=0;i<=num;i++)
		  {
			febbo=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=febbo;
		   System.out.println("febbo="+febbo);
		  }
		System.out.println("0 to "+num+"\tbebbonic series print successfully");
		
	}
	src.close();
	
	}

}
