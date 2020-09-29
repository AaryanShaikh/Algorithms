//An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
//For instance, a 3 digit number will be considered an Armstrong number if the sum of the cubes of its digits is equal to the number itself. 
//For example, 153 is an Armstrong number, as 1*3 + 53 + 3*3 = 153
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
