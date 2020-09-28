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