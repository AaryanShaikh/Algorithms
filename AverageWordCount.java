import java.util.*;
public class AverageWordCount{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.replaceAll("[^a-zA-Z ]", "");
		String strsplit[] = str.split(" ");
		double sum = 0.0;
		for (int i=0;i<strsplit.length ;i++ ) {
			sum+=strsplit[i].length();
		}
		System.out.println((int)Math.ceil(sum/=strsplit.length));
	}
}