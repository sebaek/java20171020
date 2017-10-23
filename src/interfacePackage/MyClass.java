package interfacePackage;

public class MyClass implements MyInterface, YourInterface {

	@Override
	public int getRandomNumber() {
		
		return (int) Math.floor((Math.random() * 10));
	}

	@Override
	public int getCeilNumber(double number) {
		
		return (int) Math.ceil(number);
	}
	
	public void doSomething() {
		System.out.println("뭔일인가???");
	}

	@Override
	public void print() {
		
		
	}
	
}




