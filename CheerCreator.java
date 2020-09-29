/*You are cheering on your favorite team. After each play, if your team got over 10 yards further down the field, you stand up and give your friend a high five. 
If they don't move forward by at least a yard you stay quiet and say 'shh', and if they move forward 10 yards or less, you say 'Ra!' for every yard that they moved
forward in that play.
Sample Input 
3
Sample Output
Ra!Ra!Ra!
*/
import java.util.*;
public class CheerCreator{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num = in.nextInt();
		if (num>10) {
			System.out.println("High Five");
		}
		else if (num<1) {
			System.out.println("shh");
		}
		else{
			for (int i=0;i<num ;i++ ) {
				System.out.print("Ra!");
			}
		}
	}
}
