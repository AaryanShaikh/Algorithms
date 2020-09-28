import java.util.*;
public class StringRotations
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		char ch2[]=new char[5];
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch2[0]=ch[1];
			ch2[1]=ch[2];
			ch2[2]=ch[3];
			ch2[3]=ch[4];
			ch2[4]=ch[0];
			for(int j=0;j<ch.length;j++)
			{
				System.out.print(ch2[j]);
			}
			for(int j=0;j<ch.length;j++)
			{
				ch[j]=ch2[j];	
			}
			System.out.println("");			
		}
	}
}