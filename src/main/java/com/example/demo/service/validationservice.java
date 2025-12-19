package com.example.demo.service;
import com.example.demo.entity.validationentity;
import java.util.List;
public interface validationservice{
validationentity postdata(validationentity id);
validationentity find(long id);
}