/* write a program that takes two strings in JSON format and compares them. the program should 
output the difference between those JSON Strings.
input:
{"a":2,"b":3}
{"a":2,"b":4}
output:
"b":3
"b":4
input:
{"a":"hello","b":{"c":3}}
{"a":"hello","b":{"c":11}}
output:
"b":{"c":3}
"b":{"c":11}
*/
import java.util.*;
public class JSONComparator{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		StringBuilder sb = new StringBuilder(str1);
		sb.setCharAt(0,' ');
		sb.setCharAt(str1.length()-1,' ');
		str1 = sb.toString();
		sb = new StringBuilder(str2);
		sb.setCharAt(0,' ');
		sb.setCharAt(str2.length()-1,' ');
		str2 = sb.toString();
		String strsplit[] = str1.split(",");
		String strsplit2[] = str2.split(","); 
		if(strsplit[0].equals(strsplit2[0])){
			System.out.println(strsplit[1]+"\n"+strsplit2[1]);
		}else{
			System.out.println(strsplit[0]+"\n"+strsplit2[0]);
		}
	}
}