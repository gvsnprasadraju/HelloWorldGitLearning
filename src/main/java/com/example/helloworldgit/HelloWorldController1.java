package com.example.helloworldgit;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController1 {
    @GetMapping(value = "/helloMessage1/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String HelloMessage1(@PathVariable String name){

        return "Hello from helloworld1from gvsn2account on class HelloWorldController1. " + name;

    }



}
