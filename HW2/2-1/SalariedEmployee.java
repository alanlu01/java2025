package ntou.cs.java2025;
import java.util.Scanner;

public class SalariedEmployee extends Employee {
    private int weeklySalary;
    private int workingWeeks;

    @Override
    public void inputData(Scanner input) {
        System.out.print("Please input weekly salary: ");
        weeklySalary = input.nextInt();
        System.out.print("Please input working weeks: ");
        workingWeeks = input.nextInt();
    }

    @Override
    public int getEarnings() {
        return weeklySalary * workingWeeks;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public int getWorkingWeeks() {
        return workingWeeks;
    }
}
