package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRopsitory;
import com.exampl.demo.entity.studententity;
@Repository
public interface studentrepo extends JpaRopsitory<studententity,Integer>{

}