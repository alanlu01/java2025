package ntou.cs.java2025;

public class FuelRecord {
	private int fuelCost;
	private double liters;
	private String brand;

	public FuelRecord(int fuelCost, double liters, String brand) {

		// 當油價或公升數為零或負值時皆視為不合法
		if (fuelCost <= 0 || liters <= 0) {
			throw new IllegalArgumentException("Fuel cost and liters must be greater than zero");
		}
		this.fuelCost = fuelCost;
		this.liters = liters;
		this.brand = brand;
	}

	public int getFuelCost() {
		return fuelCost;
	}

	public void setFuelCost(int fuelCost) {
		this.fuelCost = fuelCost;
	}

	public double getLiters() {
		return liters;
	}

	public void setLiters(double liters) {
		this.liters = liters;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double costPerLiter() throws ArithmeticException {
		if ((fuelCost != 0) && (liters == 0)) {
			throw new ArithmeticException();
		} else if ((fuelCost == 0) && (liters == 0)) {
			return 0;
		} else {
			return fuelCost / liters;
		}
	}
}