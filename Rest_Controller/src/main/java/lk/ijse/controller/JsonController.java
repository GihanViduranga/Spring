package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JsonController {
    /*meka karaddi jeson walin error ekak enawa ekata thinawa dependency ekak danna jackson data binding kiyala eka dala artyfact eka hadagena lode karahama hari
    <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.15.0</version>
        </dependency>

        menna me dependency eka
     */

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String test1(@RequestBody CustomerDTO customerDTO) {
        return customerDTO.toString();
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO test3(){
        return new CustomerDTO("1","Gihan","Viduranga");
    }

    /*Meken karanne arraylist ekak hadala json haraha get ekak gahana eka*/
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> test2(){
        ArrayList<CustomerDTO> result = new ArrayList<>();
        result.add(new CustomerDTO("1", "John", "Hello"));
        result.add(new CustomerDTO("2", "Mark", "Bye"));
        return result;
    }
}

