package makechange;

import java.util.Scanner;

public class MakeChange
{
	public static void main(String[] args) 
	{
		/*	
		 * User inputs price of purchase
		 * User inputs amount tendered
		 * 	Error case if tendered amount insufficient
		 * Make change with remaining funds tendered
		 * $20, $10, $5, $1, 25c, 10c, 5c, 1c
		 */

		Scanner keyboardInput = new Scanner(System.in);

		System.out.print("Please enter price of purchase:  ");
		double cost = keyboardInput.nextDouble();
		cost *= 100;
		keyboardInput.nextLine();

		System.out.print("Please enter amount tendered:  ");
		double paid = keyboardInput.nextDouble();
		paid *= 100;
		keyboardInput.nextLine();
		
		int change = (int) (paid - cost);
		
		if(change < 0)
		{
			//Error
			System.out.println("Insufficient payment.");
		}
		else if(change == 0)
		{
			System.out.println("Exact change made, no change due.");
		}
		else
		{
			makeChange(change);
		}

		keyboardInput.close();
	}

	private static void makeChange(int change)
	{
		//$20, $10, $5, $1, 25c, 10c, 5c, 1c
		int changeDue = change;
		
		while(changeDue > 0)
		{
			changeDue = giveHighestChange(changeDue);
		}
	}

	private static int giveHighestChange(int changeDue)
	{
		int amount = 0;
		int type = 0;
		
		if(changeDue >= 2000)
		{
			type = 2000;
		}
		else if(changeDue >= 1000)
		{
			type = 1000;
		}
		else if(changeDue >= 500)
		{
			type = 500;
		}
		else if(changeDue >= 100)
		{
			type = 100;
		}
		else if(changeDue >= 25)
		{
			type = 25;
		}
		else if(changeDue >= 10)
		{
			type = 10;
		}
		else if(changeDue >= 5)
		{
			type = 5;
		}
		else if(changeDue >= 1)
		{
			type = 1;
		}
		
		amount = (int) (changeDue / type);
		changeDue = changeDue % type;
		giveOutput(amount, type);		

		if(changeDue > 0)
		{
			System.out.print(", ");
		}
		else
		{
			System.out.println(".");
		}
		return changeDue;
	}

	private static void giveOutput(int amount, int type)
	{
		String name = "";
		
		if(type >= 2000)
		{
			if(amount > 1)
			{
				name = "twenties";
			}
			else
			{
				name = "Twenty";
			}
		}
		else if(type >= 1000)
		{
			if(amount > 1)
			{
				name = "Tens";
			}
			else
			{
				name = "Ten";
			}
		}
		else if(type >= 500)
		{
			if(amount > 1)
			{
				name = "Fives";
			}
			else
			{
				name = "Five";
			}
		}
		else if(type >= 100)
		{
			if(amount > 1)
			{
				name = "Ones";
			}
			else
			{
				name = "One";
			}
		}
		else if(type >= 25)
		{
			if(amount > 1)
			{
				name = "Quarters";
			}
			else
			{
				name = "Quarter";
			}
		}
		else if(type >= 10)
		{
			if(amount > 1)
			{
				name = "Dimes";
			}
			else
			{
				name = "Dime";
			}
		}
		else if(type >= 5)
		{
			if(amount > 1)
			{
				name = "Nickels";
			}
			else
			{
				name = "Nickel";
			}
		}
		else if(type >= 1)
		{
			if(amount > 1)
			{
				name = "Pennies";
			}
			else
			{
				name = "Penny";
			}
		}
		
		System.out.print(amount + " " + name);
	}
	
	

}
