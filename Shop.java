/*A customer purchases one or more items and gives the respective quantity for each item to be purchased. Based on the quantity and price of the items, display the final amount after discount. A customer is eligible for 10% miscount on total purchase price above R.,11000. For total purchase price below Rs.1000, no discount is given. Check if customer has a membership with the store. If he is member, then he gets an extra 5% discount on every purchase, but if purchase amount of member is above Rs.1000 then he gets total discount of 15% on purchase price. For example, if RaJesh does purchase of Rs.1800 which is above Rs.1000 and he is not member of store he gets discount of 10%.
But If Rajesh Is member of store then he gets total 15% discount on Rs.1800 since its above Rs.1000, but if he does purchase of Rs.800 which Is below Rs.1000 then he gets only discount of 5%.
Given , Items and price
Item No Items price
1. Yoghurt 50 
2. Cheese 100 
3. Milk 40 
4. Fruit 200 
5. oil 300
Calculate the actual price customer has to Pay.
Example 1
1 3 5
2 1 6
y
1649.0INR  
*/
import java.util.*;
public class Shop{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int menu[] = {50,100,40,200,300};
		String str = in.nextLine();
		String items[] = str.split(" ");
		String str2 = in.nextLine();
		String quantity[] = str2.split(" ");
		double total = 0.0;
		for (int i=0;i<items.length ;i++ ) {
			total = total + menu[Integer.parseInt(items[i])-1] * Integer.parseInt(quantity[i]);
		}
		String ch = in.nextLine();
		if (ch.equals("y")&&total>1000.0) {
			total = total - ((total*15)/100);
			System.out.println(total+"INR");
		}else if(ch.equals("y")&&total<1000.0){
			total = total - ((total*5)/100);
			System.out.println(total+"INR");
		}else{
			System.out.println(total+"INR");
		}
	}
}