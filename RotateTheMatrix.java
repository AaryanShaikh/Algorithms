/*Write a program that takes a NxN square matrix as an input and rotates it clockwise by 90 degrees.
Input:
1  2  3
4  5  6
7  8  9
Output:
7  4  1
8  5  2
9  6  3
*/
import java.util.*;
public class RotateTheMatrix{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 3x3 Matrix");
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=0;
			}
		}
		b[0][2]=a[0][0];
		b[1][2]=a[0][1];
		b[2][2]=a[0][2];
		b[0][1]=a[1][0];
		b[1][1]=a[1][1];
		b[2][1]=a[1][2];
		b[0][0]=a[2][0];
		b[1][0]=a[2][1];
		b[2][0]=a[2][2];
		System.out.println("The Matrix After 90deg rotation is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
