/*Imagine a fictional programming language, which supports basic arithmetic operations, + 
(addition), - (subtraction), / (division) and (multiplication). 
Declaring variables is done using the svar command: 
svar a; svar b; 
The basic assignment operator is supported: 
a = 10; b = 3.14; 
The print command outputs the value of a variable or an expression: 
print a; 
Each statement must and with a semicolon. 
Implement a custom interpreter that reads and executes a given source code corresponding to the
rules defined above. 
Example Source Code: 
8
svar a;
a = 44;
svar b;
b = 31;
svar str;
str = "Hello"; 
print str; 
print a + b; 
The program above should output: 
Hello 
75 
The custom interpreter should also handle and notify about syntax errors in the source code. 
*/
import java.util.*;
public class CustomInterpreter{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Estimated lines of Code");
		int loc = in.nextInt();
		in.nextLine();
		String locs[] = new String[loc];
		System.out.println("Write your code here");
		for (int i=0;i<loc ;i++ ) {
			locs[i] = in.nextLine();
		}
		System.out.println("\nCompiling Output...\n");
		for (int i=0;i<loc ;i++ ) {
			if (!locs[i].contains(";")) {
				System.out.println("Semicolon missing at line number "+(i+1));
				System.exit(1);
			}
		}
		String variables[] = new String[loc];
		int vid = 0;
		String varvalues[] = new String[loc];
		for (int i=0;i<loc ;i++ ) {
			if (locs[i].contains("svar")) {
				locs[i] = locs[i].replaceAll("[^a-zA-Z0-9 ]", "");
				String strsplit[] = locs[i].split(" ");
				variables[vid] = strsplit[1];
				vid++;
			}else if(locs[i].contains("=")){
				locs[i] = locs[i].replaceAll("[^a-zA-Z0-9=]", "");
				String strsplit[] = locs[i].split("=");
				for (int j=0;j<variables.length ;j++ ) {
					if (variables[j].equals(strsplit[0])) {
						varvalues[j] = strsplit[1];
						break;
					}
				}
			}else if (locs[i].contains("print")) {
				StringBuilder string = new StringBuilder(locs[i]); 
        		string.setCharAt(locs[i].length()-1, ' ');
        		locs[i] = string.toString();
				String strsplit[] = locs[i].split(" ");
				String subsplit2[] = strsplit[1].split(" ");
				if (strsplit[1].contains("+")||strsplit[1].contains("-")||strsplit[1].contains("*")||strsplit[1].contains("/")){
					if (strsplit[1].contains("+")) {
						String subsplit[] = strsplit[1].split("\\+");
						int num1 = 0, num2 = 0;
						for (int j=0;j<variables.length ;j++ ) {
							if (variables[j].equals(subsplit[0])) {
								num1 = Integer.parseInt(varvalues[j]);
								break;
							}
						}
						for (int j=0;j<variables.length ;j++ ) {
							if (variables[j].equals(subsplit[1])) {
								num2 = Integer.parseInt(varvalues[j]);
								break;
							}
						}
						System.out.println(num1+num2);
					}else if (strsplit[1].contains("-")) {
						String subsplit[] = strsplit[1].split("\\-");
						int num1 = 0, num2 = 0;
						for (int j=0;j<variables.length ;j++ ) {
							if (variables[j].equals(subsplit[0])) {
								num1 = Integer.parseInt(varvalues[j]);
								break;
							}
						}
						for (int j=0;j<variables.length ;j++ ) {
							if (variables[j].equals(subsplit[1])) {
								num2 = Integer.parseInt(varvalues[j]);
								break;
							}
						}
						System.out.println(num1-num2);
					}else if (strsplit[1].contains("*")) {
						String subsplit[] = strsplit[1].split("\\*");
						int num1 = 0, num2 = 0;
						for (int j=0;j<variables.length ;j++ ) {
							if (variables[j].equals(subsplit[0])) {
								num1 = Integer.parseInt(varvalues[j]);
								break;
							}
						}
						for (int j=0;j<variables.length ;j++ ) {
							if (variables[j].equals(subsplit[1])) {
								num2 = Integer.parseInt(varvalues[j]);
								break;
							}
						}
						System.out.println(num1*num2);
					}else if (strsplit[1].contains("/")) {
						String subsplit[] = strsplit[1].split("\\/");
						int num1 = 0, num2 = 0;
						for (int j=0;j<variables.length ;j++ ) {
							if (variables[j].equals(subsplit[0])) {
								num1 = Integer.parseInt(varvalues[j]);
								break;
							}
						}
						for (int j=0;j<variables.length ;j++ ) {
							if (variables[j].equals(subsplit[1])) {
								num2 = Integer.parseInt(varvalues[j]);
								break;
							}
						}
						System.out.println(num1/num2);
					}
				}else{
					for (int j=0;j<variables.length ;j++ ) {
						if (variables[j].equals(subsplit2[0])) {
							System.out.println(varvalues[j]);
							break;
						}
					}
				}
			}
		}
	}
}