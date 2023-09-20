package practice;
import java.util.Scanner;
public class CompareObject 
{
//	public static void main(String r[])
//	{
////		Scanner p=new Scanner(System.in);
////		char name=p.next().charAt(0);
////		System.out.println(name);
//		
//		Scanner p=new Scanner(System.in);
//		String name=p.next();
//		String sirname=p.next();
//		char[] name1=name.toCharArray();
//		char[] sirname1=sirname.toCharArray();
//		int n=name1.length;
//		int m=sirname1.length;
//		for(int i=0;i<n;i++)
//		{
//			if(name1[i]!=sirname1[n-i+1])
//			{
//				System.out.println("Not Palindrome");
//				break;
//			}
//		}
//		
//	}
	
	public static boolean isPalindrome(int i, int j,String A)
    {
       // comparing the two pointers
      if (i >= j) 
      {
            return true;
      }
       // comparing the characters on those pointers
      if (A.charAt(i) != A.charAt(j)) 
      {
         return false;
      }
       // checking everything again recursively
       return isPalindrome(i + 1, j - 1, A);
      }

  public static boolean isPalindrome(String A)
  {
    return isPalindrome(0, A.length() - 1, A);
  }

// main function
public static void main(String[] args)
{
// Input string
String A = "mom";

// Convert the string to lowercase
A = A.toLowerCase();
int i=0;
int j=A.length()-1;
boolean str = isPalindrome(i,j,A);
System.out.println(str);
}
}
