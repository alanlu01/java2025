package ntou.cs.java2025;

public class EmployeeTest {
    public static void main(String[] args) {
        // 建立兩位員工物件
        Employee emp1 = new Employee("Bob", "Jones", 2875.00);
        Employee emp2 = new Employee("Susan", "Baker", 3150.75);

        // 顯示原本的年薪
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // 增加 10% 薪水
        System.out.println("Increasing employee salaries by 10%");
        emp1.raiseSalary(10);
        emp2.raiseSalary(10);

        // 顯示加薪後的年薪
        System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}