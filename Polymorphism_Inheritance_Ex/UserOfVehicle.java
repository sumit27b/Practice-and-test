package question_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserOfVehicle {

	public static void main(String[] args) {
		
		Vehicle c1 =new Car("2345678", new Person("chandler",32), 4);
		Vehicle m1 =new Motorcycle("779829", new Person("monica", 20), 2);
		Vehicle t1 =new Truck("299746", new Person("Joey", 40), 8);
		Vehicle c2 =new Car("2345678", new Person("ross",30), 4);
		Vehicle m2 =new Motorcycle("7020657", new Person("rachel", 30), 2);
		
		List<Vehicle> vs =new ArrayList<Vehicle>();
		vs.add(c1);
		vs.add(m1);
		vs.add(t1);
		vs.add(c2);
		vs.add(m2);
		
		Iterator<Vehicle> itr= vs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(c1.registraion_amount(4));
		System.out.println(m1.registraion_amount(2));
		System.out.println(t1.registraion_amount(8));
	}

}
