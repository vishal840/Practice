import java.io.*;
public class EmployeeTest {
	public static void main(String args[])
	{
		Employee EmpOne = new Employee("Vishal Sinha");
		Employee EmpTwo = new Employee("Vineet Sinha");
		
		EmpOne.empAgen(21);
		EmpOne.empSalaryn(3.25);
		EmpOne.empDesignationn("Software Engineer");
		EmpOne.printEmp();
		EmpTwo.empAgen (28);
		EmpTwo.empSalaryn(70);
		EmpTwo.empDesignationn("SDE 1");
		EmpTwo.printEmp();
	}

}
