package com.example.homework0116.entity;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="professor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
    private List<Professor_Student> professor_studentList;

    public List<Professor_Student> getProfessor_studentList() {
        return professor_studentList;
    }

    public void setProfessor_studentList(List<Professor_Student> professor_studentList) {
        this.professor_studentList = professor_studentList;
    }

    public void addProfessor_studentList(Professor_Student ps) {
        this.professor_studentList.add(ps);
    }

}
