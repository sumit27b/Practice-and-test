package nov25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		List<Student> students = null;
		try {
			students = StudentIOOperation.readFromFile();
		} catch (StudentDBFileNotFound e) {
			System.out.println("Student.db file not found!");
			students =new ArrayList<Student>();
		}
		boolean flag=true;
		while(flag) {
			System.out.println("-------------------------------------\n"
							+ "0. Show All");
			System.out.println("1. Add Student");
			System.out.println("2. Add Student without marks");
			System.out.println("3. search student by name");
			System.out.println("4. remove Student by name");
			System.out.println("5. remove all");
			System.out.println("6. exit without save");
			System.out.println("7. exit with save"
							+ "\n-------------------------------------");
			System.out.println("Enter Your choice.");
			int ch=sc.nextInt();		
			switch (ch) {
			case 0:
				for (Student student : students) {
					System.out.println(student);
				}
				break;

			case 1: addStudentWithMarks(students,sc);
			break;

			case 2:	addStudentWithoutMarks(students,sc);				
			break;

			case 3:	searchStudentByName(students,sc);
			break;

			case 4: removeStudentByName(students,sc);
			break;

			case 5: removeAll(students);
			break;

			case 6:	flag=false;	break;

			case 7: StudentIOOperation.writeTOFile(students);
			flag=false;	break;
			}
		}	
	}

	//case 1:
	private static void addStudentWithMarks(List<Student>students,Scanner sc) {
		System.out.println("Enter Name of Student");
		String name=sc.next();
		System.out.println("Enter Student Age");
		int age =sc.nextInt();
		System.out.println("Enter Student Marks");
		int []marks=new int[3];
		for(int i=0;i<marks.length;i++) {
			System.out.println("subject "+(i+1)+"marks:");
			marks[i]=sc.nextInt();
		}
		students.add(new Student(name, age, marks));
	}

	//case 2:
	private static void addStudentWithoutMarks(List<Student> students, Scanner sc) {
		System.out.println("Enter Name of Student");
		String name1=sc.next();
		System.out.println("Enter Student Age");
		int age1 =sc.nextInt();
		students.add(new Student(name1, age1));
	}

	//case 3:
	private static void searchStudentByName(List<Student> students, Scanner sc) {
		System.out.println("Enter student name to search :");
		String name = sc.next();
		for (int i = 0; i <students.size(); i++) {
			if(students.get(i).getName().equalsIgnoreCase(name))
				System.out.println(students.get(i));		
		}
	}

	//case 4:
	private static void removeStudentByName(List<Student> students,Scanner sc) {
		System.out.println("Enter student name which u want to remove :");
		String rname = sc.next();
		for (int i = 0; i <students.size(); i++) {
			if(students.get(i).getName().equalsIgnoreCase(rname))
				students.remove(i);
		}
		System.out.println("Removed SuccesFully");
	}

	//case 5
	private static void removeAll(List<Student> students) {
		for (int i = 0; i <students.size(); i++) {
			students.removeAll(students);
		}
		System.out.println("list is now empty");
	}

}//end of class
