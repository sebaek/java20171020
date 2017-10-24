package math;

import java.util.Random;

public class MyMain {
	public static void main(String[] args) {
		System.out.println(Math.round(3.14));
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.floor(3.14));
		System.out.println(Math.pow(3, 3));
		System.out.println(Math.abs(-3));
		System.out.println(Math.max(-3, 3));
		System.out.println(Math.min(-3, 3));
		
		System.out.println(Math.random());
		
		// Random // import 단축키 ctrl + shift + o
		Random random = new Random();
		System.out.println(random.nextInt(100) + 1);
	}
}





