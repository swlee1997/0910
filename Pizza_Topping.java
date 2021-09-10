package array;

public class Pizza_Topping {
	public static void main(String[] args) {
		String[] toppings = 
			{
				"pepperoni" , "mushrooms" , "onions" , "sausage" , "bacon"
			};
		
		
//		String toppings[] = new String[5];
//				toppings[0] = "pepperoni";
//				toppings[1] = "mushrooms";
//				toppings[2] = "onions";
//				toppings[3] = "sausage";
//				toppings[4] = "bacon";
		
		for (int i = 0; i < toppings.length; i++) {
			System.out.print(toppings[i] + " ");
		}
	}
}
