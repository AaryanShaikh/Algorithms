import java.util.Scanner;
public class NoNumerals{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		String words[] = str.split(" ");
		for (int i=0;i<words.length ;i++ ) {
			switch (words[i]) {
				case "1": words[i] = "one";
						break;
				case "2": words[i] = "two";
						break;
				case "3": words[i] = "three";
						break;
				case "4": words[i] = "four";
						break;
				case "5": words[i] = "five";
						break;
				case "6": words[i] = "six";
						break;
				case "7": words[i] = "seven";
						break;
				case "8": words[i] = "eight";
						break;
				case "9": words[i] = "nine";
						break;
				case "10": words[i] = "ten";
						break;
				default:
						break;
			}		
		}
		for (int i=0;i<words.length ;i++ ) {
			System.out.print(words[i]+" ");
		}
	}
}