package com.example.userlogindatabaseweb.controller;

import com.example.userlogindatabaseweb.repository.TestRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller                         // notifies Spring this is our controller
public class TestController {

    // below codeblock lets spring controller know about the repository
    TestRepository repository;
    public TestController(TestRepository repo){
        this.repository = repo;
    }


    // setup for localhost:8080/start
    @GetMapping("/start")
    public String start(Model model){
        return "start";
    }


}
