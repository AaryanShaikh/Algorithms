/* A simple virtual assistant can read the uer input, recognize and execute the underlying command. for eg
if the user input what time is it the output should be the current time.
write your own virtual assistant. the minimum requirements are
-greeting the user
-do basic calculations
-tell the time and the date.
*/
import java.util.*;
import java.text.SimpleDateFormat;
public class VirtualAssistant{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ai[] = {"what you want me to do??","need me??","I can understand most of the things!!","Yallo!!"};
		String greetings[] = {"hi","hello","yo","sup","whatsup"};
		String calc[] = {"add","addition","sum","sub","subtraction","difference","mul","multiply","product","div","division","remainder","multiplication"};
		String dnt[] = {"date","time","day"};
		boolean cal = false;
		boolean greet = false;
		boolean dt = false;
		boolean run = true;
		while(run){
			int index = (int)(Math.random() * (3 - 0 + 1) + 0);
			System.out.println();
			System.out.println("A.I:"+ai[index]);
			System.out.print("You:");
			String str = in.nextLine().toLowerCase();
			str = str.replaceAll("[^a-zA-Z0-9 ]", "");
			String strsplit[] = str.split(" ");
			for (int i=0;i<strsplit.length ;i++ ) {
				if (strsplit[i].equals("sleep")) {
					run = false;
					System.out.println("A.I Shutting down...");
				}
			}
			for (int i=0;i<strsplit.length ;i++ ) {
				for (int j=0;j<greetings.length ;j++ ) {
					if (strsplit[i].equals(greetings[j])) {
						System.out.println("A.I:Hello!");
						greet = true;
						break;
					}
				}
				if (greet) {
					greet = false;
					break;
				}
			}
			if (!greet) {
				String sel = "";
				for (int i=0;i<strsplit.length ;i++ ) {
					for (int j=0;j<calc.length ;j++ ) {
						if (strsplit[i].equals(calc[j])) {
							cal = true;
							sel = strsplit[i];
							break;
						}
					}
					if (cal) {
						break;
					}
				}
				if (cal) {
					cal = false;
					if (sel.equals("add")||sel.equals("addition")||sel.equals("sum")) {
						System.out.println("Enter the numbers you want to add");
						String nums = in.nextLine();
						String numssplit[] = nums.split(" ");
						int sum = 0;
						for (int i=0;i<numssplit.length ;i++ ) {
							sum+=Integer.parseInt(numssplit[i]);
						}
						System.out.println("The sum is "+sum);
					}
					else if(sel.equals("sub")||sel.equals("subtraction")||sel.equals("difference")){
						System.out.println("Enter the numbers you want to subtract");
						String nums = in.nextLine();
						String numssplit[] = nums.split(" ");
						int sum = 0;
						for (int i=0;i<numssplit.length ;i++ ) {
							if (i==0) {
								sum = Integer.parseInt(numssplit[0]);
								continue;
							}
							sum-=Integer.parseInt(numssplit[i]);
						}
						System.out.println("The difference is "+sum);
					}
					else if(sel.equals("mul")||sel.equals("multiply")||sel.equals("product")||sel.equals("multiplication")){
						System.out.println("Enter the numbers you want to multiply");
						String nums = in.nextLine();
						String numssplit[] = nums.split(" ");
						int sum = 0;
						for (int i=0;i<numssplit.length ;i++ ) {
							if (i==0) {
								sum = Integer.parseInt(numssplit[0]);
								continue;
							}
							sum*=Integer.parseInt(numssplit[i]);
						}
						System.out.println("The product is "+sum);
					}
					else if(sel.equals("div")||sel.equals("division")){
						System.out.println("Enter the numbers you want to divide");
						String nums = in.nextLine();
						String numssplit[] = nums.split(" ");
						int sum = 0;
						for (int i=0;i<numssplit.length ;i++ ) {
							if (i==0) {
								sum = Integer.parseInt(numssplit[0]);
								continue;
							}
							sum/=Integer.parseInt(numssplit[i]);
						}
						System.out.println("The division is "+sum);
					}
				}
				if (!cal) {
					String dot = "";
					for (int i=0;i<strsplit.length ;i++ ) {
						for (int j=0;j<dnt.length ;j++ ) {
							if (strsplit[i].equals(dnt[j])) {
								dt = true;
								dot = strsplit[i];
								break;
							}
						}
						if (dt) {
							break;
						}
					}
					if (dt) {
						if (dot.equals("date")||dot.equals("day")) {
							System.out.print("Today date is : ");
							SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
							Date date = new Date();
							System.out.println(dateFormat.format(date));
						}
						else if(dot.equals("time")){
							System.out.print("The Current time is : ");
							SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
							Date date = new Date();
							System.out.println(dateFormat.format(date));
						}
					}
					dt=false;
				}	
			}
		}
	}
}