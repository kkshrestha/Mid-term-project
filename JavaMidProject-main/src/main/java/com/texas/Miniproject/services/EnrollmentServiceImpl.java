package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Enrollment;
import com.texas.Miniproject.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository){
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public Enrollment save(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public List<Enrollment> listAll() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Optional<Enrollment> getEnrollmentById(Long id) {
        return enrollmentRepository.findById(id);
    }

    @Override
    public Enrollment updateEnrollment(Enrollment enrollment) {
        return enrollmentRepository.saveAndFlush(enrollment);
    }

    @Override
    public void deleteEnrollment(Long id) {
        enrollmentRepository.deleteById(id);
    }
}
