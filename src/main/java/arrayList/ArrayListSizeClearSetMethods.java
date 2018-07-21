package arrayList;

import java.util.ArrayList;

public class ArrayListSizeClearSetMethods {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Dhinesh");
		names.add("Dhilip");
		names.add("Dhiva");
		names.add("Jayasudha");
		
		/*Method 1: E set(int index, E element); 
		 * 			This method replaces element in specified index with specified element in argument. 
		 * 			Returns the element which was replaced
		 *  		The method throws an IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size()).
		 */
		String replacedName = names.set(2, "Aishu");  //The name 'Dhiva' in index 2 got replcaced with name "Aishu" 
													  //and set method returned the name "Dhiva"
		System.out.println("Name in specified index is -  " +replacedName+ "  - and it got replaced"); 
											//Output: Name in specified index is -  Dhiva  - and it got replaceds		
		System.out.println(names); // Output: [Dhinesh, Dhilip, Aishu, Jayasudha]

		/*Method 2: void trimToSize(); 
		 * 			This method trims the capacity of the list to current size.
		 * 			This method exist in ArrayList class only. not in List interface 			
		 */
		names.trimToSize();
		
		/*Method 3: void clear(); 
		 * 			This method deletes all elements from the list. 
		 * 			The list is empty after the call, so it has size 0  
		 */
		names.clear();    							//All the elements in the list are removed. Hence, the size of list is 0.
		int sizeOfListAfterClear = names.size();
		System.out.println(sizeOfListAfterClear);  //Output:  0
		
		
		
	}	

}
