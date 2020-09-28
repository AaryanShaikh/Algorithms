import java.util.*;
public class Scrabble{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of strings");
		int size=Integer.parseInt(in.nextLine());
		System.out.println("Enter the strings");
		String str[]=new String[size];
		int res[]=new int[size];
		for(int i=0;i<size;i++)
		{
			str[i]=in.nextLine();
		}
		for(int i=0;i<size;i++)
		{
			char ch[]=str[i].toCharArray();
			for (int j=0;j<ch.length;j++) 
			{
				if(ch[j]=='q'||ch[j]=='Q'||ch[j]=='z'||ch[j]=='Z')
				{
					res[i]+=10;
				}
				else if(ch[j]=='j'||ch[j]=='J'||ch[j]=='x'||ch[j]=='X')
				{
					res[i]+=8;
				}
				else if(ch[j]=='k'||ch[j]=='K')
				{
					res[i]+=5;
				}
				else if(ch[j]=='f'||ch[j]=='F'||ch[j]=='h'||ch[j]=='H'||ch[j]=='v'||ch[j]=='V'||ch[j]=='w'||ch[j]=='W'||ch[j]=='y'||ch[j]=='Y')
				{
					res[i]+=4;
				}
				else if(ch[j]=='b'||ch[j]=='B'||ch[j]=='c'||ch[j]=='C'||ch[j]=='m'||ch[j]=='M'||ch[j]=='p'||ch[j]=='P')
				{
					res[i]+=3;
				}
				else if(ch[j]=='d'||ch[j]=='D'||ch[j]=='g'||ch[j]=='G')
				{
					res[i]+=2;
				}
				else
				{
					res[i]+=1;
				}
			}
		}
		int max=res[0];
		int id=0;
		for (int i=1;i<res.length;i++)
		{
			if(res[i]>max)
			{
				id=i;
				max=res[i];
			}
		}
				System.out.println("The highest score is="+str[id]);
	}
}