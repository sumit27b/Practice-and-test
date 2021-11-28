package Study.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfPerson {

	public static void main(String[] args) {
		List<Person2> persons =new ArrayList<Person2>();
		persons.add(new Person2("joey",new MyDate3(23,4,1980)));
		persons.add(new Person2("chandler",new MyDate3(3,11,1970)));
		persons.add(new Person2("rachel",new MyDate3(23,8,2005)));
		persons.add(new Person2("ross",new MyDate3(27,1,2023)));


		for(Person2 p:persons)
			System.out.println(p);

		Collections.sort(persons);

	//	Collections.sort(persons, new SortOnNameLength());	
		Collections.sort(persons, new SortOnDOBBasis());	
		System.out.println("\nafter Sorting by name length..");
		for(Person2 p:persons)
			System.out.println(p);
	}

}

class SortOnDOBBasis implements Comparator<Person2>
{
	@Override
	public int compare(Person2 o1, Person2 o2) {
		
		return o1.getDob().compareTo(o2.getDob());
	}	
}

class SortOnNameLength implements Comparator<Person2>{
	@Override
	public int compare(Person2 o1, Person2 o2) {
		if(o1.getName().length() > o2.getName().length()) return 1;
		if(o1.getName().length() < o2.getName().length()) return -1;
		else
			return 0;
	}

}