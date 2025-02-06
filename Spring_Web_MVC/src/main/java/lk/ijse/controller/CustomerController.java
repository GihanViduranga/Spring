package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("customer")
public class CustomerController {
    @GetMapping
    public String getCustomer(){
        return "customer";
    }
}
