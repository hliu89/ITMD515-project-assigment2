package com.liu.demo.service;

import com.liu.demo.dao.CustomerDao;
import com.liu.demo.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerDao customerDao;

    public void save(Customer customer){
        customerDao.save(customer);
    }

    public void delete(Customer c){
        customerDao.delete(c);
    }

    public Optional<Customer> findCustomer(String id){
       return customerDao.findById(id);
    }

    public List<Customer> findAllCustomer(){
        return customerDao.findAll();
    }
}
