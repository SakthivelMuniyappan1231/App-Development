package com.minduints.onlineservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minduints.onlineservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    
    
}
