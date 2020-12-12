package pointofsale;
import java.util.Scanner;

public class Order implements IUsing {
	
	private float totalPrice = 0;
	private double price = 0;
	
	public int input() {
		Scanner scan = new Scanner(System.in);	// reads in input for item choice
		int num = scan.nextInt();
		return num;
	}
	
	public double addToOrder(int num) {
		switch (num) {	// adds the drink and the price of the drink to the order based on item number input
		case 1:
			System.out.println("Coffee added to order");
			price = 3.25;
			break;
		case 2:
			System.out.println("Cappucino added to order");
			price = 3.50;
			break;
		case 3:
			System.out.println("Latte added to order");
			price = 3.50;
			break;
		case 4:
			System.out.println("Lavender Latte added to order");
			price = 3.75;
			break;
		case 5:
			System.out.println("Mocha added to order");
			price = 3.50;
			break;
		case 6:
			System.out.println("Pour Over added to order");
			price = 3.75;
			break;
		case 7:
			System.out.println("Tea added to order");
			price = 2.75;
			break;
		case 8:
			System.out.println("Milk Tea added to order");
			price = 3.50;
			break;
		case 9:
			System.out.println("Chai Tea Latte added to order");
			price = 3.75;
			break;
		case 10:
			System.out.println("Matcha Latte added to order");
			price = 3.75;
			break;
		case 11:
			System.out.println("Herbal Tea added to order");
			price = 3.00;
			break;
		}
		return price;
	}
	
	public float calcTotal(double price) {
		price = addToOrder(0);
		totalPrice += price;
		return totalPrice;
	}
	
	public void showInfo() {
		totalPrice += (totalPrice*.08); // this adds the tax to the order
		System.out.println("The total is $" + totalPrice);
	}

}
