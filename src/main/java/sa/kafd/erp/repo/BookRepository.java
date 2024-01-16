package sa.kafd.erp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sa.kafd.erp.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    public List<Book> findByBookNameContainsAndBookAuthorEquals(String booKName, String bookAuthor);




}
