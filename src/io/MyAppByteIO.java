package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class MyAppByteIO {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("jeju.txt");
		FileOutputStream fos = new FileOutputStream("jeju2.txt");
		
		FileReader fr = new FileReader("jeju.txt");
		System.out.println((char) fis.read());
		System.out.println((char) fr.read());
		
//		int b = 0;
//
//		
//		while ((b = fis.read()) != -1) {
//			fos.write(b);
//		}
		
		fr.close();
	
		fis.close();
		fos.close();
	}
}
