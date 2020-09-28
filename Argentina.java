import java.util.*;
public class Argentina{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		final float pesos = 0.02f;
		int ipesos = in.nextInt();
		int idollar = in.nextInt();
		float res = ipesos*pesos;
		if (res<idollar) {
			System.out.println("Pesos");
		}
		else{
			System.out.println("Dollars");
		}
	}
}