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