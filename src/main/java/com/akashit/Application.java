package com.akashit;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akashit.entity.Book;
import com.akashit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		BookRepository repo = run.getBean(BookRepository.class);
		
		
		
		List<Book> books = repo.getAllBooks();
		
		for (Book b : books) {
			 System.out.println(b); }
		
	}
		
		
		
		//--------------------------------------------------------------------
		/* (1)
		 * List<Book> books = repo.findByBookName("CSS"); for (Book b : books) {
		 * System.out.println(b); }
		 */
		
		//--------------------------------------------------------------------
		/*
		 * List<Book> books = repo.findByBookPriceGreaterThan(300.00); for (Book b:
		 * books) { System.out.println(b); }
		 */
		
		
	}


