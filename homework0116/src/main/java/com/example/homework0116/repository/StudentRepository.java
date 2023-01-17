package com.example.homework0116.repository;

import com.example.homework0116.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository extends JpaRepository<Student, Long> {
    public Student findBYId(String id);
    public void deleteById(String id);
    public Student save(Student student);

}
