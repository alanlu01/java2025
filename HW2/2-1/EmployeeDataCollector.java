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
		// TODO (會用到inputEmployeeData)
	}

	public void inputEmployeeData(Employee employee) {
		employee.inputData(input);
		setBonus(employee);
		list.add(employee);
	}

	public void setBonus(Employee employee) {
		// TODO
	}
}
