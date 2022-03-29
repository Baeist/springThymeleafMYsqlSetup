package com.example.userlogindatabaseweb.controller;

import com.example.userlogindatabaseweb.repository.TestRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller                         // notifies Spring this is our controller
public class TestController {

    // the 2 lines below, let spring controller know about the repository
    TestRepository repository;
    public TestController(TestRepository repo){
        this.repository = repo;
    }


    // setup for localhost:8080/start
    @GetMapping("/start")
    public String start(Model model){       // model is used when using thymeleaf to access variable values, it does nothing here
        return "start";
    }


}
