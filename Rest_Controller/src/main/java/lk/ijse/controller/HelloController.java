package lk.ijse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String SayHello(){
        return "Hello World";
    }
    @PostMapping
    public String SayHelloPost(){
        return "Hello World (POST)";
    }

    @DeleteMapping
    public String SayHelloDelete(){
        return "Hello World (DELETE)";
    }

    @PutMapping
    public String SayHelloPut(){
        return "Hello World (PUT)";
    }
}
