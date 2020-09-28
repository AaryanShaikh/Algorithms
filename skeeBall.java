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