package ntou.cs.java2025;
import java.util.Scanner;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private int grossSales;

    @Override
    public void inputData(Scanner input) {
        System.out.print("Please input commission rate: ");
        commissionRate = input.nextDouble();
        System.out.print("Please input gross sales: ");
        grossSales = input.nextInt();
    }

    @Override
    public int getEarnings() {
        return (int)(commissionRate * grossSales);
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }
}
