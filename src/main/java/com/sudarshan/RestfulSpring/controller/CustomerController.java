package com.sudarshan.RestfulSpring.controller;

import com.sudarshan.RestfulSpring.models.Customer;
import com.sudarshan.RestfulSpring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @GetMapping("/customers")
    public Iterable<Customer> getAllCustomers(
            @RequestParam(name="_page", defaultValue = "1") Integer pageNum,
            @RequestParam(name="_limit", defaultValue = "10")  Integer pageSize){
        Pageable p = PageRequest.of(pageNum-1, pageSize);
        return repo.findAll(p).getContent();
    }
}
