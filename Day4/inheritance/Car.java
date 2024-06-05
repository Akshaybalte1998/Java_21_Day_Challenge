package inheritance;

public class Car extends Vechicle {
	
	private int numberOfDoor ;
	
	public Car()
	{
		numberOfDoor=4;
	}
	
	public Car(String brand,int numberOfDoor)
	{
		super(brand);
		this.numberOfDoor=numberOfDoor;
	}
	
	public int  getNumberOfDoor()
	{
		return numberOfDoor;
	}
	
	
	public void setnumberOfDoor(int numberOfDoor)
	{
		this.numberOfDoor=numberOfDoor;
	}
	@Override
	public String toString()
	{
		return super.toString()+"  numberOfDoor"+this.numberOfDoor;
	}
	
	public void OpenTrunk()
	{
		System.out.println("trunk is open");
	}

}
