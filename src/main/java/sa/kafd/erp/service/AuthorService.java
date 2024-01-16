package sa.kafd.erp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.kafd.erp.model.Author;
import sa.kafd.erp.repo.AuthorRepository;
import sa.kafd.erp.repo.BookRepository;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public Author getAuthorById(Long authorId) {

        String sql_statement = "";
        return authorRepository.findById(authorId).get();
    }

    public List<Author> getAuthorsList(Long authorId) {
        return authorRepository.findAll();
    }
}
