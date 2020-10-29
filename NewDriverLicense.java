import java.util.*;
public class NewDriverLicense{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int num = in.nextInt();
		in.nextLine();
		String str2 = in.nextLine();
		str2 = str2+" "+str;
		String names[] = str2.split(" ");
		Arrays.sort(names);
		int time = 0;
		boolean isComp = false;
		for (int i=0;i<names.length; ) {
			int k=0;
			time+=20;
			while (k<num&&i<names.length) {
				if (names[i].equals(str)) {
					isComp = true;
					break;
				}
				i++;
				k++;	
			}
			if (isComp) {
				break;
			}
		}
		System.out.println(time);
	}
}