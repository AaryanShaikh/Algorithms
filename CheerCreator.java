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