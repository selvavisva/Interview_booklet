package com.depth.files;

import java.util.Scanner;

public class NewScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the targetted companies :: ");
		String enteredData = scanner.nextLine();
		System.out.println("Interested companies are ::"+enteredData);
	}
}
