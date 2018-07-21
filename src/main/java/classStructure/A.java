package classStructure;

import certification.B;

public class A extends B{
	
	public void callingMethod() {	
		System.out.println("Method from A");
	}
	
	 public static void main(String... args) {
		B obj = new B();
		obj.callingMethod();
		 
	 }

}
