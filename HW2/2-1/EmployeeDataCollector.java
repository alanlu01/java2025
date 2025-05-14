package ntou.cs.java2025;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDataCollector {
	
	private Scanner input = new Scanner(System.in);
	private ArrayList<Employee> list = new ArrayList<Employee>();

	public EmployeeDataCollector () {
		input = new Scanner(System.in);
		list = new ArrayList<Employee>();
	}
	
	public void collectEmployeeData() {
	    int choice;
	    do {
	        System.out.println("---Earnings Calculation System:");
	        System.out.println("1. Salaried Employee");
	        System.out.println("2. Hourly Employee");
	        System.out.println("3. Commission Employee");
	        System.out.println("4. Piece Worker");
	        System.out.print("Please input (1~4, -1 to end): ");
	        choice = input.nextInt();
	        if (choice == -1) {
	            break;
	        }
	        Employee employee;
	        switch (choice) {
	            case 1: employee = new SalariedEmployee(); break;
	            case 2: employee = new HourlyEmployee(); break;
	            case 3: employee = new CommissionEmployee(); break;
	            case 4: employee = new PieceWorker(); break;
	            default: continue;
	        }
	        inputEmployeeData(employee);
	        System.out.println();
	    } while (true);
	    System.out.println("Input finished!");
	    System.out.println();
	    System.out.println("---Result:");
	    int totalEarnings = 0;
	    int totalBonus = 0;
	    int idx = 1;
	    for (Employee emp : list) {
	        System.out.println("No. " + idx + ":");
	        if (emp instanceof SalariedEmployee) {
	            SalariedEmployee se = (SalariedEmployee) emp;
	            System.out.println("Salaried Employee => weekly salary: " + String.format("%,d", se.getWeeklySalary())
	                + ", working weeks: " + String.format("%,d", se.getWorkingWeeks())
	                + ", calculated earnings: " + String.format("%,d", se.getEarnings())
	                + ", bonus: " + String.format("%,d", emp.getBonus().getBonus(emp.getEarnings())));
	        } else if (emp instanceof HourlyEmployee) {
	            HourlyEmployee he = (HourlyEmployee) emp;
	            System.out.println("Hourly Employee => hourly salary: " + String.format("%,d", he.getHourlySalary())
	                + ", hours: " + String.format("%,d", he.getHours())
	                + ", calculated earnings: " + String.format("%,d", he.getEarnings())
	                + ", bonus: " + String.format("%,d", emp.getBonus().getBonus(emp.getEarnings())));
	        } else if (emp instanceof CommissionEmployee) {
	            CommissionEmployee ce = (CommissionEmployee) emp;
	            System.out.println("Commission Employee => commission rate: " + String.format("%.2f", ce.getCommissionRate())
	                + ", gross sales: " + String.format("%,d", ce.getGrossSales())
	                + ", calculated earnings: " + String.format("%,d", ce.getEarnings())
	                + ", bonus: " + String.format("%,d", emp.getBonus().getBonus(emp.getEarnings())));
	        } else if (emp instanceof PieceWorker) {
	            PieceWorker pw = (PieceWorker) emp;
	            System.out.println("Piece Worker => wage: " + String.format("%,d", pw.getWage())
	                + ", piece: " + String.format("%,d", pw.getPiece())
	                + ", calculated earnings: " + String.format("%,d", pw.getEarnings())
	                + ", bonus: " + String.format("%,d", emp.getBonus().getBonus(emp.getEarnings())));
	        }
	        totalEarnings += emp.getEarnings();
	        totalBonus += emp.getBonus().getBonus(emp.getEarnings());
	        idx++;
	    }
	    System.out.println();
	    System.out.println("Total earnings: " + String.format("%,d", totalEarnings));
	    System.out.println("Total bonus: " + String.format("%,d", totalBonus));
	}

	public void inputEmployeeData(Employee employee) {
		employee.inputData(input);
		setBonus(employee);
		list.add(employee);
	}

	public void setBonus(Employee employee) {
	    System.out.print("Please input type of Bonus (1: static, 2: dynamic): ");
	    int type = input.nextInt();
	    if (type == 1) {
	        employee.setBonus(new StaticBonus());
	    } else {
	        employee.setBonus(new DynamicBonus());
	    }
	}
}
