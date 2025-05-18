package ntou.cs.java2025;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FuelCalculator {

	private static final GasStationBrand[] BRANDS = { null, new GasStationBrand("CPC", "Chinese Petroleum Corporation"),
			new GasStationBrand("FPCC", "Formosa Petrochemical Corporation"),
			new GasStationBrand("Costco", "Costco Wholesale") };

	public void calculateFuelUnitPrice() {

		Scanner scanner = new Scanner(System.in);
		boolean success = false;
		do {
			try {
				System.out.printf("%nPlease enter the cost of gasoline: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter the liters of gasoline: ");
				double denominator = scanner.nextDouble();
				System.out.print("Please enter the brand (1: CPC, 2: FPCC, 3: Costco): ");
				int brandNumber = scanner.nextInt();

				String brandName = BRANDS[brandNumber].getName();
				FuelRecord record = new FuelRecord(numerator, denominator, brandName);
				double result = record.costPerLiter();

				System.out.printf("Cost per liter of fuel for %s: %d / %.2f = %.2f%n",
					brandName, record.getFuelCost(), record.getLiters(), result);
				success = true;
			} catch (InputMismatchException e) {
				System.out.println("Exception: " + e.getClass().getName());
				System.out.println("You must enter integers. Please try again.");
				System.out.println("Thank you for the test!");
				scanner.nextLine();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception: " + e.toString());
				System.out.println("You must enter a valid brand number! Please try again.");
				System.out.println("Thank you for the test!");
				scanner.nextLine();
			} catch (NullPointerException e) {
				System.out.println("Exception: " + e.toString());
				System.out.println("Brand cannot be null. Please try again.");
				System.out.println("Thank you for the test!");
				scanner.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println("Exception: " + e.getClass().getName() + ": " + e.getMessage());
				System.out.println("Fuel cost and liters must be greater than zero. Please try again.");
				System.out.println("Thank you for the test!");
			}
		} while (!success);
		System.out.println("Thank you for the test!");
		scanner.close();
	}
}
