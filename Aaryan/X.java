package Aaryan;
public class X
{
	public static boolean isPrime(int x)//To return if Prime or not
	{
		int n=x,flag=0,rem;
		for(int i=2;i<n;i++)
		{
			rem=n%i;
			if(rem==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			return (true);
		}
		else
		{
			return (false);
		}
	}
	public static int doRev(int x)//To reverse a number
	{
		int num=x,dig=0,rev=0;
		while(num!=0)
		{
			dig=num%10;//extract the last digit
			rev=rev*10+dig;//reversing
			num/=10;//reducing the number
		}
		return rev;
	}
	public static boolean isPalindrome(int x)//To return if Palindrome or not
	{
		int num=x;
		int num2=doRev(num);
		if(num==num2){return (true);}
		else{return (false);}
	}
	public static int doFact(int x)
	{
		int num=x;
		for(int i=num-1;i>1;i--)
		{
			num*=i;
		}
		return num;
	}
}
