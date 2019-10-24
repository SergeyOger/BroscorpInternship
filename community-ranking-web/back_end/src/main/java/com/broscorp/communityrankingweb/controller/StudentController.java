package com.broscorp.communityrankingweb.controller;

import com.broscorp.communityrankingweb.entity.Student;
import com.broscorp.communityrankingweb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getStudentsList() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping("/students")
    public void deleteStudents(@RequestParam Long[] studentsId) {
        for (Long id : studentsId) {
            studentRepository.deleteById(id);
        }
    }
}
