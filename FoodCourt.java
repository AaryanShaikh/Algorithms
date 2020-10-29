/*A food court facilitates their customers with a featured App where the customers can view the Menu Card and place their order. The order may be delivered on-premises or off-premises as per policies. Write a code to take the order from the customer by pressing menu number. Quantity 
After one customer completes the process of placing the order by pressing the Menu Number and Quantity, your code should accept y to continue taking order or n for stopping the process of order taking. Final Output should be the calculated total amount. Menu card is given as: 
Number Name Price
1 Veg Sandwich 80.0 
2 Cheese Sandwich 130.0 
3 Veg Grilled Sandwich 100.0 
4 Sada Dosa 80.0 
5 Masala Dosa 90.0 
6 Onion Rava Sada Dosa 110.0 
7 Onion Rava Masala Dosa 120.0 
8 Spring Dosa 140.0 
9 Plain Uttapam 70.0 
10 Onion Uttapam 80.0 
11 PavBhaji 130.0 
12 Veg Cheese Pizza 160.0 
13 Paneer Frankie 70.0 
14 Noodles Frankie 60.0 
15 Tea 40.0 
16 Coffee 50.0 
17 Watermelon Juice 30.0 
18 Mosarnbi Juice 40.0
19 Falooda 160.0
20 Ice.Cream 150.0 
*/
import java.util.*;
public class FoodCourt{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean check = true;
		double items[] = {80.0,130.0,100.0,80.0,90.0,110.0,120.0,140.0,70.0,80.0,130.0,160.0,70.0,60.0,40.0,50.0,30.0,40.0,160.0,150.0};
		double total = 0.0;
		while(check){
			int menuno = in.nextInt();
			if (menuno<=0&&menuno>=21) {
				System.out.println("Invalid input");
			}else{
				int quantity = in.nextInt();
				total = total + items[menuno-1] * quantity;
				System.out.println("Do You want to order more items??");
				in.nextLine();
				String ch = in.nextLine();
				if (ch.equals("n")) {
					check = false;
				}
			}
		}
		System.out.println("Total Amount: "+total+" INR");
	}
}