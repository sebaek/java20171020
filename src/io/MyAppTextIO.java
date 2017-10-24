package io;

import java.io.FileInputStream;
import java.util.Scanner;

public class MyAppTextIO {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("numbers.txt");
		Scanner scanner = new Scanner(fis);
		
		scanner.useDelimiter(",");
		while (scanner.hasNextDouble()) {
			System.out.println(scanner.nextDouble());
		}
		
		scanner.close();
		fis.close();
	}
}
