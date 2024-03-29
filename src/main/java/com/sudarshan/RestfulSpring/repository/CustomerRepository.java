package com.sudarshan.RestfulSpring.repository;

import com.sudarshan.RestfulSpring.models.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
}
