
public class EmployeePayRollMain {

	public static void main(String[] args) {
		System.out.println("WELCOME TO EMPLOYEE PAYROLL SERVICE");
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.readEmployeeDataFromConsole();
		employeePayrollService.writeEmployeeDataInConsole();
	}

}
