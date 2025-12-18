package com.example.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.studentservice;
import com.example.demo.entity.studententity;
import java.util.List;
@RestController
public class studentcontroller{
    @Autowired studentservice ser;

    @PostMapping("/Post")
    public studententity senddata(@RequestBody studententity stu){
        return ser.postData(stu);
    }
    @GetMapping("/GET")
    public List<studententity>findAlldata(){
        return ser.getAll();
    }
    @DeleteMapping("/DELETE/{id}")
    public String deleting(@PathVariable int id){
        ser.delete(id);
        return "delete is successfully";
    }
      @GetMapping("/GETID/{id}")
    public studententity alldata(@PathVariable int id){
        return ser.findid(id);
    }
    @PutMapping("/PUT/{id}")
    public studententity updating(@PathVariable int id,@RequestBody studententity stu){
        return ser.put(id,stu);
    }
}