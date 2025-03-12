package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> listAllStudent();

    Optional<Student> getStudentById(Long id);

    void deleteStudent(Long id);

    Student updateStudent(Student student);
}
