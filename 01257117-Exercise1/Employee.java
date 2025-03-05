package ntou.cs.java2025;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // 建構子
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        // 確保月薪不為負數
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
    }

    // Getter 和 Setter 方法
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // 計算年薪
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // 讓員工加薪指定百分比
    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    }
}