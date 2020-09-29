//You are in a hat store in Argentina! The prices are listed in US Dollars and Argentinian Pesos. You have both, but you want to make sure you pay the lower price! 
//Do you pay in Dollars or Pesos? The exchange rate is 2 cents for every Peso.
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
