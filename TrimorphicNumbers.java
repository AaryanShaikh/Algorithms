/*A trimorphic number is a number whose cube ends in the number itself. 
For example:
Input: 4
Output: true (4^3 is 64, which ends in 4)
*/
import Xero.X;
import java.util.*;
class TrimorphicNumbers
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int count=0,dig,rev=0,rev1;
		int temp=n;
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		temp=n;
		int result=n*n*n;
		for(int i=0;i<count;i++)
		{
			dig=result%10;
			rev=rev*10+dig;
			result=result/10;
		}
		rev1=X.doRev(rev);
		if(temp==rev1)
		{
			System.out.println("The number "+temp+" is a Trimorphic Number");
		}
		else
		{
			System.out.println("The number "+temp+" is a not Trimorphic Number");
		}
	}
}
