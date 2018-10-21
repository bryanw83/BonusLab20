package BonusLab20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BonusLab20ShoppingList {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userChoice = null;
		String userContinue = null;

		ArrayList<String> foods = new ArrayList<String>(
				Arrays.asList("bannanas", "apples", "bread", "milk", "cheese", "carrots", "potatoes", "coffee"));

		ArrayList<Double> prices = new ArrayList<Double>(Arrays.asList(0.99, 0.79, 1.25, 2.15, 2.55, 0.89, 0.44, 5.89));

		ArrayList<String> userFoods = new ArrayList<String>();
		ArrayList<Double> userPrices = new ArrayList<Double>();

		System.out.println("Welcome to 'Ye Olde Timey Market's' automated shopping list.\n");

		do {
			System.out.printf("%-10s %-10s %-15s %n", "Item ID", "Product", "Price");
			System.out.printf("%-10s %-10s %-15s %n", "=======", "=======", "=====");
			for (int i = 0; i < foods.size(); i++) {
				for (int j = 0; j < prices.size(); j++) {

				}

				System.out.printf("%-1d %-8s %-10s %.2f %n", (i + 1), ".", foods.get(i), prices.get(i));

			}
			System.out.println();

			System.out.println("Please enter the name of the product you would like: ");
			userChoice = scnr.next();
			String m = userChoice.toLowerCase();
			checkSelection(m, foods);
			if (foods.contains(m)) {
				int index = foods.indexOf(m);
				userFoods.add(foods.get(index));
				userPrices.add(prices.get(index));
				System.out.println(foods.get(index) + " - " + prices.get(index));
			}
			System.out.println("Would you like to continue shopping? (y/n)");
			userContinue = scnr.next();

		} while (userContinue.equalsIgnoreCase("y"));

		System.out.println("Ok, so your order comes to: ");
		int n = 0;
		for (n = 0; n < userFoods.size(); n++) {
			for (int j2 = 0; j2 < userPrices.size(); j2++) {

			}
			System.out.printf("%-8s %.2f %n", userFoods.get(n), userPrices.get(n));
		}
		System.out.print("The average cost of all the selected items comes to: ");
		System.out.printf("%.2f", getAverage(userPrices));
		System.out.println();
		System.out.println();
		getHighPrice(userPrices);
		getLowPrice(userPrices);

		scnr.close();
	}

	public static String checkSelection(String input, ArrayList<String> n) {
		boolean result = false;
		while (result == false) {
			if (n.contains(input)) {
				result = true;
			} else {
				System.out.println(
						"I'm sorry. We curently don't have that item in stock. Please make another selection: ");
			}
			break;
		}
		return input;

	}

	public static double getAverage(ArrayList<Double> n) {
		double sum = 0.0;
		for (int i = 0; i < n.size(); i++) {
			sum += n.get(i);
		}
		return sum / n.size();
	}

	public static void getHighPrice(ArrayList<Double> n) {
		Collections.sort(n);

		System.out.println("The lowest cost is: " + n.get(0));
	}

	public static void getLowPrice(ArrayList<Double> n) {
		Collections.reverse(n);

		System.out.println("The highest cost is: " + n.get(0));
	}

	public static String checkOrder(String input, ArrayList<String> n) {
		boolean result = false;
		while (result == false) {
			if (n.contains(input)) {
				result = true;
				break;
			}

		}
		return input;
	}
}
