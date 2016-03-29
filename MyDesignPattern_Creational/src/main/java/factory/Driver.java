package factory;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f = null;
		System.out
				.print("Enter selection( F -- fast food, K-- korean food, s--Sushi FOOD)  :");
		Scanner scan = new Scanner(System.in);

		if (scan.hasNextLine()) {
			f = FoodFactory.produceFood(scan.nextLine());
		}

		if (f != null) {
			f.describe();
		}

	}

}
