package com.example.homework0116.service;


import com.example.homework0116.entity.Professor;
import com.example.homework0116.entity.Professor_Student;
import com.example.homework0116.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStu();

    Student getStuById(int id);

    void createStu(Student student);

    void deleteStuByID(int id);

    void updateStuById(int id, Student student);

    List<Professor> getRelationById(int id);
}
