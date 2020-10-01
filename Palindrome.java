/* Write a program to check if a number its palindrome or not
*/
import java.util.*;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no to check if it's a Palindrome");
		String num=in.nextLine();
		char arr[]=num.toCharArray();
		int len=arr.length;
		char temp[]=new char[len];
		int j=0;
		for(int i=len-1;i>=0;i--)
		{
			temp[j]=arr[i];
			j++;
		}
		String num2=String.valueOf(temp);
		if(num.equals(num2))
		{
			System.out.println("The number is a Palindrome");
		}
		else
		{
			System.out.println("The number is not a Palindrome");
		}
	}
}
