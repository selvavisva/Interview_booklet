package com.depth.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndPrint2 {
	public static void main(String[] args) {

		try {
			File file = new File("C:\\Users\\selva\\Documents\\Test1.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bfReader = new BufferedReader(fileReader);
			String s;
			while ((s = bfReader.readLine()) != null) {
				System.out.println(s);
			}

		} catch (IOException exp) {
			exp.printStackTrace();
		}
	}
}
