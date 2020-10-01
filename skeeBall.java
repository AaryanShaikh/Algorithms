/* You are playing a game at your local arcade, and you receive 1 ticket from the machine for every 12 points that you score. You want to purchase a squirt gun with your
tickets. Given your score, and the price of the squirt gun (in tickets) are you able to buy it?
Task 
Evaluate whether or not you have scored high enough to earn enough tickets to purchase the squirt gun at the arcade.
Sample Input 
500
40
Sample Output
Buy it!
*/
import java.util.*;
public class skeeBall{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pts=in.nextInt();
		int cost=in.nextInt();
		float res=pts/12;
		res = Math.round(res);
		if (res<40) {
			System.out.println("Try again");
		}
		else if (res==40) {
			System.out.println("Buy it!");
		}
		else{
			System.out.println("Buy it!");
		}
	}
}
