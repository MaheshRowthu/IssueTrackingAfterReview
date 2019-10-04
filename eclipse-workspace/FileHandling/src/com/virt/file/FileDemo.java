package com.virt.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("abc.text");
			FileWriter fw = new FileWriter("newcopy.txt");
			int ch = 0;
			while (ch != -1) {

				ch = fr.read();
				while (ch != '\n') {
					if (ch == -1)
						break;
					fw.write(ch);
				}
				fw.write('\n');
				ch = fr.read();
				while (ch != '\n') {
					if (ch == -1)
						break;
				}
			}
			fr.close();
			fw.close();
			System.out.println("file copied as per ur need");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
