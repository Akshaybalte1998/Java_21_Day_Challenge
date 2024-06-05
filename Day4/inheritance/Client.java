package inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car c1=new Car("tata",4);
		 System.out.println(c1);
		c1.OpenTrunk();
		c1.Move();
		c1.StartEngine();
		
		
		Bike b1=new Bike("GT",650);
		System.out.println(b1);
		b1.ButtonStar();
		b1.Move();
		b1.StartEngine();
	}

}
