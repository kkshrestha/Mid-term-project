package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Instructor;

import java.util.List;
import java.util.Optional;

public interface InstructorService {
    Instructor save(Instructor instructor);

    List<Instructor> listAll();

    Optional<Instructor> getInstructorById(Long id);

    Instructor updateInstructor(Instructor instructor);

    void deleteInstructor(Long id);
}
