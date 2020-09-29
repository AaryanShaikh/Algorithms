/*The Caesar cipher is a type of substitution cipher in which each letter in the plaintext is shifted to a certain number of places down the alphabet. 
For example, with a shift of 1, A would be replaced by B, B would become C, and so on. The method is named after Julius Caesar, who allegedly used it to communicate 
with his generals.
For example:
Input: "defend the east wall of the castle"
Output: "efgfoe uif fbtu xbmm pg uif dbtumf"*/
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
