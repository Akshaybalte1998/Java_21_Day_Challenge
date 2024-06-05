package inheritanceOverloading;


public class Vechicle {
	
	private String brand;
	
	public Vechicle()
	{
		this.brand="Akshay";
	}
	
	public Vechicle(String brand)
	{
		this.brand=brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public void StartEngine()
	{
		System.out.println("vehicle engine  is start");
	}
	public void Move()
	{
		System.out.println(" vehicle engine is move");
	}
	
	
	@Override
	public String toString()
	{
		return "brand : "+brand;
	}
}
