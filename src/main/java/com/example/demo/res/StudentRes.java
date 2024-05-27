package com.example.demo.res;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
@Repository
public interface StudentRes extends JpaRepository<Student,Integer> {

}
