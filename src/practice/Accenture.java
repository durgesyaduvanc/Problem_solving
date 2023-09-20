package practice;
import java.util.Arrays;
import java.util.Scanner;

public class Accenture {

	public static void main(String[] args) {
		
		int[] arr= {1,5,6,1,2,3,4,7,8,9,5,4,1,2,3,6,5,4,7,8,9,6,5,4,1,2,3,6,5,4,1,2,5,4,6,3,12,54,56,2,2,1,4,5,2,3,6,5,12,12,2};
		int i,j,count=0,n=0;
		int max=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		//n=sc.nextInt();
		Arrays.sort(arr);
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		for(i=0;i<arr.length;i++)
		{
			count=0;
			for( j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				else
				{   
					break;
				}
					
			}
			if(count>=1)
			{
				System.out.println("\n"+arr[i]+"--------->"+count);
				i=j-1;
				
			}
			if(max<count)
			{
				max=count;
				n++;
			}
			
		}
		System.out.println("maximum time repeated number is "+n+" repeat="+max);
		
		
		
		
	}

}
