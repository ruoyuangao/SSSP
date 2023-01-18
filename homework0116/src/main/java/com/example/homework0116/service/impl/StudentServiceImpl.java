package com.example.homework0116.service.impl;

import com.example.homework0116.entity.Professor;
import com.example.homework0116.entity.Professor_Student;
import com.example.homework0116.entity.Student;
import com.example.homework0116.exception.ResourceNotFoundException;
import com.example.homework0116.repository.StudentRepository;
import com.example.homework0116.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStu() {
        List<Student> list = this.studentRepository.findAll();
        if (list == null) {
            throw new ResourceNotFoundException("Student list not found");
        }
        return list;
    }

    @Override
    public Student getStuById(int id) {
        Student student = this.studentRepository.findById(id);
        if (student == null) {
            throw new ResourceNotFoundException("Student not found");
        }
        return student;
    }

    @Override
    @Transactional
    public void createStu(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    @Transactional
    public void deleteStuByID(int id) {
        this.studentRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void updateStuById(int id, Student student) {
        student.setId(id);
        this.studentRepository.save(student);
    }

    @Override
    public List<Professor> getRelationById(int id) {
        List<Professor> list = this.studentRepository.getRelationById(id);
        if (list == null) {
            throw new ResourceNotFoundException("Relation not found");
        }
        return list;
    }
}
