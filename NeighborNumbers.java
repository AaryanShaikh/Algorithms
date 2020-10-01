/*Given two strings as input, write a program to find which numbers from the first string are present in the second string. Print the result as a string containing the
matched numbers in ascending order.
For example:
Input:
"12, 13, 15, 19, 212, 556, 2146"
"13, 44, 432, 12, 788, 246, 2146, 46"
Output: "12, 13, 2146"
*/
import java.util.*;
public class NeighborNumbers
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the First array");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the size of the Second array");
		int size2=in.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enter the elements");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=in.nextInt();
		}
		System.out.println("Neighbor Numbers are:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(arr[i]==arr2[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}
