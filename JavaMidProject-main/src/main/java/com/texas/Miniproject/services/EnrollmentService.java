package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentService {
    Enrollment save(Enrollment enrollment);

    List<Enrollment> listAll();

    Optional<Enrollment> getEnrollmentById(Long id);

    Enrollment updateEnrollment(Enrollment enrollment);

    void deleteEnrollment(Long id);
}
