package getterSetter;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployerInfo e1=new EmployerInfo(1,"akshasy");
		System.out.println(e1.toString());
		String details=e1.toString();
		System.out.println(details);
		
		
		
		System.out.println(" using getter and setters");
		EmployerInfo emp ;
		emp= new EmployerInfo();
		
		emp.setId(2);
		emp.setName("ashu");
		System.out.println("id "+emp.getId()+" name: "+emp.getName());
		
	}

}
