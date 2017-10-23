package inheritence;

public class SubClass extends SuperClass {

	public SubClass() {
		super();
	}
	
	public SubClass(int num, String name) {
		super(num, name);
		
	}
	
	@Override
	public void printMessage( ) {
		System.out.println("서브클래스의 수: "+ this.num + 
				         "\n서브클래스의 이름: " + this.name);
	}
}
