import java.util.*;
public class PaintCosts{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float num = in.nextFloat();
		float res = num*5;
		res = res + 40;
		float res1 = res / 100;
		res1 = res1*10;
		res = res1 + res;
		res = Math.ceil(res);
		int resf = (int)res; 
		System.out.println(resf);
	}
}