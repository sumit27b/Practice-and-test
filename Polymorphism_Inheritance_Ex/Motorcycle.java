package question_1;

public class Motorcycle extends Vehicle{

	public Motorcycle(String registration_Num, Person owner, int noOfWheels) {
		super(registration_Num, owner, noOfWheels);
	}

	@Override
	public double registraion_amount(int w) {
		System.out.println("Registration Amount of Motorcycle");
		double a =(5000*getNoOfWheels()*8.2);
		return a;
	}
	
	

}
