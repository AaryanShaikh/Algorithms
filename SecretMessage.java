import java.util.Scanner;
public class SecretMessage{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.nextLine();
		input = input.toLowerCase();
		String normal = "abcdefghijklmnopqrstuvwxyz";
		String reverse = new StringBuffer(normal).reverse().toString();
		char nor[] = normal.toCharArray();
		char rev[] = reverse.toCharArray();
		char inp[] = input.toCharArray();
		for (int i=0;i<inp.length ;i++) {
			for (int k=0;k<nor.length ;k++ ) {
				if (inp[i]==nor[k]) {
					inp[i] = rev[k];
					break;
				}
				else if (inp[i]==' ') {
					inp[i]=' ';
					break;
				}
				else{
					continue;
				}
			}
		}
		for (int i=0;i<inp.length ;i++ ) {
			System.out.print(inp[i]);
		}
	}
}