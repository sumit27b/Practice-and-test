package question_1;

public class Person {
	private String name;
	private int age;
	
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age;
	}

	//partially parameterized constructor
	public Person(String name) {
		super();
		this.name = name;
	}
	
	//fully parameterized constructor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
