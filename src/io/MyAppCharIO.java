package io;

import java.io.FileReader;
import java.io.FileWriter;

public class MyAppCharIO {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("jeju.txt");
		FileWriter fw = new FileWriter("jeju3.txt");
		int c = 0;
		
		while ((c = fr.read()) != -1) {
//			System.out.println((char) c);
			fw.write(c);
		}

		fr.close();
		fw.close();
	}
}
