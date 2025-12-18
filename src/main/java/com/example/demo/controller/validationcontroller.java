package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.validationentity;
import com.example.demo.service.validationservice;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;

@RestController
public class validationcontroller{
  @Autowired validationservice va;
  @PostMapping("/postvalue")
  public validationentity sendData(@Valid @RequestBody validationentity val){
      return va.postData(val);
  }
}
