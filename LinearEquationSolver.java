/* A linear equation is an equation taht may be put in the form a * x + b = c, where x is the
variable a,b,c are the coefficients, which are often real numbers.
 the solution of such an equation is the value that, when substituted to the unknown (the x), make
 the equality true.
 input:
 2x - 3 = 1
 output:
 x = 2
 input:
 3 = 1 + 2x
 output:
 x = 1
 input:
 3x - 4 = 2
 output:
 x = 2
*/
import java.util.*;
public class LinearEquationSolver{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.replaceAll("[^0-9x\\-\\+=]", "");
		String strsplit[] = str.split("=");
		if (strsplit[0].contains("+")||strsplit[0].contains("-")||strsplit[0].contains("*")||strsplit[0].contains("/")) {
			if (strsplit[0].contains("+")) {
				String subsplit[] = strsplit[0].split("+");
				int res;
				res = Integer.parseInt(subsplit[1])-Integer.parseInt(strsplit[1]);
				subsplit[0] = subsplit[0].replaceAll("x", "");
				System.out.println("x = "+res/Integer.parseInt(subsplit[0]));
			}else if (strsplit[0].contains("-")) {
				String subsplit[] = strsplit[0].split("-");
				int res;
				res = Integer.parseInt(subsplit[1])+Integer.parseInt(strsplit[1]);
				subsplit[0] = subsplit[0].replaceAll("x", "");
				System.out.println("x = "+res/Integer.parseInt(subsplit[0]));
			}else if (strsplit[0].contains("*")) {
				String subsplit[] = strsplit[0].split("*");
				int res;
				res = Integer.parseInt(subsplit[1])/Integer.parseInt(strsplit[1]);
				subsplit[0] = subsplit[0].replaceAll("x", "");
				System.out.println("x = "+res/Integer.parseInt(subsplit[0]));
			}else if (strsplit[0].contains("/")) {
				String subsplit[] = strsplit[0].split("/");
				int res;
				res = Integer.parseInt(subsplit[1])*Integer.parseInt(strsplit[1]);
				subsplit[0] = subsplit[0].replaceAll("x", "");
				System.out.println("x = "+res/Integer.parseInt(subsplit[0]));
			}
		}else{
			if (strsplit[1].contains("+")) {
				String subsplit[] = strsplit[1].split("\\+");
				int res;
				res = Integer.parseInt(strsplit[0])-Integer.parseInt(subsplit[0]);
				subsplit[1] = subsplit[1].replaceAll("x", "");
				System.out.println("x = "+res/Integer.parseInt(subsplit[1]));
			}else if (strsplit[1].contains("-")) {
				String subsplit[] = strsplit[1].split("\\-");
				int res;
				res = Integer.parseInt(strsplit[0])+Integer.parseInt(subsplit[0]);
				subsplit[1] = subsplit[1].replaceAll("x", "");
				System.out.println("x = "+res/Integer.parseInt(subsplit[1]));
			}else if (strsplit[1].contains("*")) {
				String subsplit[] = strsplit[1].split("\\*");
				int res;
				res = Integer.parseInt(strsplit[0])/Integer.parseInt(subsplit[0]);
				subsplit[1] = subsplit[1].replaceAll("x", "");
				System.out.println("x = "+res/Integer.parseInt(subsplit[1]));
			}else if (strsplit[1].contains("/")) {
				String subsplit[] = strsplit[1].split("\\/");
				int res;
				res = Integer.parseInt(strsplit[0])*Integer.parseInt(subsplit[0]);
				subsplit[1] = subsplit[1].replaceAll("x", "");
				System.out.println("x = "+res/Integer.parseInt(subsplit[1]));
			}
		}
	}
}