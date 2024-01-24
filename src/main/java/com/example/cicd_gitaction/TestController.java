package com.example.cicd_gitaction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final EmailValidator emailValidator = new EmailValidator();
    @RequestMapping(value = "validateEmail", method = RequestMethod.POST)
    public ResponseEntity<String> validateEmail(@RequestBody String email) {
        if (emailValidator.isValid(email)) {
            return ResponseEntity.ok("Valid");
        } else {
            return ResponseEntity.badRequest().body("Invalid");
        }
    }

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "Heloo";
    }

    @RequestMapping(value = "hellooo",method = RequestMethod.GET)
    public String helloWorld(){
        return "Heloo";
    }
}
