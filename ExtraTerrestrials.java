import java.util.*;
public class ExtraTerrestrials{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.nextLine();
		String reverse = new StringBuffer(input).reverse().toString();
		System.out.println(reverse);
	}
}