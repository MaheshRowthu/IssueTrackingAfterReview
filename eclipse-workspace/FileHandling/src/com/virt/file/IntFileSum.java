package com.virt.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IntFileSum {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("numbers.txt");
			FileWriter fw = new FileWriter("sum.txt");
			BufferedReader br = new BufferedReader(fr);
			Scanner sc = new Scanner(br);

			String line = br.readLine();
			int sum = 0;
			while (line != null) {
				String arNumbers[] = line.split(" ");
				sum = 0;
//				System.out.println(arNumbers);
				int x = sc.nextInt();
				sum = sum + x;
				if (sc.nextLine() == "\n") {
					System.out.println(sum);
				}
			}
			fw.write("sum is:" + sum);
			;
			System.out.println("sum =" + sum);
			sc.close();
			br.close();
			fw.close();
			fr.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
