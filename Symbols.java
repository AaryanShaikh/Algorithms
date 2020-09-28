import java.util.*;
public class Symbols{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.nextLine();
		String res = input.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(res);  
	}
}