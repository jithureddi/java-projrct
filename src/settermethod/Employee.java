package settermethod;

public class Employee {

	private int empId;
	private String empName;
	private String empDesig;
	private double salary;
	private String address;
	private boolean isPermanent;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public void display() {
		System.out.println("ID: " +empId);
		System.out.println("Name:  " +empName);
		System.out.println("Designation: " +empDesig);
		System.out.println("Salary: " +salary);
		System.out.println("Address: " +address);
		System.out.println("Is Permanent Employee: "+isPermanent);

}
}
