package com.example.demo.service.imples;
import org.springframework.stereotype.Service;
import com.example.demo.repository.validationrepo;
import com.example.demo.entity.validationentity;
import com.example.demo.service.validationservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class impl implements validationservice{
@Autowired validationrepo student;
//save()
//findall()
//findbyid()
//deletebyid()
//existsbyit()

@Override
public validationentity postData(validationentity stu){
    return student.save(stu);
}
}

