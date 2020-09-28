//Program to check if the number is Anti-Lychrel Number or not
import Xero.X;
import java.util.*;
public class AntiLychrel
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=in.nextInt();
		int rev=X.doRev(num);
		int count=0;
		for(int i=1;i<50;i++)
		{
			int sum=num+rev;
			if(X.isPalindrome(sum))
			{
				System.out.println("Number is an Anti-Lychrel Number");
				break;
			}
			else if(i==30)
			{
				System.out.println("Number is not an Anti-Lychrel Number");
				break;
			}
			else
			{
				num=sum;
				rev=X.doRev(num);
			}
		}
	}
}