import java.util.Scanner;
public class Hovercraft{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num = in.nextInt();
		int total = 21000000;
		int res = num*3000000;
		if (res>total) {
			System.out.println("Profit");
		}
		else if (res==total) {
			System.out.println("Broke Even");
		}
		else{
			System.out.println("Loss");
		}
	}
}