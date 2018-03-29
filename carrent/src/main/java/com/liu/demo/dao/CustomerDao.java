package com.liu.demo.dao;

import com.liu.demo.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface CustomerDao extends JpaRepository<Customer, Serializable> {
}
