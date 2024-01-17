package sa.kafd.erp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.kafd.erp.model.Author;
import sa.kafd.erp.model.GenericResponse;
import sa.kafd.erp.service.AuthorService;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {

    private static final Logger logger = Logger.getLogger(AuthorController.class.getName());

    @Autowired
    private AuthorService authorService;

    @GetMapping(path = "/{authorId}")
    public ResponseEntity<GenericResponse> getAuthorById(@PathVariable(name = "authorId")  Long authorId) {
        GenericResponse response = new GenericResponse();
        Author author = authorService.getAuthorById(authorId);
        if(!Objects.isNull(author)){
            response.setResponseCode("100");
            response.setResponseMessage("SUCCESS");
            response.setResponseBody(author);
        }
        logger.log(Level.INFO, "BACKEND-RESPONSE[getAuthorById]: {0}" , response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
