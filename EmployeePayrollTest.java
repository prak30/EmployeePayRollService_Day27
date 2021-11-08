import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeePayrollTest {
//	 @Test
	    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
	        EmployeePayrollTwo employeePayrollService = new EmployeePayrollTwo();
	        employeePayrollService.addEmployee(new EmployeeData(1, "Jeff Bezos", 10000));
	        employeePayrollService.addEmployee(new EmployeeData(2, "Bill Gates", 20000));
	        employeePayrollService.addEmployee(new EmployeeData(3, "Mark Z", 30000));
	        employeePayrollService.writeEmployeeDataToFile();
	        long entries = employeePayrollService.countEntries();
	        assertEquals(3, entries);
	    }
	 
	//    @Test
	    public void given3EmployeesWhenWrittenToFileShouldPrintEmployeeEntries()
	    {
	        EmployeePayrollTwo employeePayrollService = new EmployeePayrollTwo();
	        employeePayrollService.addEmployee(new EmployeeData(1,"Jeff Bezos",10000));
	        employeePayrollService.addEmployee(new EmployeeData(2,"Bill Gates",20000));
	        employeePayrollService.addEmployee(new EmployeeData(3,"Mark Z",30000));
	        employeePayrollService.writeEmployeeDataToFile();
	        employeePayrollService.printData();
	        long entries = employeePayrollService.countEntries();
	        assertEquals(3, entries);
	    }
	    
	    @Test
	    public void givenFileOnReadindFromFileShouldMatchEmployeeCount() {
	        EmployeePayrollTwo employeePayrollService = new EmployeePayrollTwo();
	        long entries = employeePayrollService.readDataFromFile();
	        assertEquals(3, entries);
	    }
}
