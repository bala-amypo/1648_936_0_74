package com.example.demo.service;
import com.example.demo.entity.studententity;
import java.util.List;
public interface studentservice{
studententity postData(studententity stu);
List<studententity>getAll();
String delete(int id);
studententity findid(int id);
studententity put(int id,studententity entity);
}