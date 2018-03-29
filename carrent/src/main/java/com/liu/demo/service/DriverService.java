package com.liu.demo.service;

import com.liu.demo.dao.DriverDao;
import com.liu.demo.entities.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {
    @Autowired
    DriverDao driverDao;

    public void save(Driver driver){
        driverDao.save(driver);
    }
    public void delete(Driver driver){
        driverDao.delete(driver);
    }
    public void update(){

    }
    public List<Driver> findAllDriver(){
        return driverDao.findAll();
    }
    public Optional<Driver> findDriver(String id){
        return driverDao.findById(id);
    }

}
