package sa.kafd.erp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sa.kafd.erp.model.Book;
import sa.kafd.erp.service.BookService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v2")
public class BookControllerV2 {

    @Autowired
    private BookService bookService;

    @GetMapping(path = "/sayHello")
    public String sayHello() {
        return "Hello in Book ERP Application - V2";
    }

    @GetMapping(path = "/book")
    public List<Book> getBooksList() {
        return bookService.getBooksList();
    }

    @GetMapping(path = "/book/{bookId}")
    public Book getBookById(@PathVariable("bookId") Long bookId) {
        return bookService.getBookById(bookId);
    }

    @PostMapping(path = "/book")
    public Long saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return book.getBookId();
    }
}
