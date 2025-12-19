package com.example.demo.service.imples;
import org.springframework.stereotype.Service;
import com.example.demo.repository.validationrepo;
import com.example.demo.entity.validationentity;
import com.example.demo.service.validationservice;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class validationimpl implements validationservice{
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
@Override
    public validationentity findid(long id){
        return stud.findById(id).orElse(null);
    }
    
@Override
public List<studententity>getAll(){
    return student.findAll();
    }
@Override
public String delete( int id){
    student.deleteById(id);
    return "your id is deleted successfully deleted";
    }
@Override
    public studententity findid( int id){
        return student.findById(id).orElse(null);
    }
    @Override
    public studententity put(int id,studententity entity){
    if(student.existsById(id)){
        entity.setId(id);
        return student.save(entity);
            }
        return null;
    }
}

