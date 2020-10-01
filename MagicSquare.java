//A magic square is a square matrix of distinct numbers in which the sum of the numbers in each row, column and diagonal is equal. The sum is called the magic sum.
//Input:
//4 3 8
//9 5 1
//2 7 6
//Output: 15
import java.util.*;
public class MagicSquare
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a[][]=new int[5][5];
		System.out.println("Enter a 3x3 Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		int i=0,j=0,row1=0,row2=0,row3=0,col1=0,col2=0,col3=0;
		for(j=0;j<3;j++)
		{
			row1+=a[i][j];
		}i++;
		for(j=0;j<3;j++)
		{
			row2+=a[i][j];
		}i++;
		for(j=0;j<3;j++)
		{
			row3+=a[i][j];
		}
		j=0;
		for(i=0;i<3;i++)
		{
			col1+=a[i][j];
		}j++;
		for(i=0;i<3;i++)
		{
			col2+=a[i][j];
		}j++;
		for(i=0;i<3;i++)
		{
			col3+=a[i][j];
		}
		if(row1==row2&&row2==row3&&col1==col2&&col2==col3)
		{
			System.out.println("Its's a Magic Square!");
		}
		else
		{
			System.out.println("Its's not a Magic Square!");
		}
	}
}
