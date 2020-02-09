package settermethod;

public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpId(111);
		e1.setEmpName("Jithu");
		e1.setEmpDesig("Student");
		e1.setSalary(2000);
		e1.setPermanent(true);
		e1.display();
		
		System.out.println("***************************************");
		
		Employee e2=new Employee();
		
		e2.setEmpId(6663);
		e2.setEmpName("reddy");
		e2.setEmpDesig("developer");
		e2.setSalary(4000);
		e2.setPermanent(false);
		e2.display();
		

	}

}
