import java.util.*;
public class Armstrong
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to check if it's Armstrong no or not");
		int num=in.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			int cal=rem*rem*rem;
			sum=sum+cal;
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("The number is an Armstrong number");
		}
		else
		{
			System.out.println("The number is not an Armstrong number");	
		}
	}
}