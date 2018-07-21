package certification;
import classStructure.A;

class MultiClass {
	public void method1() {
		A obj = new A();
		int b = obj.a;
		System.out.println(b+ "Class 1");
	}

}

class Class2{
	public void method2() {
		A obj = new A();
		int b = obj.a;
		System.out.println(b +"Class 2");
	}
	
}