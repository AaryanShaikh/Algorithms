/*A number is called a Disarium number if the sum of the powers of its digits equals the number itself. The digits are powered to their positions in the number.
Input: 135
Output: true
135 is a Disarium number because it equals to 1^1 + 3^2 + 5^3 (each digit powered to the position in the number).*/
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
