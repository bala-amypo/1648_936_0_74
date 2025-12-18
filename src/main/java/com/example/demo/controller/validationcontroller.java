package com.example.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.validationservice;
import com.example.demo.entity.validationentity;
@RestController
public class validationcontroller{
    @Autowired validationservice server;

    @PostMapping("/Post")
    public validationentity senddata(@Valid @RequestBody validationentity st){
        return server.postdata(st);
    }
}