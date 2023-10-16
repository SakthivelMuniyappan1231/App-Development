package com.minduints.onlineservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minduints.onlineservice.model.BookingCustomer;


public interface BookingCustomerRepository extends JpaRepository<BookingCustomer, Integer>{

}
