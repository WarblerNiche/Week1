//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
// Added comment to test some stuff.
//


public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int remainingSeats = 11;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		float groceriesCost = 15.38f;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInit = 'C';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHot = true;
		
		// 5. Create a variable to hold a customer's first name
		String cxFirstName = "Lex";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "42 Wallaby Way, Sydney";

		// 7. Print all variables to the console
		System.out.print("Seats left: " +remainingSeats+ "\nGroceries Total: $" +groceriesCost+
				"\nMiddle Initial: " +middleInit+ "\nIt is hot outside: " +isHot+ "\nFirst Name: " +cxFirstName+
				"\nStreet Address: " +streetAddress + "\n");

		// 8. A customer booked 2 plane seats, 
		int seatsBooked = 2;
		//		remove 2 seats from the available seats variable
		System.out.println("There are currently " + remainingSeats + " seats left.");
		System.out.println("A customer booked " + seatsBooked + " seats");
		remainingSeats = (remainingSeats - seatsBooked);
		System.out.println("There are currently " + remainingSeats + " seats left.");

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		float candyBar = 2.15f;
		System.out.println("You got a candy bar. It cost $" +candyBar + ".");
		// 		costOfGroceries = costOfGroceries + 2.15;
		groceriesCost += candyBar;
		System.out.println("Your new grocery total is: $" + groceriesCost);		

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		System.out.println("Birth Certificate Middle Initial \"" + middleInit + "\" is incorrect.");
		middleInit = 'D';
		System.out.println("Middle Initial changed to \"" + middleInit + "\".");

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		if (isHot == true)
		{
			isHot = false;
			System.out.println("It is no longer hot outside.");
		}
		else
		{
			System.out.println("It is no longer cold outside.");
		};

		// 12.  Create a new variable called full name using the customer's first name, 
		String fullName = cxFirstName + " " + middleInit + " Smithersonjensen-Heimer";
		//			the middle initial, and a last name of your choice

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("The customers full name is " + fullName + ", and he lives at " + streetAddress + ".");
		
		
	}
}