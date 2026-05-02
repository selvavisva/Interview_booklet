package com.depth.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate2 {	
	public static void main(String[] args) {
		
		Book b1 = new Book("Java Book Expert edition",800,"Kathy Sierra");
		Book b2 = new Book("Python Book Expert edition",800,"XXXX");
		Book b3 = new Book("Redis Book Expert edition",800,"YYYY");
		Book b4 = new Book("node.js Book Expert edition",800,"WWWWW");
		Book b5 = new Book("Java Book Action",1900,"EDYHRU");
		Book b6 = new Book("Java Black Book",700,"DETYUI");
		Book b7 = new Book("AI experts book",800,"FCFTF");
		
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);
		books.add(b7);
				
		Predicate<Book> bookPredicate = book -> (book.getName().contains("Java") && (book.getPrice() < 1000));
		List<Book> bookList = books.stream().filter(bookPredicate).toList();
		
		bookList.forEach( x -> {
				System.out.println(x.getName());
		});	
	}
}
