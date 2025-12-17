package com.example.demo.service.impl;
import org.springframework.sterotype.service;

import com.example.demo.entity.studententity;
import com.example.demo.service.studentservice


@service
public class impl implements studentservice{
@Autowired studentrepo student;
//save()
//findall()
//findbyid()
//deletebyid()
//existsbyit()
public studententity postValue(studententity stu){
    return student.save(stu);
}
}