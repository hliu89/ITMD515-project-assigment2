package com.liu.demo.service;

import com.liu.demo.dao.TransactionDao;
import com.liu.demo.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    TransactionDao transactionDao;
    public void save(Transaction t){
        transactionDao.save(t);
    }
    public void delete(Transaction t){
        transactionDao.delete(t);
    }
    public List<Transaction> findAllTransaction(){
        return transactionDao.findAll();
    }
    public Optional<Transaction> findTransactionById(String id){
        return transactionDao.findById(id);
    }

}
