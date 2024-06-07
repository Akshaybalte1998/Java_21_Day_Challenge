package staticVariables;

public class EmployeeInfo {

	private int id;
	private String name;
	
	private static String organizationName="IACSD";
	
	
	
	public EmployeeInfo()
	{
		this.id=00;
		this.name="nil";
	}
	public EmployeeInfo(int id ,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return "id: "+id+" name: "+name+" origanization name"+organizationName;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name )
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	//static method can access only static members
	public static void updateOrganizationName(String newOrganizationName)
	{
		organizationName=newOrganizationName;
	}
}
		
