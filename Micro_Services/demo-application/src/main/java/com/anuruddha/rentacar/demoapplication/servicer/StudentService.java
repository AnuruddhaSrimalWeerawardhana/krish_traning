package com.anuruddha.rentacar.demoapplication.servicer;

import com.anuruddha.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student  save(Student student);
    public Student fetchStudentById(int id);
}
