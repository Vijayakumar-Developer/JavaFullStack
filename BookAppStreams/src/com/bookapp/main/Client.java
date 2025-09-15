package com.bookapp.main;

import java.util.List;
import java.util.Scanner;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBookService bookService = new BookServiceImpl();
		Scanner sc = new Scanner (System.in);
		System.out.println(" Book App ");
		System.out.println(" Choose the choice ");
		System.out.println("1. View All Books");
		System.out.println("2. Search by Author");
		System.out.println("3. Search by category");
        System.out.println("4. Search by Price Less Than");
        System.out.println("5. Search by Year Published");
        System.out.println("6. Search by Author & Category");
        System.out.println("7. Search by Book ID");
        System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		sc.nextLine();
		try {
			switch(choice) {
			case 1:
				List<Book> allBooks = bookService.getAll();
				allBooks.forEach(System.out::println);
				break;
			case 2:
				System.out.println("Enter author name : ");
				String author= sc.nextLine();
				bookService.getByAuthorContains(author).forEach(System.out::println);
				break;
			case 3:
				System.out.println("Enter category : ");
				String category= sc.nextLine();
				bookService.getByCategory(category).forEach(System.out::println);
				break;
			case 4:
				System.out.println("Enter Max Price:");
				double price = sc.nextDouble();
				bookService.getByPriceLessThan(price).forEach(System.out::println);
				break;
			case 5:
				System.out.println("Enter year published :");
				int year =sc.nextInt();
				bookService.getByDatePublished(year).forEach(System.out::println);
				break;
			case 6:
				System.out.println("Enter author Keyword : ");
				String auth = sc.nextLine();
				System.out.println(" Enter Category : ");
				String cat = sc.nextLine();
				bookService.getByAuthorContainsAndCategory(auth, cat).forEach(System.out::println);
				break;
			case 7:
				System.out.println("Enter Book ID : ");
				int id = sc.nextInt();
				System.out.println(bookService.getById(id));
				break;
			default:
                System.out.println("Invalid choice.");
			}
		}
		catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
