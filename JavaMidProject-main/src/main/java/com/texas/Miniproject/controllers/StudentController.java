package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Student;
import com.texas.Miniproject.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> listStudent(){
        return studentService.listAllStudent();
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable Long id){
        return studentService.getStudentById(id);

    }

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student){
        Student createdStudent = studentService.createStudent(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student){
        return new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.OK);
    }
}