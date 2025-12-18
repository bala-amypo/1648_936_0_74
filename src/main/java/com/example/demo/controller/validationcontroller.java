package com.example.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.validationservice;
import com.example.demo.entity.validationentity;
import java.util.List;
@RestController
public class validationcontroller{
    @Autowired validationservice ser;

    @PostMapping("/Post")
    public validationentity senddata(@Valid @RequestBody validationentity stu){
        return ser.postData(stu);
    }
}