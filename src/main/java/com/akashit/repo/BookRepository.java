package com.akashit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.akashit.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	
	
	@Query(value = "select * from book", nativeQuery = true)
	public List<Book> getAllBooks();
	
	@Query("from Book")
	public List<Book> getBooks();

	
	

	/* (1)
	 * //public List <Book> findByBookPriceGreaterThan(double d); // select * from
	 * book where book_price > : price public List<Book>
	 * findByBookPriceGreaterThan(Double price);
	 * 
	 * // select * from book where book_price < : price public List<Book>
	 * findByBookPriceLessThan(Double price);
	 * 
	 * // select * from book where book_name = : bookName public List<Book>
	 * findByBookName(String bookName);
	 */

}
