package com.liu.demo.dao;


import com.liu.demo.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface DriverDao extends JpaRepository<Driver, Serializable> {
}
