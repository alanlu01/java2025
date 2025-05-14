package ntou.cs.java2025;
import java.util.Scanner;

public class HourlyEmployee extends Employee {
    private int hourlySalary;
    private int hours;

    @Override
    public void inputData(Scanner input) {
        System.out.print("Please input hourly salary: ");
        hourlySalary = input.nextInt();
        System.out.print("Please input hours: ");
        hours = input.nextInt();
    }

    @Override
    public int getEarnings() {
        if (hours <= 40) {
            return hourlySalary * hours;
        } else {
            return hourlySalary * 40 + (int)((hours - 40) * hourlySalary * 1.5);
        }
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public int getHours() {
        return hours;
    }
}
