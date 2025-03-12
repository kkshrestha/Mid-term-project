package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Instructor;
import com.texas.Miniproject.services.InstructorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
    private final InstructorService instructorService;
    public InstructorController(InstructorService instructorService){
        this.instructorService = instructorService;
    }

    @PostMapping
    public ResponseEntity<Instructor> save(@RequestBody Instructor instructor){
        return new ResponseEntity<>(instructorService.save(instructor), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Instructor>> list(){
        return new ResponseEntity<>(instructorService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<Instructor> getById(@PathVariable Long id){
        return instructorService.getInstructorById(id);
    }

    @PutMapping
    public ResponseEntity<Instructor> update(@RequestBody Instructor instructor){
        return new ResponseEntity<>(instructorService.updateInstructor(instructor), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInstructor(@PathVariable Long id){
        instructorService.deleteInstructor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
