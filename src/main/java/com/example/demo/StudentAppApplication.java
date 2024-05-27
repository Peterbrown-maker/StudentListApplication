package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.res.StudentRes;

@SpringBootApplication
public class StudentAppApplication implements CommandLineRunner {
   @Autowired
	private StudentRes studentRepo;
	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String name="PeterBrown";
		String email="kgobudipeter@gmail.com";
		String address="Witbank";
		Student student1=new Student(name,address,email);
		studentRepo.save(student1);

	}

}
