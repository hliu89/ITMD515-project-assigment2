package com.liu.demo.service;

import com.liu.demo.dao.CarDao;
import com.liu.demo.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    CarDao carDao;

    public void save(Car c){
        carDao.save(c);
    }
    public void delete(Car c){
        carDao.delete(c);
    }
    public List<Car> findAllCar(){
        return carDao.findAll();
    }
    public Optional<Car> findCarById(String id){
        return carDao.findById(id);
    }
}
