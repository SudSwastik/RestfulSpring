package com.sudarshan.RestfulSpring.controller;
import com.sudarshan.RestfulSpring.models.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        Customer c1 = new Customer();
        c1.setId(1);
        c1.setName("sud");

        Customer c2 = new Customer();
        c2.setId(2);
        c2.setName("sud1");
        return Arrays.asList(c1,c2);
    }
}
