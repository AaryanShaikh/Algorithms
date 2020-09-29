/*You run a hovercraft factory. Your factory makes ten hovercrafts in a month. Given the number of customers you got that month, did you make a profit? It costs you
2,000,000 to build a hovercraft, and you are selling them for 3,000,000. You also pay 1,000,000 each month for insurance.
Input Format: 
An integer that represents the sales that you made that month.
Output Format: 
A string that says 'Profit', 'Loss', or 'Broke Even'.
Sample Input: 
5
Sample Output: 
Loss*/
import java.util.Scanner;
public class Hovercraft{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num = in.nextInt();
		int total = 21000000;
		int res = num*3000000;
		if (res>total) {
			System.out.println("Profit");
		}
		else if (res==total) {
			System.out.println("Broke Even");
		}
		else{
			System.out.println("Loss");
		}
	}
}
