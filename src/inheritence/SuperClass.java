package inheritence;

public class SuperClass {
	protected int num;
	protected String name;
	
	public SuperClass() {
		
	}
	
	public SuperClass(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void printMessage( ) {
		System.out.println("슈퍼클래스의 수: "+ this.num + 
				         "\n슈퍼클래스의 이름: " + this.name);
	}
}
