import java.util.*;
class Converter{
	static String toBinary(int x){
		String res = "";
		while(x>0){
			res += Integer.toString(x%2);
			x/=2;
		}
		return (new StringBuffer(res).reverse().toString());
	}
}
public class BinConv{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(Converter.toBinary(in.nextInt()));
	}
}