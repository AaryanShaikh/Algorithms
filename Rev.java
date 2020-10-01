/* Write a program to reverse any given number
*/
import java.util.*;
class Rev
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int num=in.nextInt();
		int dig,rev=0;
		while(num!=0)
		{
			dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		System.out.println("The reverse is :"+rev);
	}
}
