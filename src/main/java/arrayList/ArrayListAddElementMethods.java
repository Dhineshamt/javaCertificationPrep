package arrayList;
import java.util.List;
import java.util.ArrayList;

public class ArrayListAddElementMethods{

	public static void main(String[] args) {
		
		List<Character> letters = new ArrayList<>();
		
		/*Method 1: boolean add(E element);
		  *         Adds element to end of the list. 
		  *         Returns true if element gets added successfully.
		  */
		letters.add('A');
		letters.add('B');
		letters.add('D');
		
		/*Method 2: void add(int index, E element); 
		 * 			Adds element into specified index. Index starts from 0.  
		 * 			Returns nothing upon successful insertion.
		 * 			Throws 'Index out of bound exception' if index is not found (index <0 || index > size())
		 */
		letters.add(2, 'C');        //character 'C' will be added in between B and D in letters array list.
		System.out.println(letters);   //Output:   [A,B,C,D]
		
		/*Method 3: boolean addAll(Collection c);
		 * 			Inserts elements from specified collection at the end.
		 * 			returns true if any element is added
		 */
		List<String> carParts = new ArrayList<>();
		carParts.add("engine");
		carParts.add("bumper");
		carParts.add("bonnet");
		
		List<String> car = new ArrayList<>();
		car.addAll(carParts);                //All the elements of car parts are added to car.
		
		System.out.println(car);  			//Output: [engine, bumper, bonnet]
		
		
		/*Method 4: boolean addAll(int index, Collection c); 
		 * 			Insert specified collection in specified index. Index starts from 0. 
		 * 			returns true if collection gets added successfully
		 * 			Throws 'Index out of bound exception' if index is not found (index <0 || index > size())
		 */
		List<String> interior = new ArrayList<>();
		interior.add("Seat cover");
		interior.add("sound system");
		
		car.addAll(0, interior);           //All the elements of interior will be added to car after first index
		System.out.println(car);           //Output: [Seat cover, sound system, engine, bumper, bonnet]
		
	}

}
