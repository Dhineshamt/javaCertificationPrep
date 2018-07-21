package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConstructors {

	public static void main(String[] args) {
		//Constructor type 1 - This will create arraylist with capacity of 10
	    List<String> homeNames = new ArrayList<>();	    
	    homeNames.add("dhinesh");
	    homeNames.add("Aishu");
		
		//Constructor type 2 - This will create array list with initial capacity of 20 which is passed in argument to constructor
		List<String> officeNames = new ArrayList<>(20);
		officeNames.add("Arun");
		officeNames.add("Prasanna");
		
		//Constructor type 3 - This will add the collection specified in the argument to the list
		List<String> names = new ArrayList<>(homeNames);
		
		
		System.out.println(homeNames);
		System.out.println(officeNames);
		System.out.println(names);
		
	}

}
