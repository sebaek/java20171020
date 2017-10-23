package interfacePackage;

public class YourClass implements MyInterface{

	@Override
	public int getRandomNumber() {
		
		return new java.util.Random().nextInt(10);
	}

	@Override
	public int getCeilNumber(double number) {
		
		return (int) (number + 1);
	}

}
