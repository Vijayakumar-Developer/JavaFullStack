package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() throws BookNotFoundException {
		// TODO Auto-generated method stub
		//return null;
        return BookDetails.getBooks();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		//return null;
        List<Book> result = BookDetails.getBooks().stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
        if (result.isEmpty())
            throw new BookNotFoundException("No books found with author containing: " + author);
        return result;

	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		//return null;
        List<Book> result = BookDetails.getBooks().stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
        if (result.isEmpty())
            throw new BookNotFoundException("No books found in category: " + category);
        return result;

	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		//return null;
        List<Book> result = BookDetails.getBooks().stream()
                .filter(book -> book.getPrice() < price)
                .collect(Collectors.toList());
        if (result.isEmpty())
            throw new BookNotFoundException("No books found with price less than: " + price);
        return result;

	}

	@Override
	public List<Book> getByDatePublished(int year) throws BookNotFoundException {
		// TODO Auto-generated method stub
		//return null;
        List<Book> result = BookDetails.getBooks().stream()
                .filter(book -> book.getDatePublished().getYear() == year)
                .collect(Collectors.toList());
        if (result.isEmpty())
            throw new BookNotFoundException("No books published in year: " + year);
        return result;

	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		//return null;
        List<Book> result = BookDetails.getBooks().stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase())
                        && book.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
        if (result.isEmpty())
            throw new BookNotFoundException("No books found with author containing '" + author + "' in category '" + category + "'");
        return result;

	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		//return null;
        return BookDetails.getBooks().stream()
                .filter(book -> book.getBookId() == bookId)
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("No book found with ID: " + bookId));
    }

	}


