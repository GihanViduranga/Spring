package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormDataController {
    @PostMapping("test1")
    public String test1(@RequestParam("id") String id,@RequestParam("name") String name){
        return id+"-"+name;
    }

    //http://localhost:8080/Rest_Controller_Web_exploded/form/test2
    @PostMapping("test2")
    public String test2(@ModelAttribute CustomerDTO customerDTO){//potha balapan terei
        return customerDTO.toString();
    }
}
