import java.util.Scanner;
public class GothamCity{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num = in.nextInt();
		if (num<5) {
			System.out.println("I got this!");
		}
		else if(num>=5&&num<=10){
			System.out.println("Help me Batman!");
		}
		else{
			System.out.println("Good Luck out there!");
		}
	}
}