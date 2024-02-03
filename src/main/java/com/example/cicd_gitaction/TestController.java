package com.example.cicd_gitaction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    private final EmailValidator emailValidator = new EmailValidator();
    @RequestMapping(value = "validateEmail", method = RequestMethod.POST)
    public ResponseEntity<String> validateEmail(@RequestParam String email) {
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

    @RequestMapping(value = "hello1",method = RequestMethod.GET)
    public String hello1(){
        return "Heloo";
    }

}
