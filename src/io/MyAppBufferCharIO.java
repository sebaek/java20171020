package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyAppBufferCharIO {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("jeju.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("jeju5.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		char[] c = new char[10];
		int flag = 0;
		
		while ((flag = br.read(c)) != -1) {
			bw.write(c, 0, flag);
		}
		
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		
	}
}
