package com.anuruddha.rentacar.demoapplication.controller;

import com.anuruddha.rentacar.demoapplication.model.Student;
import com.anuruddha.rentacar.demoapplication.servicer.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String greeting(){
        return "Hello Springboot ha haa haaa";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String greeting2(){
        return "Hello Springboot ha haa haaa Post";
    }


    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){

         return studentService.save(student);
    }

   public ResponseEntity<Student> fetchStudent(@RequestParam int id){
       Student student = studentService.fetchStudentById()
   }
}


