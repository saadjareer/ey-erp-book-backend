package sa.kafd.erp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class BookControllerV1 {

    @GetMapping(path = "/sayHello")
    public String sayHello() {
        System.out.println("REQUEST: sayHello");
        return "Hello in Book ERP Application";

    }
}
