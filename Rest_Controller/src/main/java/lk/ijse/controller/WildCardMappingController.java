package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildCard")
public class WildCardMappingController {
    @GetMapping(path ="test1/*/hello")
    public String test1(){
        return "test1";
    }
}
