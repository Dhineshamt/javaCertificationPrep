package certification;

public class InstanceBlock {
	
	{
		System.out.println("Instance block-1");
	}
	
	{
		System.out.println("Instance block-2");
	}
	
	static {
		System.out.println("This is static block");
	}
	
	public InstanceBlock() {
		System.out.println("This is constructor");
	}
	
	public static void main(String args[]) {
		InstanceBlock obj = new InstanceBlock();
		InstanceBlock obj1 = new InstanceBlock();
	}

}
