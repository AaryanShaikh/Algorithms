/* Password validator is a program that validates passwords to match specific rules. For example, the minimum length of the password must be eight characters long and it
should have at least one uppercase letter in it.
A valid password is the one that conforms to the following rules:
 - Minimum length is 5;
 - Maximum length is 10;
 - Should contain at least one number;
 - Should contain at least one special character (such as &, +, @, $, #, %, etc.);
 - Should not contain spaces.
*/
import java.util.*;
public class PasswordValidator{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your password for Validation");
		String input=in.nextLine();
		char ch[]=input.toCharArray();
		int space=0,num=0,spec=0,word=0;
		if(ch.length>=5&&ch.length<=10)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==' ')
				{
					space++;
				}
				else if(Character.isDigit(ch[i]))
				{
					num++;
				}
				else if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
				{
					word++;
				}
				else
				{
					spec++;
				}
			}
			if(space!=0||num==0||spec==0)
			{
				System.out.println("False");
			}
			else
			{
				System.out.println("True");
			}
		}
		else
		{
			System.out.println("False");
		}
	}
}
