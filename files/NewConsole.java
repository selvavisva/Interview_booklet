package com.depth.files;

import java.io.Console;
import java.util.Scanner;

public class NewConsole {
	public static void main(String[] args) {
		
		//Console will work in terminal not from IDE
		Console console = System.console();		
		if(null==console) {
			System.out.println("Console not available");
			//return;
		}
		else {
			String line;
			while(!(line=console.readLine()).equalsIgnoreCase("Exit")) {
				System.out.println("Input enteres :: "+line);
			}
		}
	}
}
