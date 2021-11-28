package question_1;

public class Truck extends Vehicle {

	public Truck(String registration_Num, Person owner, int noOfWheels) {
		super(registration_Num, owner, noOfWheels);
	}

	@Override
	public double registraion_amount(int w) {
		System.out.println("Registration Amount of Truck");
		double a =(5000*getNoOfWheels()*10.2);
		return a;
	}

}
