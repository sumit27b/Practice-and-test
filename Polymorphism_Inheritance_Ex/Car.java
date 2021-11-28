package question_1;

public class Car extends Vehicle{

	public Car(String registration_Num, Person owner, int noOfWheels) {
		super(registration_Num, owner, noOfWheels);
	}

	@Override
	public double registraion_amount(int w) {
		System.out.println("Registration Amount of Car");
		double a =5000*getNoOfWheels()*12.2;
		return a;
	}

}
