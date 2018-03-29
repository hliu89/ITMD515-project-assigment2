package com.liu.demo.dao;

import com.liu.demo.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface TransactionDao extends JpaRepository<Transaction, Serializable> {
}
