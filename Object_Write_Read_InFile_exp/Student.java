package nov25;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable{
	String name;
	int age;
	int [] marks;
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
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", marks=" + Arrays.toString(marks);
	}
	public Student(String name, int age, int[] marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
