package sa.kafd.erp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sa.kafd.erp.model.Author;
import sa.kafd.erp.model.Book;
import sa.kafd.erp.model.GenericResponse;
import sa.kafd.erp.service.BookService;

import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/api/v1/book")
public class BookController {

    private static final Logger logger = Logger.getLogger(BookController.class.getName());

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<GenericResponse> getBooksList() {

        GenericResponse response = new GenericResponse();
        List<Book> booksList = bookService.getBooksList();
        if(!booksList.isEmpty()){
            response.setResponseCode("100");
            response.setResponseMessage("SUCCESS");
            response.setResponseBody(booksList);
        }
        logger.log(Level.INFO, "RESPONSE[getBooksList]: {0}" , response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(path = "/{bookId}")
    public ResponseEntity<GenericResponse> getBookById(@PathVariable("bookId") Long bookId) {
        GenericResponse response = new GenericResponse();
        Book resultBook = bookService.getBookById(bookId);
        if(!Objects.isNull(resultBook)){
            response.setResponseCode("100");
            response.setResponseMessage("SUCCESS");
            response.setResponseBody(resultBook);
        }
        logger.log(Level.INFO, "RESPONSE[getBookById]: {0}" , response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GenericResponse> saveBook(@RequestBody Book book) {
        GenericResponse response = new GenericResponse();
        Book savedBook = bookService.saveBook(book);
        if(!Objects.isNull(savedBook)){
            response.setResponseCode("100");
            response.setResponseMessage("SUCCESS");
            response.setResponseBody(savedBook.getBookId());
        }
        logger.log(Level.INFO, "RESPONSE[saveBook]: {0}" , response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
