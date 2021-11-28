package Study.collection;

public class Person2 implements Comparable<Person2> {
	private String name;
	private MyDate3 dob;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate3 getDob() {
		return dob;
	}
	public void setDob(MyDate3 dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", dob=" + dob + "]";
	}
	public Person2(String name, MyDate3 dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	@Override
	public int compareTo(Person2 o) {
		
		return this.name.compareTo(o.name);
	}
	
	
}
