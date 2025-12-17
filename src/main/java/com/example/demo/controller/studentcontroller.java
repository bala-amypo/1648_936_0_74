package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.studentservice;

@RestController
public class studentcontroller{
    @Autowired studentservice ser;

}