package com.example.homework0116.repository;

import com.example.homework0116.entity.Professor;
import com.example.homework0116.entity.Professor_Student;
import com.example.homework0116.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public Student findById(int id);
    public void deleteById(int id);

    @Query(value="select distinct p from Professor p left join Professor_Student ps on p.id = ps.pro.id where ps.stu.id = :id")
    List<Professor> getRelationById(int id);
}
