package com.bookapp.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> getBooks(){
		return Arrays.asList(
           new Book("Java", 101, 450.0, "Vijayakumar", "Back End", LocalDate.of(2024, 5, 10)),
           new Book("Angular", 102, 500.0, "Ezhil", "Front End", LocalDate.of(2025, 5, 11)),
           new Book("React JS", 103, 550.0, "Ilamaran", "Front End", LocalDate.of(2025, 5, 12)),
           new Book("Spring Framework", 104, 600.0, "Vijay", "Back End", LocalDate.of(2024, 5, 13)),
           new Book("MySQL", 105, 650.0, "Kumar", "Database", LocalDate.of(2000, 5, 14))
       );
	}

}