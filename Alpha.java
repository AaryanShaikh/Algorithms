import java.util.*;
public class Alpha
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a character to check if it's an alphabet");
		char ch=in.next().charAt(0);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
		{
			System.out.println(ch+" is an alphabet");
		}
		else
		{
			System.out.println(ch+" is not an alphabet");
		}
	}
}