/*You want to take a list of numbers and find the sum of all of the even numbers in the list. Ignore any odd numbers.

Task:
Find the sum of all even integers in a list of numbers.

Sample Input: 
9 
1 2 3 4 5 6 7 8 9

Sample Output: 
20
*/
import java.util.Scanner;
public class ThatsOdd{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size = in.nextInt();
		int ele[] = new int[size];
		for (int i=0;i<size ;i++ ) {
		 	ele[i] = in.nextInt();
		 }
		 int sum = 0;
		 for (int i=0;i<size ;i++ ) {
		  	if (ele[i]%2==0) {
		  		sum = sum+ele[i];
		  	}
		  }
		  System.out.println(sum); 
	}
}
