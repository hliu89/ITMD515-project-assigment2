package com.liu.demo.dao;

import com.liu.demo.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CarDao extends JpaRepository<Car, Serializable> {
}
