package question_1;

public abstract class Vehicle {
	
	private String registration_Num;
	private Person owner;
	private int noOfWheels;
	
	//fully parameterized constructor
	public Vehicle(String registration_Num, Person owner, int noOfWheels) {
		super();
		this.registration_Num = registration_Num;
		this.owner = owner;
		this.noOfWheels = noOfWheels;
	}
	
	@Override
	public String toString() {
		return "Registration_Num=" + registration_Num + ", Owner" + owner + ", NoOfWheels=" + noOfWheels
				;
	}

	public String getRegistration_Num() {
		return registration_Num;
	}
	public void setRegistration_Num(String registration_Num) {
		this.registration_Num = registration_Num;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	public abstract double registraion_amount(int w);

}
