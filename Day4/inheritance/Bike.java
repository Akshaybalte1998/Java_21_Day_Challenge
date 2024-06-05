package inheritance;

public class Bike extends Vechicle{
	
	private int cc;
	
	public Bike()
	{
		this.cc=125;
	}

	public Bike(String brand,int cc)
	{
		super(brand);
		this.cc=cc;
	}
	@Override
	public String toString()
	{
		return super.toString()+"bike cc: "+this.cc;
	}
	
	public void setCC(int cc)
	{
		this.cc=cc;
	}
	public int getCC()
	{
		return this.cc;
	}
	
	public void ButtonStar()
	{
		System.out.println(" button start bike");
	}
	
	
	
}
