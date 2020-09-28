import java.util.Scanner;
public class FruitBowl{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fruit = in.nextInt();
		int res = fruit/2;
		res = res/3;
		System.out.println(res); 
	}
}