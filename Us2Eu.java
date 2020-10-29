/*You and your friends are going to Europe! You have made plans to travel around Europe with your friends, but one thing you need to take into account so that everything goes
according to play, is that the format of their date is different than from what is used in the United States. Your job is to convert all your dates from MM/DD/YYYY to DD/MM/YYYY.
Task: 
Create a function that takes in a string containing a date that is in US format, and return a string of the same date converted to EU.
Input Format: 
A string that contains a date formatting 11/19/2019 or November 19, 2019.
Output Format: 
A string of the same date but in a different format: 19/11/2019.
Sample Input: 
7/26/2019
Sample Output: 
26/7/2019
*/
import java.util.*;
public class Us2Eu{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if (Character.isDigit(str.charAt(0))) {
			String strsplit[] = str.split("/");
			str = "";
			str = strsplit[1]+"/"+strsplit[0]+"/"+strsplit[2];
			System.out.println(str);
		}else{
			str = str.replace(",","");
			String strsplit[] = str.split(" ");
			str = "";
			strsplit[0] = strsplit[0].toLowerCase();
			switch(strsplit[0]){
				case "january" : strsplit[0] = "1";
					break;
				case "february" : strsplit[0] = "2";
					break;
				case "march" : strsplit[0] = "3";
					break;
				case "april" : strsplit[0] = "4";
					break;
				case "may" : strsplit[0] = "5";
					break;
				case "june" : strsplit[0] = "6";
					break;
				case "july" : strsplit[0] = "7";
					break;
				case "august" : strsplit[0] = "8";
					break;
				case "september" : strsplit[0] = "9";
					break;
				case "october" : strsplit[0] = "10";
					break;
				case "november" : strsplit[0] = "11";
					break;
				case "december" : strsplit[0] = "12";
					break;
			}
			str = strsplit[1]+"/"+strsplit[0]+"/"+strsplit[2];
			System.out.println(str);
		}
	}
}
