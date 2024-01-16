package sa.kafd.erp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.kafd.erp.model.Author;
import sa.kafd.erp.service.AuthorService;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping(path = "/{authorId}")
    public Author getAuthorById(@PathVariable(name = "authorId")  Long authorId) {
        return authorService.getAuthorById(authorId);
    }
}
