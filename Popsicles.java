import java.util.*;
public class Popsicles{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String str[] = input.split(" ");
		int siblings = Integer.parseInt(str[0]);
		int popsicles = Integer.parseInt(str[1]);
		if (popsicles%siblings==0) {
			System.out.println("give away");
		} else{
			System.out.println("eat them yourself");		
		}
	}
}