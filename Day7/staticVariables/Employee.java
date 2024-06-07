package staticVariables;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfo e1=new EmployeeInfo(1, "King");
		EmployeeInfo e2=new EmployeeInfo(2,"Ernst");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		EmployeeInfo.updateOrganizationName("New IACSD");
		System.out.println("AFter update-------");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}

}
