package com.example.demo.service.imples;
import org.springframework.stereotype.Service;
import com.example.demo.repository.studentrepo;
import com.example.demo.entity.studententity;
import com.example.demo.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class impl implements studentservice{
@Autowired studentrepo student;
//save()
//findall()
//findbyid()
//deletebyid()
//existsbyit()

@Override
public studententity postData(studententity stu){
    return student.save(stu);
    @Override
    public List<studententity>getAllData(){
        return studentrepo.findAll(stu);
        }
    }
}
