package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.validationentity;

public interface validationrepo extends JpaRepository<validationentity,Long>{
      
}