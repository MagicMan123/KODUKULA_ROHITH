import java.util.Scanner;

public class receipt
{
	static double discount;
	static double subtotal;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("\nPlease enter item 2:");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("\nPlease enter item 3:");
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		subtotal = (price1 + price2 + price3);
		
		format(item1, price1, item2, price2, item3, price3, subtotal);
		
	}
	public static double discount(double subtotal)
	{
		if(subtotal >= 2000)
		{
			discount = 0.15;
		}
		if(subtotal < 2000)
		{
			discount = 0.00;
		}
		return discount;
	}
	public static void format(String item1, double price1, String item2, double price2, String item3, double price3, double subtotal) 
	{
		System.out.printf("<<<<<<<<<<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>>>>>>>>>>\n\n*%9s ........   %5.2f\n*%9s ........   %5.2f\n*%9s ........   %5.2f\n\n*     Subtotal ........   %5.2f\n*     Discount ........   %5.2f\n*     Total ........   %9.2f",item1,price1,item2,price2,item3,price3,(subtotal),discount(subtotal)*(subtotal),(1-(discount(subtotal)))*(subtotal));
	}
}