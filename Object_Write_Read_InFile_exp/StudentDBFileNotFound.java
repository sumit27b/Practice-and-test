package nov25;

public class StudentDBFileNotFound extends Exception {
	public StudentDBFileNotFound(){
		super("Student.db file not found");
	}
}
