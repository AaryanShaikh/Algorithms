//Program to find if a number is Disarium Number or not
import java.util.*;
class DisariumNumbers
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to check if the number is Disarium Number or not");
		int n=in.nextInt();
		int i=0,j=0,result=0,count=0,temp1;
		int a[]=new int[5];
		int temp=n;
		while(temp!=0)
		{
			a[i++]=temp%10;
			temp/=10;
		}
		count=i;
		while(count!=0)
		{
			temp1=a[j];
			for(int k=0;k<count-1;k++)
			{
				temp1*=a[j];
			}
			result+=temp1;
			count--;j++;
		}
		if(result==n)
		{
			System.out.println(n+" is a Disarium Number");
		}
		else
		{
			System.out.println(n+" is not a Disarium Number");
		}
	}
}