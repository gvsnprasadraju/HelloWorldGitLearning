package com.example.helloworldgit;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value = "/helloMessage/{name}", produces = MediaType.APPLICATION_JSON_VALUE)

    public String HelloMessage(@PathVariable String name){

        return "Hello" + name;

    }



}
