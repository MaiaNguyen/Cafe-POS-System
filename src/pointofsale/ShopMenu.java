package pointofsale;
import java.util.Scanner;

public class ShopMenu implements IUsing {

	private String items[] = {"Coffee", "Cappucino", "Latte", "Lavender Latte", "Mocha", "Pour Over",
			"Tea", "Milk Tea", "Chai Tea Latte", "Matcha Latte", "Herbal Tea"};
	
	public int input() {
		Scanner scan = new Scanner(System.in);	// reads in input for hot or iced choice
		int hotOrIce = scan.nextInt();
		return hotOrIce;
	}
	public void showInfo() {
		System.out.println("COFFEE:");
		for(int i = 0; i < 11; i++)
		{
			if (i == 6)
			{
				System.out.println("\nTEAS:");
			}
				System.out.println("#" + (i+1) + " " + items[i]);
		}
	}

}
