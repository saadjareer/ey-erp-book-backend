package sa.kafd.erp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sa.kafd.erp.model.Book;
import sa.kafd.erp.service.BookService;

import java.util.List;

@SpringBootTest
public class BookServiceTests {

    @Autowired
    BookService bookService;

    @Test
    void testGetBooksList() {

        // actual_result -> based on the API call [e.g.: 3]
        // expected_result -> 4

        // test -> compare actual with expected
        // if (=) -> PASS
        // else -> FAIL

        List<Book> booksList = bookService.getBooksList();
        int actual_booksListSize = booksList.size();
        int expected_booksListSize = 4;

        Assertions.assertEquals(actual_booksListSize, expected_booksListSize);

        // where are the spaces
    }
    
}
