import java.util.*;
public class PigLatin{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String str[] = input.split(" ");
		char temp = 'a';
		for (int i = 0;i<str.length ;i++ ) {
			char words[] = str[i].toCharArray();
			for (int j = 0;j<words.length ;j++ ) {
			 	if (j==0) {
			 		temp = words[j];
			 	}
			 	else if(j==(words.length)-1){
			 		words[j-1] = words[j];
			 		words[j] = temp;
			 	}
			 	else{
			 		words[j-1] = words[j];
			 	}
			 }
			  String newStr = String.valueOf(words);
			  newStr = newStr+"ay";
			  str[i] = newStr;
		}
		String joined = String.join(" ", str);
		System.out.println(joined);
	}
}