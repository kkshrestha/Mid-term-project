package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Enrollment;
import com.texas.Miniproject.services.EnrollmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {
    private final EnrollmentService enrollmentService;
    public EnrollmentController(EnrollmentService enrollmentService){
        this.enrollmentService = enrollmentService;
    }

    @PostMapping
    public ResponseEntity<Enrollment> save(@RequestBody Enrollment enrollment){
        return new ResponseEntity<>(enrollmentService.save(enrollment), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Enrollment>> list(){
        return new ResponseEntity<>(enrollmentService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<Enrollment> getById(@PathVariable Long id){
        return enrollmentService.getEnrollmentById(id);
    }

    @PutMapping
    public ResponseEntity<Enrollment> update(@RequestBody Enrollment enrollment){
        return new ResponseEntity<>(enrollmentService.updateEnrollment(enrollment), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnrollment(@PathVariable Long id){
        enrollmentService.deleteEnrollment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
