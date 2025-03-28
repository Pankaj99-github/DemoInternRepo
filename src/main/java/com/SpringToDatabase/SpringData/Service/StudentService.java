package com.SpringToDatabase.SpringData.Service;

import com.SpringToDatabase.SpringData.Entity.Student;
import com.SpringToDatabase.SpringData.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
   private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);

    }

    public List<Student> getallDetails(){
        return studentRepo.findAll();
    }
}
