//Program to encript the data using Caesar Cipher
import java.util.*;
public class CaesarCipher
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String you want to encript");
		String str=in.nextLine();
		char temp;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
			else if((ch[i]>'a'||ch[i]<'z')&&(ch[i]>'A'||ch[i]<'Z'))
			{
				temp=ch[i];
				temp--;
				temp--;
				temp--;
				ch[i]=temp;
			}
		}
		String str2=new String(ch);
		System.out.println("The encripted String is:");
		System.out.println(str2);
	}
}