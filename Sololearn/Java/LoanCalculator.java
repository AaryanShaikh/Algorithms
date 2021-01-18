import java.util.*;
public class LoanCalculator{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		double per = 0;
		for (int i=0;i<6 ;i++ ) {
			per = Math.round((10.0 * num) / 100.0);
			num-=per;
		}
		System.out.println((int)num);
	}
}