import java.util.*;
public class TelephoneNumber{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		String str=in.nextLine();
		char ch[]=str.toCharArray();
		System.out.println("Telephone Number is:");
		if(ch.length<=10)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(i==0)
				{
					System.out.print("("+ch[i]);
				}
				else if(i==2)
				{
					System.out.print(ch[i]+") ");
				}
				else if(i==5)
				{
					System.out.print(ch[i]+"-");
				}
				else
				{
					System.out.print(ch[i]);
				}
			}
		}
		else
		{
			for(int i=0;i<ch.length;i++)
			{
				if(i==0)
				{
					System.out.print("(+"+ch[i]);
				}
				else if(i==2)
				{
					System.out.print(ch[i]+") ");
				}
				else if(i==5)
				{
					System.out.print("-"+ch[i]);
				}
				else if(i==8)
				{
					System.out.print("-"+ch[i]);
				}
				else
				{
					System.out.print(ch[i]);
				}
			}
		}
	}
}