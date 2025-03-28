package com.SpringToDatabase.SpringData.Repository;

import com.SpringToDatabase.SpringData.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
