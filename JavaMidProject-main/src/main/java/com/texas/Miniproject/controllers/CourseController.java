package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Course;
import com.texas.Miniproject.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<Course> save(@RequestBody Course course){
        return new ResponseEntity<>(courseService.save(course), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Course>> list(){
        return new ResponseEntity<>(courseService.listAll(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<Course> getById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }

    @PutMapping
    public ResponseEntity<Course> update(@RequestBody Course course){
        return new ResponseEntity<>(courseService.updateCourse(course), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
