package com.example.homework0116.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Table(name = "student")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private int age;

    @OneToMany(mappedBy = "stu", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Professor_Student> professor_studentList;

    public List<Professor_Student> getProfessor_studentList() {
        return professor_studentList;
    }

    public void setProfessor_studentList(List<Professor_Student> ps) {
        this.professor_studentList = ps;
    }

    public void addProfessor_studentList(Professor_Student ps) {
        this.professor_studentList.add(ps);
    }
}