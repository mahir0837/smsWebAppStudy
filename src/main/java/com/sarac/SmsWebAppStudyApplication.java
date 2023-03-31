package com.sarac;

import com.sarac.Entity.Student;
import com.sarac.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsWebAppStudyApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SmsWebAppStudyApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {

//        Student student1=new Student("Mike","Smith","mikesmith@gmail.com");
//        studentRepository.save(student1);
//        Student student2=new Student("John","Cash","johncash@gmail.com");
//        studentRepository.save(student2);
//        Student student3=new Student("Jack","Star","jackstar@gmail.com");
//        studentRepository.save(student3);
    }
}
