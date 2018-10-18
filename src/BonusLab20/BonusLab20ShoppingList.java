package BonusLab20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BonusLab20ShoppingList {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userChoice = null;
		String userContinue = null;
		
		ArrayList<String> foods = new ArrayList<String>(Arrays.asList("Bannanas", "Apples", "Bread", "Milk", "Cheese", "Carrots", "Potatoes", "Coffee"));
		
		ArrayList<Double> prices = new ArrayList<Double> (Arrays.asList(0.99, 0.79, 1.25, 2.15, 2.55, 0.89, 0.44, 5.89));
		
		ArrayList<String> userFoods = new ArrayList<String>();
		ArrayList<Double> userPrices = new ArrayList<Double>();
		
		
		System.out.println("Welcome to 'Ye Olde Timey Market's' automated shopping list.\n");
		
		do {
		System.out.printf("%-10s %-10s %-15s %n", "Item ID", "Product", "Price");
		System.out.printf("%-10s %-10s %-15s %n", "=======", "=======", "=====");
		for (int i = 0; i < foods.size(); i++) {
			for (int j = 0; j < prices.size(); j++) {
				
			}
			
			System.out.printf("%-1d %-8s %-10s %-2s %n", (i + 1) , "." , foods.get(i), Double.toString(prices.get(i)));
			
		}
		System.out.println();
		
		
			System.out.println("Please enter the name of the product you would like: ");
			userChoice = scnr.next();
			checkSelection(userChoice , foods);
		if (userChoice.equalsIgnoreCase("Bannanas")) {
			userFoods.add(foods.get(0));
			userPrices.add(prices.get(0));
			System.out.println(foods.get(0) + " , " + prices.get(0));
		}else if (userChoice.equalsIgnoreCase("Apples")) {
			userFoods.add(foods.get(1));
			userPrices.add(prices.get(1));
			System.out.println(foods.get(1) + " , " + prices.get(1));
		}else if (userChoice.equalsIgnoreCase("Bread")) {
			userFoods.add(foods.get(2));
			userPrices.add(prices.get(2));
			System.out.println(foods.get(2) + " , " + prices.get(2));
		} else if (userChoice.equalsIgnoreCase("Milk")) {
			userFoods.add(foods.get(3));
			userPrices.add(prices.get(3));
			System.out.println(foods.get(3) + " , " + prices.get(3));
		} else if (userChoice.equalsIgnoreCase("Cheese")) {
			userFoods.add(foods.get(4));
			userPrices.add(prices.get(4));
			System.out.println(foods.get(4) + " , " + prices.get(4));
		} else if (userChoice.equalsIgnoreCase("Carrots")) {
			userFoods.add(foods.get(5));
			userPrices.add(prices.get(5));
			System.out.println(foods.get(5) + " , " + prices.get(5));
		} else if (userChoice.equalsIgnoreCase("Potatoes")) {
			userFoods.add(foods.get(6));
			userPrices.add(prices.get(6));
			System.out.println(foods.get(6) + " , " + prices.get(6));
		} else if (userChoice.equalsIgnoreCase("Coffee")) {
			userFoods.add(foods.get(7));
			userPrices.add(prices.get(7));
			System.out.println(foods.get(7) + " , " + prices.get(7));
		}
		System.out.println("Would you like to continue shopping? (y/n)");
		userContinue = scnr.next();
		
		} while (userContinue.equalsIgnoreCase("y"));
		
		
		System.out.println("Ok, so your order comes to: ");
		int n = 0;
		for (n = 0; n < userFoods.size(); n++) {
			for (int j2 = 0; j2 < userPrices.size(); j2++) {
				
			}System.out.printf("%-8s %-10s %n" , userFoods.get(n), Double.toString(userPrices.get(n)));
		}
		System.out.println(Double.toString(getAverage(userPrices)));
	
	}

	public static String checkSelection (String input, ArrayList<String> n){ 
		boolean result = false;
		while (result == false) {
			if (n.contains(input)) {
			    result = true;
		} else {
				System.out.println("I'm sorry. We curently don't have that item in stock. Please make another selection: ");
		}
			break;
		}
		return input;
	
	} 
public static double getAverage (ArrayList<Double> n){
	double sum = 0.0;
	for (int i = 0; i < n.size(); i++) {
		sum += n.get(i);
	}
	return sum / n.size();
}
}
