package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.Repository.JpaRopsitory;
import com.exampl.demo.Entity.studententity;
@Repository
public interface studentrepo extends JpaRopsitory<studententity,Integer>{

}