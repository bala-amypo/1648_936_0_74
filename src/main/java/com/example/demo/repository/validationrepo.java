package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.validationentity;
@Repository
public interface validationrepo extends JpaRepository<validationentity,Long>{
      
}