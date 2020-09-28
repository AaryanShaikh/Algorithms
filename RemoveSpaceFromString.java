import java.util.*;
public class RemoveSpaceFromString{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		char ch[]=str.toCharArray();
		char ch2[]=new char[ch.length];
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				ch2[k]=ch[i];
				k++;
			}
		}
		System.out.println("The String without Spaces");
		String str2=new String(ch2);
		System.out.println(str2);
	}
}