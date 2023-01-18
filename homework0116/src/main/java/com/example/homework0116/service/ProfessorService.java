package com.example.homework0116.service;

import com.example.homework0116.entity.Professor;
import com.example.homework0116.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorService {
    void createPro(Professor professor);

    void deleteProById(int id);

    void updateProById(int id, Professor professor);

    List<Professor> getAllPro();

    Professor getProById(int id);

    List<Student> getRelationById(int id);
}
