package com.example.demo.service.imples;
import org.springframework.stereotype.Service;
import com.example.demo.repository.validationrepo;
import com.example.demo.entity.validationentity;
import com.example.demo.service.validationservice;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class impl implements validationservice{
@Autowired validationrepo stud;
//save()
//findall()
//findbyid()
//deletebyid()
//existsbyit()

@Override
public validationentity postdata(validationentity st){
    return stud.save(st);
}
}

