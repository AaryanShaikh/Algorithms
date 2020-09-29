/*You have a bowl on your counter with an even number of pieces of fruit in it. Half of them are bananas, and the other half are apples. You need 3 apples to make a pie.
Sample Input
26 
Sample Output 
4
*/
import java.util.Scanner;
public class FruitBowl{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fruit = in.nextInt();
		int res = fruit/2;
		res = res/3;
		System.out.println(res); 
	}
}
