package getterSetter;

public class EmployerInfo {

	
	
	private int id;
	private String name;
	public EmployerInfo()
	{
		this.id=00;
		this.name="nil";
	}
	public EmployerInfo(int id ,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return "id: "+id+" name: "+name;
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
	
	
	
	
	
}
