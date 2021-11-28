package nov25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIOOperation {


	//file should overwrite 
	static void writeTOFile(List<Student> students) {
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Student.db"));

			for(Iterator<Student> itr =students.iterator();itr.hasNext();) {
				Student stud=(itr.next());
				oos.writeObject(stud);
			}
			oos.flush();
			oos.close();

		}  catch (IOException e) {
			System.out.println(e);
		}
	}

	//if file not present then throw exception"StudentDbFileNotFound"
	public static List<Student> readFromFile() throws StudentDBFileNotFound {
		List<Student> students =new ArrayList<Student>();
		ObjectInputStream obj=null;
		try {
			FileInputStream fin=new FileInputStream("Student.db");
			obj=new ObjectInputStream(fin);
			while (fin.available()>0) {
				Student student =(Student)obj.readObject();
				students.add(student);
			}

		} catch (FileNotFoundException e) {

			throw new StudentDBFileNotFound();
		}
		catch (IOException |ClassNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(obj!=null)
				obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return students;
	}
}
