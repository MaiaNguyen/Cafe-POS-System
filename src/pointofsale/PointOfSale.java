package pointofsale;

public class PointOfSale {
	
	public static void main(String[] args) 
		throws java.io.IOException {
		
		ShopMenu menu1 = new ShopMenu();
		Order order1 = new Order();
		double price = 0;
		char answer;
		int hotOrIce;	// holds the choice from hot or ice input()
		int itemNum;	// holds the choice from item choice input()
		
		System.out.println("Grindn' Roasters POS 1\n");
		menu1.showInfo();
		
		do {
			System.out.println("\nHot or Iced? Enter 1 for iced and 2 for hot:  ");
			hotOrIce = menu1.input();
			
			switch(hotOrIce) {	// there is a 25 cent fee for iced drinks, so this tests if a drink will have this fee
			case 1 :
				price += .25;
				break;
			case 2 :
				price += 0;
				break;
			}
			
			System.out.println("Enter the number to add to the order:  ");
			itemNum = order1.input();
			
			order1.addToOrder(itemNum);	// adds a drink to the cart
			order1.calcTotal(price);	// calculates the total price for the drinks
			
			System.out.println("Add another drink? (Y for yes, N for no):  ");	// allows user to add another drink to the order
			answer = (char) System.in.read();
		} while (answer == 'Y' || answer == 'y');
		
		order1.showInfo();
	}

}