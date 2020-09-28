import java.util.*;
public class TheSpyLife{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.nextLine();
		String reverse = new StringBuffer(input).reverse().toString();
		String res = reverse.replaceAll("[^a-zA-Z ]", "");
		System.out.println(res);  
	}
}