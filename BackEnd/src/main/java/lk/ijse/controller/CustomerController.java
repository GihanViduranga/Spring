package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    private List<CustomerDTO> customerDTOS = new ArrayList<>();

    @PostMapping(path = "save" )
    public CustomerDTO addCustomer(@RequestBody CustomerDTO customerDTO) {
        customerDTOS.add(customerDTO);
        return customerDTO;
    }

    @PostMapping(path = "update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO) {
        for (CustomerDTO customer : customerDTOS) {
            if (customer.getId().equals(customerDTO.getId())) {
                customer.setName(customerDTO.getName());
                customer.setPhone(customerDTO.getPhone());
                return customer;
            }
        }
        return customerDTO;
    }

    @PostMapping(path = "delete/{id}")
    public String deleteCustomer(@PathVariable ("id")String id){
        for (CustomerDTO customer : customerDTOS) {
            if (customer.getId().equals(id)) {
                customerDTOS.remove(customer);
                return "Customer deleted successfully";
            }
        }
        return "Customer not found";
    }

    @GetMapping(path = "get")
    public List<CustomerDTO> getAllCustomers() {
        return customerDTOS;
    }

}
