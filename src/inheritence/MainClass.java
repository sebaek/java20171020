package inheritence;

public class MainClass {

	public static void main(String[] args) {
		SubClass o1 = new SubClass(10, "제주");
		o1.printMessage();
		
		doSomething(o1);
	}
	
	public static void doSomething(SuperClass s) {
		
	}
}
