package sa.kafd.erp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.kafd.erp.model.Book;
import sa.kafd.erp.repo.BookRepository;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooksList() {
//        return bookRepository.findAll();
    }

    public Book getBookById(Long bookId) {
        return bookRepository.findById(bookId).get();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
