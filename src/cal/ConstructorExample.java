package cal;
 import java.util.Scanner;
public class ConstructorExample {
	String name;
	String fatherName;
	String DOB;
	long Mob;
	static int temp;
//parameterize  constructor that take three input:
	ConstructorExample(String n,String f,String d,long m)

	{
	name=n;
	fatherName=f;
	DOB=d;
	Mob=m;
	}
//Parameterize constructor that take two input through object creation:
 ConstructorExample( String n, String f) {
		// TODO Auto-generated constructor stub
	 name=n;
	 fatherName=f;
 }
 //Default constructor :
 ConstructorExample()
 {
	System.out.println("default constructor");
 }
//init block body start;
 {
	
	
	temp++;
	
 }
 public void display() {
	 System.out.println("student name="+name);
	 System.out.println("father name="+fatherName);
	 System.out.println("student DOB="+DOB);
	 System.out.println("student Mobile.No="+Mob);}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample studentDetails0=new  ConstructorExample();
		ConstructorExample studentDetails1=new  ConstructorExample("durgesh","Ravindra Yadav","20/05/2002",72038027072l);
		ConstructorExample studentDetails2=new ConstructorExample("Raju","Girdhari");
		 
		studentDetails1.display();
		studentDetails2.display();
		//its print total number of constructor present in program:
		System.out.println("total number of constructor="+temp);
	}

}
