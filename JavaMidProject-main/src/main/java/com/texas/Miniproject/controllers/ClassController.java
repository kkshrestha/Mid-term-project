package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Classes;
import com.texas.Miniproject.services.ClassService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classes")
public class ClassController {
    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @PostMapping
    public ResponseEntity<Classes> save(@RequestBody Classes classes){
        return new ResponseEntity<>(classService.saveClass(classes), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Classes>> list(){
        return new ResponseEntity<>(classService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<Classes> getById(@PathVariable Long id){
        return classService.getClassById(id);
    }

    @PutMapping
    public ResponseEntity<Classes> update(@RequestBody Classes classes){
        return new ResponseEntity<>(classService.updateClass(classes), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id){
        classService.deleteClass(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
